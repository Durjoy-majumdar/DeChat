package p595ll;

import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C30790w2;
import com.tencent.p014mm.storage.emotion.EmojiGroupInfo;
import di3.C86312j;
import gy3.C87412m;
import hp3.C87581a;
import java.util.ArrayList;
import java.util.Iterator;
import o40.C61926c;
import ob0.C89132b;
import p490dl.C45409e;
import p490dl.C97489o;
import p490dl.C97491p;
import rx3.C13598b0;
import te3.C101776f80;
import te3.C49978jd3;
import te3.C50892pz1;
import u60.C65220d;
import u60.C65222f;
import u60.C65228g;
import u60.C65231j;
import u60.C65234n;
import v60.C102152a;
import v60.C102156f;
import v60.C102157g;
import wh3.C38139n;
import z51.C39315g;

/* renamed from: ll.i */
public final class C99497i {

    /* renamed from: e */
    public static C99497i f291713e;

    /* renamed from: a */
    public final C65222f<C34294c> f291714a;

    /* renamed from: b */
    public int f291715b;

    /* renamed from: c */
    public int f291716c;

    /* renamed from: d */
    public final C99498a f291717d;

    /* renamed from: ll.i$b */
    public static final class C34300b<_Ret, _Var> implements C87581a {

        /* renamed from: a */
        public final /* synthetic */ EmojiGroupInfo f92435a;

        public C34300b(EmojiGroupInfo emojiGroupInfo) {
            this.f92435a = emojiGroupInfo;
        }

        public Object call(Object obj) {
            C89132b.C89134c cVar = (C89132b.C89134c) obj;
            int i = cVar.f256793a;
            int i2 = cVar.f256794b;
            Log.m105924i("MicroMsg.EmojiPackSyncManager", "CgiGetEmotionDetail end: " + i + ", " + i2);
            C50892pz1 pz12 = (C50892pz1) cVar.f256796d;
            if (i == 0 && i2 == 0) {
                ((C39315g) C86312j.m106911c(C39315g.class)).mo58034O6().mo57719f().mo61537Lo(this.f92435a.field_productID, pz12, LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext()));
            }
            return C13598b0.f38549a;
        }
    }

    /* renamed from: ll.i$a */
    public static final class C99498a implements C65231j<C34294c> {

        /* renamed from: a */
        public final /* synthetic */ C99497i f291718a;

        public C99498a(C99497i iVar) {
            this.f291718a = iVar;
        }

        /* renamed from: a */
        public void mo539a(C65220d dVar, C65234n nVar) {
            C34294c cVar = (C34294c) dVar;
            C87412m.m108594g(cVar, "task");
            C87412m.m108594g(nVar, "status");
            Log.m105924i("MicroMsg.EmojiPackSyncManager", "onLoaderFin: " + cVar.f92423f + ", " + nVar);
            C99497i iVar = this.f291718a;
            int i = iVar.f291716c + 1;
            iVar.f291716c = i;
            if (i >= iVar.f291715b) {
                Log.m105924i("MicroMsg.EmojiPackSyncManager", "onDesignerEnd: ");
                int nowSecond = (int) Util.nowSecond();
                C97491p pVar = C97491p.f286143a;
                pVar.mo136773a(false);
                pVar.mo136774c().putInt("designer_sync_time", nowSecond);
                C99497i iVar2 = C99497i.f291713e;
                if (iVar2 != null) {
                    C65222f<C34294c> fVar = iVar2.f291714a;
                    fVar.getClass();
                    C61926c.m72668M(new C65228g(fVar));
                    iVar2.f291714a.mo89354g(iVar2.f291717d);
                }
                C99497i.f291713e = null;
            }
        }
    }

    public C99497i() {
        C65222f<C34294c> fVar = new C65222f<>(new C102156f(new C102152a(Integer.MAX_VALUE, Integer.MAX_VALUE), new C102157g(1, 5), 1, "EmojiDesigner"));
        this.f291714a = fVar;
        C99498a aVar = new C99498a(this);
        this.f291717d = aVar;
        fVar.mo89353f(aVar);
    }

    /* renamed from: a */
    public final void mo138910a() {
        C49978jd3 jd32;
        ArrayList<EmojiGroupInfo> d = C97489o.m125592g().mo136763d();
        ArrayList<Number> arrayList = new ArrayList<>();
        Iterator<EmojiGroupInfo> it = d.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            EmojiGroupInfo next = it.next();
            C38139n jo = C30790w2.m39221h().mo57719f().mo61538jo(next.field_productID);
            C50892pz1 pz12 = new C50892pz1();
            if ((jo != null ? jo.field_content : null) != null) {
                try {
                    pz12.parseFrom(jo.field_content);
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.EmojiPackSyncManager", e, "", new Object[0]);
                }
            }
            C101776f80 f802 = pz12.f140062d;
            if (f802 == null || (jd32 = f802.f298229E) == null) {
                Log.m105924i("MicroMsg.EmojiPackSyncManager", "start: GetEmotionDetail " + next.field_productID);
                if (C87412m.m108589b(next.field_productID, "17")) {
                    continue;
                } else {
                    String str = next.field_productID;
                    C87412m.m108593f(str, "groupInfo.productID");
                    new C45409e(str).mo9225i().mo123420E(new C34300b(next));
                }
            } else {
                int i = jd32.f136019d;
                if (!arrayList.contains(Integer.valueOf(i))) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (arrayList.size() >= 50) {
                Log.m105924i("MicroMsg.EmojiPackSyncManager", "start: too many groups " + d.size());
                break;
            }
        }
        this.f291715b = arrayList.size();
        for (Number intValue : arrayList) {
            int intValue2 = intValue.intValue();
            Log.m105924i("MicroMsg.EmojiPackSyncManager", "checkStart: add task " + intValue2);
            this.f291714a.mo89348b(new C34294c(intValue2));
        }
    }
}
