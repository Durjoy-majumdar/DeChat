package com.tencent.p014mm.plugin.game.commlib;

import com.tencent.p014mm.ipcinvoker.C1256g;
import com.tencent.p014mm.ipcinvoker.C80883e;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import java.util.LinkedList;
import q20.C89449a;

/* renamed from: com.tencent.mm.plugin.game.commlib.j */
public class C41857j {

    /* renamed from: a */
    public static LinkedList<String> f112802a = new LinkedList<>();

    /* renamed from: b */
    public static final String f112803b = MMApplicationContext.getPackageName();

    @C89449a
    /* renamed from: com.tencent.mm.plugin.game.commlib.j$a */
    public static class C41858a implements C80883e {
        private C41858a() {
        }

        public void invoke(Object obj, C1256g gVar) {
            C41853c.m45381o();
        }
    }

    static {
        f112802a.add(MMApplicationContext.getPackageName() + ":tools");
    }
}
