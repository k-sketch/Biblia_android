# Mi Biblia (Android)

App hecha con Capacitor: la carpeta `www/` es la app, `android/` es el proyecto nativo.

## Opcion A: APK en la nube (sin instalar nada)
1. Crea una cuenta gratis en github.com y un repositorio nuevo.
2. Sube TODO el contenido de esta carpeta (incluida `.github`).
3. Ve a la pestana **Actions** > **Construir APK** > **Run workflow**.
4. Al terminar (5-10 min) abre la ejecucion y descarga **MiBiblia-APK**. Dentro esta `app-debug.apk`.
5. Pasalo al celular, abrelo y permite "instalar apps desconocidas".

## Opcion B: Android Studio
1. Instala Node 20 y Android Studio.
2. En esta carpeta: `npm install` y luego `npx cap open android`.
3. En Android Studio: Build > Build APK(s), o conecta el celular y pulsa Run.

## Cambiar la app
Edita `www/index.html`, ejecuta `npx cap sync android` y vuelve a construir.

## Para Google Play
Hace falta un APK/AAB firmado (Build > Generate Signed Bundle) y una cuenta de desarrollador (pago unico de 25 USD).

## Datos incluidos
- `www/xref/`: referencias cruzadas de OpenBible.info (CC BY 4.0), tomadas de trekhleb/bible-cross-references. Alimentan la pestaña "Conexiones" (boton con el simbolo de enlace).
- Las Biblias se descargan desde GitHub (scrollmapper/bible_databases, mrk214/bible-data-es-spa y seven1m/open-bibles) o desde HelloAO (bible.helloao.org) o se importan desde un archivo.
