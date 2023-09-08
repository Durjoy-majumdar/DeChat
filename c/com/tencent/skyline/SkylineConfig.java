package com.tencent.skyline;

import gy3.C87412m;
import java.util.HashMap;
import kotlin.Metadata;
import org.json.JSONObject;

@Metadata(mo182093d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010*\u001a\u00020\nJ\"\u0010+\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010,j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0001`-R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0018\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u001cX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&¨\u0006."}, mo182094d2 = {"Lcom/tencent/skyline/SkylineConfig;", "", "()V", "createRuntime", "", "getCreateRuntime", "()Z", "setCreateRuntime", "(Z)V", "entryPointName", "", "getEntryPointName", "()Ljava/lang/String;", "setEntryPointName", "(Ljava/lang/String;)V", "id", "", "getId", "()I", "setId", "(I)V", "libraryURI", "getLibraryURI", "setLibraryURI", "preloadTaskRunner", "getPreloadTaskRunner", "setPreloadTaskRunner", "runtimePtr", "", "getRuntimePtr", "()J", "setRuntimePtr", "(J)V", "windowHeight", "", "getWindowHeight", "()D", "setWindowHeight", "(D)V", "windowWidth", "getWindowWidth", "setWindowWidth", "toJSON", "toMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "skyline_release"}, mo182095k = 1, mo182096mv = {1, 6, 0}, mo182098xi = 48)
public final class SkylineConfig {
    private boolean createRuntime = true;
    private String entryPointName = "mainForSkyline";

    /* renamed from: id */
    private int f250521id;
    private String libraryURI = "package:skylineandroid/main.dart";
    private boolean preloadTaskRunner = true;
    private long runtimePtr;
    private double windowHeight;
    private double windowWidth;

    public final boolean getCreateRuntime() {
        return this.createRuntime;
    }

    public final String getEntryPointName() {
        return this.entryPointName;
    }

    public final int getId() {
        return this.f250521id;
    }

    public final String getLibraryURI() {
        return this.libraryURI;
    }

    public final boolean getPreloadTaskRunner() {
        return this.preloadTaskRunner;
    }

    public final long getRuntimePtr() {
        return this.runtimePtr;
    }

    public final double getWindowHeight() {
        return this.windowHeight;
    }

    public final double getWindowWidth() {
        return this.windowWidth;
    }

    public final void setCreateRuntime(boolean z) {
        this.createRuntime = z;
    }

    public final void setEntryPointName(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.entryPointName = str;
    }

    public final void setId(int i) {
        this.f250521id = i;
    }

    public final void setLibraryURI(String str) {
        C87412m.m108594g(str, "<set-?>");
        this.libraryURI = str;
    }

    public final void setPreloadTaskRunner(boolean z) {
        this.preloadTaskRunner = z;
    }

    public final void setRuntimePtr(long j) {
        this.runtimePtr = j;
    }

    public final void setWindowHeight(double d) {
        this.windowHeight = d;
    }

    public final void setWindowWidth(double d) {
        this.windowWidth = d;
    }

    public final String toJSON() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", getId());
        jSONObject.put("windowWidth", getWindowWidth());
        jSONObject.put("windowHeight", getWindowHeight());
        jSONObject.put("runtimePtr", getRuntimePtr());
        jSONObject.put("createRuntime", getCreateRuntime());
        jSONObject.put("preloadTaskRunner", getPreloadTaskRunner());
        String jSONObject2 = jSONObject.toString();
        C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …ner)\n        }.toString()");
        return jSONObject2;
    }

    public final HashMap<String, Object> toMap() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("id", Integer.valueOf(getId()));
        hashMap.put("windowWidth", Double.valueOf(getWindowWidth()));
        hashMap.put("windowHeight", Double.valueOf(getWindowHeight()));
        hashMap.put("runtimePtr", Long.valueOf(getRuntimePtr()));
        hashMap.put("createRuntime", Boolean.valueOf(getCreateRuntime()));
        hashMap.put("preloadTaskRunner", Boolean.valueOf(getPreloadTaskRunner()));
        return hashMap;
    }
}
