package er1;

import com.tencent.p014mm.sdk.platformtools.BuildInfo;
import fy3.C32224a;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import rx3.C36568h;

/* renamed from: er1.e5 */
public final class C58713e5 {

    /* renamed from: A */
    public static final C58716c f168069A;

    /* renamed from: B */
    public static final C58716c f168070B;

    /* renamed from: C */
    public static final C58716c f168071C;

    /* renamed from: D */
    public static final C58716c f168072D;

    /* renamed from: a */
    public static final C58715b f168073a = new C58715b((C8480h) null);

    /* renamed from: b */
    public static final ArrayList<C58716c> f168074b;

    /* renamed from: c */
    public static final C58716c f168075c;

    /* renamed from: d */
    public static final C58716c f168076d;

    /* renamed from: e */
    public static final C58716c f168077e;

    /* renamed from: f */
    public static final C58716c f168078f;

    /* renamed from: g */
    public static final C58716c f168079g;

    /* renamed from: h */
    public static final C58716c f168080h;

    /* renamed from: i */
    public static final C58716c f168081i;

    /* renamed from: j */
    public static final C58716c f168082j;

    /* renamed from: k */
    public static final C58716c f168083k;

    /* renamed from: l */
    public static final C58716c f168084l;

    /* renamed from: m */
    public static final C58716c f168085m;

    /* renamed from: n */
    public static final C58716c f168086n;

    /* renamed from: o */
    public static final C58716c f168087o;

    /* renamed from: p */
    public static final C58716c f168088p;

    /* renamed from: q */
    public static final C58716c f168089q;

    /* renamed from: r */
    public static final C58716c f168090r;

    /* renamed from: s */
    public static final C58716c f168091s;

    /* renamed from: t */
    public static final C58716c f168092t;

    /* renamed from: u */
    public static final C58716c f168093u;

    /* renamed from: v */
    public static final C58716c f168094v;

    /* renamed from: w */
    public static final C58716c f168095w;

    /* renamed from: x */
    public static final C58716c f168096x;

    /* renamed from: y */
    public static final C58716c f168097y;

    /* renamed from: z */
    public static final C58716c f168098z;

    /* renamed from: er1.e5$a */
    public static final class C58714a extends C87413o implements C32224a<HashMap<String, Integer>> {

        /* renamed from: d */
        public static final C58714a f168099d = new C58714a();

        public C58714a() {
            super(0);
        }

        public Object invoke() {
            HashMap hashMap = new HashMap();
            Iterator<C58716c> it = C58713e5.f168074b.iterator();
            while (it.hasNext()) {
                C58716c next = it.next();
                if (!hashMap.containsKey(next.f168101b) || !BuildInfo.DEBUG) {
                    hashMap.put(next.f168101b, Integer.valueOf(next.f168100a));
                } else {
                    throw new RuntimeException("stageNameIdMap name duplicate:" + next.f168101b);
                }
            }
            return hashMap;
        }
    }

    /* renamed from: er1.e5$b */
    public static final class C58715b {
        public C58715b(C8480h hVar) {
        }

        /* renamed from: a */
        public final C58716c mo83623a() {
            return C58713e5.f168092t;
        }

        /* renamed from: b */
        public final C58716c mo83624b() {
            return C58713e5.f168091s;
        }
    }

    /* renamed from: er1.e5$c */
    public static final class C58716c {

        /* renamed from: a */
        public final int f168100a;

        /* renamed from: b */
        public final String f168101b;

        public C58716c(int i, String str) {
            C87412m.m108594g(str, "name");
            this.f168100a = i;
            this.f168101b = str;
        }

        /* renamed from: a */
        public final String mo83625a() {
            return this.f168101b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C58716c)) {
                return false;
            }
            C58716c cVar = (C58716c) obj;
            return this.f168100a == cVar.f168100a && C87412m.m108589b(this.f168101b, cVar.f168101b);
        }

        public int hashCode() {
            return (this.f168100a * 31) + this.f168101b.hashCode();
        }

        public String toString() {
            return "LiveStage(id=" + this.f168100a + ", name=" + this.f168101b + ')';
        }
    }

    static {
        ArrayList<C58716c> arrayList = new ArrayList<>();
        f168074b = arrayList;
        C58716c cVar = new C58716c(10, "ViewHolderBegin");
        arrayList.add(cVar);
        f168075c = cVar;
        C58716c cVar2 = new C58716c(20, "ViewHolderEnd");
        arrayList.add(cVar2);
        f168076d = cVar2;
        C58716c cVar3 = new C58716c(30, "ItemSelectedBegin");
        arrayList.add(cVar3);
        f168077e = cVar3;
        C58716c cVar4 = new C58716c(40, "JoinLiveBegin");
        arrayList.add(cVar4);
        f168078f = cVar4;
        C58716c cVar5 = new C58716c(50, "ItemSelectedEnd");
        arrayList.add(cVar5);
        f168079g = cVar5;
        C58716c cVar6 = new C58716c(60, "JoinLiveCgiBack");
        arrayList.add(cVar6);
        f168080h = cVar6;
        C58716c cVar7 = new C58716c(70, "JoinLiveEnd");
        arrayList.add(cVar7);
        f168081i = cVar7;
        C58716c cVar8 = new C58716c(80, "StartLive");
        arrayList.add(cVar8);
        f168082j = cVar8;
        C58716c cVar9 = new C58716c(90, "JoinLiveFinish");
        arrayList.add(cVar9);
        f168083k = cVar9;
        C58716c cVar10 = new C58716c(100, "ConnectSucc");
        arrayList.add(cVar10);
        f168084l = cVar10;
        C58716c cVar11 = new C58716c(110, "FirstFrameEvent");
        arrayList.add(cVar11);
        f168085m = cVar11;
        C58716c cVar12 = new C58716c(120, "BeginPlay");
        arrayList.add(cVar12);
        f168086n = cVar12;
        C58716c cVar13 = new C58716c(130, "EnterActivity");
        arrayList.add(cVar13);
        f168087o = cVar13;
        C58716c cVar14 = new C58716c(140, "VisitorRoleGuide");
        arrayList.add(cVar14);
        f168088p = cVar14;
        C58716c cVar15 = new C58716c(150, "NearbyRedDot");
        arrayList.add(cVar15);
        f168089q = cVar15;
        C58716c cVar16 = new C58716c(160, "RestartLive");
        arrayList.add(cVar16);
        f168090r = cVar16;
        C58716c cVar17 = new C58716c(10, "AnchorDoPost");
        arrayList.add(cVar17);
        f168091s = cVar17;
        C58716c cVar18 = new C58716c(20, "AnchorCreateLive");
        arrayList.add(cVar18);
        f168092t = cVar18;
        C58716c cVar19 = new C58716c(21, "AnchorCreateLiveFailed");
        arrayList.add(cVar19);
        f168093u = cVar19;
        C58716c cVar20 = new C58716c(22, "RecheckRealName");
        arrayList.add(cVar20);
        f168094v = cVar20;
        C58716c cVar21 = new C58716c(30, "AnchorJoinLive");
        arrayList.add(cVar21);
        f168095w = cVar21;
        C58716c cVar22 = new C58716c(31, "AnchorJoinLiveFailed");
        arrayList.add(cVar22);
        f168096x = cVar22;
        C58716c cVar23 = new C58716c(40, "AnchorEnterRoom");
        arrayList.add(cVar23);
        f168097y = cVar23;
        C58716c cVar24 = new C58716c(41, "AnchorEnterRoomFailed");
        arrayList.add(cVar24);
        f168098z = cVar24;
        C58716c cVar25 = new C58716c(50, "AnchorShareFeed");
        arrayList.add(cVar25);
        f168069A = cVar25;
        C58716c cVar26 = new C58716c(51, "AnchorShareFeedFailed");
        arrayList.add(cVar26);
        f168070B = cVar26;
        C58716c cVar27 = new C58716c(60, "AnchorCancelCreate");
        arrayList.add(cVar27);
        f168071C = cVar27;
        C58716c cVar28 = new C58716c(70, "AnchorSuccessLive");
        arrayList.add(cVar28);
        f168072D = cVar28;
        arrayList.add(new C58716c(10, "AnchorLinkSelected"));
        arrayList.add(new C58716c(20, "AnchorLinkAcceptSuc"));
        arrayList.add(new C58716c(21, "AnchorLinkAcceptFail"));
        arrayList.add(new C58716c(30, "AnchorLinkHangupSuc"));
        arrayList.add(new C58716c(31, "AnchorLinkHangupFail"));
        arrayList.add(new C58716c(10, "VisitorLinkApplySuc"));
        arrayList.add(new C58716c(11, "VisitorLinkApplyFail"));
        arrayList.add(new C58716c(20, "VisitorLinkAccepted"));
        arrayList.add(new C58716c(30, "VisitorLinkHangupSuc"));
        arrayList.add(new C58716c(31, "VisitorLinkHangupFail"));
        arrayList.add(new C58716c(10, "VisitorRewardSuc"));
        arrayList.add(new C58716c(11, "VisitorRewardFail"));
        arrayList.add(new C58716c(12, "VisitorRewardConsumeFail"));
        C36568h.m40985a(C58714a.f168099d);
    }
}
