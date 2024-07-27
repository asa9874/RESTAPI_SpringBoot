<h1>스프링 RESTAPI 구현(2024.07)</h1>
<img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FcANFRp%2FbtsIs6p20ID%2F9GVdPLYystmfSxNBeD1Jh0%2Fimg.png">
<h1>1.REST API</h1>
<h3>REST API는 Representational State Transfer (REST) 아키텍처 스타일을 따르는 Application Programming Interface (API)를 의미한다. REST는 웹 서비스와 상호 작용하기 위해 설계된 아키텍처 스타일로, HTTP 프로토콜을 사용하여 클라이언트와 서버 간의 통신을 처리한다.</h3>
<h1>2.REST API 구성요소</h1>
<h2>2-1.자원(Resource)</h2>
⭐자원은 URI로 식별된다.</p>
 

 

<h2>2-2.HTTP 메서드</h2>
⭐GET: 자원의 조회</p>
⭐POST: 새로운 자원의 생성</p>
⭐PUT: 기존 자원의 전체 수정</p>
⭐PATCH: 기존 자원의 부분 수정</p>
⭐DELETE: 자원의 삭제</p>
 

 

<h2>2-3.헤더(Headers)</h2>
⭐HTTP 요청과 응답에 추가 정보를 제공한다.</p>
 

 

<h2>2-4.상태 코드(Status Codes)</h2>
⭐요청의 결과를 나타내는 코드</p>
⭐2xx: 성공 (예: 200 OK, 201 Created)</p>
⭐3xx: 리다이렉션 (예: 301 Moved Permanently, 302 Found)</p>
⭐4xx: 클라이언트 오류 (예: 400 Bad Request, 401 Unauthorized, 404 Not Found)</p>
⭐5xx: 서버 오류 (예: 500 Internal Server Error, 503 Service Unavailable)</p>
 

<h1>3.REST의 핵심 원칙</h1>
<h2>3-1. 무상태성 (Statelessness)</h2>
⭐각 클라이언트 요청은 독립적이며, 필요한 모든 정보가 포함되어야 한다.</p>
⭐서버는 이전 요청의 상태를 저장하지 않는다.</p>
⭐이를 통해 시스템의 확장성과 성능이 향상된다.</p>

<h2>3-2. 클라이언트-서버 구조 (Client-Server Architecture)</h2>
⭐클라이언트와 서버는 독립적으로 개발, 배포, 확장 가능하다.</p>
⭐클라이언트는 사용자 인터페이스를, 서버는 데이터 저장 및 비즈니스 로직을 담당한다.</p>

<h2>3-3. 캐시 처리 가능 (Cacheable)</h2>
⭐서버 응답은 캐시될 수 있어야 하며, 캐싱 여부를 명시해야 한다.</p>
⭐캐시를 통해 서버 부하를 줄이고 성능을 향상시킬 수 있다.</p>

<h2>3-4. 계층화 시스템 (Layered System)</h2>
⭐클라이언트와 서버 간 통신은 여러 계층을 거칠 수 있다.</p>
⭐계층을 추가하여 보안, 로드 밸런싱, 캐싱 등의 기능을 구현할 수 있다.</p>

<h2>3-5. 인터페이스 일관성 (Uniform Interface)</h2>
⭐일관된 인터페이스를 제공하여 사용성을 높인다.</p>
⭐URI로 자원을 식별하고 HTTP 메서드(GET, POST, PUT, DELETE)로 작업을 수행한다.</p>

<h2>3-6. 표현의 독립성 (Representation Independence)</h2>
⭐클라이언트와 서버는 데이터의 표현 방식에 독립적이다.</p>
⭐서버는 데이터를 JSON, XML 등 다양한 형식으로 제공할 수 있으며, 클라이언트는 원하는 형식을 요청할 수 있다.</p>



<h1>4.@RESTController</h1>
⭐@RestController는 Spring Framework에서 제공하는 애노테이션으로, RESTful 웹 서비스를 만들기 위해 사용된다.</p>
⭐@Controller와 @ResponseBody 애노테이션을 결합한 형태로, 클래스의 모든 핸들러 메서드가 RESTful 웹 서비스의 엔드포인트로 동작하게된다.</p>

⭐메서드가 반환하는 객체를 자동으로 JSON 또는 XML 형태로 변환하여 HTTP 응답 본문으로 반환한다.</p>

⭐@PathVariable는 URL 경로의 변수 값을 메서드 파라미터로 전달하기 위해 사용한다.</p>