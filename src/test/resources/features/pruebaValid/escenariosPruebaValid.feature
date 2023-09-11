#language: es

Característica: Prueba de automatizacion de Software para la compañia Valid, en el sitio web de Wikipedia

  # A continuación se describen los pasos comunes que se hacen necesarios para el inicio de cada escenario
  Antecedentes: Validar el titulo en la pagina de inicio de Wikipedia

    Cuando que el usuario fredi esta en la pagina de Wikipedia
    Dado ingresa a Wikipedia

    #A continuacion se describen cada uno de los escenarios solicitados en la prueba
    @scenery1 @wikipedia
    Escenario: Validar el titulo en la pagina de inicio de Wikipedia
    Entonces valida la existencia del titulo Bienvenidos  a Wikipedia en el home de la pagina

    @scenery2 @wikipedia
    Escenario: Buscar y validar el titulo de la pagina de resultados
    Cuando el usuario busca la palabra Sistema
    Entonces el titulo de la pagina de resultados debe contener Sistema

   @scenery3 @wikipedia
    Escenario: Buscar y validar el titulo de "Analisis CEEM" en resultados
    Cuando el usuario busca la palabra Sistema
     Y el usuario hace scroll para encontrar Analisis CEEM en los resultados
     Entonces el subtitulo de la pagina de resultados debe contener Análisis CEEM

   @scenery4 @wikipedia
    Escenario: Validar mensaje de error al dejar vacio el CAPTCHA al crear una cuenta
    Cuando el usuario hace clic en Crear una cuenta
    Y el usuario diligencia los campos solicitados fr3d1C@ V@l1d.2023$ fredy.junior@gmail.com
    Entonces se debe mostrar el popup con el mensaje Completa este campo para el campo del CAPTCHA

   @scenery5 @wikipedia
  Escenario: Cambiar a version movil y volver a version de escritorio
    Cuando el usuario selecciona la opcion Version para moviles desde la parte inferior
     Y el usuario verifica que la opcion Escritorio esta presente
     Entonces el usuario se devuelve a la version de Escritorio

  @scenery6 @wikipedia
  Escenario: Comparar revisiones seleccionadas en el historial
    Cuando el usuario selecciona la opcion Ver historial desde la parte inferior
    Y el usuario selecciona dos revisiones de la lista para comparar revisiones seleccionadas
    Entonces se deben mostrar dos campos de texto para comparar las revisiones seleccionadas

