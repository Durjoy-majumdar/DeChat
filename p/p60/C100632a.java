package p60;

import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import p823sg.C90193h;
import t60.C101725g;
import x60.C102564a;

/* renamed from: p60.a */
public class C100632a implements C101725g {
    /* renamed from: a */
    public String mo140078a(C102564a<?> aVar) {
        String str;
        if (aVar == null || Util.isNullOrNil(aVar.toString())) {
            str = null;
        } else {
            str = C90193h.m112878f(aVar.toString().getBytes());
            Log.m105919d("MicroMsg.Loader.DefaultFileNameCreator", "create image file name :%s", str);
        }
        return str + ".tmp";
    }
}
