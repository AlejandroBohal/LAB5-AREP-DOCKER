db.createUser(
    {
        user  : "root",
        pwd   : "aG9sYW11bmRvMTIz",
        roles : [
            {
                role : "readWrite",
                db   : "registro-arep"
            }
        ]
    }
)