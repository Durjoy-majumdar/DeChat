package com.tencent.p014mm.plugin.sns.model;

import android.view.Menu;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SnsTranslateFinishEvent;
import com.tencent.p014mm.autogen.events.SnsTranslateStartEvent;
import com.tencent.p014mm.autogen.events.SnsUnTranslateEvent;
import com.tencent.p014mm.autogen.events.TranslateMessageEvent;
import com.tencent.p014mm.plugin.sns.p106ui.C96230u;
import com.tencent.p014mm.plugin.sns.p106ui.monitor.SnsMethodCalculate;
import com.tencent.p014mm.plugin.sns.storage.SnsInfo;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.HashMap;
import java.util.LinkedList;
import ke3.C88144b;
import lc3.C10485b;
import p910lj.C76701a;
import te3.w64;

/* renamed from: com.tencent.mm.plugin.sns.model.w1 */
public class C94965w1 {

    /* renamed from: a */
    public static HashMap<String, C94967b> f275297a = new HashMap<>();

    /* renamed from: b */
    public static LinkedList<C94966a> f275298b = new LinkedList<>();

    /* renamed from: com.tencent.mm.plugin.sns.model.w1$a */
    public static class C94966a {

        /* renamed from: a */
        public String f275299a;

        /* renamed from: b */
        public String f275300b;

        /* renamed from: c */
        public String f275301c;

        /* renamed from: d */
        public int f275302d;

        public boolean equals(Object obj) {
            SnsMethodCalculate.markStartTimeMs("equals", "com.tencent.mm.plugin.sns.model.SnsTranslateManager$SnsTranslateInfo");
            if (obj instanceof C94966a) {
                C94966a aVar = (C94966a) obj;
                if (!this.f275299a.equals(aVar.f275299a) || this.f275302d != aVar.f275302d) {
                    SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.SnsTranslateManager$SnsTranslateInfo");
                    return false;
                }
                SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.SnsTranslateManager$SnsTranslateInfo");
                return true;
            }
            boolean equals = super.equals(obj);
            SnsMethodCalculate.markEndTimeMs("equals", "com.tencent.mm.plugin.sns.model.SnsTranslateManager$SnsTranslateInfo");
            return equals;
        }
    }

    /* renamed from: com.tencent.mm.plugin.sns.model.w1$b */
    public static class C94967b {

        /* renamed from: a */
        public String f275303a;

        /* renamed from: b */
        public String f275304b;

        /* renamed from: c */
        public String f275305c;

        /* renamed from: d */
        public boolean f275306d;

        /* renamed from: e */
        public boolean f275307e;

        /* renamed from: f */
        public int f275308f;

        /* renamed from: g */
        public boolean f275309g;

        /* renamed from: h */
        public boolean f275310h;
    }

    /* renamed from: a */
    public static void m120620a(String str, int i) {
        SnsMethodCalculate.markStartTimeMs("addTranlsateInfoFlag", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        if (f275297a.containsKey(str)) {
            C94967b bVar = f275297a.get(str);
            bVar.f275308f = i | bVar.f275308f;
            f275297a.put(str, bVar);
        }
        SnsMethodCalculate.markEndTimeMs("addTranlsateInfoFlag", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    /* renamed from: b */
    public static void m120621b(Menu menu, boolean z) {
        SnsMethodCalculate.markStartTimeMs("dealAddTranslateMenu", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        if (m120625f()) {
            if (z) {
                menu.add(0, 14, 0, C0966R.string.jjh);
            } else {
                menu.add(0, 15, 0, C0966R.string.jjh);
            }
        }
        SnsMethodCalculate.markEndTimeMs("dealAddTranslateMenu", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    /* renamed from: c */
    public static void m120622c(Menu menu, boolean z) {
        SnsMethodCalculate.markStartTimeMs("dealAddUnTranslateMenu", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        if (m120625f()) {
            if (z) {
                menu.add(0, 16, 0, C0966R.string.jjj);
            } else {
                menu.add(0, 17, 0, C0966R.string.jjj);
            }
        }
        SnsMethodCalculate.markEndTimeMs("dealAddUnTranslateMenu", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    /* renamed from: d */
    public static String m120623d(String str, String str2) {
        SnsMethodCalculate.markStartTimeMs("genCommentTranlsateId", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        String str3 = str + ";" + str2;
        SnsMethodCalculate.markEndTimeMs("genCommentTranlsateId", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        return str3;
    }

    /* renamed from: e */
    public static C94967b m120624e(String str) {
        SnsMethodCalculate.markStartTimeMs("getCacheTranslateInfo", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        if (f275297a.containsKey(str)) {
            C94967b bVar = f275297a.get(str);
            SnsMethodCalculate.markEndTimeMs("getCacheTranslateInfo", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
            return bVar;
        }
        SnsMethodCalculate.markEndTimeMs("getCacheTranslateInfo", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        return null;
    }

    /* renamed from: f */
    public static boolean m120625f() {
        SnsMethodCalculate.markStartTimeMs("isTranslateFeatureOn", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        C88144b.m109788f("translate");
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("TranslateSnsOff");
        if (Util.isNullOrNil(c)) {
            SnsMethodCalculate.markEndTimeMs("isTranslateFeatureOn", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
            return true;
        } else if (Util.safeParseInt(c) != 0) {
            SnsMethodCalculate.markEndTimeMs("isTranslateFeatureOn", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
            return false;
        } else {
            SnsMethodCalculate.markEndTimeMs("isTranslateFeatureOn", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
            return true;
        }
    }

    /* renamed from: g */
    public static boolean m120626g(String str, int i) {
        SnsMethodCalculate.markStartTimeMs("isTranslateInfoContainsFlag", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        boolean z = false;
        if (f275297a.containsKey(str)) {
            if ((f275297a.get(str).f275308f & i) != 0) {
                z = true;
            }
            SnsMethodCalculate.markEndTimeMs("isTranslateInfoContainsFlag", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
            return z;
        }
        SnsMethodCalculate.markEndTimeMs("isTranslateInfoContainsFlag", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        return false;
    }

    /* renamed from: h */
    public static void m120627h(String str, int i, String str2, String str3) {
        SnsMethodCalculate.markStartTimeMs("notifyTranslateFinish", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        if (f275297a.containsKey(str)) {
            C94967b bVar = f275297a.get(str);
            bVar.f275305c = str3;
            bVar.f275304b = str2;
            bVar.f275306d = true;
            bVar.f275307e = Util.isNullOrNil(str2);
            f275297a.put(str, bVar);
        }
        if (Util.isNullOrNil(str2)) {
            C76701a.makeText(MMApplicationContext.getContext(), (int) C0966R.string.jji, 1).show();
        }
        SnsTranslateFinishEvent snsTranslateFinishEvent = new SnsTranslateFinishEvent();
        SnsTranslateFinishEvent.C92595a aVar = snsTranslateFinishEvent.f265201d;
        aVar.f265202a = i;
        aVar.f265203b = str;
        aVar.f265204c = str2;
        aVar.f265205d = str3;
        snsTranslateFinishEvent.publish();
        SnsMethodCalculate.markEndTimeMs("notifyTranslateFinish", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    /* renamed from: i */
    public static void m120628i(String str, int i) {
        SnsMethodCalculate.markStartTimeMs("notifyTranslateStart", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        if (!f275297a.containsKey(str)) {
            C94967b bVar = new C94967b();
            bVar.f275303a = str;
            bVar.f275305c = null;
            bVar.f275304b = null;
            bVar.f275306d = false;
            bVar.f275307e = false;
            bVar.f275310h = true;
            bVar.f275309g = true;
            f275297a.put(str, bVar);
        }
        SnsTranslateStartEvent snsTranslateStartEvent = new SnsTranslateStartEvent();
        SnsTranslateStartEvent.C92597a aVar = snsTranslateStartEvent.f265208d;
        aVar.f265209a = i;
        aVar.f265210b = str;
        snsTranslateStartEvent.publish();
        SnsMethodCalculate.markEndTimeMs("notifyTranslateStart", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    /* renamed from: j */
    public static void m120629j(String str, int i) {
        SnsMethodCalculate.markStartTimeMs("removeTranslateInfoFlag", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        if (f275297a.containsKey(str)) {
            C94967b bVar = f275297a.get(str);
            bVar.f275308f &= ~i;
            if (i != 2 && i == 4) {
                bVar.f275310h = true;
            }
            f275297a.put(str, bVar);
        }
        SnsMethodCalculate.markEndTimeMs("removeTranslateInfoFlag", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    /* renamed from: k */
    public static void m120630k(C96230u uVar) {
        SnsMethodCalculate.markStartTimeMs("translateComment", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        if (!(uVar == null || uVar.f281195e == null)) {
            String str = uVar.f281193c;
            if (Util.isNullOrNil(str)) {
                Log.m105924i("MicroMsg.SnsTranslateManager", "commentContent is empty, quit translate");
                SnsMethodCalculate.markEndTimeMs("translateComment", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
                return;
            }
            StringBuilder sb = new StringBuilder();
            w64 w64 = uVar.f281195e;
            int i = w64.f299709j;
            sb.append(i != 0 ? (long) i : w64.f299714r);
            sb.append("");
            String d = m120623d(uVar.f281192b, sb.toString());
            if (f275297a.containsKey(d)) {
                C94967b bVar = f275297a.get(d);
                if (!bVar.f275306d || Util.isNullOrNil(bVar.f275304b)) {
                    f275297a.remove(d);
                } else {
                    Log.m105919d("MicroMsg.SnsTranslateManager", "translateComment, get from cache, id:%s", d);
                    m120627h(bVar.f275303a, 2, bVar.f275304b, bVar.f275305c);
                    SnsMethodCalculate.markEndTimeMs("translateComment", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
                    return;
                }
            }
            TranslateMessageEvent translateMessageEvent = new TranslateMessageEvent();
            TranslateMessageEvent.C67800a aVar = translateMessageEvent.f193961d;
            aVar.f193963b = d;
            aVar.f193962a = str;
            aVar.f193964c = 3;
            translateMessageEvent.publish();
            m120628i(d, 2);
            C94966a aVar2 = new C94966a();
            aVar2.f275299a = d;
            aVar2.f275302d = 3;
            f275298b.add(aVar2);
            Log.m105919d("MicroMsg.SnsTranslateManager", "translateComment, id:%s", aVar2.f275299a);
        }
        SnsMethodCalculate.markEndTimeMs("translateComment", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    /* renamed from: l */
    public static void m120631l(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("translatePost", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        if (snsInfo != null) {
            String snsId = snsInfo.getSnsId();
            Log.m105919d("MicroMsg.SnsTranslateManager", "translatePost, id:%s", snsId);
            if (snsInfo.field_snsId == 0) {
                Log.m105918d("MicroMsg.SnsTranslateManager", "translatePost, the id is null or zero");
                f275297a.remove(snsId);
                m120627h(snsId, 1, (String) null, (String) null);
                SnsMethodCalculate.markEndTimeMs("translatePost", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
                return;
            }
            if (f275297a.containsKey(snsId)) {
                C94967b bVar = f275297a.get(snsId);
                if (!bVar.f275306d || bVar.f275307e) {
                    f275297a.remove(snsId);
                } else {
                    Log.m105919d("MicroMsg.SnsTranslateManager", "translatePost, get from cache, id:%s", snsId);
                    m120627h(bVar.f275303a, 1, bVar.f275304b, bVar.f275305c);
                    SnsMethodCalculate.markEndTimeMs("translatePost", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
                    return;
                }
            }
            if (snsInfo.getTimeLine() != null) {
                String str = snsInfo.getTimeLine().ContentDesc;
                TranslateMessageEvent translateMessageEvent = new TranslateMessageEvent();
                TranslateMessageEvent.C67800a aVar = translateMessageEvent.f193961d;
                aVar.f193963b = snsId;
                aVar.f193962a = str;
                aVar.f193964c = 2;
                translateMessageEvent.publish();
                m120628i(snsInfo.getSnsId() + "", 1);
                C94966a aVar2 = new C94966a();
                aVar2.f275299a = snsId;
                aVar2.f275302d = 2;
                f275298b.add(aVar2);
            }
        }
        SnsMethodCalculate.markEndTimeMs("translatePost", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    /* renamed from: m */
    public static void m120632m(C96230u uVar) {
        SnsMethodCalculate.markStartTimeMs("unTranslateComment", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        if (uVar != null) {
            StringBuilder sb = new StringBuilder();
            w64 w64 = uVar.f281195e;
            int i = w64.f299709j;
            sb.append(i != 0 ? (long) i : w64.f299714r);
            sb.append("");
            String d = m120623d(uVar.f281192b, sb.toString());
            m120635p(m120624e(d));
            SnsUnTranslateEvent snsUnTranslateEvent = new SnsUnTranslateEvent();
            SnsUnTranslateEvent.C92598a aVar = snsUnTranslateEvent.f265211d;
            aVar.f265212a = 2;
            aVar.f265213b = d;
            snsUnTranslateEvent.publish();
            Log.m105919d("MicroMsg.SnsTranslateManager", "unTranslateComment, id:%s", d);
        }
        SnsMethodCalculate.markEndTimeMs("unTranslateComment", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    /* renamed from: n */
    public static void m120633n(SnsInfo snsInfo) {
        SnsMethodCalculate.markStartTimeMs("unTranslatePost", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        if (snsInfo != null) {
            String snsId = snsInfo.getSnsId();
            m120635p(m120624e(snsId));
            SnsUnTranslateEvent snsUnTranslateEvent = new SnsUnTranslateEvent();
            SnsUnTranslateEvent.C92598a aVar = snsUnTranslateEvent.f265211d;
            aVar.f265212a = 1;
            aVar.f265213b = snsId;
            snsUnTranslateEvent.publish();
            Log.m105919d("MicroMsg.SnsTranslateManager", "unTranslatePost, id:%s", snsId);
        }
        SnsMethodCalculate.markEndTimeMs("unTranslatePost", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    /* renamed from: o */
    public static void m120634o(C94967b bVar) {
        SnsMethodCalculate.markStartTimeMs("updateAnimFlagWhenTranslateFinish", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        int i = bVar.f275308f;
        if ((i & 2) != 0) {
            bVar.f275309g = false;
        } else if ((i & 4) != 0) {
            bVar.f275310h = false;
        }
        f275297a.put(bVar.f275303a, bVar);
        SnsMethodCalculate.markEndTimeMs("updateAnimFlagWhenTranslateFinish", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }

    /* renamed from: p */
    public static void m120635p(C94967b bVar) {
        SnsMethodCalculate.markStartTimeMs("updateAnimFlagWhenUnTranslateTranslateFinish", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
        int i = bVar.f275308f;
        if ((i & 2) != 0) {
            bVar.f275309g = true;
        } else if ((i & 4) != 0) {
            bVar.f275310h = true;
        }
        f275297a.put(bVar.f275303a, bVar);
        SnsMethodCalculate.markEndTimeMs("updateAnimFlagWhenUnTranslateTranslateFinish", "com.tencent.mm.plugin.sns.model.SnsTranslateManager");
    }
}
