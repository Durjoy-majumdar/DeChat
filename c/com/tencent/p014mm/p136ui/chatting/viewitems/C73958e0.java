package com.tencent.p014mm.p136ui.chatting.viewitems;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Pair;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import bl3.C39818r;
import ck3.C39969i;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelimage.C92836k;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.modelstat.C68144a;
import com.tencent.p014mm.p136ui.anim.transition.MMTransitionHelper;
import com.tencent.p014mm.p136ui.chatting.BaseChattingUIFragment;
import com.tencent.p014mm.p136ui.chatting.C73684f2;
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryUI;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74023i;
import com.tencent.p014mm.p136ui.widget.progress.RoundProgressBtn;
import com.tencent.p014mm.plugin.album.view.ChattingAlbumContainer;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C7335d;
import di3.C86312j;
import dm2.C58325i;
import eb0.C45628s0;
import eb0.C75569c4;
import eb0.C86493v0;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import fy3.C32224a;
import gj3.C59469a;
import gj3.C59473f;
import gj3.C59474h;
import gy3.C8480h;
import gy3.C87412m;
import gy3.C87413o;
import i21.C98591h;
import i40.C98597b;
import i40.C98598e;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C9556a;
import ke3.C88144b;
import mh0.C99862a;
import mh0.C99864d;
import mh0.C99865e0;
import nj3.C76874e0;
import nj3.C76879j;
import nj3.C76912y0;
import p158gt.C98201k;
import p278yh.C79111f;
import p278yh.C79112g;
import p434ig.C98671a;
import p434ig.C98672d;
import p434ig.C98674g;
import p548hg.C76165c;
import p548hg.C98450d;
import p606mm.C99933h;
import p680ru.C77569h;
import p749xh.C38549d8;
import pe3.C47465a;
import ph0.C100792a;
import qh0.C62619a;
import rx3.C13601g;
import rx3.C36568h;
import rx3.C36570n;
import sx3.C110818d0;
import sx3.C36907w;
import th0.C101888l;
import uj3.C78208e;
import zj3.C79348e;
import zj3.C79368l;
import zj3.C79371n;
import zj3.C79384u0;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.e0 */
public final class C73958e0 {

    /* renamed from: a */
    public static final C73969f f217061a = new C73969f((C8480h) null);

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.e0$a */
    public static final class C73959a extends C74243t8 {

        /* renamed from: T */
        public final C72963f4 f217062T;

        /* renamed from: U */
        public final boolean f217063U;

        /* renamed from: V */
        public final String f217064V;

        /* renamed from: W */
        public final C78208e f217065W;

        /* renamed from: X */
        public final C98674g f217066X;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C73959a(C72963f4 f4Var, boolean z, String str, C78208e eVar, C98674g gVar) {
            super(f4Var, z, eVar, f4Var.mo108768t(), str);
            C87412m.m108594g(f4Var, "msg");
            C87412m.m108594g(eVar, "holder");
            C87412m.m108594g(gVar, "albumInfoItem");
            this.f217062T = f4Var;
            this.f217063U = z;
            this.f217064V = str;
            this.f217065W = eVar;
            this.f217066X = gVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C73959a)) {
                return false;
            }
            C73959a aVar = (C73959a) obj;
            return C87412m.m108589b(this.f217062T, aVar.f217062T) && this.f217063U == aVar.f217063U && C87412m.m108589b(this.f217064V, aVar.f217064V) && C87412m.m108589b(this.f217065W, aVar.f217065W) && C87412m.m108589b(this.f217066X, aVar.f217066X);
        }

        public int hashCode() {
            int hashCode = this.f217062T.hashCode() * 31;
            boolean z = this.f217063U;
            if (z) {
                z = true;
            }
            int i = (hashCode + (z ? 1 : 0)) * 31;
            String str = this.f217064V;
            return ((((i + (str == null ? 0 : str.hashCode())) * 31) + this.f217065W.hashCode()) * 31) + this.f217066X.hashCode();
        }

        public String toString() {
            return "AlbumBucket(msg=" + this.f217062T + ", isGroupChat=" + this.f217063U + ", chatroom=" + this.f217064V + ", holder=" + this.f217065W + ", albumInfoItem=" + this.f217066X + ')';
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.e0$b */
    public static final class C73960b extends C73684f2 {

        /* renamed from: f */
        public final String f217067f = "MicroMsg.AlbumClickListener";

        /* renamed from: g */
        public int f217068g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C73960b(C67391b bVar, C74023i iVar, int i, boolean z) {
            super(bVar);
            C87412m.m108594g(iVar, "item");
            this.f217068g = i;
        }

        /* renamed from: a */
        public void mo57756a(View view, C67391b bVar, C72963f4 f4Var) {
            C92836k kVar;
            C73959a aVar = null;
            Object tag = view != null ? view.getTag() : null;
            if (tag instanceof C73959a) {
                aVar = (C73959a) tag;
            }
            if (aVar != null) {
                ((C77569h) C86312j.m106911c(C77569h.class)).mo35247zz(aVar.f212238a);
                Class cls = C98201k.class;
                C72963f4 f4Var2 = aVar.f212238a;
                C68144a.m80547c(f4Var2, C68144a.C68145a.Click);
                if (f4Var2.mo108769t2() == 1) {
                    kVar = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127200vP(f4Var2.mo108768t(), f4Var2.getMsgId());
                    if (kVar.f267374a == 0) {
                        kVar = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127168NQ(f4Var2.mo108768t(), f4Var2.mo108774y2());
                    }
                } else {
                    kVar = ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).mo127168NQ(f4Var2.mo108768t(), f4Var2.mo108774y2());
                }
                if (!C97625j3.m125812b().mo105883I()) {
                    C76912y0.m92771j(this.f216339d.mo91565f(), this.f216339d.f193286j.getContentView());
                } else if (f4Var2.mo108769t2() == 1) {
                    C73969f fVar = C73958e0.f217061a;
                    C67391b bVar2 = this.f216339d;
                    C87412m.m108593f(bVar2, "ui");
                    fVar.mo103037b(bVar2, f4Var2, f4Var2.getMsgId(), f4Var2.mo108774y2(), aVar.f217968b, aVar.f217064V, this.f217068g, false, view);
                } else if (kVar.mo127146q()) {
                    C73969f fVar2 = C73958e0.f217061a;
                    C67391b bVar3 = this.f216339d;
                    C87412m.m108593f(bVar3, "ui");
                    fVar2.mo103037b(bVar3, f4Var2, f4Var2.getMsgId(), f4Var2.mo108774y2(), aVar.f217968b, aVar.f217064V, this.f217068g, false, view);
                } else {
                    if (kVar.f267388o == -1) {
                        Log.m105925i(this.f217067f, "retry downloadImg, %d", Long.valueOf(kVar.f267374a));
                        kVar.mo127127D(0);
                        ((C92839m) ((C98201k) C86312j.m106911c(cls)).mo137277xi()).Dx0(Long.valueOf(kVar.f267374a), kVar);
                    }
                    C73969f fVar3 = C73958e0.f217061a;
                    C67391b bVar4 = this.f216339d;
                    C87412m.m108593f(bVar4, "ui");
                    fVar3.mo103037b(bVar4, f4Var2, f4Var2.getMsgId(), f4Var2.mo108774y2(), aVar.f217968b, aVar.f217064V, this.f217068g, false, view);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.e0$c */
    public static final class C73961c extends C74023i.C74026c {

        /* renamed from: b */
        public C79111f f217069b;

        /* renamed from: c */
        public C79112g f217070c;

        /* renamed from: d */
        public long f217071d;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.e0$c$a */
        public static final class C73962a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ String f217072d;

            /* renamed from: e */
            public final /* synthetic */ C72963f4 f217073e;

            /* renamed from: f */
            public final /* synthetic */ C99862a f217074f;

            /* renamed from: g */
            public final /* synthetic */ C73961c f217075g;

            /* renamed from: com.tencent.mm.ui.chatting.viewitems.e0$c$a$a */
            public static final class C57745a<T extends C47465a> implements C58325i {

                /* renamed from: a */
                public final /* synthetic */ C72963f4 f165280a;

                public C57745a(C72963f4 f4Var) {
                    this.f165280a = f4Var;
                }

                /* renamed from: a */
                public void mo32063a(int i, boolean z, C38549d8 d8Var, C47465a aVar) {
                    C62619a aVar2 = (C62619a) aVar;
                    if (aVar2 != null) {
                        C72963f4 f4Var = this.f165280a;
                        aVar2.f177832g = System.currentTimeMillis();
                        ((C99933h) C86312j.m106911c(C99933h.class)).mo84399BM(18, String.valueOf(f4Var.getMsgId()), aVar2, C57748f0.f165287a);
                    }
                }
            }

            /* renamed from: com.tencent.mm.ui.chatting.viewitems.e0$c$a$c */
            public static final class C57746c<T extends C47465a> implements C58325i {

                /* renamed from: a */
                public final /* synthetic */ C72963f4 f165281a;

                public C57746c(C72963f4 f4Var) {
                    this.f165281a = f4Var;
                }

                /* renamed from: a */
                public void mo32063a(int i, boolean z, C38549d8 d8Var, C47465a aVar) {
                    C62619a aVar2 = (C62619a) aVar;
                    if (aVar2 != null) {
                        C72963f4 f4Var = this.f165281a;
                        aVar2.f177831f += System.currentTimeMillis() - aVar2.f177832g;
                        aVar2.f177830e++;
                        ((C99933h) C86312j.m106911c(C99933h.class)).mo84399BM(18, String.valueOf(f4Var.getMsgId()), aVar2, C57756g0.f165306a);
                    }
                }
            }

            /* renamed from: com.tencent.mm.ui.chatting.viewitems.e0$c$a$b */
            public static final class C73963b implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C72963f4 f217076d;

                public C73963b(C72963f4 f4Var) {
                    this.f217076d = f4Var;
                }

                public final void run() {
                    ((C76165c) C86312j.m106911c(C76165c.class)).ao0(this.f217076d);
                }
            }

            /* renamed from: com.tencent.mm.ui.chatting.viewitems.e0$c$a$d */
            public static final class C73964d implements Runnable {

                /* renamed from: d */
                public final /* synthetic */ C72963f4 f217077d;

                public C73964d(C72963f4 f4Var) {
                    this.f217077d = f4Var;
                }

                public final void run() {
                    ((C76165c) C86312j.m106911c(C76165c.class)).v90(this.f217077d);
                }
            }

            public C73962a(String str, C72963f4 f4Var, C99862a aVar, C73961c cVar) {
                this.f217072d = str;
                this.f217073e = f4Var;
                this.f217074f = aVar;
                this.f217075g = cVar;
            }

            public final void onClick(View view) {
                RoundProgressBtn a;
                Class cls = C75700k0.class;
                Class cls2 = C99865e0.class;
                Class cls3 = C99864d.class;
                Class<C62619a> cls4 = C62619a.class;
                Class cls5 = C99933h.class;
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgAlbum$AppMsgAlbumViewHolder$showStatusIcon$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                String str = this.f217072d;
                Log.m105924i(str, "progressPB(msgId:" + this.f217073e.getMsgId() + ") click, extra media status:" + this.f217074f.mo55367F() + ", msg status:" + this.f217073e.getStatus());
                C79112g gVar = this.f217075g.f217070c;
                boolean z = false;
                if (!(gVar == null || (a = gVar.mo109037a()) == null || a.getVisibility() != 0)) {
                    z = true;
                }
                if (!z) {
                    Log.m105924i(this.f217072d, "chattingAlbumProgress is gone");
                    C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgAlbum$AppMsgAlbumViewHolder$showStatusIcon$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                } else if (this.f217073e.getStatus() == 1 || this.f217073e.getStatus() == 9) {
                    long currentTimeMillis = System.currentTimeMillis();
                    C73961c cVar = this.f217075g;
                    String str2 = "onClick";
                    if (currentTimeMillis - cVar.f217071d < 1200) {
                        Log.m105920e("MicroMsg.ChattingItemAppMsgAlbum", "don't click again in 2s");
                        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgAlbum$AppMsgAlbumViewHolder$showStatusIcon$1", "android/view/View$OnClickListener", str2, "(Landroid/view/View;)V");
                        return;
                    }
                    String str3 = str2;
                    cVar.f217071d = currentTimeMillis;
                    if (this.f217074f.mo55367F() == 102) {
                        this.f217074f.mo55373L(101);
                        C99862a aVar = this.f217074f;
                        aVar.mo55372K(aVar.mo55368G());
                        ((C99933h) C86312j.m106911c(cls5)).mo84406lr(18, String.valueOf(this.f217073e.getMsgId()), cls4, new C57745a(this.f217073e));
                        C98597b.C60245a aVar2 = C98597b.f289091e;
                        C7335d c = C86312j.m106911c(cls3);
                        C87412m.m108593f(c, "getService(AlbumFeatureService::class.java)");
                        ((C99865e0) aVar2.mo85231a((C98598e) c, cls2)).mo139218j3(this.f217074f, this.f217073e, true);
                        this.f217073e.mo100991d(1);
                        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(this.f217073e.getMsgId(), this.f217073e);
                        C119179t tVar = C119157j.f356862d;
                        C73963b bVar = new C73963b(this.f217073e);
                        ((C119157j) tVar).mo183876g(bVar, this.f217072d + "_Upload");
                        String str4 = this.f217072d;
                        Log.m105924i(str4, "send msg[" + this.f217073e.getMsgId() + '_' + this.f217073e.mo108774y2() + "] is resumed. ");
                    } else {
                        this.f217074f.mo55373L(102);
                        C99862a aVar3 = this.f217074f;
                        aVar3.mo55372K(aVar3.mo55368G());
                        ((C99933h) C86312j.m106911c(cls5)).mo84406lr(18, String.valueOf(this.f217073e.getMsgId()), cls4, new C57746c(this.f217073e));
                        C98597b.C60245a aVar4 = C98597b.f289091e;
                        C7335d c2 = C86312j.m106911c(cls3);
                        C87412m.m108593f(c2, "getService(AlbumFeatureService::class.java)");
                        ((C99865e0) aVar4.mo85231a((C98598e) c2, cls2)).mo139218j3(this.f217074f, this.f217073e, true);
                        this.f217073e.mo100991d(9);
                        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(this.f217073e.getMsgId(), this.f217073e);
                        C119179t tVar2 = C119157j.f356862d;
                        C73964d dVar = new C73964d(this.f217073e);
                        ((C119157j) tVar2).mo183876g(dVar, this.f217072d + "_Upload");
                        String str5 = this.f217072d;
                        Log.m105924i(str5, "send [" + this.f217073e.getMsgId() + '_' + this.f217073e.mo108774y2() + "] is paused.");
                    }
                    C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgAlbum$AppMsgAlbumViewHolder$showStatusIcon$1", "android/view/View$OnClickListener", str3, "(Landroid/view/View;)V");
                } else {
                    Log.m105924i(this.f217072d, "msg state is illegal, skip click.");
                    C117292a.m165361g(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgAlbum$AppMsgAlbumViewHolder$showStatusIcon$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            }
        }

        /* renamed from: a */
        public final C73961c mo103027a(View view, boolean z) {
            C87412m.m108594g(view, "view");
            super.create(view);
            if (z) {
                C79111f fVar = new C79111f(view);
                this.f217069b = fVar;
                if (fVar.f232278g == null) {
                    fVar.f232278g = (TextView) view.findViewById(C0966R.C0970id.b9_);
                }
                this.userTV = fVar.f232278g;
                this.maskView = this.convertView.findViewById(C0966R.C0970id.b7h);
            } else {
                this.f217070c = new C79112g(view);
                this.maskView = this.convertView.findViewById(C0966R.C0970id.b7h);
            }
            return this;
        }

        /* renamed from: b */
        public final void mo103028b(String str, boolean z, C72963f4 f4Var, C99862a aVar) {
            C87412m.m108594g(str, "tag");
            C87412m.m108594g(f4Var, "msg");
            C87412m.m108594g(aVar, "albumExtraMediaInfo");
            RoundProgressBtn roundProgressBtn = null;
            if (aVar.mo55368G() < 0 || aVar.mo55368G() > 100) {
                C79112g gVar = this.f217070c;
                RoundProgressBtn a = gVar != null ? gVar.mo109037a() : null;
                if (a != null) {
                    a.setVisibility(8);
                }
                C79111f fVar = this.f217069b;
                if (fVar != null) {
                    roundProgressBtn = fVar.mo109035a();
                }
                if (roundProgressBtn != null) {
                    roundProgressBtn.setVisibility(8);
                }
            } else {
                C79112g gVar2 = this.f217070c;
                RoundProgressBtn a2 = gVar2 != null ? gVar2.mo109037a() : null;
                if (a2 != null) {
                    a2.setVisibility(0);
                }
                C79111f fVar2 = this.f217069b;
                RoundProgressBtn a3 = fVar2 != null ? fVar2.mo109035a() : null;
                if (a3 != null) {
                    a3.setVisibility(0);
                }
                C79112g gVar3 = this.f217070c;
                RoundProgressBtn a4 = gVar3 != null ? gVar3.mo109037a() : null;
                if (a4 != null) {
                    a4.setProgress(aVar.mo55368G());
                }
                C79111f fVar3 = this.f217069b;
                if (fVar3 != null) {
                    roundProgressBtn = fVar3.mo109035a();
                }
                if (roundProgressBtn != null) {
                    roundProgressBtn.setProgress(aVar.mo55368G());
                }
            }
            Log.m105918d(str, "showProgress: " + aVar.mo55368G() + ", startUploadProgress: " + aVar.mo55366E() + ", msgId: " + f4Var.getMsgId());
        }

        /* JADX WARNING: type inference failed for: r12v8, types: [android.view.View] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: c */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo103029c(java.lang.String r24, boolean r25, com.tencent.p014mm.storage.C72963f4 r26, mh0.C99862a r27, p434ig.C98671a r28, p434ig.C98674g r29) {
            /*
                r23 = this;
                r0 = r23
                r1 = r24
                r2 = r26
                r3 = r27
                java.lang.String r4 = "tag"
                gy3.C87412m.m108594g(r1, r4)
                java.lang.String r4 = "msg"
                gy3.C87412m.m108594g(r2, r4)
                java.lang.String r4 = "albumExtraMediaInfo"
                gy3.C87412m.m108594g(r3, r4)
                java.lang.String r4 = "albumAppMsg"
                r5 = r28
                gy3.C87412m.m108594g(r5, r4)
                java.lang.String r4 = "albumInfoItem"
                r5 = r29
                gy3.C87412m.m108594g(r5, r4)
                r4 = 0
                java.lang.String r5 = "status upload done, msgId: "
                r6 = 100
                java.lang.String r7 = "status download done, msgId: "
                java.lang.String r8 = "status download begin, msgId: "
                r9 = 4
                r10 = 3
                r11 = 8
                r12 = 0
                if (r25 != 0) goto L_0x02eb
                yh.g r13 = r0.f217070c
                if (r13 == 0) goto L_0x0042
                android.widget.ProgressBar r13 = r13.mo109040d()
                goto L_0x0043
            L_0x0042:
                r13 = r12
            L_0x0043:
                if (r13 != 0) goto L_0x0046
                goto L_0x0049
            L_0x0046:
                r13.setVisibility(r11)
            L_0x0049:
                yh.g r13 = r0.f217070c
                if (r13 == 0) goto L_0x0052
                com.tencent.mm.ui.widget.imageview.WeImageView r13 = r13.mo109038b()
                goto L_0x0053
            L_0x0052:
                r13 = r12
            L_0x0053:
                if (r13 != 0) goto L_0x0056
                goto L_0x0059
            L_0x0056:
                r13.setVisibility(r11)
            L_0x0059:
                yh.g r13 = r0.f217070c
                if (r13 == 0) goto L_0x0062
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r13 = r13.mo109037a()
                goto L_0x0063
            L_0x0062:
                r13 = r12
            L_0x0063:
                if (r13 != 0) goto L_0x0066
                goto L_0x0069
            L_0x0066:
                r13.setVisibility(r11)
            L_0x0069:
                yh.g r13 = r0.f217070c
                if (r13 == 0) goto L_0x0072
                com.tencent.mm.ui.widget.MMPinProgressBtn r13 = r13.mo109039c()
                goto L_0x0073
            L_0x0072:
                r13 = r12
            L_0x0073:
                if (r13 != 0) goto L_0x0076
                goto L_0x0079
            L_0x0076:
                r13.setVisibility(r11)
            L_0x0079:
                int r13 = r26.getStatus()
                r14 = 1
                if (r13 >= r14) goto L_0x0082
                goto L_0x027d
            L_0x0082:
                int r13 = r27.mo55367F()
                if (r13 == r10) goto L_0x0235
                if (r13 == r9) goto L_0x01f1
                switch(r13) {
                    case 100: goto L_0x0167;
                    case 101: goto L_0x00ff;
                    case 102: goto L_0x0097;
                    default: goto L_0x008d;
                }
            L_0x008d:
                yh.g r6 = r0.f217070c
                if (r6 == 0) goto L_0x01a2
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r6 = r6.mo109037a()
                goto L_0x01a3
            L_0x0097:
                yh.g r5 = r0.f217070c
                if (r5 == 0) goto L_0x00a0
                android.widget.ProgressBar r5 = r5.mo109040d()
                goto L_0x00a1
            L_0x00a0:
                r5 = r12
            L_0x00a1:
                if (r5 != 0) goto L_0x00a4
                goto L_0x00a7
            L_0x00a4:
                r5.setVisibility(r11)
            L_0x00a7:
                yh.g r5 = r0.f217070c
                if (r5 == 0) goto L_0x00b4
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r5 = r5.mo109037a()
                if (r5 == 0) goto L_0x00b4
                r5.setHasPause(r4)
            L_0x00b4:
                yh.g r5 = r0.f217070c
                if (r5 == 0) goto L_0x00bd
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r5 = r5.mo109037a()
                goto L_0x00be
            L_0x00bd:
                r5 = r12
            L_0x00be:
                if (r5 != 0) goto L_0x00c1
                goto L_0x00c4
            L_0x00c1:
                r5.setVisibility(r4)
            L_0x00c4:
                yh.g r5 = r0.f217070c
                if (r5 == 0) goto L_0x00cd
                com.tencent.mm.ui.widget.imageview.WeImageView r5 = r5.mo109038b()
                goto L_0x00ce
            L_0x00cd:
                r5 = r12
            L_0x00ce:
                if (r5 != 0) goto L_0x00d1
                goto L_0x00d4
            L_0x00d1:
                r5.setVisibility(r4)
            L_0x00d4:
                yh.g r5 = r0.f217070c
                if (r5 == 0) goto L_0x00e4
                com.tencent.mm.ui.widget.imageview.WeImageView r5 = r5.mo109038b()
                if (r5 == 0) goto L_0x00e4
                r6 = 2131755078(0x7f100046, float:1.9141025E38)
                r5.setImageResource(r6)
            L_0x00e4:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "status upload pause, msgId: "
                r5.append(r6)
                long r6 = r26.getMsgId()
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r5)
                goto L_0x027d
            L_0x00ff:
                yh.g r5 = r0.f217070c
                if (r5 == 0) goto L_0x0108
                android.widget.ProgressBar r5 = r5.mo109040d()
                goto L_0x0109
            L_0x0108:
                r5 = r12
            L_0x0109:
                if (r5 != 0) goto L_0x010c
                goto L_0x010f
            L_0x010c:
                r5.setVisibility(r11)
            L_0x010f:
                yh.g r5 = r0.f217070c
                if (r5 == 0) goto L_0x0118
                com.tencent.mm.ui.widget.imageview.WeImageView r5 = r5.mo109038b()
                goto L_0x0119
            L_0x0118:
                r5 = r12
            L_0x0119:
                if (r5 != 0) goto L_0x011c
                goto L_0x011f
            L_0x011c:
                r5.setVisibility(r4)
            L_0x011f:
                yh.g r5 = r0.f217070c
                if (r5 == 0) goto L_0x012c
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r5 = r5.mo109037a()
                if (r5 == 0) goto L_0x012c
                r5.setHasPause(r4)
            L_0x012c:
                yh.g r5 = r0.f217070c
                if (r5 == 0) goto L_0x0135
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r5 = r5.mo109037a()
                goto L_0x0136
            L_0x0135:
                r5 = r12
            L_0x0136:
                if (r5 != 0) goto L_0x0139
                goto L_0x013c
            L_0x0139:
                r5.setVisibility(r4)
            L_0x013c:
                yh.g r5 = r0.f217070c
                if (r5 == 0) goto L_0x014c
                com.tencent.mm.ui.widget.imageview.WeImageView r5 = r5.mo109038b()
                if (r5 == 0) goto L_0x014c
                r6 = 2131756113(0x7f100451, float:1.9143124E38)
                r5.setImageResource(r6)
            L_0x014c:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "status upload doing, msgId: "
                r5.append(r6)
                long r6 = r26.getMsgId()
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r5)
                goto L_0x027d
            L_0x0167:
                yh.g r5 = r0.f217070c
                if (r5 == 0) goto L_0x0170
                com.tencent.mm.ui.widget.imageview.WeImageView r5 = r5.mo109038b()
                goto L_0x0171
            L_0x0170:
                r5 = r12
            L_0x0171:
                if (r5 != 0) goto L_0x0174
                goto L_0x0177
            L_0x0174:
                r5.setVisibility(r11)
            L_0x0177:
                yh.g r5 = r0.f217070c
                if (r5 == 0) goto L_0x0180
                android.widget.ProgressBar r5 = r5.mo109040d()
                goto L_0x0181
            L_0x0180:
                r5 = r12
            L_0x0181:
                if (r5 != 0) goto L_0x0184
                goto L_0x0187
            L_0x0184:
                r5.setVisibility(r4)
            L_0x0187:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r6 = "status upload begin, msgId: "
                r5.append(r6)
                long r6 = r26.getMsgId()
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r5)
                goto L_0x027d
            L_0x01a2:
                r6 = r12
            L_0x01a3:
                if (r6 != 0) goto L_0x01a6
                goto L_0x01a9
            L_0x01a6:
                r6.setVisibility(r11)
            L_0x01a9:
                yh.g r6 = r0.f217070c
                if (r6 == 0) goto L_0x01b2
                com.tencent.mm.ui.widget.imageview.WeImageView r6 = r6.mo109038b()
                goto L_0x01b3
            L_0x01b2:
                r6 = r12
            L_0x01b3:
                if (r6 != 0) goto L_0x01b6
                goto L_0x01b9
            L_0x01b6:
                r6.setVisibility(r11)
            L_0x01b9:
                yh.g r6 = r0.f217070c
                if (r6 == 0) goto L_0x01c2
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r6 = r6.mo109037a()
                goto L_0x01c3
            L_0x01c2:
                r6 = r12
            L_0x01c3:
                if (r6 != 0) goto L_0x01c6
                goto L_0x01c9
            L_0x01c6:
                r6.setVisibility(r11)
            L_0x01c9:
                yh.g r6 = r0.f217070c
                if (r6 == 0) goto L_0x01d2
                com.tencent.mm.ui.widget.MMPinProgressBtn r6 = r6.mo109039c()
                goto L_0x01d3
            L_0x01d2:
                r6 = r12
            L_0x01d3:
                if (r6 != 0) goto L_0x01d6
                goto L_0x01d9
            L_0x01d6:
                r6.setVisibility(r11)
            L_0x01d9:
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r5)
                long r7 = r26.getMsgId()
                r6.append(r7)
                java.lang.String r5 = r6.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r5)
                goto L_0x027c
            L_0x01f1:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r7)
                long r7 = r26.getMsgId()
                r5.append(r7)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r5)
                yh.g r5 = r0.f217070c
                if (r5 == 0) goto L_0x0210
                com.tencent.mm.ui.widget.MMPinProgressBtn r5 = r5.mo109039c()
                goto L_0x0211
            L_0x0210:
                r5 = r12
            L_0x0211:
                if (r5 != 0) goto L_0x0214
                goto L_0x0217
            L_0x0214:
                r5.setVisibility(r11)
            L_0x0217:
                yh.g r5 = r0.f217070c
                if (r5 == 0) goto L_0x0220
                com.tencent.mm.ui.widget.MMPinProgressBtn r5 = r5.mo109039c()
                goto L_0x0221
            L_0x0220:
                r5 = r12
            L_0x0221:
                if (r5 != 0) goto L_0x0224
                goto L_0x0227
            L_0x0224:
                r5.setProgress(r6)
            L_0x0227:
                yh.g r5 = r0.f217070c
                if (r5 == 0) goto L_0x027c
                com.tencent.mm.ui.widget.MMPinProgressBtn r5 = r5.mo109039c()
                if (r5 == 0) goto L_0x027c
                r5.invalidate()
                goto L_0x027c
            L_0x0235:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r8)
                long r6 = r26.getMsgId()
                r5.append(r6)
                java.lang.String r5 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r5)
                yh.g r5 = r0.f217070c
                if (r5 == 0) goto L_0x0254
                com.tencent.mm.ui.widget.MMPinProgressBtn r5 = r5.mo109039c()
                goto L_0x0255
            L_0x0254:
                r5 = r12
            L_0x0255:
                if (r5 != 0) goto L_0x0258
                goto L_0x025b
            L_0x0258:
                r5.setVisibility(r4)
            L_0x025b:
                yh.g r5 = r0.f217070c
                if (r5 == 0) goto L_0x0264
                com.tencent.mm.ui.widget.MMPinProgressBtn r5 = r5.mo109039c()
                goto L_0x0265
            L_0x0264:
                r5 = r12
            L_0x0265:
                if (r5 != 0) goto L_0x0268
                goto L_0x026f
            L_0x0268:
                int r6 = r27.mo55363B()
                r5.setProgress(r6)
            L_0x026f:
                yh.g r5 = r0.f217070c
                if (r5 == 0) goto L_0x027c
                com.tencent.mm.ui.widget.MMPinProgressBtn r5 = r5.mo109039c()
                if (r5 == 0) goto L_0x027c
                r5.invalidate()
            L_0x027c:
                r14 = 0
            L_0x027d:
                yh.g r5 = r0.f217070c
                if (r5 == 0) goto L_0x028f
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r5 = r5.mo109037a()
                if (r5 == 0) goto L_0x028f
                com.tencent.mm.ui.chatting.viewitems.e0$c$a r6 = new com.tencent.mm.ui.chatting.viewitems.e0$c$a
                r6.<init>(r1, r2, r3, r0)
                r5.setOnClickListener(r6)
            L_0x028f:
                yh.g r1 = r0.f217070c
                if (r1 == 0) goto L_0x02a4
                android.view.View r2 = r1.f232282c
                if (r2 != 0) goto L_0x02a2
                android.view.View r2 = r1.f232280a
                r3 = 2131299071(0x7f090aff, float:1.8216133E38)
                android.view.View r2 = r2.findViewById(r3)
                r1.f232282c = r2
            L_0x02a2:
                android.view.View r12 = r1.f232282c
            L_0x02a4:
                if (r12 != 0) goto L_0x02a8
                goto L_0x042a
            L_0x02a8:
                if (r14 == 0) goto L_0x02ab
                r11 = 0
            L_0x02ab:
                k20.a r1 = new k20.a
                r1.<init>()
                java.lang.ThreadLocal<k20.a> r2 = k20.C60958c.f173611a
                java.lang.Integer r2 = java.lang.Integer.valueOf(r11)
                r1.mo10233c(r2)
                java.lang.Object[] r16 = r1.mo10232b()
                java.lang.String r17 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgAlbum$AppMsgAlbumViewHolder"
                java.lang.String r18 = "showStatusIcon"
                java.lang.String r19 = "(Ljava/lang/String;ZLcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/plugin/album/AlbumExtraMediaInfo;Lcom/tencent/mm/album/msg/AlbumAppMsg;Lcom/tencent/mm/album/msg/AlbumInfoItem;)V"
                java.lang.String r20 = "android/view/View_EXEC_"
                java.lang.String r21 = "setVisibility"
                java.lang.String r22 = "(I)V"
                r15 = r12
                j20.C117292a.m165358d(r15, r16, r17, r18, r19, r20, r21, r22)
                java.lang.Object r1 = r1.mo10231a(r4)
                java.lang.Integer r1 = (java.lang.Integer) r1
                int r1 = r1.intValue()
                r12.setVisibility(r1)
                java.lang.String r16 = "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgAlbum$AppMsgAlbumViewHolder"
                java.lang.String r17 = "showStatusIcon"
                java.lang.String r18 = "(Ljava/lang/String;ZLcom/tencent/mm/storage/MsgInfo;Lcom/tencent/mm/plugin/album/AlbumExtraMediaInfo;Lcom/tencent/mm/album/msg/AlbumAppMsg;Lcom/tencent/mm/album/msg/AlbumInfoItem;)V"
                java.lang.String r19 = "android/view/View_EXEC_"
                java.lang.String r20 = "setVisibility"
                java.lang.String r21 = "(I)V"
                j20.C117292a.m165359e(r15, r16, r17, r18, r19, r20, r21)
                goto L_0x042a
            L_0x02eb:
                yh.f r13 = r0.f217069b
                if (r13 == 0) goto L_0x02f4
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r13 = r13.mo109035a()
                goto L_0x02f5
            L_0x02f4:
                r13 = r12
            L_0x02f5:
                if (r13 != 0) goto L_0x02f8
                goto L_0x02fb
            L_0x02f8:
                r13.setVisibility(r11)
            L_0x02fb:
                yh.f r13 = r0.f217069b
                if (r13 == 0) goto L_0x0313
                android.widget.ProgressBar r14 = r13.f232279h
                if (r14 != 0) goto L_0x0310
                android.view.View r14 = r13.f232272a
                r15 = 2131311863(0x7f093cf7, float:1.8242078E38)
                android.view.View r14 = r14.findViewById(r15)
                android.widget.ProgressBar r14 = (android.widget.ProgressBar) r14
                r13.f232279h = r14
            L_0x0310:
                android.widget.ProgressBar r13 = r13.f232279h
                goto L_0x0314
            L_0x0313:
                r13 = r12
            L_0x0314:
                if (r13 != 0) goto L_0x0317
                goto L_0x031a
            L_0x0317:
                r13.setVisibility(r11)
            L_0x031a:
                yh.f r13 = r0.f217069b
                r14 = 2131299138(0x7f090b42, float:1.8216269E38)
                if (r13 == 0) goto L_0x0332
                com.tencent.mm.ui.widget.imageview.WeImageView r15 = r13.f232275d
                if (r15 != 0) goto L_0x032f
                android.view.View r15 = r13.f232272a
                android.view.View r15 = r15.findViewById(r14)
                com.tencent.mm.ui.widget.imageview.WeImageView r15 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r15
                r13.f232275d = r15
            L_0x032f:
                com.tencent.mm.ui.widget.imageview.WeImageView r13 = r13.f232275d
                goto L_0x0333
            L_0x0332:
                r13 = r12
            L_0x0333:
                if (r13 != 0) goto L_0x0336
                goto L_0x0339
            L_0x0336:
                r13.setVisibility(r11)
            L_0x0339:
                int r13 = r27.mo55367F()
                if (r13 == r10) goto L_0x03e5
                if (r13 == r9) goto L_0x03a3
                yh.f r3 = r0.f217069b
                if (r3 == 0) goto L_0x034a
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r3 = r3.mo109035a()
                goto L_0x034b
            L_0x034a:
                r3 = r12
            L_0x034b:
                if (r3 != 0) goto L_0x034e
                goto L_0x0351
            L_0x034e:
                r3.setVisibility(r11)
            L_0x0351:
                yh.f r3 = r0.f217069b
                if (r3 == 0) goto L_0x0366
                com.tencent.mm.ui.widget.imageview.WeImageView r4 = r3.f232275d
                if (r4 != 0) goto L_0x0363
                android.view.View r4 = r3.f232272a
                android.view.View r4 = r4.findViewById(r14)
                com.tencent.mm.ui.widget.imageview.WeImageView r4 = (com.tencent.p014mm.p136ui.widget.imageview.WeImageView) r4
                r3.f232275d = r4
            L_0x0363:
                com.tencent.mm.ui.widget.imageview.WeImageView r3 = r3.f232275d
                goto L_0x0367
            L_0x0366:
                r3 = r12
            L_0x0367:
                if (r3 != 0) goto L_0x036a
                goto L_0x036d
            L_0x036a:
                r3.setVisibility(r11)
            L_0x036d:
                yh.f r3 = r0.f217069b
                if (r3 == 0) goto L_0x0376
                com.tencent.mm.ui.widget.progress.RoundProgressBtn r3 = r3.mo109035a()
                goto L_0x0377
            L_0x0376:
                r3 = r12
            L_0x0377:
                if (r3 != 0) goto L_0x037a
                goto L_0x037d
            L_0x037a:
                r3.setVisibility(r11)
            L_0x037d:
                yh.f r3 = r0.f217069b
                if (r3 == 0) goto L_0x0385
                com.tencent.mm.ui.widget.MMPinProgressBtn r12 = r3.mo109036b()
            L_0x0385:
                if (r12 != 0) goto L_0x0388
                goto L_0x038b
            L_0x0388:
                r12.setVisibility(r11)
            L_0x038b:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r5)
                long r4 = r26.getMsgId()
                r3.append(r4)
                java.lang.String r2 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r2)
                goto L_0x042a
            L_0x03a3:
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r7)
                long r4 = r26.getMsgId()
                r3.append(r4)
                java.lang.String r2 = r3.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r2)
                yh.f r1 = r0.f217069b
                if (r1 == 0) goto L_0x03c2
                com.tencent.mm.ui.widget.MMPinProgressBtn r1 = r1.mo109036b()
                goto L_0x03c3
            L_0x03c2:
                r1 = r12
            L_0x03c3:
                if (r1 != 0) goto L_0x03c6
                goto L_0x03c9
            L_0x03c6:
                r1.setVisibility(r11)
            L_0x03c9:
                yh.f r1 = r0.f217069b
                if (r1 == 0) goto L_0x03d1
                com.tencent.mm.ui.widget.MMPinProgressBtn r12 = r1.mo109036b()
            L_0x03d1:
                if (r12 != 0) goto L_0x03d4
                goto L_0x03d7
            L_0x03d4:
                r12.setProgress(r6)
            L_0x03d7:
                yh.f r1 = r0.f217069b
                if (r1 == 0) goto L_0x042a
                com.tencent.mm.ui.widget.MMPinProgressBtn r1 = r1.mo109036b()
                if (r1 == 0) goto L_0x042a
                r1.invalidate()
                goto L_0x042a
            L_0x03e5:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                r5.append(r8)
                long r6 = r26.getMsgId()
                r5.append(r6)
                java.lang.String r2 = r5.toString()
                com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r2)
                yh.f r1 = r0.f217069b
                if (r1 == 0) goto L_0x0404
                com.tencent.mm.ui.widget.MMPinProgressBtn r1 = r1.mo109036b()
                goto L_0x0405
            L_0x0404:
                r1 = r12
            L_0x0405:
                if (r1 != 0) goto L_0x0408
                goto L_0x040b
            L_0x0408:
                r1.setVisibility(r4)
            L_0x040b:
                yh.f r1 = r0.f217069b
                if (r1 == 0) goto L_0x0413
                com.tencent.mm.ui.widget.MMPinProgressBtn r12 = r1.mo109036b()
            L_0x0413:
                if (r12 != 0) goto L_0x0416
                goto L_0x041d
            L_0x0416:
                int r1 = r27.mo55363B()
                r12.setProgress(r1)
            L_0x041d:
                yh.f r1 = r0.f217069b
                if (r1 == 0) goto L_0x042a
                com.tencent.mm.ui.widget.MMPinProgressBtn r1 = r1.mo109036b()
                if (r1 == 0) goto L_0x042a
                r1.invalidate()
            L_0x042a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C73958e0.C73961c.mo103029c(java.lang.String, boolean, com.tencent.mm.storage.f4, mh0.a, ig.a, ig.g):void");
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.e0$d */
    public static class C73965d extends C74023i {

        /* renamed from: v */
        public C67391b f217078v;

        /* renamed from: w */
        public C73960b f217079w;

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.d7e);
            C73961c cVar = new C73961c();
            cVar.mo103027a(n4Var, true);
            n4Var.setTag(cVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return false;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(bVar, "ui");
            if (f4Var == null) {
                return false;
            }
            Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
            if (valueOf == null || valueOf.intValue() != 153) {
                return valueOf != null && valueOf.intValue() == 136;
            }
            C73958e0.f217061a.mo103036a(bVar, f4Var);
            return true;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            C87412m.m108594g(e0Var, "menu");
            C87412m.m108594g(view, "v");
            C87412m.m108594g(f4Var, "msg");
            Object tag = view.getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
            int b = ((C74243t8) tag).mo103252b();
            if (f4Var.getContent() == null) {
                return true;
            }
            if (!C75569c4.m90688u(f4Var) && !C75569c4.m90687t(f4Var) && !f4Var.mo100980S3() && C101888l.f300029a.mo141352a(f4Var.mo108768t())) {
                e0Var.mo107136c(b, 153, 0, view.getContext().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
            }
            C88144b.m109788f("favorite");
            if (!f4Var.mo100980S3() && C101888l.f300029a.mo141352a(f4Var.mo108768t()) && !f4Var.mo100972K3()) {
                e0Var.mo107136c(b, 116, 0, view.getContext().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
            }
            e0Var.mo107136c(b, 136, 0, view.getContext().getString(C0966R.string.b_6), C0966R.raw.icons_filled_quote);
            return true;
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(f4Var, "msg");
            return true;
        }

        /* renamed from: d */
        public C72963f4.C72966d<?> mo82118d(C72963f4 f4Var, Context context, C39969i iVar) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(iVar, "talkerInfo");
            return new C73973g(f4Var);
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            TextView textView;
            C87412m.m108594g(bVar, "ui");
            C87412m.m108594g(f4Var, "msg");
            C87412m.m108592e(cVar, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgAlbum.AppMsgAlbumViewHolder");
            C73961c cVar2 = (C73961c) cVar;
            this.f217078v = bVar;
            String content = f4Var.getContent();
            C79371n nVar = (C79371n) bVar.f193278b.mo102812a(C79371n.class);
            nVar.mo102405C3(f4Var);
            nVar.mo102409q3(f4Var);
            nVar.mo102406W4(f4Var);
            if (content != null) {
                C98671a aVar = new C98671a();
                aVar.mo141099d(content);
                C98674g gVar = new C98674g();
                gVar.mo141099d(aVar.f289309p);
                C98597b.C60245a aVar2 = C98597b.f289091e;
                C7335d c = C86312j.m106911c(C99864d.class);
                C87412m.m108593f(c, "getService(AlbumFeatureService::class.java)");
                C99862a g3 = ((C99865e0) aVar2.mo85231a((C98598e) c, C99865e0.class)).mo139217g3(f4Var.getMsgId());
                C79111f fVar = cVar2.f217069b;
                if (fVar != null) {
                    if (fVar.f232274c == null) {
                        fVar.f232274c = (TextView) fVar.f232272a.findViewById(C0966R.C0970id.b2y);
                    }
                    textView = fVar.f232274c;
                } else {
                    textView = null;
                }
                if (textView != null) {
                    Activity f = bVar.mo91565f();
                    C87412m.m108593f(f, "ui.context");
                    textView.setText(((C98450d) C86312j.m106911c(C98450d.class)).mo137793FC(f, gVar));
                }
                C79111f fVar2 = cVar2.f217069b;
                if (fVar2 != null) {
                    if (fVar2.f232276e == null) {
                        fVar2.f232276e = (ChattingAlbumContainer) fVar2.f232272a.findViewById(C0966R.C0970id.o5d);
                    }
                    ChattingAlbumContainer chattingAlbumContainer = fVar2.f232276e;
                    if (chattingAlbumContainer != null) {
                        chattingAlbumContainer.mo94180g(f4Var, gVar);
                    }
                }
                String t = bVar.mo91583x() ? f4Var.mo108768t() : null;
                View view = cVar2.clickArea;
                if (view != null) {
                    view.setTag(new C73959a(f4Var, bVar.mo91583x(), t, cVar2, gVar));
                    View view2 = cVar2.clickArea;
                    if (this.f217079w == null) {
                        this.f217079w = new C73960b(this.f217078v, this, 0, true);
                    }
                    view2.setOnClickListener(this.f217079w);
                    cVar2.clickArea.setOnLongClickListener(mo103098p(bVar));
                    cVar2.clickArea.setOnTouchListener(((C79368l) bVar.f193278b.mo102812a(C79368l.class)).mo108189Z4());
                }
                cVar2.mo103028b("MicroMsg.ChattingItemAppMsgAlbumFrom", true, f4Var, g3);
                cVar2.mo103029c("MicroMsg.ChattingItemAppMsgAlbumFrom", true, f4Var, g3, aVar, gVar);
            }
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return !z && i == 1124073521;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.e0$e */
    public static class C73966e extends C74023i implements C73774p2 {

        /* renamed from: v */
        public C67391b f217080v;

        /* renamed from: w */
        public C73960b f217081w;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.e0$e$a */
        public static final class C73967a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ C72963f4 f217082d;

            public C73967a(C72963f4 f4Var) {
                this.f217082d = f4Var;
            }

            public final void onClick(DialogInterface dialogInterface, int i) {
                C72963f4 f4Var = this.f217082d;
                boolean z = true;
                if (f4Var == null || !f4Var.mo101016t3()) {
                    z = false;
                }
                if (z) {
                    ((C76165c) C86312j.m106911c(C76165c.class)).mo106377PI(this.f217082d);
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.e0$e$b */
        public static final class C73968b implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public static final C73968b f217083d = new C73968b();

            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        /* renamed from: E */
        public View mo26231E(LayoutInflater layoutInflater, View view) {
            if (view != null && view.getTag() != null) {
                return view;
            }
            C6807n4 n4Var = new C6807n4(layoutInflater, C0966R.C0971layout.d7g);
            C73961c cVar = new C73961c();
            cVar.mo103027a(n4Var, false);
            n4Var.setTag(cVar);
            return n4Var;
        }

        /* renamed from: R */
        public boolean mo26232R() {
            return true;
        }

        /* renamed from: X */
        public boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(bVar, "ui");
            C87412m.m108594g(f4Var, "msg");
            Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
            if (valueOf == null || valueOf.intValue() != 153) {
                return valueOf != null && valueOf.intValue() == 136;
            }
            C73958e0.f217061a.mo103036a(bVar, f4Var);
            return true;
        }

        /* renamed from: Z */
        public boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var) {
            C87412m.m108594g(e0Var, "menu");
            C87412m.m108594g(view, "v");
            C87412m.m108594g(f4Var, "msg");
            Object tag = view.getTag();
            C87412m.m108592e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
            int b = ((C74243t8) tag).mo103252b();
            if (f4Var.getContent() == null) {
                return true;
            }
            if (!C75569c4.m90688u(f4Var) && !C75569c4.m90687t(f4Var) && !f4Var.mo100980S3() && C101888l.f300029a.mo141352a(f4Var.mo108768t())) {
                e0Var.mo107136c(b, 153, 0, view.getContext().getString(C0966R.string.i48), C0966R.raw.icons_filled_share);
            }
            C88144b.m109788f("favorite");
            if (f4Var.getStatus() != 1 && f4Var.getStatus() != 9 && !f4Var.mo100980S3() && C101888l.f300029a.mo141352a(f4Var.mo108768t()) && !f4Var.mo100972K3()) {
                e0Var.mo107136c(b, 116, 0, view.getContext().getString(C0966R.string.f361137hk2), C0966R.raw.icons_filled_favorites);
            }
            if (!(f4Var.getStatus() == 1 || f4Var.getStatus() == 9)) {
                e0Var.mo107136c(b, 136, 0, view.getContext().getString(C0966R.string.b_6), C0966R.raw.icons_filled_quote);
            }
            if ((f4Var.mo101000j3() || f4Var.f230728K == 1) && mo103083Q(f4Var, this.f217080v) && mo103081O(f4Var.mo108768t())) {
                C67391b bVar = this.f217080v;
                boolean z = false;
                if (bVar != null && bVar.mo91580u()) {
                    z = true;
                }
                if (!z) {
                    e0Var.mo107136c(b, 123, 0, view.getContext().getString(C0966R.string.b_d), C0966R.raw.icons_filled_previous);
                }
            }
            return true;
        }

        /* renamed from: a */
        public void mo70162a(View view, C67391b bVar, C72963f4 f4Var) {
            Resources m;
            Resources m2;
            Resources m3;
            String str = null;
            Activity f = bVar != null ? bVar.mo91565f() : null;
            String string = (bVar == null || (m3 = bVar.mo91572m()) == null) ? null : m3.getString(C0966R.string.f360268bb1);
            String string2 = (bVar == null || (m2 = bVar.mo91572m()) == null) ? null : m2.getString(C0966R.string.a2j);
            if (!(bVar == null || (m = bVar.mo91572m()) == null)) {
                str = m.getString(C0966R.string.f7926wf);
            }
            C76879j.m92707A(f, string, "", string2, str, new C73967a(f4Var), C73968b.f217083d);
        }

        /* renamed from: a0 */
        public boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(f4Var, "msg");
            ((C98591h) C86312j.m106911c(C98591h.class)).Gr0(f4Var.mo108768t());
            String content = f4Var.getContent();
            if (content == null) {
                return false;
            }
            C68070l.C68072b.m80422u(content, (String) null);
            return false;
        }

        /* renamed from: d */
        public C72963f4.C72966d<?> mo82118d(C72963f4 f4Var, Context context, C39969i iVar) {
            C87412m.m108594g(context, "context");
            C87412m.m108594g(iVar, "talkerInfo");
            return new C73973g(f4Var);
        }

        /* renamed from: f */
        public void mo26237f(C74023i.C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
            TextView textView;
            Class cls = C79371n.class;
            C87412m.m108594g(bVar, "ui");
            C87412m.m108594g(f4Var, "msg");
            C87412m.m108592e(cVar, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ChattingItemAppMsgAlbum.AppMsgAlbumViewHolder");
            C73961c cVar2 = (C73961c) cVar;
            this.f217080v = bVar;
            ((C79371n) bVar.f193278b.mo102812a(cls)).mo102406W4(f4Var);
            String content = f4Var.getContent();
            ((C79371n) bVar.f193278b.mo102812a(cls)).mo102405C3(f4Var);
            if (content != null) {
                C98671a aVar = new C98671a();
                aVar.mo141099d(content);
                C98674g gVar = new C98674g();
                gVar.mo141099d(aVar.f289309p);
                C98597b.C60245a aVar2 = C98597b.f289091e;
                C7335d c = C86312j.m106911c(C99864d.class);
                C87412m.m108593f(c, "getService(AlbumFeatureService::class.java)");
                C99862a g3 = ((C99865e0) aVar2.mo85231a((C98598e) c, C99865e0.class)).mo139217g3(f4Var.getMsgId());
                C79112g gVar2 = cVar2.f217070c;
                if (gVar2 != null) {
                    if (gVar2.f232283d == null) {
                        gVar2.f232283d = (TextView) gVar2.f232280a.findViewById(C0966R.C0970id.b2y);
                    }
                    textView = gVar2.f232283d;
                } else {
                    textView = null;
                }
                if (textView != null) {
                    Activity f = bVar.mo91565f();
                    C87412m.m108593f(f, "ui.context");
                    textView.setText(((C98450d) C86312j.m106911c(C98450d.class)).mo137793FC(f, gVar));
                }
                C79112g gVar3 = cVar2.f217070c;
                if (gVar3 != null) {
                    if (gVar3.f232285f == null) {
                        gVar3.f232285f = (ChattingAlbumContainer) gVar3.f232280a.findViewById(C0966R.C0970id.o5d);
                    }
                    ChattingAlbumContainer chattingAlbumContainer = gVar3.f232285f;
                    if (chattingAlbumContainer != null) {
                        chattingAlbumContainer.mo94180g(f4Var, gVar);
                    }
                }
                String t = bVar.mo91583x() ? f4Var.mo108768t() : null;
                View view = cVar2.clickArea;
                if (view != null) {
                    view.setTag(new C73959a(f4Var, bVar.mo91583x(), t, cVar2, gVar));
                    View view2 = cVar2.clickArea;
                    if (this.f217081w == null) {
                        this.f217081w = new C73960b(this.f217080v, this, 0, false);
                    }
                    view2.setOnClickListener(this.f217081w);
                    cVar2.clickArea.setOnLongClickListener(mo103098p(bVar));
                    cVar2.clickArea.setOnTouchListener(((C79368l) bVar.f193278b.mo102812a(C79368l.class)).mo108189Z4());
                }
                cVar2.mo103028b("MicroMsg.ChattingItemAppMsgAlbumTo", false, f4Var, g3);
                cVar2.mo103029c("MicroMsg.ChattingItemAppMsgAlbumTo", false, f4Var, g3, aVar, gVar);
            }
            mo103087e0(cVar2, f4Var, bVar.mo91573n(), bVar.mo91583x(), bVar, this);
        }

        /* renamed from: k0 */
        public boolean mo26238k0(int i, boolean z) {
            return z && i == 1124073521;
        }

        /* renamed from: l0 */
        public boolean mo103033l0() {
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.e0$f */
    public static final class C73969f {

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.e0$f$a */
        public static final class C73970a implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public static final C73970a f217084d = new C73970a();

            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.e0$f$b */
        public static final class C73971b implements DialogInterface.OnClickListener {

            /* renamed from: d */
            public static final C73971b f217085d = new C73971b();

            public final void onClick(DialogInterface dialogInterface, int i) {
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.e0$f$c */
        public static final class C73972c<T extends C47465a> implements C58325i {

            /* renamed from: a */
            public static final C73972c<T> f217086a = new C73972c<>();

            /* renamed from: a */
            public /* bridge */ /* synthetic */ void mo32063a(int i, boolean z, C38549d8 d8Var, C47465a aVar) {
                C62619a aVar2 = (C62619a) aVar;
            }
        }

        public C73969f(C8480h hVar) {
        }

        /* renamed from: a */
        public final void mo103036a(C67391b bVar, C72963f4 f4Var) {
            C87412m.m108594g(bVar, "ui");
            C87412m.m108594g(f4Var, "msg");
            if (f4Var.mo100972K3()) {
                Log.m105924i("MicroMsg.ChattingItemAppMsgAlbum", "album is clean!!!");
                C76879j.m92749t(bVar.mo91565f(), bVar.mo91565f().getString(C0966R.string.bzd), bVar.mo91565f().getString(C0966R.string.a3h), C73970a.f217084d);
                return;
            }
            Activity f = bVar.mo91565f();
            C87412m.m108593f(f, "ui.context");
            if (!Util.isNullOrNil(f4Var.getContent())) {
                Intent intent = new Intent();
                intent.putExtra("Retr_Msg_Id", f4Var.getMsgId());
                intent.putExtra("Retr_Msg_Type", 34);
                intent.putExtra("Multi_Retr", true);
                intent.putExtra("Retr_Msg_content", f4Var.getContent());
                intent.putExtra("Retr_go_to_chattingUI", false);
                intent.putExtra("Retr_show_success_tips", true);
                C88144b.m109801s(f, "com.tencent.mm.ui.transmit.MsgRetransmitUI", intent, (Bundle) null);
            }
        }

        /* renamed from: b */
        public final void mo103037b(C67391b bVar, C72963f4 f4Var, long j, long j2, String str, String str2, int i, boolean z, View view) {
            ChattingAlbumContainer chattingAlbumContainer;
            C72963f4 f4Var2;
            C67391b bVar2 = bVar;
            long j3 = j;
            long j4 = j2;
            String str3 = str;
            int i2 = i;
            Class cls = C79348e.class;
            C87412m.m108594g(bVar, "ui");
            C72963f4 f4Var3 = f4Var;
            C87412m.m108594g(f4Var, "msg");
            if (f4Var.mo100972K3()) {
                Log.m105924i("MicroMsg.ChattingItemAppMsgAlbum", "album is clean!!!");
                C76879j.m92749t(bVar.mo91565f(), bVar.mo91565f().getString(C0966R.string.bzd), bVar.mo91565f().getString(C0966R.string.a3h), C73971b.f217085d);
                return;
            }
            Log.m105924i("MicroMsg.ChattingItemAppMsgAlbum", "[ImageGalleryUI] showImgGallery");
            Intent intent = new Intent(bVar.mo91565f(), ImageGalleryUI.class);
            intent.putExtra("img_gallery_msg_id", j3);
            intent.putExtra("img_gallery_msg_svr_id", j4);
            intent.putExtra("Retr_Security_Msg_Id", j3);
            intent.putExtra("Retr_Security_Is_Intercept_Block", false);
            intent.putExtra("Retr_Security_Intercept_Activity_PackageName", ImageGalleryUI.class.getName());
            intent.putExtra("show_search_chat_content_result", ((C79384u0) bVar2.f193278b.mo102812a(C79384u0.class)).mo102513x2());
            intent.putExtra("key_is_biz_chat", ((C79348e) bVar2.f193278b.mo102812a(cls)).mo70071q1());
            intent.putExtra("key_biz_chat_id", ((C79348e) bVar2.f193278b.mo102812a(cls)).mo70068i4());
            intent.putExtra("img_gallery_talker", str3);
            intent.putExtra("img_gallery_chatroom_name", str2);
            intent.putExtra("img_gallery_enter_from_chatting_ui", true);
            intent.putExtra("msg_type", i2);
            if (z) {
                intent.putExtra("img_preview_only", true);
            }
            if (i2 == 1) {
                intent.putExtra("show_enter_grid", false);
            }
            String r = bVar.mo91577r();
            if (f4Var.mo108769t2() == 1) {
                str3 = bVar.mo91573n();
            } else if (str3 == null) {
                str3 = "";
            }
            Bundle bundle = new Bundle();
            if (bVar.mo91582w()) {
                bundle.putInt("stat_scene", 2);
            } else {
                bundle.putInt("stat_scene", C45628s0.m50738C(r) ? 7 : 1);
            }
            bundle.putString("stat_msg_id", "msg_" + j4);
            bundle.putString("stat_chat_talker_username", r);
            bundle.putString("stat_send_msg_user", str3);
            intent.putExtra("_stat_obj", bundle);
            C87412m.m108593f(str3, "sendMsgUsername");
            C87412m.m108593f(r, "talkerUsername");
            String a = C86493v0.m107223a("" + j4);
            C86493v0.C86495c c = C86493v0.m107224d().mo120947c(a, true);
            c.mo120962i("preUsername", str3);
            c.mo120962i("preChatName", r);
            c.mo120962i("Contact_Sub_Scene", 3);
            c.mo120962i("Contact_Scene_Note", r);
            intent.putExtra("img_gallery_session_id", a);
            intent.putExtra("img_gallery_enter_use_share_element_anim", i2 != 1);
            intent.putExtra("album_enter_from_scene", 1);
            Bundle bundle2 = null;
            Context context = view != null ? view.getContext() : null;
            Activity activity = context instanceof Activity ? (Activity) context : null;
            if (activity != null) {
                Object tag = view.getTag();
                C73959a aVar = tag instanceof C73959a ? (C73959a) tag : null;
                C78208e eVar = aVar != null ? aVar.f217065W : null;
                C73961c cVar = eVar instanceof C73961c ? (C73961c) eVar : null;
                if (cVar != null) {
                    C79111f fVar = cVar.f217069b;
                    if (fVar != null) {
                        if (fVar.f232276e == null) {
                            fVar.f232276e = (ChattingAlbumContainer) fVar.f232272a.findViewById(C0966R.C0970id.o5d);
                        }
                        chattingAlbumContainer = fVar.f232276e;
                    } else {
                        C79112g gVar = cVar.f217070c;
                        if (gVar != null) {
                            if (gVar.f232285f == null) {
                                gVar.f232285f = (ChattingAlbumContainer) gVar.f232280a.findViewById(C0966R.C0970id.o5d);
                            }
                            chattingAlbumContainer = gVar.f232285f;
                        } else {
                            chattingAlbumContainer = null;
                        }
                    }
                    if (chattingAlbumContainer != null) {
                        Object tag2 = view.getTag();
                        C73959a aVar2 = tag2 instanceof C73959a ? (C73959a) tag2 : null;
                        List<Pair<View, String>> e = chattingAlbumContainer.mo94179e((aVar2 == null || (f4Var2 = aVar2.f217062T) == null) ? 0 : f4Var2.getMsgId());
                        C59473f fVar2 = ((C59474h) C39818r.f106831a.mo62443b(activity).mo75002a(C59474h.class)).f169947e;
                        C59469a aVar3 = bVar2.f193300x;
                        if (fVar2.f169944b.f169948f) {
                            Log.m105918d("MM.Transition", "getAnimOptionBundle has already called startForResult");
                        } else {
                            bundle2 = MMTransitionHelper.f165034a.mo81990a(fVar2.f169943a, e, aVar3, intent);
                        }
                    }
                }
            }
            BaseChattingUIFragment baseChattingUIFragment = bVar2.f193286j;
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(bundle2);
            aVar4.mo10233c(intent);
            BaseChattingUIFragment baseChattingUIFragment2 = baseChattingUIFragment;
            C117292a.m165358d(baseChattingUIFragment2, aVar4.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgAlbum$Companion", "showImgGallery", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;JJLjava/lang/String;Ljava/lang/String;IZLandroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            baseChattingUIFragment.startActivity((Intent) aVar4.mo10231a(0), (Bundle) aVar4.mo10231a(1));
            C117292a.m165359e(baseChattingUIFragment2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgAlbum$Companion", "showImgGallery", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;JJLjava/lang/String;Ljava/lang/String;IZLandroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;Landroid/os/Bundle;)V");
            bVar2.f193286j.overridePendingTransition(0, 0);
            C62619a aVar5 = new C62619a();
            aVar5.f177833h = 1;
            ((C99933h) C86312j.m106911c(C99933h.class)).mo84399BM(18, "album_enter_from_scene", aVar5, C73972c.f217086a);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.e0$g */
    public static final class C73973g implements C72963f4.C72966d<C73973g> {

        /* renamed from: b */
        public final C72963f4 f217087b;

        /* renamed from: c */
        public final C13601g f217088c;

        /* renamed from: d */
        public final List<Boolean> f217089d;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.e0$g$a */
        public static final class C73974a extends C87413o implements C32224a<C99862a> {

            /* renamed from: d */
            public final /* synthetic */ C73973g f217090d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C73974a(C73973g gVar) {
                super(0);
                this.f217090d = gVar;
            }

            public Object invoke() {
                C98597b.C60245a aVar = C98597b.f289091e;
                C7335d c = C86312j.m106911c(C99864d.class);
                C87412m.m108593f(c, "getService(AlbumFeatureService::class.java)");
                C99865e0 e0Var = (C99865e0) aVar.mo85231a((C98598e) c, C99865e0.class);
                C72963f4 f4Var = this.f217090d.f217087b;
                return e0Var.mo139217g3(f4Var != null ? f4Var.getMsgId() : 0);
            }
        }

        public C73973g(C72963f4 f4Var) {
            ArrayList arrayList;
            String content;
            this.f217087b = f4Var;
            C13601g a = C36568h.m40985a(new C73974a(this));
            this.f217088c = a;
            boolean z = true;
            if ((f4Var == null || f4Var.mo108769t2() != 1) ? false : z) {
                List<T> s0 = C110818d0.m150947s0(((C99862a) ((C36570n) a).getValue()).mo55365D().mo139238A(), 9);
                arrayList = new ArrayList(C36907w.m41090l(s0, 10));
                for (T G : s0) {
                    arrayList.add(Boolean.valueOf(C86013q1.m106450k(G.mo55382G())));
                }
            } else {
                C98674g gVar = new C98674g();
                C98671a aVar = new C98671a();
                if (!(f4Var == null || (content = f4Var.getContent()) == null)) {
                    aVar.mo141099d(content);
                }
                gVar.mo141099d(aVar.f289309p);
                List<C98672d> list = gVar.f289364h;
                arrayList = new ArrayList(C36907w.m41090l(list, 10));
                for (C98672d q : list) {
                    arrayList.add(Boolean.valueOf(C86013q1.m106450k(C100792a.f295260a.mo140245q(q, this.f217087b))));
                }
            }
            this.f217089d = arrayList;
        }

        /* renamed from: a */
        public boolean mo82132a(Object obj) {
            C73973g gVar = (C73973g) obj;
            C87412m.m108594g(gVar, "other");
            C99862a aVar = (C99862a) ((C36570n) this.f217088c).getValue();
            if (aVar.mo141100e().mo53860f(aVar, (C99862a) ((C36570n) gVar.f217088c).getValue())) {
                C72963f4 f4Var = this.f217087b;
                Integer num = null;
                Integer valueOf = f4Var != null ? Integer.valueOf(f4Var.getStatus()) : null;
                C72963f4 f4Var2 = gVar.f217087b;
                if (f4Var2 != null) {
                    num = Integer.valueOf(f4Var2.getStatus());
                }
                return C87412m.m108589b(valueOf, num) && C87412m.m108589b(this.f217089d, gVar.f217089d);
            }
        }
    }
}
