🍷 Pododoc - 와인 추천 & 평점 예측 프로젝트

📌 개요
WineMate는 사용자 취향을 기반으로 와인을 추천하고, 입력한 와인 정보로 예상 평점을 제공하는 머신러닝 기반의 와인 추천 웹/모바일 앱입니다.

머신러닝으로 와인 평점 예측

유사 와인 추천

웹(React), 앱(Android) 동시 지원

Spring 기반 백엔드 + Flask ML API

Docker 기반 모듈화 / 배포 자동화 예정

🧱 기술 스택

영역	사용 기술
프론트엔드	React, Android(Java/Kotlin), Axios
백엔드	Spring Boot, Flask (Python)
DB	PostgreSQL
머신러닝	Scikit-learn, Pandas
배포	Docker, Docker Compose
자동화	Jenkins (예정), GitHub Actions (대안)

🔧 프로젝트 구조
bash
복사
편집
/frontend-react      - React 프론트엔드
/backend-spring      - Spring 백엔드
/ml-api-flask        - Flask ML 서버
/db-init             - DB 초기 설정
/docker              - 도커 관련 파일들

🚀 실행 방법 (개발 환경 기준)
bash
복사
편집

# 1. 레포 클론
git clone https://github.com/Seoptrike/Pododoc_refactor.git
cd pododoc

# 2. docker-compose 실행
docker-compose up --build

# 3. 웹 앱 실행 확인
http://localhost:3000

# 4. Flask API 확인
http://localhost:5000/predict
📡 주요 API

기능	URL	Method
평점 예측	/predict	POST
와인 추천	/recommend	POST
와인 등록	/api/wines	POST
평점 조회	/api/users/{id}/ratings	GET
📄 API 명세 자세히 보기

📸 화면 예시
준비 중 (React, Android UI 스크린샷 추가 예정)

🛠 향후 계획
 CI/CD 자동화 (Jenkins or GitHub Actions)

 사용자 로그인 및 개인화 추천

 사용자 기반 추천 (협업 필터링)

 배포 환경 HTTPS 적용

👨‍💻 개발자
김인섭 | Backend, ML API, Android 개발
GitHub | Blog (선택)

