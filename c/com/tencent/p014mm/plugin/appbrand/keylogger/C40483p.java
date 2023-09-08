package com.tencent.p014mm.plugin.appbrand.keylogger;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import uo0.C52586e;

/* renamed from: com.tencent.mm.plugin.appbrand.keylogger.p */
public final class C40483p implements C52586e {

    /* renamed from: b */
    public static final Pattern f108772b = Pattern.compile(String.format("%s(.*)%s", new Object[]{"<kLog>", "</kLog>"}));

    /* renamed from: a */
    public C52586e f108773a = null;

    /* renamed from: a */
    public void mo63264a(String str, String str2, Object... objArr) {
        C52586e eVar = this.f108773a;
        if (eVar != null) {
            eVar.mo63264a(str, String.format("%s%s%s", new Object[]{"<kLog>", str2, "</kLog>"}), objArr);
        }
    }

    /* renamed from: b */
    public List<String> mo63265b(String str, long j) {
        C52586e eVar = this.f108773a;
        return eVar == null ? new ArrayList() : eVar.mo63265b(str, j);
    }
}
