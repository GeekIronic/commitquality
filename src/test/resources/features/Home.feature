Feature: Validación y verificación de la visualización y funcionamiento basico del home

  @Naver @test
  Scenario: Validar las opciones habilitadas para el naver y el titulo
    Given que el usuario entro a la pagina web
    And que el usuario visualiza el naver del home
    When el sistema mostrara las opciones habilitadas del naver y visualizara un titulo de entrada
    Then el sistema verificara que las opciones habilitabas del naver sean las mismas descritas
    And el sistema mostrar el titulo "ADVERTISE YOUR PRODUCT / SERVICE HERE: Contact me on X @CommitQuality"

  @Naver @RedireccionNaver
  Scenario: Validar entrada al formulario de agregar producto
    Given que el usuario entro a la pagina web
    And que el usuario visualiza el naver del home
    When el usuario da clic en la opcion "Add Product"
    Then el sistema lo redireccionara al formulario de Agregar Producto

  @Naver @RedireccionNaver
  Scenario: Validar entrada al formulario de practice
    Given que el usuario entro a la pagina web
    And que el usuario visualiza el naver del home
    When el usuario da clic en la opcion "Practice"
    Then el sistema lo redireccionara a la pagina de Practice mostrando la nota "Note to user: This page is likely to be updated - Things may move around and extra items will be added."
    And el sistema mostrara los cuadros con cada tipo de componente a practricar

  @Naver @RedireccionNaver
  Scenario: Validar entrada al formulario de login
    Given que el usuario entro a la pagina web
    And que el usuario visualiza el naver del home
    When el usuario da clic en la opcion "Login"
    Then el sistema lo redireccionara al formulario del login


