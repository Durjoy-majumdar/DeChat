package cj1;

import android.content.Intent;
import android.os.Bundle;
import cj1.C0576n4;
import com.tencent.p014mm.live.api.LiveConfig;
import com.tencent.p014mm.protocal.protobuf.FinderObject;
import com.tencent.p014mm.sdk.platformtools.Log;
import eb0.C31543z5;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import o40.C61926c;
import pe3.C89349b;
import rx3.C13598b0;
import sx3.C110818d0;
import sx3.C64197v;
import te3.C49098d51;
import te3.C50168kr0;
import te3.C51333t21;
import te3.C51395th0;
import te3.C51745vv0;
import te3.C51938x81;
import te3.C64347eq2;
import te3.C64848y91;

/* renamed from: cj1.b1 */
public final class C54738b1 {

    /* renamed from: B */
    public static final C0518a f153409B = new C0518a((C8480h) null);

    /* renamed from: C */
    public static final ConcurrentHashMap<String, C54738b1> f153410C = new ConcurrentHashMap<>();

    /* renamed from: A */
    public C64347eq2 f153411A;

    /* renamed from: a */
    public C49098d51 f153412a;

    /* renamed from: b */
    public C51333t21 f153413b;

    /* renamed from: c */
    public LinkedList<C64848y91> f153414c;

    /* renamed from: d */
    public C64848y91 f153415d;

    /* renamed from: e */
    public LinkedList<C51745vv0> f153416e;

    /* renamed from: f */
    public int f153417f;

    /* renamed from: g */
    public int f153418g;

    /* renamed from: h */
    public byte[] f153419h;

    /* renamed from: i */
    public int f153420i;

    /* renamed from: j */
    public int f153421j = -1;

    /* renamed from: k */
    public int f153422k;

    /* renamed from: l */
    public ArrayList<LiveConfig> f153423l = new ArrayList<>();

    /* renamed from: m */
    public int f153424m = -1;

    /* renamed from: n */
    public int f153425n = -1;

    /* renamed from: o */
    public int f153426o;

    /* renamed from: p */
    public C50168kr0 f153427p;

    /* renamed from: q */
    public String f153428q;

    /* renamed from: r */
    public FinderObject f153429r;

    /* renamed from: s */
    public C51395th0 f153430s;

    /* renamed from: t */
    public int f153431t;

    /* renamed from: u */
    public final ArrayList<String> f153432u = new ArrayList<>();

    /* renamed from: v */
    public HashMap<Long, String> f153433v = new HashMap<>();

    /* renamed from: w */
    public C51938x81 f153434w;

    /* renamed from: x */
    public Bundle f153435x;

    /* renamed from: y */
    public String f153436y = "";

    /* renamed from: z */
    public String f153437z = "";

    /* renamed from: cj1.b1$a */
    public static final class C0518a {
        public C0518a(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo559a() {
            C0518a aVar = C54738b1.f153409B;
            Log.printInfoStack("Finder.FinderLiveBundle", "clearBundleStore", new Object[0]);
            ConcurrentHashMap<String, C54738b1> concurrentHashMap = C54738b1.f153410C;
            synchronized (concurrentHashMap) {
                concurrentHashMap.clear();
                C13598b0 b0Var = C13598b0.f38549a;
            }
            C0576n4.C0577a aVar2 = C0576n4.f1379b;
            Log.printInfoStack("Finder.FinderLiveScrollSquareBundle", "clearBundleStore", new Object[0]);
            ConcurrentHashMap<String, C0576n4> concurrentHashMap2 = C0576n4.f1380c;
            synchronized (concurrentHashMap2) {
                concurrentHashMap2.clear();
            }
        }

        /* renamed from: b */
        public final C54738b1 mo560b(Intent intent) {
            if (intent == null) {
                return null;
            }
            String stringExtra = intent.getStringExtra("KEY_PARAMS_CONFIG_KEY");
            if (stringExtra == null) {
                stringExtra = "";
            }
            C0518a aVar = C54738b1.f153409B;
            Log.printInfoStack("Finder.FinderLiveBundle", "getFromIntent " + intent.hashCode() + ", key:" + stringExtra, new Object[0]);
            return C54738b1.f153410C.get(stringExtra);
        }

        /* renamed from: c */
        public final void mo561c(Bundle bundle, C54738b1 b1Var) {
            if (bundle != null && b1Var != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(C31543z5.m39453c());
                sb.append('_');
                sb.append(b1Var.hashCode());
                String sb4 = sb.toString();
                C54738b1.f153410C.put(sb4, b1Var);
                bundle.putString("KEY_PARAMS_CONFIG_KEY", sb4);
                Log.printInfoStack("Finder.FinderLiveBundle", "saveToBundle " + bundle.hashCode() + ", " + b1Var.hashCode() + ", key:" + sb4, new Object[0]);
            }
        }

        /* renamed from: d */
        public final void mo562d(Intent intent, C54738b1 b1Var) {
            if (intent != null && b1Var != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(C31543z5.m39453c());
                sb.append('_');
                sb.append(b1Var.hashCode());
                String sb4 = sb.toString();
                C54738b1.f153410C.put(sb4, b1Var);
                intent.putExtra("KEY_PARAMS_CONFIG_KEY", sb4);
                Log.printInfoStack("Finder.FinderLiveBundle", "saveToIntent " + intent.hashCode() + ", " + b1Var.hashCode() + ", key:" + sb4, new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public final void mo75632a(Intent intent, long j) {
        ArrayList<String> arrayList = null;
        String stringExtra = intent != null ? intent.getStringExtra("key_enter_live_export_id") : null;
        boolean z = false;
        if (!(stringExtra == null || stringExtra.length() == 0)) {
            this.f153433v.put(Long.valueOf(j), stringExtra);
        }
        this.f153432u.clear();
        if (intent != null) {
            arrayList = intent.getStringArrayListExtra("key_enter_live_export_id_list");
        }
        if (arrayList == null || arrayList.isEmpty()) {
            z = true;
        }
        if (!z) {
            this.f153432u.addAll(arrayList);
        }
    }

    /* renamed from: b */
    public final void mo75633b(Intent intent) {
        String str;
        int i = 0;
        if (intent != null) {
            i = intent.getIntExtra("key_enter_live_param_by_pass_type", 0);
        }
        if (intent == null || (str = intent.getStringExtra("key_enter_live_param_by_pass_info")) == null) {
            str = "";
        }
        C51395th0 th02 = new C51395th0();
        th02.f142216d = i;
        th02.f142217e = C89349b.m111675b(str);
        this.f153430s = th02;
    }

    /* renamed from: c */
    public final void mo75634c(Intent intent) {
        int i = 1;
        int i2 = 0;
        if (intent != null && intent.hasExtra("key_enter_live_param_pull_more_type")) {
            this.f153425n = intent.getIntExtra("key_enter_live_param_pull_more_type", -1);
            return;
        }
        if (intent != null) {
            i2 = intent.getIntExtra("key_enter_live_param_visitor_enter_scene", 0);
        }
        this.f153431t = i2;
        if (!(i2 == 3 || i2 == 4)) {
            i = this.f153425n;
        }
        this.f153425n = i;
    }

    /* renamed from: d */
    public final LiveConfig mo75635d() {
        return (LiveConfig) C110818d0.m150917O(this.f153423l, this.f153420i);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("FinderLiveConfig:");
        StringBuilder sb4 = new StringBuilder();
        sb4.append("[tabType:");
        sb4.append(this.f153421j);
        sb4.append(",commentScene:");
        sb4.append(this.f153422k);
        sb4.append(",curPos:");
        sb4.append(this.f153420i);
        sb4.append(",bindShop:");
        sb4.append(false);
        sb4.append(",nicknameOption:");
        sb4.append(this.f153436y);
        sb4.append(", dataList:");
        int size = this.f153423l.size();
        if (size <= 0) {
            str = "empty";
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("count:" + size + ' ');
            int i = 0;
            for (T next : this.f153423l) {
                int i2 = i + 1;
                String str2 = null;
                if (i >= 0) {
                    LiveConfig liveConfig = (LiveConfig) next;
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append("##live_");
                    sb5.append(i);
                    sb5.append(":username:");
                    sb5.append(liveConfig.f157069j);
                    sb5.append(",liveId:");
                    sb5.append(Long.valueOf(liveConfig.f157064e));
                    sb5.append(", nick:");
                    sb5.append(liveConfig.f157053K);
                    sb5.append(" desc:");
                    sb5.append(liveConfig.f157076t);
                    sb5.append(" sessionBuffer:");
                    String str3 = liveConfig.f157046D;
                    if (str3 != null) {
                        Pattern pattern = C61926c.f176038a;
                        if (10 <= str3.length()) {
                            str3 = str3.substring(0, 10);
                            C87412m.m108593f(str3, "this as java.lang.String…ing(startIndex, endIndex)");
                        }
                        str2 = str3;
                    }
                    sb5.append(str2);
                    sb5.append("...,streamUrl:");
                    sb5.append(liveConfig.f157072p);
                    sb5.append(';');
                    stringBuffer.append(sb5.toString());
                    i = i2;
                } else {
                    C64197v.m75542k();
                    throw null;
                }
            }
            str = stringBuffer.toString();
            C87412m.m108593f(str, "StringBuffer().also {\n  …   }\n        }.toString()");
        }
        sb4.append(str);
        sb4.append(",pullMoreType:");
        sb4.append(this.f153425n);
        sb.append(sb4.toString());
        String sb6 = sb.toString();
        C87412m.m108593f(sb6, "sb.toString()");
        return sb6;
    }
}
