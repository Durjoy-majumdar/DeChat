package com.tencent.p014mm.plugin.webview.emojistore;

import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.PreEmotionSearchEvent;
import com.tencent.p014mm.plugin.webview.p128ui.tools.jsapi.C44040v3;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import f40.C86709a0;
import java.util.Map;
import ob0.C11385n;
import ob0.C117747y;
import p823sg.C90193h;
import sf0.C48374j0;

/* renamed from: com.tencent.mm.plugin.webview.emojistore.EmojiStoreWebViewLogic */
public class EmojiStoreWebViewLogic implements C11385n {

    /* renamed from: d */
    public C5861a f22046d = new C5861a((C58601) null);

    /* renamed from: com.tencent.mm.plugin.webview.emojistore.EmojiStoreWebViewLogic$a */
    public class C5861a {

        /* renamed from: a */
        public C5862a f22048a;

        /* renamed from: b */
        public String f22049b;

        /* renamed from: c */
        public long f22050c;

        /* renamed from: d */
        public boolean f22051d;

        /* renamed from: e */
        public boolean f22052e;

        public C5861a(C58601 r2) {
        }

        /* renamed from: a */
        public void mo6907a(int i, String str, String str2, int i2, long j) {
            String str3 = str;
            if (Util.isNullOrNil(str)) {
                Object[] objArr = new Object[3];
                objArr[0] = str3;
                objArr[1] = Integer.valueOf(i);
                objArr[2] = str2 == null ? "" : str2;
                Log.m105925i("MicroMsg.emoji.EmojiStoreWebViewLogic", "error query:%s type:%d pagebuf:%s ", objArr);
                return;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(str3);
            int i3 = i;
            stringBuffer.append(i);
            String f = C90193h.m112878f(stringBuffer.toString().getBytes());
            if (Util.isNullOrNil(this.f22049b) || !this.f22049b.equals(f) || System.currentTimeMillis() - this.f22050c > 8000 || !Util.isNullOrNil(str2)) {
                int i4 = i2;
            } else if (this.f22052e) {
                Log.m105925i("MicroMsg.emoji.EmojiStoreWebViewLogic", "hit the search cache %s", str3);
                C44040v3.m48330a(i2).mo7234w6(this.f22048a.mo6908j1().f141206d, true, C48374j0.m53717f(this.f22048a.mo6908j1().f141207e), this.f22048a.mo6908j1().f141208f);
                return;
            } else if (this.f22051d) {
                C5862a aVar = this.f22048a;
                if (aVar != null) {
                    aVar.f22059i = i2;
                }
                Log.m105924i("MicroMsg.emoji.EmojiStoreWebViewLogic", "wait the netscene running");
                return;
            } else {
                int i5 = i2;
                Log.m105924i("MicroMsg.emoji.EmojiStoreWebViewLogic", "netscene error try again");
            }
            Log.m105925i("MicroMsg.emoji.EmojiStoreWebViewLogic", "start New NetScene query:%s newMD5:%s webviewID:%d", str3, f, Integer.valueOf(i2));
            if (this.f22048a != null) {
                C86709a0.m107524d().mo123458d(this.f22048a);
            }
            this.f22049b = f;
            this.f22050c = System.currentTimeMillis();
            this.f22051d = true;
            this.f22052e = false;
            C86709a0.m107524d().mo123455a(234, EmojiStoreWebViewLogic.this);
            this.f22048a = new C5862a(i, str, str2.getBytes(), i2, j);
            C86709a0.m107524d().mo123460f(this.f22048a);
        }
    }

    public EmojiStoreWebViewLogic() {
        new IListener<PreEmotionSearchEvent>(C40008f.f107254d) {
            {
                this.__eventId = 1238741578;
            }

            public boolean callback(IEvent iEvent) {
                PreEmotionSearchEvent preEmotionSearchEvent = (PreEmotionSearchEvent) iEvent;
                if (!(preEmotionSearchEvent instanceof PreEmotionSearchEvent)) {
                    return false;
                }
                C5861a aVar = EmojiStoreWebViewLogic.this.f22046d;
                PreEmotionSearchEvent.C1110a aVar2 = preEmotionSearchEvent.f9403d;
                int i = aVar2.f9405b;
                String str = aVar2.f9404a;
                String str2 = aVar2.f9406c;
                aVar2.getClass();
                aVar.mo6907a(i, str, str2, 0, 0);
                return true;
            }
        }.alive();
    }

    /* renamed from: a */
    public static int m5580a(Map<String, Object> map, String str, int i) {
        String b = m5581b(map, str);
        return Util.isNullOrNil(b) ? i : Util.getInt(b, 0);
    }

    /* renamed from: b */
    public static String m5581b(Map<String, Object> map, String str) {
        return (!map.containsKey(str) || map.get(str) == null) ? "" : map.get(str).toString();
    }

    /* renamed from: c */
    public boolean mo6906c(Map<String, Object> map) {
        Log.m105925i("MicroMsg.emoji.EmojiStoreWebViewLogic", "getSearchEmotionData: %s", map.toString());
        String b = m5581b(map, "keyword");
        String b2 = m5581b(map, "nextPageBuffer");
        int a = m5580a(map, "type", 0);
        int a2 = m5580a(map, "webview_instance_id", 0);
        String b3 = m5581b(map, "searchID");
        this.f22046d.mo6907a(a, b, b2, a2, Util.isNullOrNil(b3) ? 0 : Long.valueOf(b3).longValue());
        return false;
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        if (yVar instanceof C5862a) {
            C86709a0.m107524d().mo123470p(234, this);
            C5861a aVar = this.f22046d;
            aVar.f22051d = false;
            C5862a aVar2 = (C5862a) yVar;
            if (i == 0 && i2 == 0) {
                aVar.f22052e = true;
            } else {
                aVar.f22052e = false;
                C44040v3.m48330a(aVar2.f22059i).mo7234w6("{}", aVar2.f22060j, "", 0);
            }
            C44040v3.m48330a(aVar2.f22059i).mo7234w6(aVar2.mo6908j1().f141206d, aVar2.f22060j, C48374j0.m53717f(aVar2.mo6908j1().f141207e), aVar2.mo6908j1().f141208f);
        }
    }
}
