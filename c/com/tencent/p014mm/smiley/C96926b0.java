package com.tencent.p014mm.smiley;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.util.SparseArray;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.smiley.C96940i;
import com.tencent.p014mm.smiley.C96965r;
import com.tencent.p014mm.storage.emotion.SmileyInfo;
import com.tencent.p014mm.storage.emotion.SmileyPanelConfigInfo;
import com.tencent.p014mm.vfs.C86009m1;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import f40.C86709a0;
import gy3.C8479f0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import p008bq.C39831i1;
import p207nl.C100134k;
import p207nl.C89008j;
import sx3.C110818d0;
import z51.C39315g;
import zt3.C119157j;

/* renamed from: com.tencent.mm.smiley.b0 */
public class C96926b0 implements C39831i1 {

    /* renamed from: g */
    public static C96926b0 f283933g;

    /* renamed from: a */
    public final String f283934a = (C89008j.f256613a.mo123383b() + "panel/");

    /* renamed from: b */
    public String f283935b = "";

    /* renamed from: c */
    public boolean f283936c = false;

    /* renamed from: d */
    public final List<SmileyPanelConfigInfo> f283937d;

    /* renamed from: e */
    public final SparseArray<SmileyPanelConfigInfo> f283938e;

    /* renamed from: f */
    public String f283939f;

    public C96926b0(Context context) {
        List<SmileyPanelConfigInfo> synchronizedList = Collections.synchronizedList(new ArrayList());
        this.f283937d = synchronizedList;
        SparseArray<SmileyPanelConfigInfo> sparseArray = new SparseArray<>();
        this.f283938e = sparseArray;
        synchronizedList.clear();
        sparseArray.clear();
        this.f283939f = LocaleUtil.getApplicationLanguage();
    }

    /* renamed from: b */
    public static C96926b0 m124490b() {
        if (f283933g == null) {
            synchronized (C96926b0.class) {
                if (f283933g == null) {
                    f283933g = new C96926b0(MMApplicationContext.getContext());
                }
            }
        }
        C96926b0 b0Var = f283933g;
        synchronized (b0Var) {
            if (!b0Var.f283936c) {
                if (!MMApplicationContext.isMainProcess()) {
                    b0Var.mo135520e();
                } else if (C86709a0.m107522a()) {
                    b0Var.mo135520e();
                }
            }
        }
        return f283933g;
    }

    /* renamed from: a */
    public boolean mo135517a(String str) {
        if (Util.isNullOrNil(str)) {
            return false;
        }
        synchronized (this.f283937d) {
            for (SmileyPanelConfigInfo smileyPanelConfigInfo : this.f283937d) {
                if (Util.isEqual(smileyPanelConfigInfo.field_key, str)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: c */
    public Drawable mo135518c(String str) {
        C96973t0 t0Var = null;
        if (Util.isNullOrNil(str)) {
            return null;
        }
        SmileyInfo g = C96945j0.m124519b().mo135535g(str);
        if (g != null) {
            C96945j0 b = C96945j0.m124519b();
            int i = g.field_position;
            return i >= 0 ? b.mo135532d(i) : b.mo135531c(g.field_fileName);
        }
        C96931e a = C96931e.m124499a();
        C96931e.m124499a().getClass();
        boolean z = C96965r.f284067d;
        C96965r.C44649c.f121057a.getClass();
        if (!(str.length() == 0)) {
            C96940i iVar = C96940i.C96942b.f283995a;
            int length = str.length();
            C96951l lVar = new C96951l(iVar.f283994e);
            C8479f0 f0Var = new C8479f0();
            lVar.mo135537a(str, 0, length, new C96949k(f0Var));
            Object obj = (C96974x) f0Var.f27484d;
            if (obj != null && (obj instanceof C96973t0)) {
                t0Var = (C96973t0) obj;
            }
        }
        return a.mo126279F(t0Var);
    }

    /* renamed from: d */
    public String mo135519d(String str) {
        if (Util.isNullOrNil(str)) {
            return "";
        }
        SmileyInfo g = C96945j0.m124519b().mo135535g(str);
        return g != null ? (!this.f283939f.equals("zh_CN") || Util.isNullOrNil(g.field_cnValue)) ? ((this.f283939f.equals("zh_TW") || this.f283939f.equals("zh_HK")) && !Util.isNullOrNil(g.field_twValue)) ? g.field_twValue : g.field_enValue : g.field_cnValue : str;
    }

    /* renamed from: e */
    public synchronized void mo135520e() {
        Log.m105924i("MicroMsg.MergerSmileyManager", "updateSmileyPanelInfo");
        this.f283937d.clear();
        this.f283935b = ((C39315g) C86312j.m106911c(C39315g.class)).getProvider().mo138037v();
        new ArrayList();
        ArrayList<SmileyPanelConfigInfo> arrayList = new ArrayList<>();
        int d = C100134k.m130830d(this.f283934a + "config.conf");
        int d2 = C100134k.m130830d("assets:///panel/config.conf");
        String str = this.f283934a + this.f283935b;
        String str2 = "assets:///panel/" + this.f283935b;
        Log.m105925i("MicroMsg.MergerSmileyManager", "updateSmileyPanelInfo: local:%s, asset:%s", Integer.valueOf(d), Integer.valueOf(d2));
        if (d > 0 && d >= d2 && C86013q1.m106450k(str)) {
            arrayList = C100134k.m130827a(new C86009m1(str));
            Log.m105925i("MicroMsg.MergerSmileyManager", "updateSmileyPanelInfo: localSize %s", Integer.valueOf(arrayList.size()));
        }
        if (arrayList.size() <= 0) {
            arrayList = C100134k.m130827a(new C86009m1(str2));
            if (arrayList.size() < 50) {
                Log.m105925i("MicroMsg.MergerSmileyManager", "updateSmileyPanelInfo: from asset xml %s", Integer.valueOf(arrayList.size()));
                try {
                    Log.m105925i("MicroMsg.MergerSmileyManager", "updateSmileyPanelInfo: %s", C86013q1.m106432N("assets:///panel/" + this.f283935b));
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.MergerSmileyManager", e, "", new Object[0]);
                }
            }
        }
        if (!arrayList.isEmpty()) {
            Set<String> keySet = C96945j0.m124519b().f284014o.keySet();
            C87412m.m108593f(keySet, "newEmojiMap.keys");
            List<T> y0 = C110818d0.m150953y0(keySet);
            int size = arrayList.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                SmileyPanelConfigInfo smileyPanelConfigInfo = arrayList.get(i2);
                String str3 = smileyPanelConfigInfo.field_key;
                if (str3.matches("^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$")) {
                    String str4 = new String(Base64.decode(str3, 0));
                    smileyPanelConfigInfo.field_key = str4;
                    str3 = str4;
                }
                if (!str3.startsWith("[") || y0.contains(str3)) {
                    this.f283937d.add(smileyPanelConfigInfo);
                    this.f283938e.put(i, smileyPanelConfigInfo);
                    i++;
                } else {
                    Log.m105925i("MicroMsg.MergerSmileyManager", "no smiley info. key:%s", str3);
                }
            }
            if (!C86013q1.m106450k(str)) {
                ((C119157j) C119157j.f356862d).mo183884o(new b0$$a(this, str2, str));
            }
        } else {
            Log.m105924i("MicroMsg.MergerSmileyManager", "smiley panel list is null.");
        }
        this.f283936c = true;
    }
}
