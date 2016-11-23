package com.collectivedev.edb.api;

import com.collectivedev.edb.api.persist.AbstractDataStore;
import com.collectivedev.edb.api.persist.JsonFile;
import com.google.gson.JsonObject;
import net.dv8tion.jda.JDA;

public abstract class IBot {
    
    public abstract void load() throws Exception;
    
    public abstract AbstractDataStore getDataStore();
    
    public abstract JsonFile<JsonObject> getJsonConfig();
    
    public abstract JDA getJDA();
}