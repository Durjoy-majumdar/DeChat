package hb2;

import android.app.Activity;
import android.os.Looper;
import android.os.Message;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.plugin.p081mv.p082ui.view.MusicMvCommentView;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import f40.C86709a0;
import gy3.C87412m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import jb2.C46467s;
import jb2.C46469u;
import pe3.C89349b;
import te3.C64488kb1;

/* renamed from: hb2.o */
public final class C59830o {

    /* renamed from: a */
    public static final C59830o f170808a = new C59830o();

    /* renamed from: b */
    public static boolean f170809b = true;

    /* renamed from: c */
    public static String f170810c = "";

    /* renamed from: d */
    public static int f170811d = 0;

    /* renamed from: e */
    public static boolean f170812e = false;

    /* renamed from: f */
    public static String f170813f = "";

    /* renamed from: g */
    public static Integer f170814g;

    /* renamed from: h */
    public static Long f170815h;

    /* renamed from: i */
    public static final HashMap<Integer, Long> f170816i = new HashMap<>();

    /* renamed from: j */
    public static boolean f170817j;

    /* renamed from: k */
    public static C64488kb1 f170818k;

    /* renamed from: l */
    public static C89349b f170819l;

    /* renamed from: m */
    public static final List<Long> f170820m;

    /* renamed from: n */
    public static ArrayList<MusicMvCommentView.C57091a> f170821n = new ArrayList<>();

    /* renamed from: o */
    public static final HashMap<Integer, WeakReference<TextView>> f170822o = new HashMap<>();

    /* renamed from: p */
    public static final HashMap<Integer, WeakReference<TextView>> f170823p = new HashMap<>();

    /* renamed from: q */
    public static final HashMap<Integer, WeakReference<MusicMvCommentView>> f170824q = new HashMap<>();

    /* renamed from: r */
    public static final HashMap<Integer, WeakReference<LinearLayout>> f170825r = new HashMap<>();

    /* renamed from: s */
    public static C46469u f170826s;

    /* renamed from: t */
    public static int f170827t;

    /* renamed from: u */
    public static boolean f170828u;

    /* renamed from: v */
    public static Activity f170829v;

    /* renamed from: w */
    public static final MMHandler f170830w = new MMHandler(Looper.getMainLooper(), (MMHandler.Callback) C59831a.f170831d);

    /* renamed from: hb2.o$a */
    public static final class C59831a implements MMHandler.Callback {

        /* renamed from: d */
        public static final C59831a f170831d = new C59831a();

        public final boolean handleMessage(Message message) {
            C87412m.m108594g(message, LocaleUtil.ITALIAN);
            if (message.what == 0) {
                C59830o.f170812e = false;
                C59830o.f170813f = "";
                Collection<WeakReference<TextView>> values = C59830o.f170822o.values();
                C87412m.m108593f(values, "onlineUserTvMap.values");
                for (WeakReference weakReference : values) {
                    TextView textView = (TextView) weakReference.get();
                    if (textView != null) {
                        textView.setVisibility(0);
                    }
                }
                Collection<WeakReference<TextView>> values2 = C59830o.f170823p.values();
                C87412m.m108593f(values2, "userEnterTipTvMap.values");
                for (WeakReference weakReference2 : values2) {
                    TextView textView2 = (TextView) weakReference2.get();
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                }
            }
            return false;
        }
    }

    static {
        List<Long> synchronizedList = Collections.synchronizedList(new ArrayList());
        C87412m.m108593f(synchronizedList, "synchronizedList(ArrayList())");
        f170820m = synchronizedList;
    }

    /* renamed from: a */
    public final void mo84787a(boolean z) {
        f170817j = z;
        C64488kb1 kb12 = f170818k;
        String str = kb12 != null ? kb12.f183909i : null;
        C89349b bVar = f170819l;
        if (str != null && bVar != null) {
            C86709a0.m107524d().mo123460f(new C46467s(str, bVar, z, 0));
        }
    }

    /* renamed from: b */
    public final void mo84788b() {
        StringBuilder sb = new StringBuilder();
        sb.append("onSessionEnd, songName:");
        C64488kb1 kb12 = f170818k;
        String str = null;
        sb.append(kb12 != null ? kb12.f183904d : null);
        sb.append(", singer:");
        C64488kb1 kb13 = f170818k;
        if (kb13 != null) {
            str = kb13.f183905e;
        }
        sb.append(str);
        Log.m105924i("MicroMsg.Mv.MvChattingDataManger", sb.toString());
        mo84787a(true);
        f170821n.clear();
        f170809b = true;
    }
}
