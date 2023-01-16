# MS_CI_CD

Ich habe mich mit Github Actions beschäftigt und ein build Workflow, sowie ein Release Workflow gebastelt. 

# Build Workflow

Der Build Workflow führt im wesentlichen gradle build aus. Vor der Ausführung werden allerdings noch die Ausführungsrechte für die Datei gradlew gesetzt, da ich gerade nur ein Windows vor mir habe und diese nicht beim push übernommen werden. Die Artefakte die beim build herauskommen werden hochgeladen und können im Bereich Actions heruntergeladen werden.

# Release Workflow

Dieser Workflow funktioniert leider nicht vollständig, da ich kein Organisationskonto besitze und die Actions (die ich gefunden habe) auf /repos/Marco201201/MS_CI_CD/releases zugreifen wollen. Dies funktioniert allerdings nicht, da mein Repo nur über /Marco201201/MS_CI_CD/releases zu erreichen ist. Ansonsten würde der Worklfow aber funktionieren und ein Release bauen, sobald ein neuer Tag erzeugt wird, welcher mit "v" beginnt. Bis zum Bauen sind die Schritte identisch mit dem ersten Workflow, anstelle des direkten Uploads werden die Dateien danach aber noch gezippt. Anschließend würde das Release erstellt werden, worin sich das Zip und die Readme befinden würden.
