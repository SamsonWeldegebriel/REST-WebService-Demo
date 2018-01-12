<html>
<body>
<h2>Spring Boot Demo with Rest!</h2>

<table class="table table-bordered table-striped">
    <thead>
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Firstname</td>
    </tr>
    </thead>
    <tbody>
    <tr th:if="${persons.empty}">
        <td colspan="3">No persons</td>
    </tr>
    <tr th:each="person : ${persons}">
        <td th:text="${person.name}">Name</td>
        <td th:text="${person.gender}">Gender</td>
        <td th:text="${person.age}">Age</td>
    </tr>
    </tbody>
</table>
</body>
</html>