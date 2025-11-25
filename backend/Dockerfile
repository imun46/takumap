# 1. 빌드 단계 (Build Stage) - 코드를 컴파일하고 JAR 파일을 만듭니다.
# Maven 빌드 환경을 위한 Java 21 JDK 이미지 사용
FROM eclipse-temurin:21-jdk-alpine AS build
WORKDIR /app

# Maven 빌드 파일(pom.xml, mvnw)을 복사하고 의존성을 다운로드
COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn
RUN chmod +x mvnw
# 의존성 다운로드 (나중에 코드 변경 시 의존성 다운로드는 캐싱되어 속도가 빨라짐)
RUN ./mvnw dependency:go-offline

# 나머지 소스 코드 복사
COPY src ./src

# 애플리케이션 빌드 (JAR 파일 생성)
RUN ./mvnw package -DskipTests

# 2. 실행 단계 (Run Stage) - 빌드된 JAR 파일을 실행합니다.
# 실행에 필요한 가벼운 Java 21 JRE 이미지 사용
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

# 빌드 단계에서 생성된 JAR 파일 복사
# target 폴더의 *.jar 파일을 otaku-map.jar 이름으로 복사
COPY --from=build /app/target/*.jar otaku-map.jar 

# 애플리케이션 실행 명령
ENTRYPOINT ["java", "-jar", "otaku-map.jar"]