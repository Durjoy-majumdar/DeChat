package com.tencent.p014mm.plugin.multitalk.p078ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.RemoteViews;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.multitalk.model.C105806i0;
import com.tencent.p014mm.plugin.multitalk.model.MultiTalkManager;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p1102pb.talkroom.sdk.MultiTalkGroup;
import com.tencent.p1102pb.talkroom.sdk.MultiTalkGroupMember;
import com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys;
import d62.C75339i;
import di3.C86312j;
import f40.C86709a0;
import f40.C86718e;
import f62.C75700k0;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import nj2.C109749c;
import p196ln.C76705f;
import p206nj.C11171e;
import p33.C110140b;
import p657pz.C89445b;
import rx3.C13604l;
import sx3.C36907w;
import sx3.C90364q0;
import vc3.C78382a;
import w33.C65925a0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.plugin.multitalk.ui.a */
public final class C105873a extends C110140b {

    /* renamed from: v */
    public C105874a f314911v;

    /* renamed from: w */
    public MultiTalkGroup f314912w;

    /* renamed from: x */
    public String f314913x = "";

    /* renamed from: y */
    public int f314914y;

    /* renamed from: z */
    public final Map<String, View> f314915z = new LinkedHashMap();

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.a$a */
    public interface C105874a {
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.a$b */
    public static final class C105875b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C105873a f314916d;

        public C105875b(C105873a aVar) {
            this.f314916d = aVar;
        }

        public final void run() {
            C105874a aVar = this.f314916d.f314911v;
            if (aVar != null) {
                MultiTalkManager.C105761g gVar = (MultiTalkManager.C105761g) aVar;
                MultiTalkManager.this.mo150648Y();
                MultiTalkManager.this.mo150626C(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.a$c */
    public static final class C105876c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C105873a f314917d;

        /* renamed from: e */
        public final /* synthetic */ GridLayout f314918e;

        public C105876c(C105873a aVar, GridLayout gridLayout) {
            this.f314917d = aVar;
            this.f314918e = gridLayout;
        }

        public final void run() {
            this.f314917d.f314914y = this.f314918e.getMeasuredWidth();
            C105873a.m142276u(this.f314917d);
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.a$d */
    public static final class C105877d implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C105873a f314919d;

        /* renamed from: e */
        public final /* synthetic */ View f314920e;

        public C105877d(C105873a aVar, View view) {
            this.f314919d = aVar;
            this.f314920e = view;
        }

        public final void run() {
            C105874a aVar = this.f314919d.f314911v;
            if (aVar != null) {
                MultiTalkManager.this.mo150650a();
            }
            View view = this.f314920e;
            if (view != null) {
                this.f314919d.mo161551r(view);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.a$e */
    public static final class C105878e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C105873a f314921d;

        public C105878e(C105873a aVar) {
            this.f314921d = aVar;
        }

        public final void run() {
            C105874a aVar = this.f314921d.f314911v;
            if (aVar != null) {
                MultiTalkManager.C105761g gVar = (MultiTalkManager.C105761g) aVar;
                MultiTalkManager.this.mo150648Y();
                MultiTalkManager.this.mo150626C(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.multitalk.ui.a$f */
    public static final class C105879f implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ MultiTalkGroup f314922d;

        /* renamed from: e */
        public final /* synthetic */ C105873a f314923e;

        /* renamed from: f */
        public final /* synthetic */ Intent f314924f;

        public C105879f(MultiTalkGroup multiTalkGroup, C105873a aVar, Intent intent) {
            this.f314922d = multiTalkGroup;
            this.f314923e = aVar;
            this.f314924f = intent;
        }

        public final void run() {
            MultiTalkGroup multiTalkGroup = this.f314922d;
            if (multiTalkGroup != null) {
                C105873a aVar = this.f314923e;
                Intent intent = this.f314924f;
                C105874a aVar2 = aVar.f314911v;
                if (aVar2 != null) {
                    MultiTalkManager.C105761g gVar = (MultiTalkManager.C105761g) aVar2;
                    String d = C105806i0.m142151d(multiTalkGroup);
                    if (C11171e.m11045b(28) || Build.VERSION.CODENAME.equals("Q")) {
                        MultiTalkManager multiTalkManager = MultiTalkManager.this;
                        multiTalkManager.f314502p0 = new MultiTalkManager.C105769o(multiTalkManager, multiTalkGroup, Boolean.FALSE);
                    }
                    String string = MMApplicationContext.getResources().getString(C0966R.string.gzi);
                    intent.putExtra("Voip_User", d);
                    String displayName = ((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(intent.getStringExtra("Voip_User")).getUsername());
                    RemoteViews remoteViews = new RemoteViews(MMApplicationContext.getPackageName(), C0966R.C0971layout.bha);
                    remoteViews.setTextViewText(C0966R.C0970id.f358873hk0, string);
                    remoteViews.setTextViewText(C0966R.C0970id.hju, displayName);
                    remoteViews.setImageViewResource(C0966R.C0970id.lnr, C0966R.C0969drawable.bsd);
                    remoteViews.setImageViewResource(C0966R.C0970id.hjk, C0966R.C0969drawable.bsa);
                    String str = displayName + string;
                    C89445b bVar = (C89445b) C86312j.m106911c(C89445b.class);
                    Context context = MMApplicationContext.getContext();
                    if (Util.isNullOrNil(C78382a.f229696b)) {
                        C78382a.f229696b = C86718e.m107552u().getString("voip_notify_channel_new_id", "voip_notify_channel_new_id");
                    }
                    bVar.mo123646Kt(context, "multitalk", ".ui.MultiTalkMainUI", intent, remoteViews, str, true, C78382a.f229696b, true);
                }
            }
        }
    }

    /* renamed from: u */
    public static final void m142276u(C105873a aVar) {
        List<MultiTalkGroupMember> list;
        int i;
        ImageView imageView;
        View view = aVar.f329509e;
        if (view != null) {
            GridLayout gridLayout = (GridLayout) view.findViewById(C0966R.C0970id.hjw);
            MultiTalkGroup multiTalkGroup = aVar.f314912w;
            if (multiTalkGroup != null && (list = multiTalkGroup.f320047i) != null) {
                ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
                for (MultiTalkGroupMember multiTalkGroupMember : list) {
                    String str = multiTalkGroupMember.f320048d;
                    if (str == null) {
                        str = "";
                    }
                    arrayList.add(str);
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (true ^ C87412m.m108589b((String) next, aVar.f314913x)) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList(C36907w.m41090l(arrayList2, 10));
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    String str2 = (String) it4.next();
                    View view2 = (View) ((LinkedHashMap) aVar.f314915z).get(str2);
                    if (view2 == null) {
                        ImageView imageView2 = new ImageView(view.getContext());
                        ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(imageView2, str2);
                        imageView = imageView2;
                    } else {
                        imageView = view2;
                    }
                    arrayList3.add(new C13604l(str2, imageView));
                }
                Map k = C90364q0.m113152k(arrayList3);
                ((LinkedHashMap) aVar.f314915z).clear();
                aVar.f314915z.putAll(k);
                gridLayout.removeAllViews();
                if (arrayList2.size() > 13) {
                    aVar.mo161553t();
                    i = 2;
                } else {
                    aVar.mo161553t();
                    i = 1;
                }
                gridLayout.setRowCount(i);
                int i2 = (int) ((gridLayout.getResources().getDisplayMetrics().density * ((float) 2)) + 0.5f);
                int i3 = (aVar.f314914y - ((i2 * 2) * 13)) / 13;
                if (i3 > 0) {
                    int i4 = 0;
                    for (Map.Entry value : ((LinkedHashMap) aVar.f314915z).entrySet()) {
                        View view3 = (View) value.getValue();
                        GridLayout.LayoutParams layoutParams = i4 < 13 ? new GridLayout.LayoutParams(GridLayout.spec(0, 1), GridLayout.spec(i4, 1)) : new GridLayout.LayoutParams(GridLayout.spec(1, 1), GridLayout.spec(i4 - 13, 1));
                        layoutParams.setMargins(i2, i2, i2, i2);
                        layoutParams.setGravity(8388659);
                        layoutParams.width = i3;
                        layoutParams.height = i3;
                        gridLayout.addView(view3, layoutParams);
                        i4++;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public String mo150881a() {
        List<MultiTalkGroupMember> list;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(MMApplicationContext.getString(C0966R.string.gzt));
        MultiTalkGroup multiTalkGroup = this.f314912w;
        if (!(multiTalkGroup == null || (list = multiTalkGroup.f320047i) == null)) {
            ArrayList arrayList = new ArrayList(C36907w.m41090l(list, 10));
            for (MultiTalkGroupMember multiTalkGroupMember : list) {
                String str = multiTalkGroupMember.f320048d;
                if (str == null) {
                    str = "";
                }
                arrayList.add(str);
            }
            ArrayList<String> arrayList2 = new ArrayList<>();
            for (Object next : arrayList) {
                if (!C87412m.m108589b((String) next, this.f314913x)) {
                    arrayList2.add(next);
                }
            }
            ArrayList arrayList3 = new ArrayList(C36907w.m41090l(arrayList2, 10));
            for (String str2 : arrayList2) {
                StringBuilder sb = new StringBuilder();
                C75339i iVar = (C75339i) C86312j.m106911c(C75339i.class);
                sb.append(iVar != null ? iVar.getDisplayName(str2) : null);
                sb.append(',');
                stringBuffer.append(sb.toString());
                arrayList3.add(stringBuffer);
            }
        }
        return super.mo150881a() + stringBuffer;
    }

    /* renamed from: b */
    public void mo150882b(boolean z, boolean z2, boolean z3) {
        super.mo150882b(z, z2, z3);
        ((LinkedHashMap) this.f314915z).clear();
        this.f314912w = null;
        this.f314913x = "";
    }

    /* renamed from: d */
    public int mo150883d() {
        return C0966R.C0969drawable.f4383b0;
    }

    /* renamed from: f */
    public int mo150884f() {
        return C0966R.string.gzi;
    }

    /* renamed from: h */
    public void mo150885h() {
        super.mo150885h();
        C119179t tVar = C119157j.f356862d;
        C105875b bVar = new C105875b(this);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(bVar, 200, false);
    }

    /* renamed from: i */
    public void mo150886i(Intent intent, String str) {
        C87412m.m108594g(intent, "intent");
        C87412m.m108594g(str, "toUser");
        super.mo150886i(intent, str);
        this.f314913x = str;
        View view = this.f329509e;
        if (view != null) {
            TextView textView = (TextView) view.findViewById(C0966R.C0970id.hjv);
            textView.setVisibility(0);
            textView.setText(C0966R.string.gzq);
            GridLayout gridLayout = (GridLayout) view.findViewById(C0966R.C0970id.hjw);
            gridLayout.setVisibility(0);
            gridLayout.setColumnCount(13);
            view.post(new C105876c(this, gridLayout));
        }
    }

    /* renamed from: j */
    public void mo150887j(Intent intent) {
        C87412m.m108594g(intent, "intent");
        C110140b.m149726c(this, false, false, false, 4, (Object) null);
        View view = this.f329509e;
        C119179t tVar = C119157j.f356862d;
        C105877d dVar = new C105877d(this, view);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(dVar, 200, false);
        C65925a0.f189525a.mo89959a(this.f329511g, 4, 3);
    }

    /* renamed from: k */
    public void mo150888k() {
        C105874a aVar = this.f314911v;
        if (aVar != null && MultiTalkManager.this.f314469K != null) {
            Bundle bundle = new Bundle();
            bundle.putString(TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, "close");
            ((C109749c) C86312j.m106911c(C109749c.class)).mo86672vo(C109749c.C61756a.MULTITALK, bundle);
        }
    }

    /* renamed from: m */
    public void mo150889m() {
        C119179t tVar = C119157j.f356862d;
        C105878e eVar = new C105878e(this);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(eVar, 200, false);
        C65925a0.f189525a.mo89959a(this.f329511g, 2, 3);
    }

    /* renamed from: n */
    public void mo150890n(Intent intent) {
        C87412m.m108594g(intent, "intent");
        MultiTalkGroup multiTalkGroup = this.f314912w;
        C110140b.m149726c(this, false, false, false, 6, (Object) null);
        C119179t tVar = C119157j.f356862d;
        C105879f fVar = new C105879f(multiTalkGroup, this, intent);
        C119157j jVar = (C119157j) tVar;
        jVar.getClass();
        jVar.mo183892w(fVar, 200, false);
        C65925a0.f189525a.mo89959a(this.f329511g, 1, 3);
    }

    /* renamed from: o */
    public void mo150891o() {
    }

    /* renamed from: p */
    public void mo150892p() {
        C105874a aVar = this.f314911v;
        if (aVar != null) {
            MultiTalkManager.this.mo150660f(true, false);
        }
        C65925a0.f189525a.mo89959a(this.f329511g, 3, 3);
    }
}
