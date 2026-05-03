# grails-tailwindcss

Sample app for the apache/grails-static-website guide [grails-tailwindcss/v8](https://grails.apache.org/guides/grails-tailwindcss/8/guide/index.html).

Demonstrates how to wire Tailwind CSS 4 into a Grails 8 GSP application via a Gradle-driven 
px @tailwindcss/cli build step, with class-based dark mode and a small @apply component layer.

`initial/` is a vanilla Grails 8 starter generated from https://prev-snapshot.grails.org. `complete/` is the same starter with all Tailwind customisations applied.

## Quick start

```bash
git clone -b grails8 https://github.com/grails-guides/grails-tailwindcss.git
cd grails-tailwindcss/complete
./gradlew bootRun
```
