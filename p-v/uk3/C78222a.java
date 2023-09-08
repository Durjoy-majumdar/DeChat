package uk3;

import android.os.Build;
import android.text.Spannable;
import android.widget.TextView;
import com.tencent.p014mm.p136ui.widget.MMTextView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72994y1;
import com.tencent.p014mm.storage.C85801v1;
import de3.C75359b0;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import gb0.C75896b;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p156gj.C87203t;
import tc2.C118418g;

/* renamed from: uk3.a */
public class C78222a {

    /* renamed from: a */
    public static volatile C78222a f229179a;

    /* renamed from: b */
    public static final MMHandler f229180b = new MMHandler("AAChattingHelper");

    /* renamed from: uk3.a$a */
    public enum C78223a implements MMTextView.C74960a {
        TEXT_CALLBACK;

        /* renamed from: a */
        public void mo108242a(CharSequence charSequence, TextView.BufferType bufferType, long j) {
            C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(j);
            if (Util.isNullOrNil(b002.mo108768t())) {
                Log.m105929w("MicroMsg.AAChattingHelper", "hy: not retrieving correct msg from db. try use old one. msg id: %d", Long.valueOf(j));
            } else if ((b002.mo108762o2() & 16) == 0) {
                C78222a.m94509b(charSequence, b002, 0);
            } else {
                Log.m105927v("MicroMsg.AAChattingHelper", "hy: show already checked. msg id is: %d", Long.valueOf(j));
            }
        }
    }

    /* renamed from: uk3.a$b */
    public static class C78224b implements Runnable {

        /* renamed from: d */
        public CharSequence f229183d;

        /* renamed from: e */
        public C72963f4 f229184e;

        /* renamed from: f */
        public int f229185f;

        /* renamed from: uk3.a$b$a */
        public static class C78225a {

            /* renamed from: a */
            public String f229186a;

            /* renamed from: b */
            public String f229187b;

            public C78225a(String str, String str2) {
                this.f229186a = str;
                this.f229187b = str2;
            }
        }

        public C78224b(CharSequence charSequence, C72963f4 f4Var, int i) {
            this.f229183d = charSequence;
            this.f229184e = f4Var;
            this.f229185f = i;
        }

        /* renamed from: a */
        public final void mo108243a(Spannable spannable) {
            String str;
            Class cls = C75700k0.class;
            System.nanoTime();
            Object[] spans = spannable.getSpans(0, spannable.length(), Object.class);
            ArrayList arrayList = new ArrayList(1);
            if (spans == null || spans.length == 0) {
                arrayList = null;
            } else {
                for (Object obj : spans) {
                    if (obj != null && C118418g.INSTANCE.mo175829ox(obj, C75359b0.class)) {
                        String substring = spannable.toString().substring(spannable.getSpanStart(obj), spannable.getSpanEnd(obj));
                        try {
                            str = Util.nullAs(new JSONObject(obj.toString()).optString("type"), obj.getClass().getName());
                        } catch (JSONException unused) {
                            str = obj.getClass().getName();
                        }
                        arrayList.add(new C78225a(substring, str));
                    }
                }
            }
            if (arrayList != null && arrayList.size() != 0) {
                C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(this.f229184e.getMsgId());
                this.f229184e = b002;
                if (!Util.isNullOrNil(b002.mo108768t())) {
                    C72963f4 f4Var = this.f229184e;
                    f4Var.mo108735O2(f4Var.mo108762o2() | 16);
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(this.f229184e.getMsgId(), this.f229184e);
                }
                C75896b r = C97625j3.m125812b().mo105903r();
                r.getClass();
                C85801v1 u = C97625j3.m125812b().mo105906u();
                C72994y1.C72995a aVar = C72994y1.C72995a.USERINFO_MONITOR_IS_TRIGGERED_BOOLEAN_SYNC;
                Boolean bool = Boolean.FALSE;
                if (!((Boolean) u.mo119685f(aVar, bool)).booleanValue()) {
                    Log.m105918d("MicroMsg.ChattingMonitoredBannerStorage", "hy: monitored illegal set text. mark now as the start time ");
                    C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_MONITOR_BANNER_MSG_COME_TIME_TICKS_LONG_SYNC, Long.valueOf(Util.nowSecond()));
                    C97625j3.m125812b().mo105906u().mo119677K(aVar, Boolean.TRUE);
                    r.mo106163b();
                }
                C75896b r2 = C97625j3.m125812b().mo105903r();
                r2.getClass();
                C97625j3.m125812b().mo105906u().mo119677K(C72994y1.C72995a.USERINFO_CHATTING_BANNER_CLOSED_BOOLEAN_SYNC, bool);
                r2.mo106163b();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C78225a aVar2 = (C78225a) it.next();
                    String str2 = aVar2.f229186a;
                    String str3 = aVar2.f229187b;
                    C115669n nVar = C115669n.INSTANCE;
                    nVar.mo160131h(14237, "msg", Long.valueOf(this.f229184e.getMsgId()), Build.MANUFACTURER, C87203t.m108275k(), Build.VERSION.RELEASE, Build.VERSION.INCREMENTAL, Build.DISPLAY, Integer.valueOf(this.f229185f), str3);
                    nVar.idkeyStat(587, 0, 1, false);
                }
            }
        }

        public void run() {
            CharSequence charSequence = this.f229183d;
            if (charSequence instanceof Spannable) {
                try {
                    mo108243a((Spannable) charSequence);
                } catch (Exception unused) {
                }
            }
        }
    }

    public C78222a() {
        f229180b.setLogging(false);
    }

    /* renamed from: a */
    public static C78222a m94508a() {
        C78222a aVar;
        if (f229179a != null) {
            return f229179a;
        }
        synchronized (C78222a.class) {
            if (f229179a == null) {
                f229179a = new C78222a();
            }
            aVar = f229179a;
        }
        return aVar;
    }

    /* renamed from: b */
    public static void m94509b(CharSequence charSequence, C72963f4 f4Var, int i) {
        if (charSequence instanceof Spannable) {
            f229180b.postToWorker(new C78224b(charSequence, f4Var, i));
        }
    }
}
