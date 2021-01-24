Git - good practices

* commit powinien miec dobry opis
* commit powinien byc atomowy , zawierac jedna zmiane
* zmiana opisu tylko dla ostatniego commita (amend) , amend zmienia tez numer commita
* podrozuj po historii  branchach tylko przy pustym drzewie roboczym
* zmerdzowany branch mozna usunac
* fast forward nie zawsze jest możliwy
* FF -  dziala tylko w przypadku gdy jeden branch może dogonić drugi
*  merge- robimy bedac na branchu do ktorego chcemy dociagnac zmiany
* zawsze mozna wymusic commit merdzujacy



GIt komendy
git status
git add
git commit -m "[tag] - message"
git restore --staged file-name
git checkout branch-name - przelacz na galaz
git checkout -b branch name //stworz i przelacz na branch 
