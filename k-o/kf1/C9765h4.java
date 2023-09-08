package kf1;

import ak1.C54067f0;
import ak1.C54108o;
import ak1.C54116w;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import bl3.C39818r;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.mmdata.rpt.FinderBroadcastPageOutStruct;
import com.tencent.p014mm.p136ui.MMFragmentActivity;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.finder.view.ConcertTicketTextView;
import com.tencent.p014mm.sdk.platformtools.BitmapUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.view.RCConstraintLayout;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import di3.C7335d;
import di3.C86312j;
import eb0.C31543z5;
import er1.C58741j5;
import fy3.C32224a;
import fy3.C32226l;
import gy3.C87412m;
import gy3.C87413o;
import ht1.C60200t1;
import ht1.C60216z4;
import ht1.C8777j5;
import it1.C9247b;
import iy3.C60641c;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import je1.C46523h2;
import k20.C60958c;
import k20.C9556a;
import k60.C60979d;
import ke3.C88144b;
import kg3.C76577a;
import l60.C99344b;
import lg3.C88494d;
import nj3.C11184p0;
import o40.C61926c;
import org.json.JSONObject;
import p159gw.C98250h;
import p185kq.C10383h;
import p185kq.C61130g;
import pl1.C100810g0;
import pl1.C11978e0;
import pl1.C11984n0;
import pl1.C11990s0;
import qo3.C77407n;
import r60.C101350i;
import rx3.C13598b0;
import rx3.C13604l;
import sx3.C110818d0;
import t60.C64207e;
import te3.C49204dz;
import te3.C49352ez;
import te3.C49816i91;
import te3.v35;
import up1.C27696y;
import wc3.C15133e0;
import x60.C102564a;
import z04.C112551y;
import zc1.C66785b;

/* renamed from: kf1.h4 */
public final class C9765h4 extends UIComponent {

    /* renamed from: x0 */
    public static final float f30239x0 = C88494d.m110349f();

    /* renamed from: A */
    public ImageView f30240A;

    /* renamed from: B */
    public ImageView f30241B;

    /* renamed from: C */
    public ConstraintLayout f30242C;

    /* renamed from: D */
    public TextView f30243D;

    /* renamed from: E */
    public ScrollView f30244E;

    /* renamed from: F */
    public String f30245F = "";

    /* renamed from: G */
    public int f30246G;

    /* renamed from: H */
    public int f30247H;

    /* renamed from: I */
    public LinkedList<v35> f30248I;

    /* renamed from: J */
    public C49352ez f30249J;

    /* renamed from: K */
    public C49204dz f30250K;

    /* renamed from: L */
    public String f30251L;

    /* renamed from: M */
    public int f30252M;

    /* renamed from: N */
    public long f30253N;

    /* renamed from: P */
    public boolean f30254P;

    /* renamed from: Q */
    public String f30255Q;

    /* renamed from: R */
    public String f30256R;

    /* renamed from: S */
    public String f30257S;

    /* renamed from: T */
    public C9247b f30258T;

    /* renamed from: U */
    public final LinkedList<C13604l<ImageView, Bitmap>> f30259U = new LinkedList<>();

    /* renamed from: V */
    public boolean f30260V;

    /* renamed from: W */
    public String f30261W;

    /* renamed from: X */
    public C77407n f30262X;

    /* renamed from: Y */
    public C11184p0 f30263Y = new C9768c(this);

    /* renamed from: Z */
    public final int f30264Z = 1;

    /* renamed from: d */
    public final String f30265d = "FinderLiveConcertTicketUIC";

    /* renamed from: e */
    public WeImageView f30266e;

    /* renamed from: f */
    public ConcertTicketTextView f30267f;

    /* renamed from: g */
    public View f30268g;

    /* renamed from: h */
    public RCConstraintLayout f30269h;

    /* renamed from: i */
    public LinearLayout f30270i;

    /* renamed from: j */
    public ConcertTicketTextView f30271j;

    /* renamed from: n */
    public ConcertTicketTextView f30272n;

    /* renamed from: o */
    public ConcertTicketTextView f30273o;

    /* renamed from: p */
    public ConcertTicketTextView f30274p;

    /* renamed from: p0 */
    public final int f30275p0 = 2;

    /* renamed from: q */
    public ConcertTicketTextView f30276q;

    /* renamed from: r */
    public ConcertTicketTextView f30277r;

    /* renamed from: s */
    public ConcertTicketTextView f30278s;

    /* renamed from: t */
    public ConcertTicketTextView f30279t;

    /* renamed from: u */
    public ImageView f30280u;

    /* renamed from: v */
    public FrameLayout f30281v;

    /* renamed from: w */
    public TextView f30282w;

    /* renamed from: x */
    public ConcertTicketTextView f30283x;

    /* renamed from: y */
    public ImageView f30284y;

    /* renamed from: z */
    public ImageView f30285z;

    /* renamed from: kf1.h4$a */
    public static final class C9766a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9765h4 f30286d;

        /* renamed from: e */
        public final /* synthetic */ boolean f30287e;

        public C9766a(C9765h4 h4Var, boolean z) {
            this.f30286d = h4Var;
            this.f30287e = z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
            r1 = r12.f132575o;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onClick(android.view.View r12) {
            /*
                r11 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r12)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$initData$2$1"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r11
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                kf1.h4 r12 = r11.f30286d
                android.widget.LinearLayout r0 = r12.f30270i
                r1 = 0
                if (r0 == 0) goto L_0x00c0
                r2 = 0
                r0.setVisibility(r2)
                androidx.constraintlayout.widget.ConstraintLayout r0 = r12.f30242C
                if (r0 == 0) goto L_0x00ba
                r3 = 8
                r0.setVisibility(r3)
                com.tencent.mm.view.RCConstraintLayout r0 = r12.f30269h
                if (r0 == 0) goto L_0x00b4
                r0.setVisibility(r3)
                com.tencent.mm.plugin.finder.view.ConcertTicketTextView r0 = r12.f30267f
                if (r0 == 0) goto L_0x00ad
                r0.setVisibility(r3)
                com.tencent.mm.plugin.finder.view.ConcertTicketTextView r0 = r12.f30272n
                if (r0 == 0) goto L_0x00a6
                r0.setVisibility(r3)
                com.tencent.mm.plugin.finder.view.ConcertTicketTextView r12 = r12.f30273o
                if (r12 == 0) goto L_0x00a0
                r12.setVisibility(r3)
                kf1.h4 r4 = r11.f30286d
                r4.f30252M = r2
                te3.dz r12 = r4.f30250K
                java.lang.String r0 = ""
                if (r12 == 0) goto L_0x005c
                java.lang.String r1 = r12.f132575o
                if (r1 != 0) goto L_0x005a
                goto L_0x005c
            L_0x005a:
                r5 = r1
                goto L_0x005d
            L_0x005c:
                r5 = r0
            L_0x005d:
                if (r12 == 0) goto L_0x0066
                java.lang.String r1 = r12.f132569f
                if (r1 != 0) goto L_0x0064
                goto L_0x0066
            L_0x0064:
                r6 = r1
                goto L_0x0067
            L_0x0066:
                r6 = r0
            L_0x0067:
                te3.ez r1 = r4.f30249J
                if (r1 == 0) goto L_0x007a
                te3.hx0 r1 = r1.f133189n
                if (r1 == 0) goto L_0x007a
                com.tencent.mm.protocal.protobuf.FinderContact r1 = r1.f134919d
                if (r1 == 0) goto L_0x007a
                java.lang.String r1 = r1.headUrl
                if (r1 != 0) goto L_0x0078
                goto L_0x007a
            L_0x0078:
                r7 = r1
                goto L_0x007b
            L_0x007a:
                r7 = r0
            L_0x007b:
                if (r12 == 0) goto L_0x0084
                java.lang.String r1 = r12.f132570g
                if (r1 != 0) goto L_0x0082
                goto L_0x0084
            L_0x0082:
                r8 = r1
                goto L_0x0085
            L_0x0084:
                r8 = r0
            L_0x0085:
                if (r12 == 0) goto L_0x008e
                java.lang.String r12 = r12.f132576p
                if (r12 != 0) goto L_0x008c
                goto L_0x008e
            L_0x008c:
                r9 = r12
                goto L_0x008f
            L_0x008e:
                r9 = r0
            L_0x008f:
                boolean r10 = r11.f30287e
                r4.mo10371n3(r5, r6, r7, r8, r9, r10)
                java.lang.String r12 = "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$initData$2$1"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r11, r12, r0, r1, r2)
                return
            L_0x00a0:
                java.lang.String r12 = "changeImgBtn"
                gy3.C87412m.m108603p(r12)
                throw r1
            L_0x00a6:
                java.lang.String r12 = "saveImgBtn"
                gy3.C87412m.m108603p(r12)
                throw r1
            L_0x00ad:
                java.lang.String r12 = "shareBtn"
                gy3.C87412m.m108603p(r12)
                throw r1
            L_0x00b4:
                java.lang.String r12 = "concertTicketViewRoot"
                gy3.C87412m.m108603p(r12)
                throw r1
            L_0x00ba:
                java.lang.String r12 = "concertRetryLayout"
                gy3.C87412m.m108603p(r12)
                throw r1
            L_0x00c0:
                java.lang.String r12 = "concertLoadingLayout"
                gy3.C87412m.m108603p(r12)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: kf1.C9765h4.C9766a.onClick(android.view.View):void");
        }
    }

    /* renamed from: kf1.h4$b */
    public static final class C9767b<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ boolean f30288a;

        /* renamed from: b */
        public final /* synthetic */ boolean f30289b;

        /* renamed from: c */
        public final /* synthetic */ C9765h4 f30290c;

        /* renamed from: d */
        public final /* synthetic */ ImageView f30291d;

        /* renamed from: e */
        public final /* synthetic */ int f30292e;

        public C9767b(boolean z, boolean z2, C9765h4 h4Var, ImageView imageView, int i) {
            this.f30288a = z;
            this.f30289b = z2;
            this.f30290c = h4Var;
            this.f30291d = imageView;
            this.f30292e = i;
        }

        /* renamed from: a */
        public void mo507a(C102564a aVar, C101350i iVar, Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            if (bitmap == null) {
                if (this.f30288a || this.f30289b) {
                    T t = aVar.f301995a;
                    C11984n0 n0Var = t instanceof C11984n0 ? (C11984n0) t : null;
                    boolean z = false;
                    if (n0Var != null) {
                        if (n0Var.getUrl().length() > 0) {
                            z = true;
                        }
                    }
                    if (z) {
                        C9765h4 h4Var = this.f30290c;
                        h4Var.getClass();
                        C61926c.m72668M(new C9867n4(h4Var));
                        Log.m105924i(this.f30290c.f30265d, "loadLinkIcon fail");
                    }
                }
                this.f30291d.setImageDrawable((Drawable) null);
                this.f30290c.mo10367j3();
                Log.m105924i(this.f30290c.f30265d, "loadLinkIcon empty url");
            } else {
                C61926c.m72668M(new C9792i4(bitmap, this.f30292e, this.f30290c, this.f30291d));
            }
            String str = this.f30290c.f30265d;
            Log.m105924i(str, "loadLinkIcon resource :" + bitmap);
        }
    }

    /* renamed from: kf1.h4$c */
    public static final class C9768c implements C11184p0 {

        /* renamed from: d */
        public final /* synthetic */ C9765h4 f30293d;

        public C9768c(C9765h4 h4Var) {
            this.f30293d = h4Var;
        }

        public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
            String str;
            String str2;
            Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
            if (valueOf != null && valueOf.intValue() == 0) {
                C9765h4 h4Var = this.f30293d;
                h4Var.getClass();
                Intent intent = new Intent();
                h4Var.mo10369l3();
                intent.putExtra("Retr_File_Name", h4Var.f30251L);
                intent.putExtra("Retr_Compress_Type", 0);
                intent.putExtra("Retr_Msg_Type", 0);
                Activity context = h4Var.getContext();
                C87412m.m108592e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
                C88144b.m109804v((MMFragmentActivity) context, ".ui.transmit.MsgRetransmitUI", intent, 1014, new C9696e4(h4Var));
                C77407n nVar = this.f30293d.f30262X;
                if (nVar != null) {
                    nVar.mo107572p();
                }
            } else if (valueOf != null && valueOf.intValue() == 1) {
                C9765h4 h4Var2 = this.f30293d;
                h4Var2.getClass();
                Intent intent2 = new Intent();
                intent2.putExtra("Ksnsupload_type", 0);
                h4Var2.mo10369l3();
                intent2.putExtra("sns_kemdia_path", h4Var2.f30251L);
                HashMap hashMap = new HashMap();
                C49352ez ezVar = h4Var2.f30249J;
                String str3 = "";
                if (ezVar == null || (str = ezVar.f133182d) == null) {
                    str = str3;
                }
                hashMap.put("activityId", str);
                hashMap.put("is_fast_share", "0");
                hashMap.put("share_type", "2");
                C49352ez ezVar2 = h4Var2.f30249J;
                if (!(ezVar2 == null || (str2 = ezVar2.f133179B) == null)) {
                    str3 = str2;
                }
                hashMap.put("resource_id", str3);
                hashMap.put("enter_sence", h4Var2.f30245F);
                C7335d c = C86312j.m106911c(C54108o.class);
                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                C8777j5.C8778a.m8607h((C8777j5) c, C54067f0.C0064m.LIVE_CONCERT_TICKET_PAGE_SHARE_SUCC, hashMap, h4Var2.f30255Q, h4Var2.f30256R, (String) null, 16, (Object) null);
                C88144b.m109791i(h4Var2.getContext(), "sns", ".ui.SnsUploadUI", intent2, (Bundle) null);
                C77407n nVar2 = this.f30293d.f30262X;
                if (nVar2 != null) {
                    nVar2.mo107572p();
                }
            } else {
                C77407n nVar3 = this.f30293d.f30262X;
                if (nVar3 != null) {
                    nVar3.mo107572p();
                }
            }
        }
    }

    /* renamed from: kf1.h4$d */
    public static final class C9769d implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9765h4 f30294d;

        public C9769d(C9765h4 h4Var) {
            this.f30294d = h4Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            this.f30294d.getActivity().finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: kf1.h4$e */
    public static final class C9770e implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9765h4 f30295d;

        public C9770e(C9765h4 h4Var) {
            this.f30295d = h4Var;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            HashMap hashMap = new HashMap();
            C9765h4 h4Var = this.f30295d;
            hashMap.put("page_id", "1003");
            C49352ez ezVar = h4Var.f30249J;
            String str3 = "";
            if (ezVar == null || (str = ezVar.f133182d) == null) {
                str = str3;
            }
            hashMap.put("activityId", str);
            C49204dz dzVar = h4Var.f30250K;
            if (!(dzVar == null || (str2 = dzVar.f132567d) == null)) {
                str3 = str2;
            }
            hashMap.put("resource_id", str3);
            hashMap.put("enter_sence", h4Var.f30245F);
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C54067f0.C0064m mVar = C54067f0.C0064m.LIVE_CONCERT_TICKET_PAGE_SHARE_BUTTON;
            C9765h4 h4Var2 = this.f30295d;
            C8777j5.C8778a.m8607h((C8777j5) c, mVar, hashMap, h4Var2.f30255Q, h4Var2.f30256R, (String) null, 16, (Object) null);
            C9765h4 h4Var3 = this.f30295d;
            if (h4Var3.f30262X == null) {
                C77407n nVar = new C77407n((Context) h4Var3.getContext(), 0, true);
                h4Var3.f30262X = nVar;
                nVar.f225779n1 = false;
                nVar.f225775k1 = true;
            }
            C77407n nVar2 = h4Var3.f30262X;
            if (nVar2 != null) {
                nVar2.f225792t1 = false;
            }
            if (nVar2 != null) {
                ((C15133e0) C86312j.m106911c(C15133e0.class)).Ct0().Q60(h4Var3.getActivity(), nVar2, 2, (C32226l<? super Boolean, C13598b0>) null, new C9839l4(h4Var3));
            }
            C77407n nVar3 = h4Var3.f30262X;
            if (nVar3 != null) {
                nVar3.f225771i = new C9807j4(h4Var3);
            }
            if (nVar3 != null) {
                nVar3.f225782p = h4Var3.f30263Y;
            }
            if (nVar3 != null) {
                nVar3.f225761d = new C9684d4(h4Var3);
            }
            if (nVar3 != null) {
                nVar3.mo107573q();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$onCreate$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: kf1.h4$f */
    public static final class C9771f implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9765h4 f30296d;

        public C9771f(C9765h4 h4Var) {
            this.f30296d = h4Var;
        }

        public final void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C9765h4 h4Var = this.f30296d;
            float f = C9765h4.f30239x0;
            h4Var.mo10362c3();
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: kf1.h4$g */
    public static final class C9772g implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9765h4 f30297d;

        public C9772g(C9765h4 h4Var) {
            this.f30297d = h4Var;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            HashMap hashMap = new HashMap();
            C9765h4 h4Var = this.f30297d;
            hashMap.put("page_id", "1003");
            C49204dz dzVar = h4Var.f30250K;
            String str3 = "";
            if (dzVar == null || (str = dzVar.f132567d) == null) {
                str = str3;
            }
            hashMap.put("resource_id", str);
            C49352ez ezVar = h4Var.f30249J;
            if (ezVar == null || (str2 = ezVar.f133182d) == null) {
                str2 = str3;
            }
            hashMap.put("activityId", str2);
            hashMap.put("enter_sence", h4Var.f30245F);
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C54067f0.C0064m mVar = C54067f0.C0064m.LIVE_CONCERT_TICKET_PAGE_SAVE_BUTTON;
            C9765h4 h4Var2 = this.f30297d;
            C8777j5.C8778a.m8607h((C8777j5) c, mVar, hashMap, h4Var2.f30255Q, h4Var2.f30256R, (String) null, 16, (Object) null);
            C9765h4 h4Var3 = this.f30297d;
            h4Var3.mo10369l3();
            String str4 = h4Var3.f30251L;
            if (str4 != null) {
                str3 = str4;
            }
            ((C98250h) C86312j.m106911c(C98250h.class)).mo137346Zv(h4Var3.getActivity(), str3, new C9715f4(h4Var3));
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$onCreate$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: kf1.h4$h */
    public static final class C9773h implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ C9765h4 f30298d;

        public C9773h(C9765h4 h4Var) {
            this.f30298d = h4Var;
        }

        public final void onClick(View view) {
            String str;
            String str2;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C9765h4 h4Var = this.f30298d;
            h4Var.f30252M = 0;
            h4Var.f30260V = true;
            HashMap hashMap = new HashMap();
            C9765h4 h4Var2 = this.f30298d;
            hashMap.put("page_id", "1003");
            C49204dz dzVar = h4Var2.f30250K;
            String str3 = "";
            if (dzVar == null || (str = dzVar.f132567d) == null) {
                str = str3;
            }
            hashMap.put("resource_id", str);
            C49352ez ezVar = h4Var2.f30249J;
            if (!(ezVar == null || (str2 = ezVar.f133182d) == null)) {
                str3 = str2;
            }
            hashMap.put("activityId", str3);
            hashMap.put("enter_sence", h4Var2.f30245F);
            C7335d c = C86312j.m106911c(C54108o.class);
            C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
            C54067f0.C0064m mVar = C54067f0.C0064m.LIVE_CONCERT_TICKET_PAGE_CHANGE_BUTTON;
            C9765h4 h4Var3 = this.f30298d;
            C8777j5.C8778a.m8607h((C8777j5) c, mVar, hashMap, h4Var3.f30255Q, h4Var3.f30256R, (String) null, 16, (Object) null);
            this.f30298d.mo10365f3(true);
            C117292a.m165361g(this, "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: kf1.h4$i */
    public static final class C9774i implements View.OnTouchListener {

        /* renamed from: d */
        public static final C9774i f30299d = new C9774i();

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$onCreate$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC$onCreate$6", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: kf1.h4$j */
    public static final class C9775j extends C87413o implements C32224a<C13598b0> {

        /* renamed from: d */
        public final /* synthetic */ C9765h4 f30300d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C9775j(C9765h4 h4Var) {
            super(0);
            this.f30300d = h4Var;
        }

        public Object invoke() {
            String str;
            String str2;
            LinkedList<C49204dz> linkedList;
            C9765h4 h4Var = this.f30300d;
            for (C13604l lVar : h4Var.f30259U) {
                String str3 = h4Var.f30265d;
                Log.m105924i(str3, "load iv: " + ((ImageView) lVar.f38555d).hashCode());
                ((ImageView) lVar.f38555d).setImageBitmap((Bitmap) lVar.f38556e);
            }
            C9765h4 h4Var2 = this.f30300d;
            if (h4Var2.f30260V) {
                h4Var2.mo10370m3();
                this.f30300d.f30260V = false;
            }
            C9765h4 h4Var3 = this.f30300d;
            RCConstraintLayout rCConstraintLayout = h4Var3.f30269h;
            if (rCConstraintLayout != null) {
                rCConstraintLayout.postDelayed(new C9667c4(h4Var3), 50);
                LinearLayout linearLayout = h4Var3.f30270i;
                if (linearLayout != null) {
                    linearLayout.setVisibility(8);
                    ConstraintLayout constraintLayout = h4Var3.f30242C;
                    if (constraintLayout != null) {
                        constraintLayout.setVisibility(8);
                        RCConstraintLayout rCConstraintLayout2 = h4Var3.f30269h;
                        if (rCConstraintLayout2 != null) {
                            rCConstraintLayout2.setVisibility(0);
                            ConcertTicketTextView concertTicketTextView = h4Var3.f30267f;
                            if (concertTicketTextView != null) {
                                concertTicketTextView.setVisibility(0);
                                ConcertTicketTextView concertTicketTextView2 = h4Var3.f30272n;
                                if (concertTicketTextView2 != null) {
                                    concertTicketTextView2.setVisibility(0);
                                    C49352ez ezVar = h4Var3.f30249J;
                                    if (ezVar != null && ezVar.f133181D) {
                                        if (((ezVar == null || (linkedList = ezVar.f133180C) == null) ? 0 : linkedList.size()) > 1) {
                                            ConcertTicketTextView concertTicketTextView3 = h4Var3.f30273o;
                                            if (concertTicketTextView3 != null) {
                                                concertTicketTextView3.setVisibility(0);
                                                HashMap hashMap = new HashMap();
                                                hashMap.put("page_id", "1003");
                                                C49204dz dzVar = h4Var3.f30250K;
                                                String str4 = "";
                                                if (dzVar == null || (str = dzVar.f132567d) == null) {
                                                    str = str4;
                                                }
                                                hashMap.put("resource_id", str);
                                                C49352ez ezVar2 = h4Var3.f30249J;
                                                if (!(ezVar2 == null || (str2 = ezVar2.f133182d) == null)) {
                                                    str4 = str2;
                                                }
                                                hashMap.put("activityId", str4);
                                                hashMap.put("enter_sence", h4Var3.f30245F);
                                                C7335d c = C86312j.m106911c(C54108o.class);
                                                C87412m.m108593f(c, "getService(HellLiveReport::class.java)");
                                                C8777j5.C8778a.m8609j((C8777j5) c, C54067f0.C0066n.LIVE_CONCERT_TICKET_PAGE_CHANGE_BUTTON, hashMap, h4Var3.f30255Q, h4Var3.f30256R, (String) null, 16, (Object) null);
                                            } else {
                                                C87412m.m108603p("changeImgBtn");
                                                throw null;
                                            }
                                        }
                                    }
                                    ConcertTicketTextView concertTicketTextView4 = h4Var3.f30272n;
                                    if (concertTicketTextView4 != null) {
                                        if (concertTicketTextView4.getVisibility() == 0) {
                                            ConcertTicketTextView concertTicketTextView5 = h4Var3.f30273o;
                                            if (concertTicketTextView5 == null) {
                                                C87412m.m108603p("changeImgBtn");
                                                throw null;
                                            } else if (concertTicketTextView5.getVisibility() == 0) {
                                                View view = h4Var3.f30268g;
                                                if (view != null) {
                                                    C9556a aVar = new C9556a();
                                                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                                                    aVar.mo10233c(0);
                                                    View view2 = view;
                                                    C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC", "showTicket", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                                    view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                                                    C117292a.m165359e(view2, "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC", "showTicket", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                                    this.f30300d.mo10364e3();
                                                    return C13598b0.f38549a;
                                                }
                                                C87412m.m108603p("playDivider");
                                                throw null;
                                            }
                                        }
                                        View view3 = h4Var3.f30268g;
                                        if (view3 != null) {
                                            C9556a aVar2 = new C9556a();
                                            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                                            aVar2.mo10233c(8);
                                            View view4 = view3;
                                            C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC", "showTicket", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                                            C117292a.m165359e(view4, "com/tencent/mm/plugin/finder/feed/FinderLiveConcertTicketUIC", "showTicket", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                                            this.f30300d.mo10364e3();
                                            return C13598b0.f38549a;
                                        }
                                        C87412m.m108603p("playDivider");
                                        throw null;
                                    }
                                    C87412m.m108603p("saveImgBtn");
                                    throw null;
                                }
                                C87412m.m108603p("saveImgBtn");
                                throw null;
                            }
                            C87412m.m108603p("shareBtn");
                            throw null;
                        }
                        C87412m.m108603p("concertTicketViewRoot");
                        throw null;
                    }
                    C87412m.m108603p("concertRetryLayout");
                    throw null;
                }
                C87412m.m108603p("concertLoadingLayout");
                throw null;
            }
            C87412m.m108603p("concertTicketViewRoot");
            throw null;
        }
    }

    /* renamed from: kf1.h4$k */
    public static final class C9776k<T, R> implements C64207e {

        /* renamed from: a */
        public final /* synthetic */ C9765h4 f30301a;

        /* renamed from: b */
        public final /* synthetic */ boolean f30302b;

        public C9776k(C9765h4 h4Var, boolean z) {
            this.f30301a = h4Var;
            this.f30302b = z;
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0084 A[SYNTHETIC, Splitter:B:24:0x0084] */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00d2  */
        /* JADX WARNING: Removed duplicated region for block: B:40:0x00de  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo507a(x60.C102564a r8, r60.C101350i r9, java.lang.Object r10) {
            /*
                r7 = this;
                android.graphics.Bitmap r10 = (android.graphics.Bitmap) r10
                if (r10 == 0) goto L_0x00e4
                kf1.h4 r8 = r7.f30301a
                te3.dz r9 = r8.f30250K
                r0 = 0
                r1 = 1
                if (r9 == 0) goto L_0x0011
                boolean r9 = r9.f132577q
                if (r9 != r1) goto L_0x0011
                r0 = 1
            L_0x0011:
                r9 = 0
                if (r0 == 0) goto L_0x00c8
                r0 = 1103626240(0x41c80000, float:25.0)
                int r2 = r10.getHeight()
                int r2 = r2 / 5
                int r3 = r10.getWidth()
                int r3 = r3 / 5
                android.graphics.Bitmap r10 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.extractThumbNail(r10, r2, r3, r1, r1)
                java.lang.String r1 = "extractThumbNail(\n      …           true\n        )"
                gy3.C87412m.m108593f(r10, r1)
                android.graphics.Canvas r1 = new android.graphics.Canvas
                r1.<init>(r10)
                android.content.Context r2 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
                android.content.res.Resources r2 = r2.getResources()
                r3 = 2131099922(0x7f060112, float:1.781221E38)
                int r2 = r2.getColor(r3)
                r1.drawColor(r2)
                java.lang.String r1 = "RSInvalidStateException "
                tj3.i r2 = new tj3.i     // Catch:{ all -> 0x005f }
                android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()     // Catch:{ all -> 0x005f }
                r2.<init>(r3)     // Catch:{ all -> 0x005f }
                r2.mo162692b(r10, r0)     // Catch:{ all -> 0x005d }
                r2.destroy()     // Catch:{ RSInvalidStateException -> 0x0054 }
                goto L_0x00a1
            L_0x0054:
                r0 = move-exception
                java.lang.String r8 = r8.f30265d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                goto L_0x0090
            L_0x005d:
                r3 = move-exception
                goto L_0x0062
            L_0x005f:
                r2 = move-exception
                r3 = r2
                r2 = r9
            L_0x0062:
                java.lang.String r4 = r8.f30265d     // Catch:{ all -> 0x00a7 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a7 }
                r5.<init>()     // Catch:{ all -> 0x00a7 }
                java.lang.String r6 = "setBlurBitmap error:"
                r5.append(r6)     // Catch:{ all -> 0x00a7 }
                java.lang.String r3 = r3.getMessage()     // Catch:{ all -> 0x00a7 }
                r5.append(r3)     // Catch:{ all -> 0x00a7 }
                java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x00a7 }
                com.tencent.p014mm.sdk.platformtools.Log.m105920e(r4, r3)     // Catch:{ all -> 0x00a7 }
                int r0 = (int) r0     // Catch:{ all -> 0x00a7 }
                android.graphics.Bitmap r10 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.fastblur(r10, r0)     // Catch:{ all -> 0x00a7 }
                if (r2 == 0) goto L_0x00a1
                r2.destroy()     // Catch:{ RSInvalidStateException -> 0x0088 }
                goto L_0x00a1
            L_0x0088:
                r0 = move-exception
                java.lang.String r8 = r8.f30265d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
            L_0x0090:
                r2.append(r1)
                java.lang.String r0 = r0.getMessage()
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r0)
            L_0x00a1:
                java.lang.String r8 = "result"
                gy3.C87412m.m108593f(r10, r8)
                goto L_0x00c8
            L_0x00a7:
                r9 = move-exception
                if (r2 == 0) goto L_0x00c7
                r2.destroy()     // Catch:{ RSInvalidStateException -> 0x00ae }
                goto L_0x00c7
            L_0x00ae:
                r10 = move-exception
                java.lang.String r8 = r8.f30265d
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r1)
                java.lang.String r10 = r10.getMessage()
                r0.append(r10)
                java.lang.String r10 = r0.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105928w(r8, r10)
            L_0x00c7:
                throw r9
            L_0x00c8:
                kf1.h4 r8 = r7.f30301a
                java.util.LinkedList<rx3.l<android.widget.ImageView, android.graphics.Bitmap>> r0 = r8.f30259U
                rx3.l r1 = new rx3.l
                android.widget.ImageView r8 = r8.f30241B
                if (r8 == 0) goto L_0x00de
                r1.<init>(r8, r10)
                r0.add(r1)
                kf1.h4 r8 = r7.f30301a
                r8.mo10367j3()
                goto L_0x00fb
            L_0x00de:
                java.lang.String r8 = "concertlayoutBg"
                gy3.C87412m.m108603p(r8)
                throw r9
            L_0x00e4:
                boolean r8 = r7.f30302b
                if (r8 == 0) goto L_0x00f6
                kf1.h4 r8 = r7.f30301a
                r8.getClass()
                kf1.n4 r9 = new kf1.n4
                r9.<init>(r8)
                o40.C61926c.m72668M(r9)
                goto L_0x00fb
            L_0x00f6:
                kf1.h4 r8 = r7.f30301a
                r8.mo10367j3()
            L_0x00fb:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kf1.C9765h4.C9776k.mo507a(x60.a, r60.i, java.lang.Object):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9765h4(AppCompatActivity appCompatActivity) {
        super(appCompatActivity);
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
    }

    /* renamed from: i3 */
    public static /* synthetic */ void m9483i3(C9765h4 h4Var, String str, ImageView imageView, boolean z, C27696y yVar, C11978e0.C11979a aVar, boolean z2, int i, int i2, Object obj) {
        int i3;
        boolean z3 = (i2 & 4) != 0 ? false : z;
        C27696y yVar2 = (i2 & 8) != 0 ? C27696y.THUMB_IMAGE : yVar;
        C11978e0.C11979a aVar2 = (i2 & 16) != 0 ? C11978e0.C11979a.LINK_THUMB : aVar;
        boolean z4 = (i2 & 32) != 0 ? false : z2;
        if ((i2 & 64) != 0) {
            i3 = h4Var.f30275p0;
        } else {
            C9765h4 h4Var2 = h4Var;
            i3 = i;
        }
        h4Var.mo10366g3(str, imageView, z3, yVar2, aVar2, z4, i3);
    }

    /* renamed from: c3 */
    public final void mo10362c3() {
        LinkedList<v35> linkedList;
        LinkedList<v35> linkedList2 = this.f30248I;
        if (!(linkedList2 == null || linkedList2.isEmpty()) && (linkedList = this.f30248I) != null) {
            ConcertTicketTextView concertTicketTextView = this.f30276q;
            if (concertTicketTextView != null) {
                concertTicketTextView.setText(linkedList.get(this.f30246G).f143289d);
                this.f30246G = (this.f30246G + 1) % linkedList.size();
                return;
            }
            C87412m.m108603p("concertLyricsTv");
            throw null;
        }
    }

    /* renamed from: d3 */
    public final int mo10363d3(int i) {
        String str = this.f30265d;
        StringBuilder sb = new StringBuilder();
        sb.append("doTpPx originDensity: ");
        float f = f30239x0;
        sb.append(f);
        Log.m105924i(str, sb.toString());
        return C60641c.m70921b(f * ((float) i));
    }

    /* renamed from: e3 */
    public final void mo10364e3() {
        C9247b bVar = this.f30258T;
        if (bVar != null) {
            bVar.mo8913b();
        }
        ConcertTicketTextView concertTicketTextView = this.f30273o;
        if (concertTicketTextView != null) {
            concertTicketTextView.setClickable(true);
        } else {
            C87412m.m108603p("changeImgBtn");
            throw null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r4 = r4.f133180C;
     */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0115  */
    /* renamed from: f3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10365f3(boolean r12) {
        /*
            r11 = this;
            r0 = -1
            r1 = 0
            r2 = 0
            if (r12 == 0) goto L_0x0042
            int r3 = r11.f30247H
            te3.ez r4 = r11.f30249J
            if (r4 == 0) goto L_0x0015
            java.util.LinkedList<te3.dz> r4 = r4.f133180C
            if (r4 == 0) goto L_0x0015
            int r4 = r4.size()
            int r4 = r4 + r0
            goto L_0x0016
        L_0x0015:
            r4 = 0
        L_0x0016:
            if (r3 >= r4) goto L_0x002f
            te3.ez r0 = r11.f30249J
            if (r0 == 0) goto L_0x0025
            java.util.LinkedList<te3.dz> r0 = r0.f133180C
            if (r0 == 0) goto L_0x0025
            int r0 = r0.size()
            goto L_0x0026
        L_0x0025:
            r0 = 0
        L_0x0026:
            if (r0 <= 0) goto L_0x002f
            int r0 = r11.f30247H
            int r0 = r0 + 1
            r11.f30247H = r0
            goto L_0x0031
        L_0x002f:
            r11.f30247H = r2
        L_0x0031:
            te3.ez r0 = r11.f30249J
            if (r0 == 0) goto L_0x0088
            java.util.LinkedList<te3.dz> r0 = r0.f133180C
            if (r0 == 0) goto L_0x0088
            int r3 = r11.f30247H
            java.lang.Object r0 = sx3.C110818d0.m150917O(r0, r3)
            te3.dz r0 = (te3.C49204dz) r0
            goto L_0x0089
        L_0x0042:
            te3.ez r3 = r11.f30249J
            if (r3 == 0) goto L_0x0070
            java.util.LinkedList<te3.dz> r3 = r3.f133180C
            if (r3 == 0) goto L_0x0070
            java.util.Iterator r3 = r3.iterator()
            r4 = 0
        L_0x004f:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0071
            java.lang.Object r5 = r3.next()
            te3.dz r5 = (te3.C49204dz) r5
            java.lang.String r5 = r5.f132567d
            te3.ez r6 = r11.f30249J
            if (r6 == 0) goto L_0x0064
            java.lang.String r6 = r6.f133179B
            goto L_0x0065
        L_0x0064:
            r6 = r1
        L_0x0065:
            boolean r5 = gy3.C87412m.m108589b(r5, r6)
            if (r5 == 0) goto L_0x006d
            r0 = r4
            goto L_0x0071
        L_0x006d:
            int r4 = r4 + 1
            goto L_0x004f
        L_0x0070:
            r0 = 0
        L_0x0071:
            r11.f30247H = r0
            if (r0 >= 0) goto L_0x0077
            r11.f30247H = r2
        L_0x0077:
            te3.ez r0 = r11.f30249J
            if (r0 == 0) goto L_0x0088
            java.util.LinkedList<te3.dz> r0 = r0.f133180C
            if (r0 == 0) goto L_0x0088
            int r3 = r11.f30247H
            java.lang.Object r0 = sx3.C110818d0.m150917O(r0, r3)
            te3.dz r0 = (te3.C49204dz) r0
            goto L_0x0089
        L_0x0088:
            r0 = r1
        L_0x0089:
            r11.f30250K = r0
            if (r0 == 0) goto L_0x0090
            java.lang.String r0 = r0.f132567d
            goto L_0x0091
        L_0x0090:
            r0 = r1
        L_0x0091:
            r11.f30261W = r0
            java.lang.String r0 = r11.f30265d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "concertTicketInfo id:"
            r3.append(r4)
            te3.ez r4 = r11.f30249J
            if (r4 == 0) goto L_0x00a6
            java.lang.String r4 = r4.f133182d
            goto L_0x00a7
        L_0x00a6:
            r4 = r1
        L_0x00a7:
            r3.append(r4)
            java.lang.String r4 = ", size:"
            r3.append(r4)
            te3.ez r4 = r11.f30249J
            if (r4 == 0) goto L_0x00c0
            java.util.LinkedList<te3.dz> r4 = r4.f133180C
            if (r4 == 0) goto L_0x00c0
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x00c1
        L_0x00c0:
            r4 = r1
        L_0x00c1:
            r3.append(r4)
            java.lang.String r4 = ", title:"
            r3.append(r4)
            te3.ez r4 = r11.f30249J
            if (r4 == 0) goto L_0x00d0
            java.lang.String r4 = r4.f133183e
            goto L_0x00d1
        L_0x00d0:
            r4 = r1
        L_0x00d1:
            r3.append(r4)
            java.lang.String r4 = ", resourceId:"
            r3.append(r4)
            te3.dz r4 = r11.f30250K
            if (r4 == 0) goto L_0x00e0
            java.lang.String r4 = r4.f132567d
            goto L_0x00e1
        L_0x00e0:
            r4 = r1
        L_0x00e1:
            r3.append(r4)
            java.lang.String r4 = ", resourceWordSize:"
            r3.append(r4)
            te3.dz r4 = r11.f30250K
            if (r4 == 0) goto L_0x00fe
            te3.z35 r4 = r4.f132578r
            if (r4 == 0) goto L_0x00fe
            java.util.LinkedList<te3.v35> r4 = r4.f145679g
            if (r4 == 0) goto L_0x00fe
            int r4 = r4.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x00ff
        L_0x00fe:
            r4 = r1
        L_0x00ff:
            r3.append(r4)
            java.lang.String r4 = ", isChange:"
            r3.append(r4)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r3)
            te3.dz r0 = r11.f30250K
            if (r0 == 0) goto L_0x0198
            if (r12 == 0) goto L_0x0149
            it1.b$a r3 = it1.C9247b.f28989d
            android.app.Activity r4 = r11.getContext()
            android.app.Activity r5 = r11.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131830090(0x7f11254a, float:1.9293168E38)
            java.lang.String r5 = r5.getString(r6)
            r6 = 500(0x1f4, double:2.47E-321)
            r8 = 0
            r9 = 8
            r10 = 0
            it1.b r3 = it1.C9247b.C9248a.m8889a(r3, r4, r5, r6, r8, r9, r10)
            r11.f30258T = r3
            r3.begin()
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r3 = r11.f30273o
            if (r3 == 0) goto L_0x0143
            r3.setClickable(r2)
            goto L_0x014c
        L_0x0143:
            java.lang.String r12 = "changeImgBtn"
            gy3.C87412m.m108603p(r12)
            throw r1
        L_0x0149:
            r11.mo10370m3()
        L_0x014c:
            java.lang.String r2 = r0.f132575o
            java.lang.String r3 = ""
            if (r2 != 0) goto L_0x0154
            r5 = r3
            goto L_0x0155
        L_0x0154:
            r5 = r2
        L_0x0155:
            java.lang.String r2 = r0.f132569f
            if (r2 != 0) goto L_0x015b
            r6 = r3
            goto L_0x015c
        L_0x015b:
            r6 = r2
        L_0x015c:
            te3.ez r2 = r11.f30249J
            if (r2 == 0) goto L_0x016f
            te3.hx0 r2 = r2.f133189n
            if (r2 == 0) goto L_0x016f
            com.tencent.mm.protocal.protobuf.FinderContact r2 = r2.f134919d
            if (r2 == 0) goto L_0x016f
            java.lang.String r2 = r2.headUrl
            if (r2 != 0) goto L_0x016d
            goto L_0x016f
        L_0x016d:
            r7 = r2
            goto L_0x0170
        L_0x016f:
            r7 = r3
        L_0x0170:
            java.lang.String r2 = r0.f132570g
            if (r2 != 0) goto L_0x0176
            r8 = r3
            goto L_0x0177
        L_0x0176:
            r8 = r2
        L_0x0177:
            java.lang.String r0 = r0.f132576p
            if (r0 != 0) goto L_0x017d
            r9 = r3
            goto L_0x017e
        L_0x017d:
            r9 = r0
        L_0x017e:
            r4 = r11
            r10 = r12
            r4.mo10371n3(r5, r6, r7, r8, r9, r10)
            android.widget.TextView r0 = r11.f30243D
            if (r0 == 0) goto L_0x0192
            kf1.h4$a r1 = new kf1.h4$a
            r1.<init>(r11, r12)
            r0.setOnClickListener(r1)
            rx3.b0 r1 = rx3.C13598b0.f38549a
            goto L_0x0198
        L_0x0192:
            java.lang.String r12 = "concertRetryBtn"
            gy3.C87412m.m108603p(r12)
            throw r1
        L_0x0198:
            if (r1 != 0) goto L_0x01a2
            kf1.n4 r12 = new kf1.n4
            r12.<init>(r11)
            o40.C61926c.m72668M(r12)
        L_0x01a2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C9765h4.mo10365f3(boolean):void");
    }

    /* renamed from: g3 */
    public final void mo10366g3(String str, ImageView imageView, boolean z, C27696y yVar, C11978e0.C11979a aVar, boolean z2, int i) {
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        String str2 = this.f30265d;
        Log.m105924i(str2, "loadConcertImage url: " + str + ", view: " + imageView.hashCode());
        if (!Util.isNullOrNil(str)) {
            C39818r rVar = C39818r.f106831a;
            C60979d<C100810g0> f2 = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2();
            C11984n0 n0Var = new C11984n0(str, yVar);
            C87412m.m108594g(aVar, "type");
            C99344b<C100810g0, Bitmap> b = f2.mo85956b(n0Var, ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar));
            C9767b bVar = new C9767b(z, z2, this, imageView, i);
            b.getClass();
            b.f291320d = bVar;
            b.mo85951a();
        } else if (i == 0) {
            imageView.setImageDrawable(getContext().getResources().getDrawable(C0966R.C0969drawable.c4a));
            mo10367j3();
        } else if (i == this.f30264Z) {
            imageView.setImageDrawable(getContext().getResources().getDrawable(C0966R.C0969drawable.bfa));
            mo10367j3();
        } else if (i != this.f30275p0) {
        } else {
            if (z) {
                C61926c.m72668M(new C9867n4(this));
                return;
            }
            imageView.setImageDrawable((Drawable) null);
            mo10367j3();
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.b1d;
    }

    /* renamed from: j3 */
    public final void mo10367j3() {
        this.f30252M++;
        Log.m105924i(this.f30265d, "currentReadyCount: " + this.f30252M);
        if (this.f30252M == 5) {
            C61926c.m72668M(new C9775j(this));
        }
    }

    /* renamed from: k3 */
    public final void mo10368k3(TextView textView, LinkedList<String> linkedList, int i) {
        C87412m.m108594g(textView, "textView");
        String str = null;
        String str2 = linkedList != null ? (String) C110818d0.m150916N(linkedList) : null;
        boolean z = false;
        if (!(str2 == null || str2.length() == 0)) {
            String str3 = linkedList != null ? (String) C110818d0.m150925W(linkedList) : null;
            if (str3 == null || str3.length() == 0) {
                z = true;
            }
            if (!z) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append('#');
                    if (linkedList != null) {
                        str = linkedList.getFirst();
                    }
                    sb.append(str);
                    i = Color.parseColor(sb.toString());
                } catch (Exception unused) {
                    Log.m105924i(this.f30265d, "color parse false");
                }
            }
        }
        textView.setTextColor(i);
    }

    /* renamed from: l3 */
    public final void mo10369l3() {
        ConcertTicketTextView concertTicketTextView = this.f30271j;
        if (concertTicketTextView != null) {
            concertTicketTextView.setVisibility(4);
            RCConstraintLayout rCConstraintLayout = this.f30269h;
            if (rCConstraintLayout != null) {
                rCConstraintLayout.setRadius(0.0f);
                C58741j5 j5Var = C58741j5.f168184a;
                C49352ez ezVar = this.f30249J;
                StringBuilder sb = new StringBuilder();
                sb.append(C58741j5.f168188e);
                sb.append("concert_");
                sb.append(ezVar != null ? Long.valueOf(ezVar.f133190o) : null);
                sb.append('_');
                sb.append(C31543z5.m39451a());
                sb.append(".jpg");
                this.f30251L = sb.toString();
                RCConstraintLayout rCConstraintLayout2 = this.f30269h;
                if (rCConstraintLayout2 != null) {
                    BitmapUtil.saveBitmapToImage(BitmapUtil.getBitmapFromView(rCConstraintLayout2), 100, Bitmap.CompressFormat.JPEG, this.f30251L, true);
                    LinkedList<v35> linkedList = this.f30248I;
                    if ((linkedList != null ? linkedList.size() : 0) > 1) {
                        ConcertTicketTextView concertTicketTextView2 = this.f30271j;
                        if (concertTicketTextView2 != null) {
                            concertTicketTextView2.setVisibility(0);
                        } else {
                            C87412m.m108603p("changeWordBtn");
                            throw null;
                        }
                    }
                    RCConstraintLayout rCConstraintLayout3 = this.f30269h;
                    if (rCConstraintLayout3 != null) {
                        rCConstraintLayout3.setRadius((float) C76577a.m92151b(getContext(), 20));
                    } else {
                        C87412m.m108603p("concertTicketViewRoot");
                        throw null;
                    }
                } else {
                    C87412m.m108603p("concertTicketViewRoot");
                    throw null;
                }
            } else {
                C87412m.m108603p("concertTicketViewRoot");
                throw null;
            }
        } else {
            C87412m.m108603p("changeWordBtn");
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0232  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x03ac  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03be  */
    /* JADX WARNING: Removed duplicated region for block: B:341:0x05e0  */
    /* renamed from: m3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10370m3() {
        /*
            r20 = this;
            r0 = r20
            java.lang.Class<ny.h> r1 = p629ny.C76979h.class
            te3.dz r2 = r0.f30250K
            if (r2 == 0) goto L_0x060a
            pe1.c<java.lang.Integer> r3 = gg1.C32444a.f86046D1
            java.lang.Object r4 = r3.mo60266n()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.String r5 = "format(format, *args)"
            java.lang.String r6 = "%06d"
            r7 = 2131823999(0x7f110d7f, float:1.9280814E38)
            java.lang.String r8 = "commemorativeNumberTv"
            r9 = 0
            r10 = 1
            r11 = 0
            if (r4 == 0) goto L_0x0051
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r4 = r0.f30274p
            if (r4 == 0) goto L_0x004d
            android.app.Activity r12 = r20.getContext()
            android.content.res.Resources r12 = r12.getResources()
            java.lang.Object[] r13 = new java.lang.Object[r10]
            java.lang.Object[] r14 = new java.lang.Object[r10]
            java.lang.Object r3 = r3.mo60266n()
            r14[r9] = r3
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r14, r10)
            java.lang.String r3 = java.lang.String.format(r6, r3)
            gy3.C87412m.m108593f(r3, r5)
            r13[r9] = r3
            java.lang.String r3 = r12.getString(r7, r13)
            r4.setText(r3)
            goto L_0x0083
        L_0x004d:
            gy3.C87412m.m108603p(r8)
            throw r11
        L_0x0051:
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r3 = r0.f30274p
            if (r3 == 0) goto L_0x0605
            android.app.Activity r4 = r20.getContext()
            android.content.res.Resources r4 = r4.getResources()
            java.lang.Object[] r12 = new java.lang.Object[r10]
            java.lang.Object[] r13 = new java.lang.Object[r10]
            te3.ez r14 = r0.f30249J
            if (r14 == 0) goto L_0x006c
            long r14 = r14.f133190o
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            goto L_0x006d
        L_0x006c:
            r14 = r11
        L_0x006d:
            r13[r9] = r14
            java.lang.Object[] r13 = java.util.Arrays.copyOf(r13, r10)
            java.lang.String r6 = java.lang.String.format(r6, r13)
            gy3.C87412m.m108593f(r6, r5)
            r12[r9] = r6
            java.lang.String r4 = r4.getString(r7, r12)
            r3.setText(r4)
        L_0x0083:
            java.util.LinkedList<java.lang.String> r3 = r2.f132572i
            android.app.Activity r4 = r20.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131101837(0x7f06088d, float:1.7816095E38)
            int r4 = r4.getColor(r5)
            if (r3 == 0) goto L_0x009d
            java.lang.Object r6 = sx3.C110818d0.m150916N(r3)
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x009e
        L_0x009d:
            r6 = r11
        L_0x009e:
            if (r6 == 0) goto L_0x00a9
            int r6 = r6.length()
            if (r6 != 0) goto L_0x00a7
            goto L_0x00a9
        L_0x00a7:
            r6 = 0
            goto L_0x00aa
        L_0x00a9:
            r6 = 1
        L_0x00aa:
            r7 = 35
            java.lang.String r12 = "color parse false"
            if (r6 != 0) goto L_0x00d3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ce }
            r6.<init>()     // Catch:{ Exception -> 0x00ce }
            r6.append(r7)     // Catch:{ Exception -> 0x00ce }
            if (r3 == 0) goto L_0x00c1
            java.lang.Object r3 = r3.getFirst()     // Catch:{ Exception -> 0x00ce }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x00ce }
            goto L_0x00c2
        L_0x00c1:
            r3 = r11
        L_0x00c2:
            r6.append(r3)     // Catch:{ Exception -> 0x00ce }
            java.lang.String r3 = r6.toString()     // Catch:{ Exception -> 0x00ce }
            int r4 = android.graphics.Color.parseColor(r3)     // Catch:{ Exception -> 0x00ce }
            goto L_0x00d3
        L_0x00ce:
            java.lang.String r3 = r0.f30265d
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r12)
        L_0x00d3:
            com.tencent.mm.view.RCConstraintLayout r3 = r0.f30269h
            if (r3 == 0) goto L_0x05fe
            r0.mo10372o3(r3, r4)
            java.util.LinkedList<java.lang.String> r3 = r2.f132573j
            android.app.Activity r4 = r20.getContext()
            android.content.res.Resources r4 = r4.getResources()
            int r4 = r4.getColor(r5)
            if (r3 == 0) goto L_0x00f1
            java.lang.Object r6 = sx3.C110818d0.m150916N(r3)
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x00f2
        L_0x00f1:
            r6 = r11
        L_0x00f2:
            if (r6 == 0) goto L_0x00fd
            int r6 = r6.length()
            if (r6 != 0) goto L_0x00fb
            goto L_0x00fd
        L_0x00fb:
            r6 = 0
            goto L_0x00fe
        L_0x00fd:
            r6 = 1
        L_0x00fe:
            if (r6 != 0) goto L_0x0123
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x011e }
            r6.<init>()     // Catch:{ Exception -> 0x011e }
            r6.append(r7)     // Catch:{ Exception -> 0x011e }
            if (r3 == 0) goto L_0x0111
            java.lang.Object r3 = r3.getFirst()     // Catch:{ Exception -> 0x011e }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x011e }
            goto L_0x0112
        L_0x0111:
            r3 = r11
        L_0x0112:
            r6.append(r3)     // Catch:{ Exception -> 0x011e }
            java.lang.String r3 = r6.toString()     // Catch:{ Exception -> 0x011e }
            int r4 = android.graphics.Color.parseColor(r3)     // Catch:{ Exception -> 0x011e }
            goto L_0x0123
        L_0x011e:
            java.lang.String r3 = r0.f30265d
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r12)
        L_0x0123:
            android.content.Context r3 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            android.content.res.Resources r3 = r3.getResources()
            r6 = 2131165306(0x7f07007a, float:1.7944825E38)
            int r3 = r3.getDimensionPixelSize(r6)
            float r3 = (float) r3
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r6 = r0.f30274p
            if (r6 == 0) goto L_0x05f9
            r6.setTextColor(r4)
            android.graphics.drawable.GradientDrawable r6 = new android.graphics.drawable.GradientDrawable
            r6.<init>()
            r6.setShape(r9)
            r13 = 8
            float[] r14 = new float[r13]
            r14[r9] = r3
            r14[r10] = r3
            r15 = 2
            r14[r15] = r3
            r16 = 3
            r14[r16] = r3
            r5 = 4
            r14[r5] = r3
            r17 = 5
            r14[r17] = r3
            r17 = 6
            r14[r17] = r3
            r17 = 7
            r14[r17] = r3
            r6.setCornerRadii(r14)
            r6.setStroke(r15, r4)
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r3 = r0.f30274p
            if (r3 == 0) goto L_0x05f4
            r3.setBackground(r6)
            java.util.LinkedList<java.lang.String> r3 = r2.f132574n
            if (r3 == 0) goto L_0x0178
            java.lang.Object r4 = sx3.C110818d0.m150916N(r3)
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0179
        L_0x0178:
            r4 = r11
        L_0x0179:
            if (r4 == 0) goto L_0x0184
            int r4 = r4.length()
            if (r4 != 0) goto L_0x0182
            goto L_0x0184
        L_0x0182:
            r4 = 0
            goto L_0x0185
        L_0x0184:
            r4 = 1
        L_0x0185:
            r6 = 2131232535(0x7f080717, float:1.8081182E38)
            java.lang.String r8 = "shareBtn"
            if (r4 != 0) goto L_0x021f
            if (r3 == 0) goto L_0x0196
            java.lang.Object r4 = sx3.C110818d0.m150925W(r3)
            java.lang.String r4 = (java.lang.String) r4
            goto L_0x0197
        L_0x0196:
            r4 = r11
        L_0x0197:
            if (r4 == 0) goto L_0x01a2
            int r4 = r4.length()
            if (r4 != 0) goto L_0x01a0
            goto L_0x01a2
        L_0x01a0:
            r4 = 0
            goto L_0x01a3
        L_0x01a2:
            r4 = 1
        L_0x01a3:
            if (r4 != 0) goto L_0x021f
            int[] r4 = new int[r15]     // Catch:{ Exception -> 0x0205 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0205 }
            r14.<init>()     // Catch:{ Exception -> 0x0205 }
            r14.append(r7)     // Catch:{ Exception -> 0x0205 }
            if (r3 == 0) goto L_0x01ba
            java.lang.Object r17 = r3.getFirst()     // Catch:{ Exception -> 0x0205 }
            java.lang.String r17 = (java.lang.String) r17     // Catch:{ Exception -> 0x0205 }
            r15 = r17
            goto L_0x01bb
        L_0x01ba:
            r15 = r11
        L_0x01bb:
            r14.append(r15)     // Catch:{ Exception -> 0x0205 }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x0205 }
            int r14 = android.graphics.Color.parseColor(r14)     // Catch:{ Exception -> 0x0205 }
            r4[r9] = r14     // Catch:{ Exception -> 0x0205 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0205 }
            r14.<init>()     // Catch:{ Exception -> 0x0205 }
            r14.append(r7)     // Catch:{ Exception -> 0x0205 }
            if (r3 == 0) goto L_0x01d9
            java.lang.Object r3 = r3.getLast()     // Catch:{ Exception -> 0x0205 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x0205 }
            goto L_0x01da
        L_0x01d9:
            r3 = r11
        L_0x01da:
            r14.append(r3)     // Catch:{ Exception -> 0x0205 }
            java.lang.String r3 = r14.toString()     // Catch:{ Exception -> 0x0205 }
            int r3 = android.graphics.Color.parseColor(r3)     // Catch:{ Exception -> 0x0205 }
            r4[r10] = r3     // Catch:{ Exception -> 0x0205 }
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable     // Catch:{ Exception -> 0x0205 }
            android.graphics.drawable.GradientDrawable$Orientation r14 = android.graphics.drawable.GradientDrawable.Orientation.TL_BR     // Catch:{ Exception -> 0x0205 }
            r3.<init>(r14, r4)     // Catch:{ Exception -> 0x0205 }
            int r4 = r0.mo10363d3(r13)     // Catch:{ Exception -> 0x0205 }
            float r4 = (float) r4     // Catch:{ Exception -> 0x0205 }
            r3.setCornerRadius(r4)     // Catch:{ Exception -> 0x0205 }
            r3.setGradientType(r9)     // Catch:{ Exception -> 0x0205 }
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r4 = r0.f30267f     // Catch:{ Exception -> 0x0205 }
            if (r4 == 0) goto L_0x0201
            r4.setBackground(r3)     // Catch:{ Exception -> 0x0205 }
            goto L_0x022e
        L_0x0201:
            gy3.C87412m.m108603p(r8)     // Catch:{ Exception -> 0x0205 }
            throw r11     // Catch:{ Exception -> 0x0205 }
        L_0x0205:
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r3 = r0.f30267f
            if (r3 == 0) goto L_0x021b
            android.app.Activity r4 = r20.getContext()
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r6)
            r3.setBackground(r4)
            java.lang.String r3 = r0.f30265d
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r3, r12)
            goto L_0x022e
        L_0x021b:
            gy3.C87412m.m108603p(r8)
            throw r11
        L_0x021f:
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r3 = r0.f30267f
            if (r3 == 0) goto L_0x05ef
            android.app.Activity r4 = r20.getContext()
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r6)
            r3.setBackground(r4)
        L_0x022e:
            te3.z35 r3 = r2.f132578r
            if (r3 == 0) goto L_0x0235
            java.util.LinkedList<te3.v35> r4 = r3.f145679g
            goto L_0x0236
        L_0x0235:
            r4 = r11
        L_0x0236:
            r0.f30248I = r4
            if (r4 == 0) goto L_0x023f
            int r4 = r4.size()
            goto L_0x0240
        L_0x023f:
            r4 = 0
        L_0x0240:
            java.lang.String r6 = "concertLyricsTv"
            java.lang.String r14 = "concertLyricsLayout"
            if (r4 <= 0) goto L_0x03ac
            long r18 = java.lang.System.currentTimeMillis()
            ky3.c r15 = ky3.C88336d.m110136a(r18)
            int r15 = r15.mo122723h(r9, r4)
            r0.f30246G = r15
            r20.mo10362c3()
            java.lang.String r15 = "changeWordBtn"
            if (r4 != r10) goto L_0x0267
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r4 = r0.f30271j
            if (r4 == 0) goto L_0x0263
            r4.setVisibility(r5)
            goto L_0x026e
        L_0x0263:
            gy3.C87412m.m108603p(r15)
            throw r11
        L_0x0267:
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r4 = r0.f30271j
            if (r4 == 0) goto L_0x03a7
            r4.setVisibility(r9)
        L_0x026e:
            if (r3 == 0) goto L_0x0276
            int r4 = r3.f145677e
            if (r4 != 0) goto L_0x0276
            r4 = 1
            goto L_0x0277
        L_0x0276:
            r4 = 0
        L_0x0277:
            if (r4 == 0) goto L_0x0295
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r4 = r0.f30271j
            if (r4 == 0) goto L_0x0291
            android.app.Activity r5 = r20.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r13 = 2131232566(0x7f080736, float:1.8081245E38)
            android.graphics.drawable.Drawable r5 = r5.getDrawable(r13)
            r4.setBackgroundDrawable(r5)
            goto L_0x0342
        L_0x0291:
            gy3.C87412m.m108603p(r15)
            throw r11
        L_0x0295:
            if (r3 == 0) goto L_0x029a
            java.util.LinkedList<java.lang.String> r4 = r3.f145678f
            goto L_0x029b
        L_0x029a:
            r4 = r11
        L_0x029b:
            r5 = 2
            int[] r13 = new int[r5]
            java.lang.String r5 = "#A6AAAAAA"
            int r19 = android.graphics.Color.parseColor(r5)
            r13[r9] = r19
            int r5 = android.graphics.Color.parseColor(r5)
            r13[r10] = r5
            if (r4 == 0) goto L_0x02b5
            java.lang.Object r5 = sx3.C110818d0.m150916N(r4)
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x02b6
        L_0x02b5:
            r5 = r11
        L_0x02b6:
            if (r5 == 0) goto L_0x02c1
            int r5 = r5.length()
            if (r5 != 0) goto L_0x02bf
            goto L_0x02c1
        L_0x02bf:
            r5 = 0
            goto L_0x02c2
        L_0x02c1:
            r5 = 1
        L_0x02c2:
            if (r5 != 0) goto L_0x0327
            if (r4 == 0) goto L_0x02cd
            java.lang.Object r5 = sx3.C110818d0.m150925W(r4)
            java.lang.String r5 = (java.lang.String) r5
            goto L_0x02ce
        L_0x02cd:
            r5 = r11
        L_0x02ce:
            if (r5 == 0) goto L_0x02d9
            int r5 = r5.length()
            if (r5 != 0) goto L_0x02d7
            goto L_0x02d9
        L_0x02d7:
            r5 = 0
            goto L_0x02da
        L_0x02d9:
            r5 = 1
        L_0x02da:
            if (r5 != 0) goto L_0x0327
            r5 = 2
            int[] r5 = new int[r5]     // Catch:{ Exception -> 0x0322 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0322 }
            r11.<init>()     // Catch:{ Exception -> 0x0322 }
            r11.append(r7)     // Catch:{ Exception -> 0x0322 }
            if (r4 == 0) goto L_0x02f2
            java.lang.Object r19 = r4.getFirst()     // Catch:{ Exception -> 0x0322 }
            java.lang.String r19 = (java.lang.String) r19     // Catch:{ Exception -> 0x0322 }
            r10 = r19
            goto L_0x02f3
        L_0x02f2:
            r10 = 0
        L_0x02f3:
            r11.append(r10)     // Catch:{ Exception -> 0x0322 }
            java.lang.String r10 = r11.toString()     // Catch:{ Exception -> 0x0322 }
            int r10 = android.graphics.Color.parseColor(r10)     // Catch:{ Exception -> 0x0322 }
            r5[r9] = r10     // Catch:{ Exception -> 0x0322 }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0322 }
            r10.<init>()     // Catch:{ Exception -> 0x0322 }
            r10.append(r7)     // Catch:{ Exception -> 0x0322 }
            if (r4 == 0) goto L_0x0311
            java.lang.Object r4 = r4.getLast()     // Catch:{ Exception -> 0x0322 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0322 }
            goto L_0x0312
        L_0x0311:
            r4 = 0
        L_0x0312:
            r10.append(r4)     // Catch:{ Exception -> 0x0322 }
            java.lang.String r4 = r10.toString()     // Catch:{ Exception -> 0x0322 }
            int r4 = android.graphics.Color.parseColor(r4)     // Catch:{ Exception -> 0x0322 }
            r10 = 1
            r5[r10] = r4     // Catch:{ Exception -> 0x0322 }
            r13 = r5
            goto L_0x0327
        L_0x0322:
            java.lang.String r4 = r0.f30265d
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r12)
        L_0x0327:
            android.graphics.drawable.GradientDrawable r4 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r5 = android.graphics.drawable.GradientDrawable.Orientation.TL_BR
            r4.<init>(r5, r13)
            r5 = 16
            int r5 = r0.mo10363d3(r5)
            float r5 = (float) r5
            r4.setCornerRadius(r5)
            r4.setGradientType(r9)
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r5 = r0.f30271j
            if (r5 == 0) goto L_0x03a2
            r5.setBackground(r4)
        L_0x0342:
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r4 = r0.f30271j
            if (r4 == 0) goto L_0x039d
            if (r3 == 0) goto L_0x034b
            java.util.LinkedList<java.lang.String> r5 = r3.f145680h
            goto L_0x034c
        L_0x034b:
            r5 = 0
        L_0x034c:
            android.app.Activity r10 = r20.getContext()
            android.content.res.Resources r10 = r10.getResources()
            r11 = 2131101837(0x7f06088d, float:1.7816095E38)
            int r10 = r10.getColor(r11)
            r0.mo10368k3(r4, r5, r10)
            if (r3 == 0) goto L_0x0363
            java.lang.String r4 = r3.f145676d
            goto L_0x0364
        L_0x0363:
            r4 = 0
        L_0x0364:
            if (r4 == 0) goto L_0x036f
            int r4 = r4.length()
            if (r4 != 0) goto L_0x036d
            goto L_0x036f
        L_0x036d:
            r4 = 0
            goto L_0x0370
        L_0x036f:
            r4 = 1
        L_0x0370:
            if (r4 != 0) goto L_0x0385
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r4 = r0.f30271j
            if (r4 == 0) goto L_0x0380
            if (r3 == 0) goto L_0x037b
            java.lang.String r3 = r3.f145676d
            goto L_0x037c
        L_0x037b:
            r3 = 0
        L_0x037c:
            r4.setText(r3)
            goto L_0x0385
        L_0x0380:
            gy3.C87412m.m108603p(r15)
            r3 = 0
            throw r3
        L_0x0385:
            r3 = 0
            android.widget.FrameLayout r4 = r0.f30281v
            if (r4 == 0) goto L_0x0399
            r4.setVisibility(r9)
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r4 = r0.f30276q
            if (r4 == 0) goto L_0x0395
            r4.setVisibility(r9)
            goto L_0x03ba
        L_0x0395:
            gy3.C87412m.m108603p(r6)
            throw r3
        L_0x0399:
            gy3.C87412m.m108603p(r14)
            throw r3
        L_0x039d:
            r3 = 0
            gy3.C87412m.m108603p(r15)
            throw r3
        L_0x03a2:
            r3 = 0
            gy3.C87412m.m108603p(r15)
            throw r3
        L_0x03a7:
            r3 = r11
            gy3.C87412m.m108603p(r15)
            throw r3
        L_0x03ac:
            android.widget.FrameLayout r3 = r0.f30281v
            if (r3 == 0) goto L_0x05ea
            r3.setVisibility(r5)
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r3 = r0.f30276q
            if (r3 == 0) goto L_0x05e5
            r3.setVisibility(r5)
        L_0x03ba:
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r3 = r0.f30267f
            if (r3 == 0) goto L_0x05e0
            java.util.LinkedList<java.lang.String> r4 = r2.f132579s
            android.app.Activity r5 = r20.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131101837(0x7f06088d, float:1.7816095E38)
            int r5 = r5.getColor(r6)
            r0.mo10368k3(r3, r4, r5)
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r3 = r0.f30272n
            if (r3 == 0) goto L_0x05d8
            java.util.LinkedList<java.lang.String> r4 = r2.f132580t
            android.app.Activity r5 = r20.getContext()
            android.content.res.Resources r5 = r5.getResources()
            r6 = 2131099699(0x7f060033, float:1.7811759E38)
            int r5 = r5.getColor(r6)
            r0.mo10368k3(r3, r4, r5)
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r3 = r0.f30273o
            if (r3 == 0) goto L_0x05d1
            java.util.LinkedList<java.lang.String> r4 = r2.f132580t
            android.app.Activity r5 = r20.getContext()
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getColor(r6)
            r0.mo10368k3(r3, r4, r5)
            android.view.View r3 = r0.f30268g
            if (r3 == 0) goto L_0x05ca
            java.util.LinkedList<java.lang.String> r4 = r2.f132581u
            android.app.Activity r5 = r20.getContext()
            android.content.res.Resources r5 = r5.getResources()
            int r5 = r5.getColor(r6)
            if (r4 == 0) goto L_0x041a
            java.lang.Object r6 = sx3.C110818d0.m150916N(r4)
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x041b
        L_0x041a:
            r6 = 0
        L_0x041b:
            if (r6 == 0) goto L_0x0426
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0424
            goto L_0x0426
        L_0x0424:
            r6 = 0
            goto L_0x0427
        L_0x0426:
            r6 = 1
        L_0x0427:
            if (r6 != 0) goto L_0x0464
            if (r4 == 0) goto L_0x0432
            java.lang.Object r6 = sx3.C110818d0.m150925W(r4)
            java.lang.String r6 = (java.lang.String) r6
            goto L_0x0433
        L_0x0432:
            r6 = 0
        L_0x0433:
            if (r6 == 0) goto L_0x043e
            int r6 = r6.length()
            if (r6 != 0) goto L_0x043c
            goto L_0x043e
        L_0x043c:
            r6 = 0
            goto L_0x043f
        L_0x043e:
            r6 = 1
        L_0x043f:
            if (r6 != 0) goto L_0x0464
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x045f }
            r6.<init>()     // Catch:{ Exception -> 0x045f }
            r6.append(r7)     // Catch:{ Exception -> 0x045f }
            if (r4 == 0) goto L_0x0452
            java.lang.Object r4 = r4.getFirst()     // Catch:{ Exception -> 0x045f }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x045f }
            goto L_0x0453
        L_0x0452:
            r4 = 0
        L_0x0453:
            r6.append(r4)     // Catch:{ Exception -> 0x045f }
            java.lang.String r4 = r6.toString()     // Catch:{ Exception -> 0x045f }
            int r5 = android.graphics.Color.parseColor(r4)     // Catch:{ Exception -> 0x045f }
            goto L_0x0464
        L_0x045f:
            java.lang.String r4 = r0.f30265d
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r4, r12)
        L_0x0464:
            r3.setBackgroundColor(r5)
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r3 = r0.f30277r
            if (r3 == 0) goto L_0x05c3
            java.lang.String r2 = r2.f132568e
            r3.setText(r2)
            java.lang.String r2 = r0.f30257S
            if (r2 == 0) goto L_0x047d
            int r2 = r2.length()
            if (r2 != 0) goto L_0x047b
            goto L_0x047d
        L_0x047b:
            r2 = 0
            goto L_0x047e
        L_0x047d:
            r2 = 1
        L_0x047e:
            java.lang.String r3 = "concertLocationTv"
            if (r2 == 0) goto L_0x0491
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r2 = r0.f30279t
            if (r2 == 0) goto L_0x048c
            r4 = 8
            r2.setVisibility(r4)
            goto L_0x04bf
        L_0x048c:
            gy3.C87412m.m108603p(r3)
            r1 = 0
            throw r1
        L_0x0491:
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r2 = r0.f30279t
            if (r2 == 0) goto L_0x05be
            di3.d r4 = di3.C86312j.m106911c(r1)
            ny.h r4 = (p629ny.C76979h) r4
            android.app.Activity r5 = r20.getContext()
            android.content.res.Resources r6 = r20.getResources()
            r7 = 2131824000(0x7f110d80, float:1.9280816E38)
            r8 = 1
            java.lang.Object[] r10 = new java.lang.Object[r8]
            java.lang.String r8 = r0.f30257S
            r10[r9] = r8
            java.lang.String r6 = r6.getString(r7, r10)
            android.text.SpannableString r4 = r4.mo107057T1(r5, r6)
            r2.setText(r4)
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r2 = r0.f30279t
            if (r2 == 0) goto L_0x05b9
            r2.setVisibility(r9)
        L_0x04bf:
            te3.ez r2 = r0.f30249J
            r3 = 0
            if (r2 == 0) goto L_0x04c8
            long r5 = r2.f133186h
            goto L_0x04c9
        L_0x04c8:
            r5 = r3
        L_0x04c9:
            java.lang.String r2 = "concertTimeTv"
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L_0x0508
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r5 = r0.f30278s
            if (r5 == 0) goto L_0x0503
            android.content.res.Resources r6 = r20.getResources()
            r7 = 2131824001(0x7f110d81, float:1.9280818E38)
            r8 = 1
            java.lang.Object[] r10 = new java.lang.Object[r8]
            er1.j4 r8 = er1.C58739j4.f168176a
            te3.ez r11 = r0.f30249J
            if (r11 == 0) goto L_0x04e5
            long r3 = r11.f133186h
        L_0x04e5:
            r11 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r11
            java.lang.String r3 = r8.mo83722r(r3)
            r10[r9] = r3
            java.lang.String r3 = r6.getString(r7, r10)
            r5.setText(r3)
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r3 = r0.f30278s
            if (r3 == 0) goto L_0x04fe
            r3.setVisibility(r9)
            goto L_0x0511
        L_0x04fe:
            gy3.C87412m.m108603p(r2)
            r1 = 0
            throw r1
        L_0x0503:
            r1 = 0
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x0508:
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r3 = r0.f30278s
            if (r3 == 0) goto L_0x05b4
            r4 = 8
            r3.setVisibility(r4)
        L_0x0511:
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r2 = r0.f30283x
            if (r2 == 0) goto L_0x05ad
            di3.d r1 = di3.C86312j.m106911c(r1)
            ny.h r1 = (p629ny.C76979h) r1
            android.app.Activity r3 = r20.getContext()
            android.content.res.Resources r4 = r20.getResources()
            r5 = 2131824002(0x7f110d82, float:1.928082E38)
            r6 = 1
            java.lang.Object[] r7 = new java.lang.Object[r6]
            te3.ez r6 = r0.f30249J
            if (r6 == 0) goto L_0x0538
            te3.hx0 r6 = r6.f133189n
            if (r6 == 0) goto L_0x0538
            com.tencent.mm.protocal.protobuf.FinderContact r6 = r6.f134919d
            if (r6 == 0) goto L_0x0538
            java.lang.String r6 = r6.nickname
            goto L_0x0539
        L_0x0538:
            r6 = 0
        L_0x0539:
            r7[r9] = r6
            java.lang.String r4 = r4.getString(r5, r7)
            android.text.SpannableString r1 = r1.mo107057T1(r3, r4)
            r2.setText(r1)
            te3.ez r1 = r0.f30249J
            if (r1 == 0) goto L_0x060a
            java.util.LinkedList<te3.ia3> r2 = r1.f133178A
            java.lang.String r3 = "ticketInfo.page_item_list"
            gy3.C87412m.m108593f(r2, r3)
            boolean r2 = r2.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            java.lang.String r3 = "topRightBtn"
            if (r2 == 0) goto L_0x059e
            java.util.LinkedList<te3.ia3> r2 = r1.f133178A
            java.lang.Object r2 = r2.getFirst()
            te3.ia3 r2 = (te3.C49821ia3) r2
            int r2 = r2.f135193f
            if (r2 == 0) goto L_0x059e
            java.util.LinkedList<te3.ia3> r1 = r1.f133178A
            java.lang.Object r1 = r1.getFirst()
            te3.ia3 r1 = (te3.C49821ia3) r1
            android.widget.TextView r2 = r0.f30282w
            if (r2 == 0) goto L_0x0599
            r2.setVisibility(r9)
            android.widget.TextView r2 = r0.f30282w
            if (r2 == 0) goto L_0x0594
            java.lang.String r4 = r1.f135191d
            r2.setText(r4)
            android.widget.TextView r2 = r0.f30282w
            if (r2 == 0) goto L_0x058f
            kf1.m4 r3 = new kf1.m4
            r3.<init>(r0, r1)
            r2.setOnClickListener(r3)
            goto L_0x060a
        L_0x058f:
            gy3.C87412m.m108603p(r3)
            r1 = 0
            throw r1
        L_0x0594:
            r1 = 0
            gy3.C87412m.m108603p(r3)
            throw r1
        L_0x0599:
            r1 = 0
            gy3.C87412m.m108603p(r3)
            throw r1
        L_0x059e:
            r1 = 0
            android.widget.TextView r2 = r0.f30282w
            if (r2 == 0) goto L_0x05a9
            r4 = 8
            r2.setVisibility(r4)
            goto L_0x060a
        L_0x05a9:
            gy3.C87412m.m108603p(r3)
            throw r1
        L_0x05ad:
            r1 = 0
            java.lang.String r2 = "concertVisitorNameTv"
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x05b4:
            r1 = 0
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x05b9:
            r1 = 0
            gy3.C87412m.m108603p(r3)
            throw r1
        L_0x05be:
            r1 = 0
            gy3.C87412m.m108603p(r3)
            throw r1
        L_0x05c3:
            r1 = 0
            java.lang.String r2 = "concertNameTv"
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x05ca:
            r1 = 0
            java.lang.String r2 = "playDivider"
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x05d1:
            r1 = 0
            java.lang.String r2 = "changeImgBtn"
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x05d8:
            r1 = 0
            java.lang.String r2 = "saveImgBtn"
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x05e0:
            r1 = 0
            gy3.C87412m.m108603p(r8)
            throw r1
        L_0x05e5:
            r1 = 0
            gy3.C87412m.m108603p(r6)
            throw r1
        L_0x05ea:
            r1 = 0
            gy3.C87412m.m108603p(r14)
            throw r1
        L_0x05ef:
            r1 = r11
            gy3.C87412m.m108603p(r8)
            throw r1
        L_0x05f4:
            r1 = r11
            gy3.C87412m.m108603p(r8)
            throw r1
        L_0x05f9:
            r1 = r11
            gy3.C87412m.m108603p(r8)
            throw r1
        L_0x05fe:
            r1 = r11
            java.lang.String r2 = "concertTicketViewRoot"
            gy3.C87412m.m108603p(r2)
            throw r1
        L_0x0605:
            r1 = r11
            gy3.C87412m.m108603p(r8)
            throw r1
        L_0x060a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C9765h4.mo10370m3():void");
    }

    /* renamed from: n3 */
    public final void mo10371n3(String str, String str2, String str3, String str4, String str5, boolean z) {
        String str6 = str4;
        Class cls = C11990s0.class;
        Class<C60200t1> cls2 = C60200t1.class;
        C87412m.m108594g(str, "qrUrl");
        C87412m.m108594g(str2, "concertBgUrl");
        C87412m.m108594g(str3, "headerUrl");
        C87412m.m108594g(str6, "viewBgUrl");
        C87412m.m108594g(str5, "logoUrl");
        this.f30259U.clear();
        ImageView imageView = this.f30284y;
        if (imageView != null) {
            C27696y yVar = C27696y.RAW_IMAGE;
            C11978e0.C11979a aVar = C11978e0.C11979a.DEFAULT;
            C11978e0.C11979a aVar2 = aVar;
            C27696y yVar2 = yVar;
            m9483i3(this, str, imageView, true, yVar, aVar, z, 0, 64, (Object) null);
            ImageView imageView2 = this.f30285z;
            if (imageView2 != null) {
                m9483i3(this, str3, imageView2, false, (C27696y) null, (C11978e0.C11979a) null, z, this.f30264Z, 24, (Object) null);
                ImageView imageView3 = this.f30240A;
                if (imageView3 != null) {
                    m9483i3(this, str2, imageView3, true, yVar2, aVar2, z, 0, 64, (Object) null);
                    ImageView imageView4 = this.f30280u;
                    if (imageView4 != null) {
                        mo10366g3(str5, imageView4, false, yVar2, aVar2, z, 0);
                        C39818r rVar = C39818r.f106831a;
                        C99344b<C100810g0, Bitmap> b = ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11871f2().mo85956b(new C11984n0(str6, yVar2), ((C11990s0) rVar.mo62446e(cls2).mo62447c(cls)).mo11867O2(aVar2));
                        C9776k kVar = new C9776k(this, z);
                        b.getClass();
                        b.f291320d = kVar;
                        b.mo85951a();
                        return;
                    }
                    C87412m.m108603p("concertLogoIv");
                    throw null;
                }
                C87412m.m108603p("concertTicketPicBg");
                throw null;
            }
            C87412m.m108603p("concertUserHeadImg");
            throw null;
        }
        C87412m.m108603p("concertVisitorShareImage");
        throw null;
    }

    /* renamed from: o3 */
    public final void mo10372o3(ViewGroup viewGroup, int i) {
        int childCount = viewGroup.getChildCount();
        if (childCount >= 0) {
            int i2 = 0;
            while (true) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt instanceof ViewGroup) {
                    mo10372o3((ViewGroup) childAt, i);
                } else if (childAt instanceof TextView) {
                    ((TextView) childAt).setTextColor(i);
                }
                if (i2 != childCount) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public boolean onBackPressed() {
        mo10364e3();
        return super.onBackPressed();
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x02d5  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0381  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            super.onCreate(r9)
            android.content.Intent r9 = r8.getIntent()
            java.lang.String r0 = "concert_ticket_info_enter_scene"
            java.lang.String r9 = r9.getStringExtra(r0)
            java.lang.String r0 = "3"
            if (r9 != 0) goto L_0x0012
            r9 = r0
        L_0x0012:
            r8.f30245F = r9
            int r9 = r9.length()
            r1 = 1
            r2 = 0
            if (r9 != 0) goto L_0x001e
            r9 = 1
            goto L_0x001f
        L_0x001e:
            r9 = 0
        L_0x001f:
            if (r9 == 0) goto L_0x0023
            r8.f30245F = r0
        L_0x0023:
            long r3 = java.lang.System.currentTimeMillis()
            r8.f30253N = r3
            android.content.Intent r9 = r8.getIntent()
            java.lang.String r0 = "concert_ticket_info_context_id"
            java.lang.String r9 = r9.getStringExtra(r0)
            r8.f30255Q = r9
            android.content.Intent r9 = r8.getIntent()
            java.lang.String r0 = "concert_ticket_info_comment_scene"
            java.lang.String r9 = r9.getStringExtra(r0)
            r8.f30256R = r9
            android.content.Intent r9 = r8.getIntent()
            java.lang.String r0 = "concert_ticket_info_anchor_name"
            java.lang.String r9 = r9.getStringExtra(r0)
            fe1.d$b r0 = fe1.C58961d.f168673a
            fe1.q r9 = r0.mo84155b(r9)
            r0 = 0
            if (r9 == 0) goto L_0x0059
            java.lang.String r9 = r9.mo84196w1()
            goto L_0x005a
        L_0x0059:
            r9 = r0
        L_0x005a:
            r8.f30257S = r9
            te3.ez r9 = new te3.ez
            r9.<init>()
            android.content.Intent r3 = r8.getIntent()
            java.lang.String r4 = "concert_ticket_info_data"
            byte[] r3 = r3.getByteArrayExtra(r4)
            if (r3 != 0) goto L_0x006e
            goto L_0x007f
        L_0x006e:
            r9.parseFrom(r3)     // Catch:{ Exception -> 0x0072 }
            goto L_0x0080
        L_0x0072:
            r9 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r3[r2] = r9
            java.lang.String r9 = "safeParser"
            java.lang.String r4 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printDebugStack(r9, r4, r3)
        L_0x007f:
            r9 = r0
        L_0x0080:
            r8.f30249J = r9
            java.lang.Class<ak1.w> r9 = ak1.C54116w.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            ak1.w r9 = (ak1.C54116w) r9
            java.lang.String r3 = r8.f30255Q
            java.lang.String r4 = r8.f30256R
            java.lang.String r5 = r8.f30245F
            r9.getClass()
            java.lang.String r9 = "enterScene"
            gy3.C87412m.m108594g(r5, r9)
            com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct r9 = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct
            r9.<init>()
            if (r3 == 0) goto L_0x00a8
            int r6 = r3.length()
            if (r6 != 0) goto L_0x00a6
            goto L_0x00a8
        L_0x00a6:
            r6 = 0
            goto L_0x00a9
        L_0x00a8:
            r6 = 1
        L_0x00a9:
            if (r6 == 0) goto L_0x00b7
            java.lang.Class<kq.h> r3 = p185kq.C10383h.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            kq.h r3 = (p185kq.C10383h) r3
            java.lang.String r3 = r3.mo10696E()
        L_0x00b7:
            r9.mo1021t(r3)
            java.lang.String r3 = "1003"
            r9.mo1022u(r3)
            if (r4 == 0) goto L_0x00c9
            int r3 = r4.length()
            if (r3 != 0) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            r1 = 0
        L_0x00c9:
            if (r1 == 0) goto L_0x00d7
            java.lang.Class<kq.g> r1 = p185kq.C61130g.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            kq.g r1 = (p185kq.C61130g) r1
            java.lang.String r4 = r1.mo33244gK()
        L_0x00d7:
            r9.mo1020s(r4)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r3 = "enter_sence"
            r1.put(r3, r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = "JSONObject().apply {\n   …ene)\n        }.toString()"
            gy3.C87412m.m108593f(r1, r3)
            java.lang.String r3 = ","
            java.lang.String r4 = ";"
            java.lang.String r1 = z04.C112551y.m153814n(r1, r3, r4, r2)
            r9.mo1023v(r1)
            r9.mo86054n()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "report22946, contextid = "
            r1.append(r3)
            java.lang.String r3 = r9.f9761i
            r1.append(r3)
            java.lang.String r3 = ", page_id = "
            r1.append(r3)
            java.lang.String r3 = r9.f9757e
            r1.append(r3)
            java.lang.String r3 = ", commentScene = "
            r1.append(r3)
            java.lang.String r9 = r9.f9766n
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            java.lang.String r1 = "HABBYGE-MALI.HellLiveVisitorReoprter"
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r1, r9)
            r9 = 2131303412(0x7f091bf4, float:1.8224938E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(R.id.finder_live_concert_close_btn)"
            gy3.C87412m.m108593f(r9, r1)
            com.tencent.mm.ui.widget.imageview.WeImageView r9 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r9
            r8.f30266e = r9
            r9 = 2131303416(0x7f091bf8, float:1.8224946E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(R.id.finder_live_concert_share_btn)"
            gy3.C87412m.m108593f(r9, r1)
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r9 = (com.tencent.p014mm.plugin.finder.view.ConcertTicketTextView) r9
            r8.f30267f = r9
            r9 = 2131300078(0x7f090eee, float:1.8218175E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(R.id.concert_play_divider)"
            gy3.C87412m.m108593f(r9, r1)
            r8.f30268g = r9
            r9 = 2131300079(0x7f090eef, float:1.8218178E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(R.id.concert_play_layout)"
            gy3.C87412m.m108593f(r9, r1)
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r9 = 2131300065(0x7f090ee1, float:1.821815E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(R.id.concert_change_word)"
            gy3.C87412m.m108593f(r9, r1)
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r9 = (com.tencent.p014mm.plugin.finder.view.ConcertTicketTextView) r9
            r8.f30271j = r9
            r9 = 2131300081(0x7f090ef1, float:1.8218182E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(R.id.concert_save_img_tv)"
            gy3.C87412m.m108593f(r9, r1)
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r9 = (com.tencent.p014mm.plugin.finder.view.ConcertTicketTextView) r9
            r8.f30272n = r9
            r9 = 2131300064(0x7f090ee0, float:1.8218147E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(R.id.concert_change_img_tv)"
            gy3.C87412m.m108593f(r9, r1)
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r9 = (com.tencent.p014mm.plugin.finder.view.ConcertTicketTextView) r9
            r8.f30273o = r9
            r9 = 2131303419(0x7f091bfb, float:1.8224952E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(R.id.finder_live_concert_ticket_pic)"
            gy3.C87412m.m108593f(r9, r1)
            com.tencent.mm.view.RCConstraintLayout r9 = (com.tencent.p014mm.view.RCConstraintLayout) r9
            r8.f30269h = r9
            r9 = 2131300085(0x7f090ef5, float:1.821819E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(R.id.concert_visitor_share_pic)"
            gy3.C87412m.m108593f(r9, r1)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r8.f30284y = r9
            r9 = 2131300077(0x7f090eed, float:1.8218173E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(R.id.concert_pic_visitor_head)"
            gy3.C87412m.m108593f(r9, r1)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r8.f30285z = r9
            r9 = 2131303415(0x7f091bf7, float:1.8224944E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(R.id.finder_live_concert_layout_bg)"
            gy3.C87412m.m108593f(r9, r1)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r8.f30241B = r9
            r9 = 2131300063(0x7f090edf, float:1.8218145E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(R.id.concert_big_ticket_pic_bg)"
            gy3.C87412m.m108593f(r9, r1)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r8.f30240A = r9
            r9 = 2131300070(0x7f090ee6, float:1.821816E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(R.id.concert_loading_ll)"
            gy3.C87412m.m108593f(r9, r1)
            android.widget.LinearLayout r9 = (android.widget.LinearLayout) r9
            r8.f30270i = r9
            r9 = 2131303414(0x7f091bf6, float:1.8224942E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(R.id.finder_live_concert_layout)"
            gy3.C87412m.m108593f(r9, r1)
            android.widget.RelativeLayout r9 = (android.widget.RelativeLayout) r9
            r9 = 2131300066(0x7f090ee2, float:1.8218151E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(R.id.concert_commemorative_number_tv)"
            gy3.C87412m.m108593f(r9, r1)
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r9 = (com.tencent.p014mm.plugin.finder.view.ConcertTicketTextView) r9
            r8.f30274p = r9
            r9 = 2131300076(0x7f090eec, float:1.8218171E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(R.id.concert_name_tv)"
            gy3.C87412m.m108593f(r9, r1)
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r9 = (com.tencent.p014mm.plugin.finder.view.ConcertTicketTextView) r9
            r8.f30277r = r9
            r9 = 2131300074(0x7f090eea, float:1.8218167E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(R.id.concert_lyrics_tv)"
            gy3.C87412m.m108593f(r9, r1)
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r9 = (com.tencent.p014mm.plugin.finder.view.ConcertTicketTextView) r9
            r8.f30276q = r9
            r9 = 2131300071(0x7f090ee7, float:1.8218161E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(R.id.concert_location_tv)"
            gy3.C87412m.m108593f(r9, r1)
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r9 = (com.tencent.p014mm.plugin.finder.view.ConcertTicketTextView) r9
            r8.f30279t = r9
            r9 = 2131300072(0x7f090ee8, float:1.8218163E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(R.id.concert_logo_iv)"
            gy3.C87412m.m108593f(r9, r1)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            r8.f30280u = r9
            r9 = 2131300075(0x7f090eeb, float:1.821817E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(R.id.concert_lyrics_word_ll)"
            gy3.C87412m.m108593f(r9, r1)
            android.widget.FrameLayout r9 = (android.widget.FrameLayout) r9
            r8.f30281v = r9
            r9 = 2131300084(0x7f090ef4, float:1.8218188E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(R.id.concert_time_tv)"
            gy3.C87412m.m108593f(r9, r1)
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r9 = (com.tencent.p014mm.plugin.finder.view.ConcertTicketTextView) r9
            r8.f30278s = r9
            r9 = 2131300086(0x7f090ef6, float:1.8218192E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(R.id.concert_visitor_tv)"
            gy3.C87412m.m108593f(r9, r1)
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r9 = (com.tencent.p014mm.plugin.finder.view.ConcertTicketTextView) r9
            r8.f30283x = r9
            r9 = 2131300080(0x7f090ef0, float:1.821818E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(R.id.concert_retry_layout)"
            gy3.C87412m.m108593f(r9, r1)
            androidx.constraintlayout.widget.ConstraintLayout r9 = (androidx.constraintlayout.widget.ConstraintLayout) r9
            r8.f30242C = r9
            r9 = 2131300083(0x7f090ef3, float:1.8218186E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(R.id.concert_ticket_retry_btn)"
            gy3.C87412m.m108593f(r9, r1)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r8.f30243D = r9
            r9 = 2131300069(0x7f090ee5, float:1.8218157E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(R.id.concer…live_visitor_info_layout)"
            gy3.C87412m.m108593f(r9, r1)
            android.widget.RelativeLayout r9 = (android.widget.RelativeLayout) r9
            r9 = 2131315520(0x7f094b40, float:1.8249496E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(R.id.top_right_btn)"
            gy3.C87412m.m108593f(r9, r1)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r8.f30282w = r9
            r9 = 2131314736(0x7f094830, float:1.8247905E38)
            android.view.View r9 = r8.findViewById(r9)
            java.lang.String r1 = "findViewById(R.id.sv)"
            gy3.C87412m.m108593f(r9, r1)
            android.widget.ScrollView r9 = (android.widget.ScrollView) r9
            r8.f30244E = r9
            com.tencent.mm.view.RCConstraintLayout r9 = r8.f30269h
            java.lang.String r1 = "concertTicketViewRoot"
            if (r9 == 0) goto L_0x0381
            kf1.c4 r3 = new kf1.c4
            r3.<init>(r8)
            r4 = 50
            r9.postDelayed(r3, r4)
            r8.mo10365f3(r2)
            com.tencent.mm.view.RCConstraintLayout r9 = r8.f30269h
            if (r9 == 0) goto L_0x037d
            kf1.g4 r1 = new kf1.g4
            r1.<init>(r8)
            zp3.C23564m.m28138h(r9, r1)
            com.tencent.mm.ui.widget.imageview.WeImageView r9 = r8.f30266e
            if (r9 == 0) goto L_0x0377
            kf1.h4$d r1 = new kf1.h4$d
            r1.<init>(r8)
            r9.setOnClickListener(r1)
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r9 = r8.f30267f
            if (r9 == 0) goto L_0x0370
            kf1.h4$e r1 = new kf1.h4$e
            r1.<init>(r8)
            r9.setOnClickListener(r1)
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r9 = r8.f30271j
            if (r9 == 0) goto L_0x036a
            kf1.h4$f r1 = new kf1.h4$f
            r1.<init>(r8)
            r9.setOnClickListener(r1)
            ok1.e r9 = ok1.C62042e.f176370a
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r3 = r8.f30272n
            java.lang.String r1 = "saveImgBtn"
            if (r3 == 0) goto L_0x0366
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r9
            ok1.C62042e.m72803Q1(r2, r3, r4, r5, r6, r7)
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r2 = r8.f30272n
            if (r2 == 0) goto L_0x0362
            kf1.h4$g r1 = new kf1.h4$g
            r1.<init>(r8)
            r2.setOnClickListener(r1)
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r3 = r8.f30273o
            java.lang.String r1 = "changeImgBtn"
            if (r3 == 0) goto L_0x035e
            r4 = 0
            r5 = 0
            r6 = 6
            r7 = 0
            r2 = r9
            ok1.C62042e.m72803Q1(r2, r3, r4, r5, r6, r7)
            com.tencent.mm.plugin.finder.view.ConcertTicketTextView r9 = r8.f30273o
            if (r9 == 0) goto L_0x035a
            kf1.h4$h r1 = new kf1.h4$h
            r1.<init>(r8)
            r9.setOnClickListener(r1)
            android.widget.ScrollView r9 = r8.f30244E
            if (r9 == 0) goto L_0x0353
            kf1.h4$i r0 = kf1.C9765h4.C9774i.f30299d
            r9.setOnTouchListener(r0)
            return
        L_0x0353:
            java.lang.String r9 = "sv"
            gy3.C87412m.m108603p(r9)
            throw r0
        L_0x035a:
            gy3.C87412m.m108603p(r1)
            throw r0
        L_0x035e:
            gy3.C87412m.m108603p(r1)
            throw r0
        L_0x0362:
            gy3.C87412m.m108603p(r1)
            throw r0
        L_0x0366:
            gy3.C87412m.m108603p(r1)
            throw r0
        L_0x036a:
            java.lang.String r9 = "changeWordBtn"
            gy3.C87412m.m108603p(r9)
            throw r0
        L_0x0370:
            java.lang.String r9 = "shareBtn"
            gy3.C87412m.m108603p(r9)
            throw r0
        L_0x0377:
            java.lang.String r9 = "closeBtn"
            gy3.C87412m.m108603p(r9)
            throw r0
        L_0x037d:
            gy3.C87412m.m108603p(r1)
            throw r0
        L_0x0381:
            gy3.C87412m.m108603p(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kf1.C9765h4.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        C60216z4.C8821a<Integer> aVar = C10064z3.f30828a;
        C9622a4 a4Var = C10064z3.f30830c;
        if (a4Var != null) {
            a4Var.onFinish();
        }
        C10064z3.f30830c = null;
        if (!this.f30254P) {
            long j = this.f30253N;
            String str = this.f30255Q;
            String str2 = this.f30256R;
            String str3 = this.f30245F;
            ((C54116w) C86312j.m106911c(C54116w.class)).getClass();
            C87412m.m108594g(str3, "enterScene");
            FinderBroadcastPageOutStruct finderBroadcastPageOutStruct = new FinderBroadcastPageOutStruct();
            if (str == null || str.length() == 0) {
                str = ((C10383h) C86312j.m106911c(C10383h.class)).mo10696E();
            }
            finderBroadcastPageOutStruct.mo1025t(str);
            finderBroadcastPageOutStruct.mo1026u("1003");
            if (str2 == null || str2.length() == 0) {
                str2 = ((C61130g) C86312j.m106911c(C61130g.class)).mo33244gK();
            }
            finderBroadcastPageOutStruct.mo1024s(str2);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("staytime", j);
            jSONObject.put("enter_sence", str3);
            String jSONObject2 = jSONObject.toString();
            C87412m.m108593f(jSONObject2, "JSONObject().apply {\n   …ene)\n        }.toString()");
            finderBroadcastPageOutStruct.mo1027v(C112551y.m153814n(jSONObject2, ",", ";", false));
            finderBroadcastPageOutStruct.mo86054n();
            Log.m105924i("HABBYGE-MALI.HellLiveVisitorReoprter", "report22947, contextid = " + finderBroadcastPageOutStruct.f9773i + ", page_id = " + finderBroadcastPageOutStruct.f9769e + ", commentScene = " + finderBroadcastPageOutStruct.f9777m + ", pg_udf_kv = " + finderBroadcastPageOutStruct.f9776l);
            this.f30254P = true;
        }
        this.f30259U.clear();
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        C49352ez ezVar = this.f30249J;
        boolean z = true;
        if (ezVar == null || !ezVar.f133181D) {
            z = false;
        }
        if (z) {
            try {
                String str = this.f30265d;
                Log.m105924i(str, "choose resouceId: " + this.f30261W);
                C49816i91 i912 = new C49816i91();
                i912.f135177d = C46523h2.f125330a.mo71859a(7996);
                C49352ez ezVar2 = this.f30249J;
                i912.f135178e = ezVar2 != null ? ezVar2.f133182d : null;
                i912.f135179f = this.f30261W;
                i912.f135180g = C66785b.f191882e.mo90662O5();
                i912.mo73342b().mo9225i();
            } catch (Exception e) {
                String str2 = this.f30265d;
                Log.m105924i(str2, "#FinderLiveSwitchConcertTicketReq fail. " + e);
            }
        }
    }
}
