package p1048uk;

import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.p014mm.autogen.mmdata.rpt.AnimateEmojiReportStruct;
import com.tencent.p014mm.p136ui.widget.MMNeat7extView;
import com.tencent.p014mm.plugin.gif.MMGIFException;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.tmassistantsdk.openSDK.QQDownloader.AssistantStore;
import di3.C86312j;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p008bq.C92281h1;
import p1048uk.C102048b;
import p1048uk.C111180c;
import p1048uk.C90685a;
import p207nl.C89008j;
import p585kl.C99145a;
import qz1.C22187h;
import u61.C101964h;
import yr3.C79150a;

/* renamed from: uk.f */
public final class C111189f {

    /* renamed from: a */
    public FrameLayout f332993a;

    /* renamed from: b */
    public final int[] f332994b = new int[2];

    /* renamed from: c */
    public final C111188e f332995c = new C111188e();

    /* renamed from: d */
    public final C111180c.C111181a f332996d = new C111190a(this);

    /* renamed from: e */
    public String f332997e;

    /* renamed from: f */
    public C111191b f332998f;

    /* renamed from: uk.f$a */
    public static final class C111190a implements C111180c.C111181a {

        /* renamed from: a */
        public final /* synthetic */ C111189f f332999a;

        public C111190a(C111189f fVar) {
            this.f332999a = fVar;
        }

        /* renamed from: a */
        public void mo162914a() {
            C111191b bVar = this.f332999a.f332998f;
            if (bVar != null) {
                bVar.mo119740a();
            }
        }

        /* renamed from: b */
        public void mo162915b(long j, String str, C102048b.C102049a aVar) {
            C87412m.m108594g(str, "animKey");
            C87412m.m108594g(aVar, "config");
            C111191b bVar = this.f332999a.f332998f;
            if (bVar != null) {
                bVar.mo119741b(j, str, aVar);
            }
        }

        /* renamed from: c */
        public void mo162916c(long j, String str, C102048b.C102049a aVar) {
            C87412m.m108594g(str, "animKey");
            C87412m.m108594g(aVar, "config");
            C111191b bVar = this.f332999a.f332998f;
            if (bVar != null) {
                bVar.mo119742c(j, str, aVar);
            }
        }

        /* renamed from: d */
        public void mo162917d(C111180c cVar, boolean z) {
            C87412m.m108594g(cVar, "holder");
            C111188e eVar = this.f332999a.f332995c;
            eVar.getClass();
            eVar.f332992a.remove(cVar);
        }

        public void onStart() {
            C111191b bVar = this.f332999a.f332998f;
            if (bVar != null) {
                bVar.onStart();
            }
        }
    }

    /* renamed from: uk.f$b */
    public interface C111191b {
        /* renamed from: a */
        void mo119740a();

        /* renamed from: b */
        void mo119741b(long j, String str, C102048b.C102049a aVar);

        /* renamed from: c */
        void mo119742c(long j, String str, C102048b.C102049a aVar);

        void onStart();
    }

    /* renamed from: a */
    public final boolean mo162925a(C72963f4 f4Var) {
        C87412m.m108594g(f4Var, "msgInfo");
        String b = C102051g.f300534a.mo141551b(f4Var);
        boolean z = true;
        if (b == null || b.length() == 0) {
            return false;
        }
        String d = f4Var.mo100986Y3() ? C101964h.m134222d(b) : C101964h.m134230l(b);
        if (!(d == null || d.length() == 0)) {
            z = false;
        }
        if (!z) {
            mo162927c(f4Var, 0, String.valueOf(f4Var.getMsgId()), b, d);
        }
        return false;
    }

    /* renamed from: b */
    public final int mo162926b(C72963f4 f4Var, int i) {
        C111180c cVar;
        C87412m.m108594g(f4Var, "msgInfo");
        List<String> c = C102051g.f300534a.mo141552c(f4Var);
        if (c.isEmpty()) {
            return 0;
        }
        LinkedList linkedList = (LinkedList) c;
        int size = linkedList.size();
        while (i < size) {
            String str = (String) linkedList.get(i);
            String d = C101964h.m134222d(str);
            if (!(d == null || d.length() == 0)) {
                StringBuilder sb = new StringBuilder();
                sb.append(f4Var.getMsgId());
                sb.append('_');
                sb.append(i);
                String sb4 = sb.toString();
                Log.m105924i("MicroMsg.EmojiDynamicController", "checkMatchPatMsg: " + sb4);
                C111188e eVar = this.f332995c;
                eVar.getClass();
                C87412m.m108594g(sb4, "key");
                Iterator<C111180c> it = eVar.f332992a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        cVar = null;
                        break;
                    }
                    cVar = it.next();
                    if (C87412m.m108589b(cVar.f332964b, sb4)) {
                        break;
                    }
                }
                if (cVar == null) {
                    mo162927c(f4Var, i, sb4, str, d);
                }
            }
            i++;
        }
        return linkedList.size();
    }

    /* renamed from: c */
    public final C111180c mo162927c(C72963f4 f4Var, int i, String str, String str2, String str3) {
        C102048b.C102049a aVar;
        C111180c.C111181a aVar2;
        C111188e eVar = this.f332995c;
        f4Var.getClass();
        eVar.getClass();
        C111180c cVar = new C111180c();
        eVar.f332992a.add(cVar);
        cVar.f332965c = f4Var.getMsgId();
        C87412m.m108594g(str, "<set-?>");
        cVar.f332964b = str;
        cVar.f332966d = f4Var.getType();
        cVar.f332967e = this.f332993a;
        cVar.f332980r = this.f332996d;
        boolean z = false;
        if (f4Var.mo108769t2() == 1) {
            AnimateEmojiReportStruct animateEmojiReportStruct = new AnimateEmojiReportStruct();
            cVar.f332979q = animateEmojiReportStruct;
            animateEmojiReportStruct.f310031h = C99145a.f290700a ? 1 : 0;
            C99145a.f290700a = false;
        }
        AnimateEmojiReportStruct animateEmojiReportStruct2 = cVar.f332979q;
        if (animateEmojiReportStruct2 != null) {
            animateEmojiReportStruct2.f310032i = animateEmojiReportStruct2.mo86045b("ChatId", this.f332997e, true);
        }
        AnimateEmojiReportStruct animateEmojiReportStruct3 = cVar.f332979q;
        if (animateEmojiReportStruct3 != null) {
            animateEmojiReportStruct3.f310027d = animateEmojiReportStruct3.mo86045b("Content", str2, true);
        }
        C87412m.m108594g(str3, "emojiKey");
        Log.m105924i("MicroMsg.EmojiDynamicController", "setPlayingKey: " + str3);
        Iterator<C102048b.C102049a> it = C102051g.f300538e.f300528c.iterator();
        while (true) {
            if (!it.hasNext()) {
                aVar = null;
                break;
            }
            aVar = it.next();
            if (C87412m.m108589b(aVar.f300529b, str3)) {
                break;
            }
        }
        C102048b.C102049a aVar3 = aVar;
        if (aVar3 != null) {
            String str4 = C89008j.f256613a.mo123384c() + aVar3.f300530c;
            if (C86013q1.m106450k(str4)) {
                C87412m.m108594g(str4, AssistantStore.DownloadInfos.DownloadInfoColumns.FILEPATH);
                cVar.f332973k = aVar3;
                if (!(aVar3.f300531d == null || (aVar2 = cVar.f332980r) == null)) {
                    aVar2.mo162915b(cVar.f332965c, cVar.f332964b, aVar3);
                }
                try {
                    cVar.f332971i = new C22187h(C86013q1.m106433O(str4, 0, -1));
                    AnimateEmojiReportStruct animateEmojiReportStruct4 = cVar.f332979q;
                    if (animateEmojiReportStruct4 != null) {
                        animateEmojiReportStruct4.f310029f = 1;
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace(cVar.f332963a, e, "create anim", new Object[0]);
                    if (e instanceof MMGIFException) {
                        C115669n.INSTANCE.mo175911u(711, 21);
                        AnimateEmojiReportStruct animateEmojiReportStruct5 = cVar.f332979q;
                        if (animateEmojiReportStruct5 != null) {
                            animateEmojiReportStruct5.f310029f = 2;
                        }
                        if (animateEmojiReportStruct5 != null) {
                            animateEmojiReportStruct5.f310030g = 1;
                        }
                    }
                }
                C22187h hVar = cVar.f332971i;
                int i2 = hVar != null ? hVar.f62783x : 1;
                if (hVar != null) {
                    hVar.f62763P = i2;
                }
                if (hVar != null) {
                    ((C92281h1) C86312j.m106911c(C92281h1.class)).ug0(hVar.f62765R, 0);
                }
                C22187h hVar2 = cVar.f332971i;
                if (hVar2 != null) {
                    hVar2.f62766d = false;
                }
                z = true;
            } else {
                C102051g.f300534a.mo141550a();
            }
        } else {
            Log.m105924i("MicroMsg.EmojiDynamicController", "setPlayingKey: no config");
        }
        if (!z) {
            AnimateEmojiReportStruct animateEmojiReportStruct6 = cVar.f332979q;
            if (animateEmojiReportStruct6 != null) {
                animateEmojiReportStruct6.f310028e = 2;
            }
            if (animateEmojiReportStruct6 != null) {
                animateEmojiReportStruct6.mo86054n();
            }
            C111188e eVar2 = this.f332995c;
            eVar2.getClass();
            eVar2.f332992a.remove(cVar);
        } else {
            AnimateEmojiReportStruct animateEmojiReportStruct7 = cVar.f332979q;
            if (animateEmojiReportStruct7 != null) {
                animateEmojiReportStruct7.f310028e = 1;
            }
        }
        return cVar;
    }

    /* renamed from: d */
    public final void mo162928d() {
        Log.m105924i("MicroMsg.EmojiDynamicController", "onStop: " + this.f332995c.f332992a.size());
        Iterator<C111180c> it = this.f332995c.f332992a.iterator();
        while (it.hasNext()) {
            C111180c next = it.next();
            Log.m105924i(next.f332963a, "stop: ");
            next.mo162911b();
        }
        this.f332995c.f332992a.clear();
    }

    /* renamed from: e */
    public final void mo162929e(C90685a aVar) {
        boolean z;
        FrameLayout frameLayout;
        C87412m.m108594g(aVar, "viewProvider");
        if (this.f332995c.f332992a.size() > 0 && (frameLayout = this.f332993a) != null) {
            frameLayout.getLocationInWindow(this.f332994b);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C111180c> it = this.f332995c.f332992a.iterator();
        while (it.hasNext()) {
            C111180c next = it.next();
            View v = aVar.mo124818v(next.f332965c);
            C79150a aVar2 = null;
            if (v != null) {
                z = next.mo162910a(aVar.mo124820x(v, next.f332964b));
                int[] iArr = this.f332994b;
                C87412m.m108594g(iArr, "rootLocation");
                MMNeat7extView mMNeat7extView = next.f332969g;
                if (mMNeat7extView != null) {
                    aVar2 = mMNeat7extView.getLayout();
                }
                if (aVar2 != null) {
                    RectF a = C90685a.C90686a.f260502a.mo124822a(mMNeat7extView);
                    int[] iArr2 = new int[2];
                    mMNeat7extView.getLocationInWindow(iArr2);
                    int i = iArr2[0] - iArr[0];
                    int i2 = iArr2[1] - iArr[1];
                    if (a.isEmpty()) {
                        mMNeat7extView.post(new C111187d(mMNeat7extView, next, i, i2));
                        a.set(next.f332972j);
                    } else {
                        next.f332972j.set(a);
                    }
                    next.mo162913d(a.centerX() + ((float) i) + ((float) mMNeat7extView.getPaddingLeft()), a.centerY() + ((float) i2) + ((float) mMNeat7extView.getPaddingTop()), (int) a.width());
                } else {
                    Log.m105924i(next.f332963a, "updateView: no layout");
                }
            } else {
                z = next.mo162910a((MMNeat7extView) null);
            }
            if (z) {
                arrayList.add(next);
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            C111180c cVar = (C111180c) it4.next();
            C111188e eVar = this.f332995c;
            eVar.getClass();
            C87412m.m108594g(cVar, "holder");
            eVar.f332992a.remove(cVar);
        }
    }
}
