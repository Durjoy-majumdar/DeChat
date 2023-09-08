package com.tencent.p014mm.p136ui.chatting.viewitems;

import a14.C0000n0;
import ak3.C67067f;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.ProgressBar;
import android.widget.TextView;
import ck3.C39969i;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.GameCenterOperationEvent;
import com.tencent.p014mm.autogen.events.ReportMsgClickEvent;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelavatar.C68080d;
import com.tencent.p014mm.p136ui.C74928u;
import com.tencent.p014mm.p136ui.chatting.AppBrandServiceChattingUI;
import com.tencent.p014mm.p136ui.chatting.BaseChattingUIFragment;
import com.tencent.p014mm.p136ui.chatting.C73304a;
import com.tencent.p014mm.p136ui.chatting.C73321b2;
import com.tencent.p014mm.p136ui.chatting.C73326c2;
import com.tencent.p014mm.p136ui.chatting.C73672d2;
import com.tencent.p014mm.p136ui.chatting.C73679e2;
import com.tencent.p014mm.p136ui.chatting.C73684f2;
import com.tencent.p014mm.p136ui.chatting.C73720i2;
import com.tencent.p014mm.p136ui.chatting.C73743l2;
import com.tencent.p014mm.p136ui.chatting.C73774p2;
import com.tencent.p014mm.p136ui.chatting.C73839r2;
import com.tencent.p014mm.p136ui.chatting.C74346y1;
import com.tencent.p014mm.p136ui.chatting.C74350z;
import com.tencent.p014mm.p136ui.chatting.C74352z3;
import com.tencent.p014mm.p136ui.chatting.view.ChattingAvatarImageView;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74059i7;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74090l0;
import com.tencent.p014mm.p136ui.chatting.viewitems.C74244u;
import com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemTranslate;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C44561j;
import com.tencent.p014mm.pluginsdk.model.app.C72688j0;
import com.tencent.p014mm.pluginsdk.p133ui.chat.x1$$c;
import com.tencent.p014mm.pluginsdk.p133ui.chat.x1$$d;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C6690n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.NetStatusUtil;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.platformtools.XmlParser;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.thumbplayer.api.TPOptionalID;
import com.tencent.youtu.sdkkitframework.common.StateEvent;
import d62.C75339i;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C45628s0;
import eb0.C45629t0;
import eb0.C75592q0;
import eb0.C75604z3;
import f40.C86709a0;
import gc0.C20828a;
import gy3.C87412m;
import h81.C32735h;
import j20.C117292a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.Future;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import kr0.C88273g1;
import kr0.C88274h0;
import l31.C61212e;
import lc3.C10485b;
import lg3.C88494d;
import nj3.C11183n0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76875f0;
import nj3.C76891l0;
import p159gw.C45962f;
import p196ln.C76705f;
import p215oo.C77032h;
import p270xi.C66282i;
import p270xi.C78839k;
import p629ny.C76979h;
import p740wo.C53193b;
import p763ym.C79138l;
import p773yy.C79168k;
import qy2.C63347a;
import rb0.C47987l;
import rb0.C47989m;
import rb0.C47994n;
import rb0.C48009v0;
import rb0.C77495c;
import rb0.C77497d;
import sw1.C48477m;
import te3.d45;
import u73.C22613h1;
import uj3.C78208e;
import uo3.C78253a;
import ww0.C78732i;
import xi3.C78844a;
import xo3.C78950d;
import z04.C112551y;
import zj3.C79336a;
import zj3.C79348e;
import zj3.C79357g;
import zj3.C79361h0;
import zj3.C79368l;
import zt3.C119157j;
import zt3.C119179t;

/* renamed from: com.tencent.mm.ui.chatting.viewitems.i */
public abstract class C74023i {

    /* renamed from: t */
    public static boolean f217195t;

    /* renamed from: u */
    public static long f217196u;

    /* renamed from: d */
    public boolean f217197d;

    /* renamed from: e */
    public C74027e f217198e;

    /* renamed from: f */
    public C78950d.C78963m f217199f;

    /* renamed from: g */
    public C74035f f217200g;

    /* renamed from: h */
    public boolean f217201h = false;

    /* renamed from: i */
    public C73326c2 f217202i;

    /* renamed from: j */
    public C73679e2 f217203j;

    /* renamed from: n */
    public C73672d2 f217204n;

    /* renamed from: o */
    public C73839r2 f217205o;

    /* renamed from: p */
    public C73720i2 f217206p;

    /* renamed from: q */
    public C73743l2 f217207q;

    /* renamed from: r */
    public C73684f2 f217208r;

    /* renamed from: s */
    public Future f217209s = null;

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.i$d */
    public static class C44864d implements C47989m.C47992c {

        /* renamed from: d */
        public String f121717d;

        /* renamed from: e */
        public C67391b f121718e;

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.i$d$a */
        public class C44865a implements Runnable {
            public C44865a() {
            }

            public void run() {
                C44864d.this.f121718e.mo91540A();
            }
        }

        public C44864d(C67391b bVar, String str) {
            this.f121717d = str;
            this.f121718e = bVar;
        }

        /* renamed from: L6 */
        public String mo66779L6() {
            return this.f121717d;
        }

        /* renamed from: g5 */
        public void mo66780g5(LinkedList<d45> linkedList) {
            C48009v0.Gx0().mo72778e(this);
            Log.m105918d("MicroMsg.ChattingItem", "onKFSceneEnd.");
            if (linkedList != null && linkedList.size() > 0) {
                boolean z = false;
                Log.m105925i("MicroMsg.ChattingItem", "onKFSceneEnd, workers size : %d. callbackid=%s", Integer.valueOf(linkedList.size()), this.f121717d);
                if (this.f121718e != null) {
                    if (linkedList.size() != 0) {
                        int i = 0;
                        while (true) {
                            if (i >= linkedList.size()) {
                                break;
                            }
                            d45 d45 = linkedList.get(i);
                            if (d45 != null && !Util.isNullOrNil(d45.f132111d) && d45.f132111d.equals(this.f121717d)) {
                                Log.m105924i("MicroMsg.ChattingItem", "needCallback find match kfopenid");
                                if (!Util.isNullOrNil(d45.f132113f)) {
                                    Log.m105924i("MicroMsg.ChattingItem", "needCallback: true");
                                    z = true;
                                    break;
                                }
                            }
                            i++;
                        }
                    }
                    if (z) {
                        MMHandlerThread.postToMainThread(new C44865a());
                    }
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.i$a */
    public class C74024a implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ String f217210d;

        /* renamed from: e */
        public final /* synthetic */ int f217211e;

        /* renamed from: f */
        public final /* synthetic */ String f217212f;

        /* renamed from: g */
        public final /* synthetic */ int f217213g;

        /* renamed from: h */
        public final /* synthetic */ String f217214h;

        /* renamed from: i */
        public final /* synthetic */ String f217215i;

        /* renamed from: j */
        public final /* synthetic */ String f217216j;

        /* renamed from: n */
        public final /* synthetic */ int f217217n;

        /* renamed from: o */
        public final /* synthetic */ String f217218o;

        /* renamed from: p */
        public final /* synthetic */ long f217219p;

        /* renamed from: q */
        public final /* synthetic */ int f217220q;

        public C74024a(C74023i iVar, String str, int i, String str2, int i2, String str3, String str4, String str5, int i3, String str6, long j, int i4) {
            this.f217210d = str;
            this.f217211e = i;
            this.f217212f = str2;
            this.f217213g = i2;
            this.f217214h = str3;
            this.f217215i = str4;
            this.f217216j = str5;
            this.f217217n = i3;
            this.f217218o = str6;
            this.f217219p = j;
            this.f217220q = i4;
        }

        public void run() {
            C78732i.C53208a ka = ((C78732i) C86312j.m106911c(C78732i.class)).mo73881ka(this.f217210d);
            C22613h1.m26479e(this.f217211e, this.f217212f, this.f217213g, 1, ka.f148428c, this.f217214h, this.f217215i, this.f217216j, this.f217217n, this.f217218o, this.f217219p, (long) this.f217210d.length(), this.f217220q, ka.f148426a, ka.f148429d, ka.f148427b);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.i$b */
    public class C74025b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ C74026c f217221d;

        public C74025b(C74023i iVar, C74026c cVar) {
            this.f217221d = cVar;
        }

        public void run() {
            this.f217221d.uploadingPB.setVisibility(0);
            this.f217221d.uploadingPB.setTag(C0966R.C0970id.b7q, Boolean.TRUE);
            Log.m105919d("MicroMsg.ChattingItem", "showUploadingPB delay visible %s", this.f217221d);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.i$e */
    public class C74027e implements View.OnLongClickListener {

        /* renamed from: d */
        public C67391b f217222d;

        /* renamed from: e */
        public C76891l0 f217223e;

        /* renamed from: f */
        public C74034g f217224f;

        /* renamed from: g */
        public int f217225g;

        /* renamed from: h */
        public int f217226h;

        /* renamed from: i */
        public View f217227i;

        /* renamed from: j */
        public C78253a f217228j;

        /* renamed from: n */
        public C78950d.C78963m f217229n;

        /* renamed from: o */
        public int f217230o = -1;

        /* renamed from: p */
        public int f217231p = -1;

        /* renamed from: q */
        public int f217232q = -1;

        /* renamed from: r */
        public final C78839k f217233r = new C74028a();

        /* renamed from: s */
        public Object f217234s;

        /* renamed from: t */
        public PopupWindow.OnDismissListener f217235t = new C74033f();

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.i$e$a */
        public class C74028a implements C78839k {
            public C74028a() {
            }

            /* renamed from: F4 */
            public void mo26186F4() {
            }

            /* renamed from: G4 */
            public void mo26160G4() {
            }

            /* renamed from: O4 */
            public void mo26162O4() {
            }

            /* renamed from: e */
            public void mo70065e() {
            }

            /* renamed from: g5 */
            public void mo70046g5() {
            }

            /* renamed from: n2 */
            public void mo26199n2() {
            }

            /* renamed from: u5 */
            public void mo26170u5() {
                C74027e eVar = C74027e.this;
                C67391b bVar = eVar.f217222d;
                if (bVar.f193298v && C74023i.this.mo103098p(bVar) != null) {
                    C74027e eVar2 = C74027e.this;
                    C74027e p = C74023i.this.mo103098p(eVar2.f217222d);
                    C78253a aVar = p.f217228j;
                    if (aVar != null && aVar.mo108266a()) {
                        p.f217228j = null;
                    }
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.i$e$b */
        public class C74029b implements C76891l0 {
            public C74029b(C74023i iVar) {
            }

            /* JADX WARNING: Removed duplicated region for block: B:165:0x03f3  */
            /* JADX WARNING: Removed duplicated region for block: B:176:0x0456  */
            /* JADX WARNING: Removed duplicated region for block: B:188:0x04ce  */
            /* JADX WARNING: Removed duplicated region for block: B:191:0x050c  */
            /* JADX WARNING: Removed duplicated region for block: B:213:0x0564  */
            /* JADX WARNING: Removed duplicated region for block: B:221:? A[RETURN, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:223:? A[RETURN, SYNTHETIC] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public void mo71744a(nj3.C76874e0 r21, android.view.View r22, android.view.ContextMenu.ContextMenuInfo r23) {
                /*
                    r20 = this;
                    r0 = r20
                    r7 = r21
                    java.lang.Class<c00.n> r8 = c00.C0405n.class
                    java.lang.Object r1 = r22.getTag()
                    com.tencent.mm.ui.chatting.viewitems.t8 r1 = (com.tencent.p014mm.p136ui.chatting.viewitems.C74243t8) r1
                    if (r1 != 0) goto L_0x000f
                    return
                L_0x000f:
                    int r9 = r1.mo103252b()
                    boolean r2 = r1 instanceof com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemTranslate.C73916c
                    r10 = 2
                    r12 = 1
                    if (r2 == 0) goto L_0x0022
                    r2 = r1
                    com.tencent.mm.ui.chatting.viewitems.ChattingItemTranslate$c r2 = (com.tencent.p014mm.p136ui.chatting.viewitems.ChattingItemTranslate.C73916c) r2
                    int r2 = r2.f216964T
                    if (r10 != r2) goto L_0x0022
                    r13 = 1
                    goto L_0x0023
                L_0x0022:
                    r13 = 0
                L_0x0023:
                    com.tencent.mm.storage.f4 r14 = r1.f212238a
                    java.lang.String r15 = "MicroMsg.ChattingItem"
                    if (r14 != 0) goto L_0x002f
                    java.lang.String r1 = "msg is null!"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r1)
                    return
                L_0x002f:
                    boolean r1 = r14.mo101020w3()
                    if (r1 == 0) goto L_0x003c
                    com.tencent.mm.ui.chatting.viewitems.i$e r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    r2 = 49
                    r1.f217232q = r2
                    goto L_0x0044
                L_0x003c:
                    com.tencent.mm.ui.chatting.viewitems.i$e r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    int r2 = r14.getType()
                    r1.f217232q = r2
                L_0x0044:
                    com.tencent.mm.ui.chatting.viewitems.i$e r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    ck3.b r1 = r1.f217222d
                    java.lang.Class<xi.i> r2 = p270xi.C66282i.class
                    com.tencent.mm.ui.chatting.manager.a r1 = r1.f193278b
                    xi.d r1 = r1.mo102812a(r2)
                    xi.i r1 = (p270xi.C66282i) r1
                    com.tencent.mm.ui.chatting.viewitems.i$e r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    xi.k r2 = r2.f217233r
                    r1.mo90405j4(r2)
                    java.lang.String r1 = "chattingItemlongclick observer register"
                    com.tencent.p014mm.sdk.platformtools.Log.m105918d(r15, r1)
                    com.tencent.mm.ui.chatting.viewitems.i$e r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    com.tencent.mm.ui.chatting.viewitems.i r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.this
                    r2 = r22
                    r3 = r23
                    boolean r1 = r1.mo26235Z(r7, r2, r3, r14)
                    com.tencent.mm.ui.chatting.viewitems.i$e r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    ck3.b r2 = r2.f217222d
                    java.lang.String r2 = r2.mo91577r()
                    boolean r2 = com.tencent.p014mm.storage.C72996z1.m85848s5(r2)
                    r6 = 116(0x74, float:1.63E-43)
                    if (r2 != 0) goto L_0x0088
                    com.tencent.mm.ui.chatting.viewitems.i$e r2 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    ck3.b r2 = r2.f217222d
                    java.lang.String r2 = r2.mo91577r()
                    boolean r2 = com.tencent.p014mm.storage.C72996z1.m85798E5(r2)
                    if (r2 == 0) goto L_0x0090
                L_0x0088:
                    java.lang.String r2 = "on create context menu, match qcontact or tcontact, remove favorite menu item"
                    com.tencent.p014mm.sdk.platformtools.Log.m105924i(r15, r2)
                    r7.removeItem(r6)
                L_0x0090:
                    r5 = 2131821447(0x7f110387, float:1.9275637E38)
                    r4 = 100
                    r3 = 123(0x7b, float:1.72E-43)
                    if (r1 == 0) goto L_0x0472
                    boolean r1 = r14.mo100993e4()
                    r2 = 2131823565(0x7f110bcd, float:1.9279933E38)
                    if (r1 != 0) goto L_0x00ae
                    boolean r1 = r14.mo100987Z3()
                    if (r1 != 0) goto L_0x00ae
                    boolean r1 = r14.mo100963C3()
                    if (r1 == 0) goto L_0x00f1
                L_0x00ae:
                    boolean r1 = eb0.C75569c4.m90662H(r14)
                    if (r1 != 0) goto L_0x00f1
                    boolean r1 = eb0.C75569c4.m90689v(r14)
                    if (r1 != 0) goto L_0x00f1
                    boolean r1 = eb0.C75569c4.m90690w(r14)
                    if (r1 != 0) goto L_0x00f1
                    di3.d r1 = di3.C86312j.m106911c(r8)
                    c00.n r1 = (c00.C0405n) r1
                    boolean r1 = r1.mo279e()
                    if (r1 != 0) goto L_0x00f1
                    r16 = 137(0x89, float:1.92E-43)
                    r17 = 0
                    com.tencent.mm.ui.chatting.viewitems.i$e r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    ck3.b r1 = r1.f217222d
                    android.content.res.Resources r1 = r1.mo91572m()
                    java.lang.String r18 = r1.getString(r2)
                    r19 = 2131756156(0x7f10047c, float:1.9143212E38)
                    r1 = r21
                    r11 = 2131823565(0x7f110bcd, float:1.9279933E38)
                    r2 = r9
                    r3 = r16
                    r4 = r17
                    r5 = r18
                    r6 = r19
                    r1.mo107136c(r2, r3, r4, r5, r6)
                    goto L_0x00f4
                L_0x00f1:
                    r11 = 2131823565(0x7f110bcd, float:1.9279933E38)
                L_0x00f4:
                    boolean r1 = eb0.C75569c4.m90690w(r14)
                    if (r1 != 0) goto L_0x010f
                    boolean r1 = eb0.C75569c4.m90689v(r14)
                    if (r1 != 0) goto L_0x010f
                    com.tencent.mm.ui.chatting.viewitems.i$e r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    com.tencent.mm.ui.chatting.viewitems.i r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.this
                    boolean r1 = r1.mo82213S()
                    if (r1 == 0) goto L_0x010f
                    com.tencent.mm.ui.chatting.viewitems.i$e r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.m87942a(r1, r7, r14, r9, r13)
                L_0x010f:
                    boolean r1 = eb0.C75569c4.m90690w(r14)
                    if (r1 != 0) goto L_0x0128
                    boolean r1 = eb0.C75569c4.m90689v(r14)
                    if (r1 != 0) goto L_0x0128
                    com.tencent.mm.ui.chatting.viewitems.i$e r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    boolean r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.m87943b(r1, r14)
                    if (r1 == 0) goto L_0x0128
                    com.tencent.mm.ui.chatting.viewitems.i$e r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.m87944c(r1, r7, r14, r9)
                L_0x0128:
                    boolean r1 = r14.mo100979R3()
                    if (r1 == 0) goto L_0x01b3
                    java.lang.Class<u73.n> r1 = u73.C101980n.class
                    di3.d r1 = di3.C86312j.m106911c(r1)
                    u73.n r1 = (u73.C101980n) r1
                    boolean r1 = r1.mo134693tB()
                    if (r1 == 0) goto L_0x01b3
                    boolean r1 = eb0.C75569c4.m90662H(r14)
                    if (r1 != 0) goto L_0x01b3
                    boolean r1 = eb0.C75569c4.m90689v(r14)
                    if (r1 != 0) goto L_0x01b3
                    boolean r1 = eb0.C75569c4.m90690w(r14)
                    if (r1 != 0) goto L_0x01b3
                    di3.d r1 = di3.C86312j.m106911c(r8)
                    c00.n r1 = (c00.C0405n) r1
                    boolean r1 = r1.mo279e()
                    if (r1 != 0) goto L_0x01b3
                    r3 = 137(0x89, float:1.92E-43)
                    r4 = 0
                    com.tencent.mm.ui.chatting.viewitems.i$e r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    ck3.b r1 = r1.f217222d
                    android.content.res.Resources r1 = r1.mo91572m()
                    java.lang.String r5 = r1.getString(r11)
                    r6 = 2131756156(0x7f10047c, float:1.9143212E38)
                    r1 = r21
                    r2 = r9
                    r1.mo107136c(r2, r3, r4, r5, r6)
                    com.tencent.mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct r1 = new com.tencent.mm.autogen.mmdata.rpt.ChatImageWebSearchActionStruct
                    r1.<init>()
                    java.lang.String r2 = ""
                    r1.mo126611w(r2)
                    long r3 = r14.mo108774y2()
                    java.lang.String r3 = java.lang.String.valueOf(r3)
                    r1.mo126609u(r3)
                    r1.f265370f = r12
                    r1.f265369e = r12
                    r3 = 67
                    r1.f265371g = r3
                    r1.mo126608t(r2)
                    r1.mo126607s(r2)
                    java.lang.String r3 = r14.mo108768t()
                    boolean r3 = com.tencent.p014mm.storage.C72996z1.m85820U5(r3)
                    if (r3 == 0) goto L_0x01a2
                    r1.f265374j = r10
                    goto L_0x01a4
                L_0x01a2:
                    r1.f265374j = r12
                L_0x01a4:
                    r1.mo126610v(r2)
                    long r2 = java.lang.System.currentTimeMillis()
                    r1.f265377m = r2
                    r1.mo86054n()
                    u73.C22613h1.m26490p(r1)
                L_0x01b3:
                    java.lang.String r1 = r14.mo108768t()
                    boolean r1 = com.tencent.p014mm.storage.C72996z1.m85812O4(r1)
                    r8 = 122(0x7a, float:1.71E-43)
                    r2 = 134(0x86, float:1.88E-43)
                    r11 = 136(0x88, float:1.9E-43)
                    r6 = 123(0x7b, float:1.72E-43)
                    if (r1 == 0) goto L_0x020a
                    android.view.MenuItem r1 = r7.findItem(r6)
                    if (r1 == 0) goto L_0x01ce
                    r7.removeItem(r6)
                L_0x01ce:
                    android.view.MenuItem r1 = r7.findItem(r8)
                    if (r1 == 0) goto L_0x01d7
                    r7.removeItem(r8)
                L_0x01d7:
                    android.view.MenuItem r1 = r7.findItem(r11)
                    if (r1 == 0) goto L_0x01e0
                    r7.removeItem(r11)
                L_0x01e0:
                    android.view.MenuItem r1 = r7.findItem(r2)
                    if (r1 == 0) goto L_0x01e9
                    r7.removeItem(r2)
                L_0x01e9:
                    r1 = 116(0x74, float:1.63E-43)
                    android.view.MenuItem r3 = r7.findItem(r1)
                    if (r3 == 0) goto L_0x01f4
                    r7.removeItem(r1)
                L_0x01f4:
                    r1 = 137(0x89, float:1.92E-43)
                    android.view.MenuItem r3 = r7.findItem(r1)
                    if (r3 == 0) goto L_0x01ff
                    r7.removeItem(r1)
                L_0x01ff:
                    r1 = 135(0x87, float:1.89E-43)
                    android.view.MenuItem r3 = r7.findItem(r1)
                    if (r3 == 0) goto L_0x020a
                    r7.removeItem(r1)
                L_0x020a:
                    com.tencent.mm.ui.chatting.viewitems.i$e r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    ck3.b r1 = r1.f217222d
                    java.lang.String r1 = r1.mo91577r()
                    boolean r1 = com.tencent.p014mm.storage.C72996z1.m85846q5(r1)
                    if (r1 == 0) goto L_0x022a
                    android.view.MenuItem r1 = r7.findItem(r11)
                    if (r1 == 0) goto L_0x0221
                    r7.removeItem(r11)
                L_0x0221:
                    android.view.MenuItem r1 = r7.findItem(r2)
                    if (r1 == 0) goto L_0x022a
                    r7.removeItem(r2)
                L_0x022a:
                    java.lang.Object[] r1 = new java.lang.Object[r10]
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r9)
                    r10 = 0
                    r1[r10] = r2
                    long r2 = r14.getMsgId()
                    java.lang.Long r2 = java.lang.Long.valueOf(r2)
                    r1[r12] = r2
                    java.lang.String r2 = "OnCreateContextMMMenux: position:%s, msgid:%s"
                    com.tencent.p014mm.sdk.platformtools.Log.m105925i(r15, r2, r1)
                    com.tencent.mm.ui.chatting.viewitems.i$e r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    ck3.b r1 = r1.f217222d
                    boolean r1 = r1.mo91584y()
                    if (r1 == 0) goto L_0x0254
                    com.tencent.mm.ui.chatting.viewitems.i$e r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.m87945d(r1, r7, r14, r9)
                    r5 = 100
                    goto L_0x0264
                L_0x0254:
                    r5 = 100
                    android.view.MenuItem r1 = r7.findItem(r5)
                    if (r1 == 0) goto L_0x0264
                    r7.removeItem(r5)
                    com.tencent.mm.ui.chatting.viewitems.i$e r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.m87945d(r1, r7, r14, r9)
                L_0x0264:
                    android.view.MenuItem r1 = r7.findItem(r6)
                    if (r1 == 0) goto L_0x02eb
                    r7.removeItem(r5)
                    r7.removeItem(r6)
                    com.tencent.mm.ui.chatting.viewitems.i$e r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    r1.getClass()
                    java.util.LinkedList r2 = new java.util.LinkedList
                    r2.<init>()
                    java.util.List<android.view.MenuItem> r3 = r7.f224704d
                    java.util.ArrayList r3 = (java.util.ArrayList) r3
                    java.util.Iterator r4 = r3.iterator()
                    int r5 = r3.size()
                    r13 = 2131823560(0x7f110bc8, float:1.9279923E38)
                    r10 = 3
                    if (r5 > r10) goto L_0x02a3
                    r3 = 123(0x7b, float:1.72E-43)
                    r4 = 0
                    ck3.b r1 = r1.f217222d
                    android.app.Activity r1 = r1.mo91565f()
                    java.lang.String r5 = r1.getString(r13)
                    r6 = 2131756134(0x7f100466, float:1.9143167E38)
                    r1 = r21
                    r2 = r9
                    r1.mo107136c(r2, r3, r4, r5, r6)
                    goto L_0x02eb
                L_0x02a3:
                    r5 = 0
                L_0x02a4:
                    boolean r16 = r4.hasNext()
                    if (r16 == 0) goto L_0x02e2
                    java.lang.Object r16 = r4.next()
                    r12 = r16
                    android.view.MenuItem r12 = (android.view.MenuItem) r12
                    if (r5 != r10) goto L_0x02d8
                    nj3.f0 r10 = new nj3.f0
                    ck3.b r11 = r1.f217222d
                    android.app.Activity r11 = r11.mo91565f()
                    r10.<init>(r11, r6, r9)
                    ck3.b r11 = r1.f217222d
                    android.content.res.Resources r11 = r11.mo91572m()
                    java.lang.String r11 = r11.getString(r13)
                    r10.f224717i = r11
                    r11 = 2131756134(0x7f100466, float:1.9143167E38)
                    r10.setIcon((int) r11)
                    r2.add(r10)
                    r2.add(r12)
                    goto L_0x02db
                L_0x02d8:
                    r2.add(r12)
                L_0x02db:
                    int r5 = r5 + 1
                    r10 = 3
                    r11 = 136(0x88, float:1.9E-43)
                    r12 = 1
                    goto L_0x02a4
                L_0x02e2:
                    r3.clear()
                    r3.addAll(r2)
                    r2.clear()
                L_0x02eb:
                    java.lang.String r1 = r14.mo108768t()
                    boolean r1 = com.tencent.p014mm.storage.C72996z1.m85812O4(r1)
                    if (r1 != 0) goto L_0x0315
                    boolean r1 = eb0.C75569c4.m90690w(r14)
                    if (r1 != 0) goto L_0x0315
                    boolean r1 = eb0.C75569c4.m90688u(r14)
                    if (r1 != 0) goto L_0x0315
                    com.tencent.mm.ui.chatting.viewitems.i$e r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    com.tencent.mm.ui.chatting.viewitems.i r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.this
                    boolean r1 = r1.mo82212C()
                    if (r1 == 0) goto L_0x0315
                    com.tencent.mm.ui.chatting.viewitems.i$e r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    ck3.b r1 = r1.f217222d
                    boolean r1 = r1.mo91584y()
                    if (r1 != 0) goto L_0x0323
                L_0x0315:
                    com.tencent.mm.ui.chatting.viewitems.i$e r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    ck3.b r1 = r1.f217222d
                    com.tencent.mm.storage.z1 r1 = r1.mo91574o()
                    boolean r1 = r1.mo62916m3()
                    if (r1 == 0) goto L_0x039f
                L_0x0323:
                    com.tencent.mm.ui.chatting.viewitems.i$e r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    r1.getClass()
                    boolean r2 = com.tencent.p014mm.p136ui.chatting.C74343y0.m88748G(r14)
                    if (r2 == 0) goto L_0x032f
                    goto L_0x039f
                L_0x032f:
                    java.util.LinkedList r2 = new java.util.LinkedList
                    r2.<init>()
                    java.util.List<android.view.MenuItem> r3 = r7.f224704d
                    java.util.ArrayList r3 = (java.util.ArrayList) r3
                    java.util.Iterator r4 = r3.iterator()
                    int r5 = r3.size()
                    r6 = 2131823551(0x7f110bbf, float:1.9279905E38)
                    r10 = 4
                    if (r5 > r10) goto L_0x035d
                    r3 = 122(0x7a, float:1.71E-43)
                    r4 = 0
                    ck3.b r1 = r1.f217222d
                    android.app.Activity r1 = r1.mo91565f()
                    java.lang.String r5 = r1.getString(r6)
                    r6 = 2131756096(0x7f100440, float:1.914309E38)
                    r1 = r21
                    r2 = r9
                    r1.mo107136c(r2, r3, r4, r5, r6)
                    goto L_0x039f
                L_0x035d:
                    r5 = 0
                L_0x035e:
                    boolean r11 = r4.hasNext()
                    if (r11 == 0) goto L_0x0396
                    java.lang.Object r11 = r4.next()
                    android.view.MenuItem r11 = (android.view.MenuItem) r11
                    if (r5 != r10) goto L_0x0390
                    nj3.f0 r12 = new nj3.f0
                    ck3.b r13 = r1.f217222d
                    android.app.Activity r13 = r13.mo91565f()
                    r12.<init>(r13, r8, r9)
                    ck3.b r13 = r1.f217222d
                    android.content.res.Resources r13 = r13.mo91572m()
                    java.lang.String r13 = r13.getString(r6)
                    r12.f224717i = r13
                    r13 = 2131756096(0x7f100440, float:1.914309E38)
                    r12.setIcon((int) r13)
                    r2.add(r12)
                    r2.add(r11)
                    goto L_0x0393
                L_0x0390:
                    r2.add(r11)
                L_0x0393:
                    int r5 = r5 + 1
                    goto L_0x035e
                L_0x0396:
                    r3.clear()
                    r3.addAll(r2)
                    r2.clear()
                L_0x039f:
                    com.tencent.mm.ui.chatting.viewitems.i$e r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    r1.getClass()
                    java.lang.String r1 = r14.mo108768t()
                    boolean r1 = com.tencent.p014mm.storage.C72996z1.m85844o5(r1)
                    if (r1 == 0) goto L_0x03af
                    goto L_0x03f0
                L_0x03af:
                    r1 = 136(0x88, float:1.9E-43)
                    android.view.MenuItem r1 = r7.findItem(r1)
                    if (r1 == 0) goto L_0x03f0
                    int r1 = r14.getType()
                    r2 = 42
                    if (r1 != r2) goto L_0x03eb
                    eb0.c r1 = eb0.C97625j3.m125812b()
                    g62.l r1 = r1.mo105911z()
                    java.lang.String r2 = r14.getContent()
                    com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
                    com.tencent.mm.storage.f4$b r1 = r1.Rv0(r2)
                    java.lang.String r2 = r1.f212675a
                    if (r2 == 0) goto L_0x03db
                    int r2 = r2.length()
                    if (r2 > 0) goto L_0x03e0
                L_0x03db:
                    java.lang.String r2 = "getView : parse possible friend msg failed"
                    com.tencent.p014mm.sdk.platformtools.Log.m105920e(r15, r2)
                L_0x03e0:
                    int r1 = r1.f212691q
                    java.util.Set<java.lang.String> r2 = eb0.C45628s0.f123410p
                    boolean r1 = com.tencent.p014mm.storage.C72996z1.m85810M4(r1)
                    r2 = 1
                    r1 = r1 ^ r2
                    goto L_0x03ec
                L_0x03eb:
                    r1 = 0
                L_0x03ec:
                    if (r1 != 0) goto L_0x03f0
                    r11 = 1
                    goto L_0x03f1
                L_0x03f0:
                    r11 = 0
                L_0x03f1:
                    if (r11 == 0) goto L_0x0448
                    com.tencent.mm.ui.chatting.viewitems.i$e r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    r1.getClass()
                    long r2 = r14.mo108774y2()
                    r4 = 0
                    int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r6 == 0) goto L_0x0448
                    ck3.b r4 = r1.f217222d
                    java.lang.String r4 = r4.mo91577r()
                    java.lang.String r5 = eb0.C75592q0.m90789s()
                    boolean r5 = eb0.C45612m0.m50674A(r4, r5)
                    if (r5 == 0) goto L_0x0448
                    java.lang.Class<kr0.u0> r5 = kr0.C27608u0.class
                    di3.d r5 = di3.C86312j.m106911c(r5)
                    kr0.u0 r5 = (kr0.C27608u0) r5
                    boolean r2 = r5.mo55360XZ(r4, r2)
                    if (r2 == 0) goto L_0x042c
                    r2 = 2131823570(0x7f110bd2, float:1.9279943E38)
                    r3 = 140(0x8c, float:1.96E-43)
                    r4 = 2131755923(0x7f100393, float:1.9142739E38)
                    r6 = 2131755923(0x7f100393, float:1.9142739E38)
                    goto L_0x0437
                L_0x042c:
                    r2 = 2131823569(0x7f110bd1, float:1.9279941E38)
                    r3 = 139(0x8b, float:1.95E-43)
                    r4 = 2131755921(0x7f100391, float:1.9142735E38)
                    r6 = 2131755921(0x7f100391, float:1.9142735E38)
                L_0x0437:
                    r4 = 0
                    ck3.b r1 = r1.f217222d
                    android.content.res.Resources r1 = r1.mo91572m()
                    java.lang.String r5 = r1.getString(r2)
                    r1 = r21
                    r2 = r9
                    r1.mo107136c(r2, r3, r4, r5, r6)
                L_0x0448:
                    bp3.p r1 = bp3.C79758p.f233760a
                    tf3.k r2 = new tf3.k
                    r2.<init>()
                    int r1 = r1.mo109883f(r2)
                    r2 = 1
                    if (r1 != r2) goto L_0x0471
                    r3 = 138(0x8a, float:1.93E-43)
                    r4 = 0
                    com.tencent.mm.ui.chatting.viewitems.i$e r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    ck3.b r1 = r1.f217222d
                    android.content.res.Resources r1 = r1.mo91572m()
                    r8 = 2131821447(0x7f110387, float:1.9275637E38)
                    java.lang.String r5 = r1.getString(r8)
                    r6 = 2131756000(0x7f1003e0, float:1.9142895E38)
                    r1 = r21
                    r2 = r9
                    r1.mo107136c(r2, r3, r4, r5, r6)
                L_0x0471:
                    return
                L_0x0472:
                    r5 = 100
                    r6 = 123(0x7b, float:1.72E-43)
                    r8 = 2131821447(0x7f110387, float:1.9275637E38)
                    boolean r1 = r14.mo100979R3()
                    if (r1 == 0) goto L_0x049b
                    eb0.c r1 = eb0.C97625j3.m125812b()
                    boolean r1 = r1.mo105883I()
                    if (r1 == 0) goto L_0x049b
                    com.tencent.mm.ui.chatting.viewitems.i$e r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    ck3.b r1 = r1.f217222d
                    java.lang.Class<zj3.v0> r2 = zj3.C79386v0.class
                    com.tencent.mm.ui.chatting.manager.a r1 = r1.f193278b
                    xi.d r1 = r1.mo102812a(r2)
                    zj3.v0 r1 = (zj3.C79386v0) r1
                    r1.mo102587P1(r7, r9, r14)
                    goto L_0x04c3
                L_0x049b:
                    boolean r1 = r14.mo101002k4()
                    if (r1 == 0) goto L_0x04c3
                    r3 = 100
                    r4 = 0
                    com.tencent.mm.ui.chatting.viewitems.i$e r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    ck3.b r1 = r1.f217222d
                    android.content.res.Resources r1 = r1.mo91572m()
                    r2 = 2131823546(0x7f110bba, float:1.9279895E38)
                    java.lang.String r10 = r1.getString(r2)
                    r11 = 2131756004(0x7f1003e4, float:1.9142903E38)
                    r1 = r21
                    r2 = r9
                    r12 = 100
                    r5 = r10
                    r10 = 123(0x7b, float:1.72E-43)
                    r6 = r11
                    r1.mo107136c(r2, r3, r4, r5, r6)
                    goto L_0x04c7
                L_0x04c3:
                    r10 = 123(0x7b, float:1.72E-43)
                    r12 = 100
                L_0x04c7:
                    int r1 = r14.getStatus()
                    r2 = 5
                    if (r1 != r2) goto L_0x0506
                    r3 = 103(0x67, float:1.44E-43)
                    r4 = 0
                    com.tencent.mm.ui.chatting.viewitems.i$e r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    ck3.b r1 = r1.f217222d
                    android.content.res.Resources r1 = r1.mo91572m()
                    r2 = 2131823558(0x7f110bc6, float:1.927992E38)
                    java.lang.String r5 = r1.getString(r2)
                    r6 = 2131756144(0x7f100470, float:1.9143187E38)
                    r1 = r21
                    r2 = r9
                    r1.mo107136c(r2, r3, r4, r5, r6)
                    java.lang.Class<gt.l> r1 = p158gt.C76053l.class
                    di3.d r1 = di3.C86312j.m106911c(r1)
                    gt.l r1 = (p158gt.C76053l) r1
                    java.lang.Class<gt.k> r2 = p158gt.C98201k.class
                    di3.d r2 = di3.C86312j.m106911c(r2)
                    gt.k r2 = (p158gt.C98201k) r2
                    gt.m r2 = r2.mo137277xi()
                    com.tencent.mm.modelimage.m r2 = (com.tencent.p014mm.modelimage.C92839m) r2
                    com.tencent.mm.modelimage.k r2 = r2.mo127198uP(r14)
                    r1.mo106262y8(r2)
                L_0x0506:
                    android.view.MenuItem r1 = r7.findItem(r10)
                    if (r1 == 0) goto L_0x050f
                    r7.removeItem(r12)
                L_0x050f:
                    boolean r1 = eb0.C75569c4.m90690w(r14)
                    if (r1 != 0) goto L_0x052a
                    boolean r1 = eb0.C75569c4.m90689v(r14)
                    if (r1 != 0) goto L_0x052a
                    com.tencent.mm.ui.chatting.viewitems.i$e r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    com.tencent.mm.ui.chatting.viewitems.i r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.this
                    boolean r1 = r1.mo82213S()
                    if (r1 == 0) goto L_0x052a
                    com.tencent.mm.ui.chatting.viewitems.i$e r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.m87942a(r1, r7, r14, r9, r13)
                L_0x052a:
                    boolean r1 = eb0.C75569c4.m90690w(r14)
                    if (r1 != 0) goto L_0x0543
                    boolean r1 = eb0.C75569c4.m90689v(r14)
                    if (r1 != 0) goto L_0x0543
                    com.tencent.mm.ui.chatting.viewitems.i$e r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    boolean r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.m87943b(r1, r14)
                    if (r1 == 0) goto L_0x0543
                    com.tencent.mm.ui.chatting.viewitems.i$e r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.m87944c(r1, r7, r14, r9)
                L_0x0543:
                    java.lang.String r1 = r14.mo108768t()
                    boolean r1 = com.tencent.p014mm.storage.C72996z1.m85812O4(r1)
                    if (r1 == 0) goto L_0x0556
                    android.view.MenuItem r1 = r7.findItem(r10)
                    if (r1 == 0) goto L_0x0556
                    r7.removeItem(r10)
                L_0x0556:
                    bp3.p r1 = bp3.C79758p.f233760a
                    tf3.k r2 = new tf3.k
                    r2.<init>()
                    int r1 = r1.mo109883f(r2)
                    r2 = 1
                    if (r1 != r2) goto L_0x057c
                    r3 = 138(0x8a, float:1.93E-43)
                    r4 = 0
                    com.tencent.mm.ui.chatting.viewitems.i$e r1 = com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.this
                    ck3.b r1 = r1.f217222d
                    android.content.res.Resources r1 = r1.mo91572m()
                    java.lang.String r5 = r1.getString(r8)
                    r6 = 2131756000(0x7f1003e0, float:1.9142895E38)
                    r1 = r21
                    r2 = r9
                    r1.mo107136c(r2, r3, r4, r5, r6)
                L_0x057c:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.C74029b.mo71744a(nj3.e0, android.view.View, android.view.ContextMenu$ContextMenuInfo):void");
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.i$e$c */
        public class C74030c implements View.OnTouchListener {
            public C74030c() {
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                arrayList.add(motionEvent);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItem$LongClickListener$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
                C74027e.this.f217225g = (int) motionEvent.getRawX();
                C74027e.this.f217226h = (int) motionEvent.getRawY();
                C74027e.this.f217227i = view;
                C117292a.m165362h(false, this, "com/tencent/mm/ui/chatting/viewitems/ChattingItem$LongClickListener$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
                return false;
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.i$e$d */
        public class C74031d implements C11183n0 {

            /* renamed from: a */
            public final /* synthetic */ C72963f4 f217240a;

            public C74031d(C72963f4 f4Var) {
                this.f217240a = f4Var;
            }

            /* renamed from: a */
            public void mo2585a(View view, int i, MenuItem menuItem) {
                int itemId = menuItem.getItemId();
                if (itemId == 140 || itemId == 139) {
                    C72963f4 f4Var = this.f217240a;
                    C67391b bVar = C74027e.this.f217222d;
                    C87412m.m108594g(view, "menuView");
                    if (f4Var != null && bVar != null) {
                        Map<String, Object> v3 = ((C67067f) bVar.f193278b.mo102812a(C67067f.class)).mo91073v3(f4Var);
                        String str = itemId != 139 ? itemId != 140 ? "" : "group_msg_set_top_bubble_remove" : "group_msg_set_top_bubble_set";
                        if (!C112551y.m153811k(str) && v3 != null) {
                            C61212e eVar = (C61212e) C86312j.m106911c(C61212e.class);
                            eVar.o30(view, str);
                            eVar.mo86175pO(view, 40, 26356);
                            eVar.mo86149PM(view, v3);
                        }
                    }
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.i$e$e */
        public class C74032e implements C11184p0 {
            public C74032e(C74027e eVar) {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                int itemId = menuItem.getItemId();
                if (itemId == 108 || itemId == 107 || itemId == 110 || itemId == 111 || itemId == 113 || itemId == 142 || itemId == 2) {
                    Log.m105924i("MicroMsg.ChattingItem", "IMsgTracerService setScene Retr_ChatItem_LongClick");
                    ((C77032h) C86312j.m106911c(C77032h.class)).setScene(4);
                }
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.i$e$f */
        public class C74033f implements PopupWindow.OnDismissListener {

            /* renamed from: d */
            public C74243t8 f217242d;

            public C74033f() {
            }

            public void onDismiss() {
                int i;
                C72963f4 f4Var;
                C72963f4 f4Var2;
                C78950d.C78963m mVar;
                ((C66282i) C74027e.this.f217222d.f193278b.mo102812a(C66282i.class)).mo90406z0(C74027e.this.f217233r);
                Log.m105918d("MicroMsg.ChattingItem", "chattingItemlongclick observer unregister");
                Object obj = C74027e.this.f217234s;
                if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue() && C78844a.C15689b.f42385a.mo108842h(true) && (mVar = C74027e.this.f217229n) != null) {
                    mVar.mo103116a();
                }
                C74243t8 t8Var = this.f217242d;
                int i2 = 0;
                if (t8Var == null || (f4Var2 = t8Var.f212238a) == null || !f4Var2.mo101020w3()) {
                    i = 0;
                } else {
                    C68070l.C68072b u = C68070l.C68072b.m80422u(this.f217242d.f212238a.getContent(), this.f217242d.f212238a.mo108775z2());
                    if (u != null) {
                        i2 = u.f195582i;
                    }
                    i = i2;
                }
                C74243t8 t8Var2 = this.f217242d;
                if (t8Var2 == null || (f4Var = t8Var2.f212238a) == null || f4Var.getType() != 1107296305) {
                    C74027e eVar = C74027e.this;
                    C74023i.m87880V(eVar.f217228j, eVar.f217222d, eVar.f217231p, eVar.f217230o, eVar.f217232q, i);
                } else {
                    C74027e eVar2 = C74027e.this;
                    C74023i.m87880V(eVar2.f217228j, eVar2.f217222d, eVar2.f217231p, eVar2.f217230o, 49, 87);
                }
                C74027e eVar3 = C74027e.this;
                eVar3.f217231p = -1;
                eVar3.f217230o = -1;
                eVar3.f217232q = -1;
                eVar3.f217222d.mo91545F(true);
            }
        }

        /* renamed from: com.tencent.mm.ui.chatting.viewitems.i$e$g */
        public class C74034g implements C11184p0 {

            /* renamed from: d */
            public C74243t8 f217244d;

            public C74034g() {
            }

            public void onMMMenuItemSelected(MenuItem menuItem, int i) {
                C74243t8 t8Var = this.f217244d;
                if (t8Var == null) {
                    Log.m105920e("MicroMsg.ChattingItem", "context item select failed, null dataTag");
                    return;
                }
                C74027e eVar = C74027e.this;
                C74023i iVar = C74023i.this;
                if ((iVar instanceof C74059i7.C74060a) || (iVar instanceof C74059i7.C74061b) || (iVar instanceof C19762b4)) {
                    iVar.mo26234Y(menuItem, eVar.f217222d, t8Var);
                } else {
                    iVar.mo26233X(menuItem, eVar.f217222d, t8Var.f212238a);
                }
                ((C79361h0) C74027e.this.f217222d.f193278b.mo102812a(C79361h0.class)).mo102469t(menuItem, i, C74023i.this);
                C74027e.this.f217230o = menuItem.getItemId();
                C74027e eVar2 = C74027e.this;
                eVar2.f217231p = i;
                C78950d.C78963m mVar = eVar2.f217229n;
                if (mVar != null) {
                    mVar.mo103116a();
                }
            }
        }

        public C74027e(C67391b bVar) {
            this.f217222d = bVar;
            this.f217223e = new C74029b(C74023i.this);
            this.f217224f = new C74034g();
        }

        /* renamed from: a */
        public static void m87942a(C74027e eVar, C76874e0 e0Var, C72963f4 f4Var, int i, boolean z) {
            C68070l.C68072b u;
            int i2;
            C74027e eVar2 = eVar;
            C76874e0 e0Var2 = e0Var;
            int i3 = i;
            if (C72996z1.m85804J4(eVar2.f217222d.mo91577r()) || f4Var.mo100967F3() || C72996z1.m85846q5(eVar2.f217222d.mo91577r()) || !(e0Var2 instanceof C76874e0) || f4Var.getType() == 318767153) {
                return;
            }
            if (f4Var.getType() != 49 || ((u = C68070l.C68072b.m80422u(f4Var.getContent(), f4Var.mo108775z2())) != null && (i2 = u.f195582i) != 6 && i2 != 38 && i2 != 39)) {
                boolean z2 = true;
                boolean z3 = (e0Var2.findItem(116) == null && e0Var2.findItem(TPOptionalID.f349338xc9bdf6cd) == null) ? false : true;
                if (e0Var2.findItem(100) == null) {
                    z2 = false;
                }
                LinkedList linkedList = new LinkedList();
                ArrayList arrayList = (ArrayList) e0Var2.f224704d;
                Iterator it = arrayList.iterator();
                if ((z3 || z2) && ((f4Var.getType() != 34 || z) && f4Var.getType() != 3)) {
                    while (it.hasNext()) {
                        MenuItem menuItem = (MenuItem) it.next();
                        if (menuItem.getItemId() == 116) {
                            C76875f0 f0Var = new C76875f0(eVar2.f217222d.mo91565f(), 134, i3);
                            f0Var.f224717i = eVar2.f217222d.mo91572m().getString(C0966R.string.b_o);
                            f0Var.setIcon((int) C0966R.raw.icons_filled_bell_ring_on);
                            linkedList.add(menuItem);
                            linkedList.add(f0Var);
                        } else if (!z2 || z3 || menuItem.getItemId() != 100) {
                            linkedList.add(menuItem);
                        } else {
                            C76875f0 f0Var2 = new C76875f0(eVar2.f217222d.mo91565f(), 134, i3);
                            f0Var2.f224717i = eVar2.f217222d.mo91572m().getString(C0966R.string.b_o);
                            f0Var2.setIcon((int) C0966R.raw.icons_filled_bell_ring_on);
                            linkedList.add(f0Var2);
                            linkedList.add(menuItem);
                        }
                    }
                    arrayList.clear();
                    arrayList.addAll(linkedList);
                    linkedList.clear();
                    return;
                }
                e0Var.mo107136c(i, 134, 0, eVar2.f217222d.mo91565f().getString(C0966R.string.b_o), C0966R.raw.icons_filled_bell_ring_on);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0060, code lost:
            if (r8 != 6) goto L_0x008b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0072, code lost:
            if (r8 != false) goto L_0x0089;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x0082, code lost:
            if (((h81.C32735h) di3.C86312j.m106911c(r1)).mo58779Qe(r0, 0) != 1) goto L_0x0086;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0084, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0086, code lost:
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:0x0087, code lost:
            if (r0 == false) goto L_0x008c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0089, code lost:
            r8 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x008b, code lost:
            r8 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x008c, code lost:
            if (r8 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0094, code lost:
            if (r9.getType() != 47) goto L_0x00b3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x00b0, code lost:
            if (((i61.C98602h) ((z51.C39315g) di3.C86312j.m106911c(z51.C39315g.class)).mo58035cm()).mo137999G(r9.mo108765s2()).mo62637I0() == false) goto L_0x00b3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x00b3, code lost:
            return true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
            return false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
            return false;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static boolean m87943b(com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e r8, com.tencent.p014mm.storage.C72963f4 r9) {
            /*
                h81.h$c r0 = h81.C32735h.C32737c.clicfg_android_msg_quote_third_stage_switch
                java.lang.Class<h81.h> r1 = h81.C32735h.class
                ck3.b r8 = r8.f217222d
                com.tencent.mm.storage.z1 r8 = r8.mo91574o()
                boolean r8 = r8.mo62916m3()
                r2 = 0
                r3 = 1
                if (r8 != 0) goto L_0x00b4
                long r4 = r9.mo108774y2()
                r6 = 0
                int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r8 == 0) goto L_0x00b4
                int r8 = w72.C78521a.f230007a
                int r8 = r9.getType()
                switch(r8) {
                    case 1: goto L_0x0077;
                    case 3: goto L_0x0077;
                    case 11: goto L_0x0077;
                    case 13: goto L_0x0077;
                    case 21: goto L_0x0077;
                    case 23: goto L_0x0077;
                    case 31: goto L_0x0077;
                    case 33: goto L_0x0077;
                    case 34: goto L_0x0075;
                    case 36: goto L_0x0077;
                    case 39: goto L_0x0077;
                    case 42: goto L_0x0075;
                    case 43: goto L_0x0077;
                    case 44: goto L_0x0077;
                    case 47: goto L_0x0089;
                    case 48: goto L_0x0077;
                    case 49: goto L_0x0027;
                    case 62: goto L_0x0077;
                    case 66: goto L_0x0075;
                    case 1048625: goto L_0x0075;
                    case 268435505: goto L_0x0077;
                    case 301989937: goto L_0x0077;
                    case 754974769: goto L_0x0075;
                    case 771751985: goto L_0x0075;
                    case 805306417: goto L_0x0077;
                    case 822083633: goto L_0x0077;
                    case 855638065: goto L_0x0075;
                    case 939524145: goto L_0x0075;
                    case 973078577: goto L_0x0075;
                    case 974127153: goto L_0x0075;
                    case 975175729: goto L_0x0075;
                    case 976224305: goto L_0x0075;
                    case 1040187441: goto L_0x0077;
                    case 1090519089: goto L_0x0089;
                    case 1107296305: goto L_0x0077;
                    default: goto L_0x0025;
                }
            L_0x0025:
                goto L_0x008b
            L_0x0027:
                java.lang.String r8 = r9.getContent()
                r4 = 0
                com.tencent.mm.message.l$b r8 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r8, r4)
                if (r8 == 0) goto L_0x008b
                int r8 = r8.f195582i
                if (r8 == r3) goto L_0x0089
                r4 = 19
                if (r8 == r4) goto L_0x0063
                r0 = 24
                if (r8 == r0) goto L_0x0089
                r0 = 33
                if (r8 == r0) goto L_0x0089
                r0 = 36
                if (r8 == r0) goto L_0x0089
                r0 = 44
                if (r8 == r0) goto L_0x0089
                r0 = 48
                if (r8 == r0) goto L_0x0089
                r0 = 53
                if (r8 == r0) goto L_0x0089
                r0 = 98
                if (r8 == r0) goto L_0x0089
                r0 = 3
                if (r8 == r0) goto L_0x0089
                r0 = 4
                if (r8 == r0) goto L_0x0089
                r0 = 5
                if (r8 == r0) goto L_0x0089
                r0 = 6
                if (r8 == r0) goto L_0x0089
                goto L_0x008b
            L_0x0063:
                di3.d r8 = di3.C86312j.m106911c(r1)
                h81.h r8 = (h81.C32735h) r8
                int r8 = r8.mo58779Qe(r0, r2)
                if (r8 != r3) goto L_0x0071
                r8 = 1
                goto L_0x0072
            L_0x0071:
                r8 = 0
            L_0x0072:
                if (r8 == 0) goto L_0x008b
                goto L_0x0089
            L_0x0075:
                r8 = 0
                goto L_0x0078
            L_0x0077:
                r8 = 1
            L_0x0078:
                di3.d r1 = di3.C86312j.m106911c(r1)
                h81.h r1 = (h81.C32735h) r1
                int r0 = r1.mo58779Qe(r0, r2)
                if (r0 != r3) goto L_0x0086
                r0 = 1
                goto L_0x0087
            L_0x0086:
                r0 = 0
            L_0x0087:
                if (r0 == 0) goto L_0x008c
            L_0x0089:
                r8 = 1
                goto L_0x008c
            L_0x008b:
                r8 = 0
            L_0x008c:
                if (r8 == 0) goto L_0x00b4
                int r8 = r9.getType()
                r0 = 47
                if (r8 != r0) goto L_0x00b3
                java.lang.Class<z51.g> r8 = z51.C39315g.class
                di3.d r8 = di3.C86312j.m106911c(r8)
                z51.g r8 = (z51.C39315g) r8
                zc3.a r8 = r8.mo58035cm()
                java.lang.String r9 = r9.mo108765s2()
                i61.h r8 = (i61.C98602h) r8
                com.tencent.mm.storage.emotion.EmojiInfo r8 = r8.mo137999G(r9)
                boolean r8 = r8.mo62637I0()
                if (r8 == 0) goto L_0x00b3
                goto L_0x00b4
            L_0x00b3:
                r2 = 1
            L_0x00b4:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74027e.m87943b(com.tencent.mm.ui.chatting.viewitems.i$e, com.tencent.mm.storage.f4):boolean");
        }

        /* renamed from: c */
        public static void m87944c(C74027e eVar, C76874e0 e0Var, C72963f4 f4Var, int i) {
            C68070l.C68072b u;
            C74027e eVar2 = eVar;
            C76874e0 e0Var2 = e0Var;
            int i2 = i;
            if (C72996z1.m85846q5(eVar2.f217222d.mo91577r()) || !(e0Var2 instanceof C76874e0)) {
                return;
            }
            if (!f4Var.mo101023z3() || (u = C68070l.C68072b.m80422u(C75604z3.m90840l(eVar2.f217222d.mo91583x(), f4Var.getContent(), f4Var.mo108769t2()), (String) null)) == null || u.f195582i != 74) {
                boolean z = true;
                boolean z2 = (e0Var.findItem(116) == null && e0Var.findItem(TPOptionalID.f349338xc9bdf6cd) == null) ? false : true;
                if (e0Var.findItem(134) == null) {
                    z = false;
                }
                LinkedList linkedList = new LinkedList();
                ArrayList arrayList = (ArrayList) e0Var2.f224704d;
                Iterator it = arrayList.iterator();
                if (!z2 && !z) {
                    e0Var.mo107136c(i, 136, 0, eVar2.f217222d.mo91565f().getString(C0966R.string.b_6), C0966R.raw.icons_filled_quote);
                } else if (!f4Var.mo100979R3() || !C72996z1.m85843n5(eVar2.f217222d.mo91577r())) {
                    while (it.hasNext()) {
                        MenuItem menuItem = (MenuItem) it.next();
                        if (menuItem.getItemId() == 116 && f4Var.getType() != 3) {
                            C76875f0 f0Var = new C76875f0(eVar2.f217222d.mo91565f(), 136, i2);
                            f0Var.f224717i = eVar2.f217222d.mo91572m().getString(C0966R.string.b_6);
                            f0Var.setIcon((int) C0966R.raw.icons_filled_quote);
                            linkedList.add(menuItem);
                            linkedList.add(f0Var);
                        } else if ((!z2 || f4Var.getType() == 3) && menuItem.getItemId() == 134) {
                            C76875f0 f0Var2 = new C76875f0(eVar2.f217222d.mo91565f(), 136, i2);
                            f0Var2.f224717i = eVar2.f217222d.mo91572m().getString(C0966R.string.b_6);
                            f0Var2.setIcon((int) C0966R.raw.icons_filled_quote);
                            linkedList.add(f0Var2);
                            linkedList.add(menuItem);
                        } else {
                            linkedList.add(menuItem);
                        }
                    }
                    arrayList.clear();
                    arrayList.addAll(linkedList);
                    linkedList.clear();
                } else {
                    e0Var.mo107136c(i, 136, 0, eVar2.f217222d.mo91565f().getString(C0966R.string.b_6), C0966R.raw.icons_filled_quote);
                }
            }
        }

        /* renamed from: d */
        public static void m87945d(C74027e eVar, C76874e0 e0Var, C72963f4 f4Var, int i) {
            eVar.getClass();
            if (e0Var instanceof C76874e0) {
                LinkedList linkedList = new LinkedList();
                ArrayList arrayList = (ArrayList) e0Var.f224704d;
                Iterator it = arrayList.iterator();
                if (arrayList.size() <= 3) {
                    e0Var.mo107136c(i, 100, 0, eVar.f217222d.mo91565f().getString(C0966R.string.b_1), C0966R.raw.icons_filled_delete);
                    return;
                }
                int i2 = 0;
                while (it.hasNext()) {
                    MenuItem menuItem = (MenuItem) it.next();
                    if (i2 == 3) {
                        C76875f0 f0Var = new C76875f0(eVar.f217222d.mo91565f(), 100, i);
                        f0Var.f224717i = eVar.f217222d.mo91572m().getString(C0966R.string.b_1);
                        f0Var.setIcon((int) C0966R.raw.icons_filled_delete);
                        linkedList.add(f0Var);
                        linkedList.add(menuItem);
                    } else {
                        linkedList.add(menuItem);
                    }
                    i2++;
                }
                arrayList.clear();
                arrayList.addAll(linkedList);
                linkedList.clear();
            }
        }

        /* renamed from: e */
        public void mo103112e(View view, int i, int i2) {
            C78950d.C78963m mVar;
            View view2 = view;
            C74243t8 t8Var = (C74243t8) view.getTag();
            if (t8Var == null) {
                Log.m105928w("MicroMsg.ChattingItem", "open menu but tag is null");
                return;
            }
            this.f217224f.f217244d = t8Var;
            C78253a aVar = this.f217228j;
            if (aVar != null) {
                aVar.mo108266a();
                this.f217228j = null;
            }
            C78253a aVar2 = new C78253a(this.f217222d.mo91565f());
            this.f217228j = aVar2;
            aVar2.f229257z = true;
            Object tag = view2.getTag(C0966R.C0970id.ke5);
            this.f217234s = tag;
            if ((tag instanceof Boolean) && ((Boolean) tag).booleanValue()) {
                if (C78844a.C15689b.f42385a.mo108842h(true)) {
                    C78253a aVar3 = this.f217228j;
                    aVar3.f229236L = true;
                    aVar3.f229230F = true;
                } else {
                    C78253a aVar4 = this.f217228j;
                    aVar4.f229236L = false;
                    aVar4.f229230F = false;
                }
                this.f217228j.f229237M = true;
            }
            PopupWindow.OnDismissListener onDismissListener = this.f217235t;
            if (onDismissListener instanceof C74033f) {
                ((C74033f) onDismissListener).f217242d = t8Var;
            }
            this.f217228j.f229227C = onDismissListener;
            if ((t8Var instanceof ChattingItemTranslate.C73916c) && 2 == ((ChattingItemTranslate.C73916c) t8Var).f216964T && (mVar = this.f217229n) != null) {
                mVar.mo103116a();
            }
            int[] iArr = new int[2];
            view2.getLocationInWindow(iArr);
            C72963f4 f4Var = t8Var.f212238a;
            if (f4Var.mo100987Z3() || f4Var.mo100963C3() || f4Var.mo100993e4()) {
                String content = C72996z1.m85820U5(f4Var.mo108768t()) ? f4Var.mo108769t2() == 1 ? f4Var.getContent() : C75604z3.m90846r(f4Var.getContent()) : f4Var.getContent();
                if (f4Var.mo100963C3() || f4Var.mo100987Z3()) {
                    C68070l.C68072b u = C68070l.C68072b.m80422u(content, (String) null);
                    content = u != null ? u.f195570f : "";
                }
                String str = content;
                if (!Util.isNullOrNil(str)) {
                    String Lp0 = ((C78732i) C86312j.m106911c(C78732i.class)).Lp0(str);
                    if (!Util.isNullOrNil(Lp0)) {
                        C74023i iVar = C74023i.this;
                        C78253a aVar5 = this.f217228j;
                        C67391b bVar = this.f217222d;
                        iVar.getClass();
                        aVar5.f229235K = new C74070j(iVar, bVar, Lp0);
                    }
                    if (Util.isNullOrNil(Lp0)) {
                        this.f217228j.f229235K = null;
                    }
                    C74023i.this.mo103071D(this.f217222d, f4Var, 1, !Util.isNullOrNil(Lp0), str, false, "34_" + C31543z5.m39453c(), 1);
                } else {
                    return;
                }
            }
            int width = ((int) (((float) view.getWidth()) / 2.0f)) + iArr[0];
            int i3 = iArr[1];
            C78253a aVar6 = this.f217228j;
            aVar6.f229250s = new C74031d(f4Var);
            aVar6.mo108271f(view, this.f217223e, this.f217224f, width, i3);
            this.f217228j.f229252u = new C74032e(this);
            C67391b bVar2 = this.f217222d;
            if (bVar2 != null) {
                bVar2.mo91545F(false);
                this.f217222d.mo91551L(false);
                this.f217222d.f193296t = false;
            }
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/chatting/viewitems/ChattingItem$LongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            if (view.getTag(C0966R.C0970id.f359414kt0) instanceof int[]) {
                int[] iArr = (int[]) view.getTag(C0966R.C0970id.f359414kt0);
                mo103112e(view, iArr[0], iArr[1]);
            } else if (!(this.f217225g == 0 && this.f217226h == 0) && this.f217227i.equals(view)) {
                mo103112e(view, this.f217225g, this.f217226h);
            } else {
                view.setOnTouchListener(new C74030c());
            }
            C117292a.m165362h(true, this, "com/tencent/mm/ui/chatting/viewitems/ChattingItem$LongClickListener", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.i$f */
    public static class C74035f extends C73684f2 {

        /* renamed from: f */
        public C74023i f217246f;

        public C74035f(C67391b bVar, C74023i iVar) {
            super(bVar);
            this.f217246f = iVar;
        }

        /* renamed from: a */
        public void mo57756a(View view, C67391b bVar, C72963f4 f4Var) {
            this.f217246f.mo26236a0(view, bVar, f4Var);
        }
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.i$g */
    public static class C74036g extends C78950d.C78963m {

        /* renamed from: a */
        public C74027e f217247a;

        public C74036g(C74027e eVar) {
            this.f217247a = eVar;
        }

        /* renamed from: a */
        public void mo103116a() {
            C74027e eVar = this.f217247a;
            C78253a aVar = eVar.f217228j;
            if (aVar != null && aVar.mo108266a()) {
                eVar.f217228j = null;
            }
        }

        /* renamed from: b */
        public void mo103117b() {
            C67391b bVar = this.f217247a.f217222d;
            if (bVar != null) {
                bVar.mo91545F(false);
            }
        }

        /* renamed from: c */
        public void mo103118c(View view) {
            this.f217247a.onLongClick(view);
        }

        /* renamed from: d */
        public void mo103119d() {
            C67391b bVar = this.f217247a.f217222d;
            if (bVar != null) {
                bVar.mo91551L(true);
            }
        }

        /* renamed from: e */
        public void mo103120e() {
            C67391b bVar = this.f217247a.f217222d;
            if (bVar != null) {
                bVar.mo91551L(false);
            }
        }

        /* renamed from: f */
        public void mo103121f(View view) {
            this.f217247a.mo103112e(view, 0, 0);
        }
    }

    /* renamed from: T */
    public static boolean m87878T() {
        String c = ((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("ShowSendOK");
        return 1 == (Util.isNullOrNil(c) ? 0 : Util.safeParseInt(c));
    }

    /* renamed from: U */
    public static void m87879U(C78253a aVar, C67391b bVar, int i, int i2, int i3) {
        m87880V(aVar, bVar, i, i2, i3, 0);
    }

    /* renamed from: V */
    public static void m87880V(C78253a aVar, C67391b bVar, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i;
        long currentTimeMillis = System.currentTimeMillis() - aVar.f229234J;
        if (currentTimeMillis > 60000) {
            currentTimeMillis = 60000;
        }
        if (i9 == -1) {
            C115669n nVar = C115669n.INSTANCE;
            Object[] objArr = new Object[10];
            objArr[0] = bVar.mo91577r();
            objArr[1] = Integer.valueOf(m87888r(bVar.mo91577r()));
            objArr[2] = Long.valueOf(currentTimeMillis);
            objArr[3] = Integer.valueOf(m87889s(i2));
            objArr[4] = Integer.valueOf(m87887q(i));
            if (i9 == -1) {
                i8 = 0;
            } else {
                i8 = i9 + 1;
                if (i8 > 5) {
                    i8 %= 5;
                }
            }
            objArr[5] = Integer.valueOf(i8);
            objArr[6] = 1;
            objArr[7] = Integer.valueOf(i3);
            objArr[8] = Integer.valueOf(i4);
            objArr[9] = 0;
            i5 = 20416;
            nVar.mo160131h(20416, objArr);
        } else {
            C115669n nVar2 = C115669n.INSTANCE;
            Object[] objArr2 = new Object[10];
            objArr2[0] = bVar.mo91577r();
            objArr2[1] = Integer.valueOf(m87888r(bVar.mo91577r()));
            objArr2[2] = Long.valueOf(currentTimeMillis);
            objArr2[3] = Integer.valueOf(m87889s(i2));
            objArr2[4] = Integer.valueOf(m87887q(i));
            if (i9 == -1) {
                i7 = 0;
            } else {
                i7 = i9 + 1;
                if (i7 > 5) {
                    i7 %= 5;
                }
            }
            objArr2[5] = Integer.valueOf(i7);
            objArr2[6] = 1;
            objArr2[7] = Integer.valueOf(i3);
            objArr2[8] = Integer.valueOf(i4);
            objArr2[9] = 0;
            i5 = 20416;
            nVar2.mo160131h(20416, objArr2);
        }
        Object[] objArr3 = new Object[11];
        objArr3[0] = Integer.valueOf(i5);
        objArr3[1] = bVar.mo91577r();
        objArr3[2] = Integer.valueOf(m87888r(bVar.mo91577r()));
        objArr3[3] = Long.valueOf(currentTimeMillis);
        objArr3[4] = Integer.valueOf(m87889s(i2));
        objArr3[5] = Integer.valueOf(m87887q(i));
        if (i9 == -1) {
            i6 = 0;
        } else {
            i6 = i9 + 1;
            if (i6 > 5) {
                i6 %= 5;
            }
        }
        objArr3[6] = Integer.valueOf(i6);
        objArr3[7] = 1;
        objArr3[8] = Integer.valueOf(i3);
        objArr3[9] = Integer.valueOf(i4);
        objArr3[10] = 0;
        Log.m105925i("MicroMsg.ChattingItem", "longClick menu report kvReport logID:%s, chatName:%s, chatType:%s, timeInterval:%s, itemType:%s, btnloc:%s, locSqe:%s, logVersion:%s, msgType:%s, subMsgType:%s, busiType:%s ", objArr3);
    }

    /* renamed from: c */
    public static void m87881c(Intent intent, String str) {
        if (intent != null && C72996z1.m85826X5(str)) {
            intent.putExtra(C74928u.C45093i.f122326r, true);
        }
    }

    /* renamed from: c0 */
    public static void m87882c0(C67391b bVar, C72963f4 f4Var) {
        if (bVar != null && f4Var != null) {
            long y4 = ((C79348e) bVar.f193278b.mo102812a(C79348e.class)).mo70080y4();
            C77495c cVar = C77495c.f225960a;
            if (f4Var.mo108769t2() != 1) {
                ((C119157j) C119157j.f356862d).mo183870a(new C77497d(f4Var, y4));
            }
        }
    }

    /* renamed from: d0 */
    public static void m87883d0(ImageView imageView, String str) {
        if (Util.isNullOrNil(str)) {
            imageView.setImageResource(C0966R.C0969drawable.bfa);
        } else {
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(imageView, str);
        }
    }

    /* renamed from: j0 */
    public static void m87884j0(C74026c cVar, boolean z, boolean z2) {
        C74023i iVar = cVar.chattingItem;
        if (iVar != null) {
            iVar.mo103093i0(cVar, z, z2);
            return;
        }
        ProgressBar progressBar = cVar.uploadingPB;
        if (progressBar != null) {
            if (z) {
                progressBar.setVisibility(0);
            } else {
                progressBar.setVisibility(8);
            }
        }
    }

    /* renamed from: l */
    public static int m87885l(Context context) {
        float p = C76577a.m92165p(context);
        return p == C76577a.m92173x(context) ? C76577a.m92155f(context, C0966R.dimen.f4287yr) : p == C76577a.m92171v(context) ? C76577a.m92155f(context, C0966R.dimen.f4279yi) : p == C76577a.m92174y(context) ? C76577a.m92155f(context, C0966R.dimen.f4288ys) : p == C76577a.m92167r(context) ? C76577a.m92155f(context, C0966R.dimen.f4265y1) : (p == C76577a.m92168s(context) || p == C76577a.m92169t(context) || p == C76577a.m92170u(context)) ? C76577a.m92155f(context, C0966R.dimen.f4266y2) : C76577a.m92155f(context, C0966R.dimen.f4284yo);
    }

    /* renamed from: m */
    public static int m87886m(Context context) {
        float p = C76577a.m92165p(context);
        return p == C76577a.m92173x(context) ? C76577a.m92155f(context, C0966R.dimen.f4263xz) : p == C76577a.m92171v(context) ? C76577a.m92155f(context, C0966R.dimen.f4263xz) : p == C76577a.m92174y(context) ? C76577a.m92155f(context, C0966R.dimen.f4264y0) : p == C76577a.m92167r(context) ? C76577a.m92155f(context, C0966R.dimen.f4262xy) : (p == C76577a.m92168s(context) || p == C76577a.m92169t(context) || p == C76577a.m92170u(context)) ? C76577a.m92155f(context, C0966R.dimen.f4266y2) : C76577a.m92155f(context, C0966R.dimen.f4263xz);
    }

    /* renamed from: q */
    public static int m87887q(int i) {
        if (i == -1) {
            return 0;
        }
        return ((int) Math.ceil((double) (((float) (i + 1)) / 5.0f))) + 10;
    }

    /* renamed from: r */
    public static int m87888r(String str) {
        if (C72996z1.m85820U5(str)) {
            return 2;
        }
        return C45628s0.m50738C(str) ? 3 : 1;
    }

    /* renamed from: s */
    public static int m87889s(int i) {
        if (i == -1) {
            return 0;
        }
        if (i != 0) {
            if (i == 1) {
                return 18;
            }
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 100) {
                            return 4;
                        }
                        if (i == 119) {
                            return 15;
                        }
                        if (i == 120) {
                            return 19;
                        }
                        if (i == 121) {
                            return 16;
                        }
                        if (i == 122) {
                            return 5;
                        }
                        if (i == 123) {
                            return 8;
                        }
                        if (i == 124) {
                            return 9;
                        }
                        if (!(i == 107 || i == 108)) {
                            if (i == 115) {
                                return 12;
                            }
                            if (i != 116) {
                                if (i == 150) {
                                    return 20;
                                }
                                if (i == 151) {
                                    return 17;
                                }
                                switch (i) {
                                    case 102:
                                        break;
                                    case 103:
                                        return 23;
                                    case 104:
                                        return 11;
                                    default:
                                        switch (i) {
                                            case 110:
                                            case 111:
                                            case 113:
                                                break;
                                            case 112:
                                                break;
                                            default:
                                                switch (i) {
                                                    case 128:
                                                        return 14;
                                                    case 129:
                                                        return 21;
                                                    case 130:
                                                        return 10;
                                                    default:
                                                        switch (i) {
                                                            case 134:
                                                                return 7;
                                                            case 135:
                                                                return 13;
                                                            case 136:
                                                                return 6;
                                                            case 137:
                                                                break;
                                                            default:
                                                                switch (i) {
                                                                    case 141:
                                                                        break;
                                                                    case TPOptionalID.OPTION_ID_BEFORE_LONG_SEEK_AV_PTS_ALIGN_MAX_THRESHOLD_MS /*142*/:
                                                                        break;
                                                                    case TPOptionalID.f349338xc9bdf6cd /*143*/:
                                                                        break;
                                                                    default:
                                                                        return 0;
                                                                }
                                                        }
                                                }
                                        }
                                }
                            }
                        }
                    }
                    return 22;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    /* renamed from: t */
    public static String m87890t(C72963f4 f4Var, boolean z, boolean z2) {
        String str = null;
        if (f4Var == null) {
            return null;
        }
        if (f4Var.mo108769t2() == 1) {
            return C75592q0.m90789s();
        }
        if (z) {
            str = C75604z3.m90847s(f4Var.getContent());
        } else if (z2) {
            str = f4Var.mo108760m2();
        }
        return Util.isNullOrNil(str) ? f4Var.mo108768t() : str;
    }

    /* renamed from: A */
    public boolean mo103069A(C67391b bVar, C68070l.C68072b bVar2, C72963f4 f4Var) {
        if (Util.isNullOrNil(bVar2.f195541W1)) {
            return false;
        }
        C73304a.m86445a(C73304a.C73305a.EnterCompleteVideo, f4Var, bVar2.f195565d2, bVar2.f195561c2);
        String s2 = f4Var.mo108765s2();
        Intent intent = new Intent();
        intent.putExtra("KFromTimeLine", false);
        intent.putExtra("KStremVideoUrl", bVar2.f195541W1);
        intent.putExtra("KThumUrl", bVar2.f195557b2);
        intent.putExtra("KThumbPath", s2);
        intent.putExtra("KSta_StremVideoAduxInfo", bVar2.f195561c2);
        intent.putExtra("KSta_StremVideoPublishId", bVar2.f195565d2);
        intent.putExtra("KSta_SourceType", 2);
        intent.putExtra("KSta_Scene", bVar.mo91583x() ? 4 : 3);
        intent.putExtra("KSta_FromUserName", mo103068y(bVar, f4Var));
        intent.putExtra("KSta_ChatName", bVar.mo91577r());
        intent.putExtra("KSta_MsgId", f4Var.mo108774y2());
        intent.putExtra("KSta_SnsStatExtStr", bVar2.f195535U1);
        if (bVar.mo91583x()) {
            intent.putExtra("KSta_ChatroomMembercount", ((C53193b) C86312j.m106911c(C53193b.class)).mo73729p1(bVar.mo91577r()));
        }
        intent.putExtra("KMediaId", "fakeid_" + f4Var.getMsgId());
        intent.putExtra("KMediaVideoTime", bVar2.f195544X1);
        intent.putExtra("StremWebUrl", bVar2.f195553a2);
        intent.putExtra("StreamWording", bVar2.f195550Z1);
        intent.putExtra("KMediaTitle", bVar2.f195570f);
        if (((C32735h) C86312j.m106911c(C32735h.class)).mo58779Qe(C32735h.C32737c.clicfg_ad_landing_page_new_stream_video, 1) > 0) {
            C88144b.m109791i(bVar.mo91565f(), "sns", ".ui.SnsAdStreamVideoPlayUI", intent, (Bundle) null);
            Log.m105924i("MicroMsg.ChattingItem", "use new stream video play UI");
        } else {
            C88144b.m109791i(bVar.mo91565f(), "sns", ".ui.VideoAdPlayerUI", intent, (Bundle) null);
        }
        return true;
    }

    /* renamed from: B */
    public void mo103070B(C67391b bVar, String str, String str2, String str3, int i, String str4, boolean z, long j, long j2, C72963f4 f4Var, C68070l.C68072b bVar2) {
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            Log.m105920e("MicroMsg.ChattingItem", "url, lowUrl both are empty");
            return;
        }
        if (!NetStatusUtil.isMobile(bVar.mo91565f()) ? str == null || str.length() <= 0 : str2 != null && str2.length() > 0) {
            str = str2;
        }
        Intent intent = new Intent();
        intent.putExtra("msg_id", j);
        intent.putExtra("rawUrl", str);
        intent.putExtra("version_name", str3);
        intent.putExtra("version_code", i);
        intent.putExtra("usePlugin", z);
        intent.putExtra("geta8key_username", bVar.mo91577r());
        intent.putExtra("KPublisherId", "msg_" + Long.toString(j2));
        intent.putExtra("KAppId", str4);
        intent.putExtra("pre_username", mo103068y(bVar, f4Var));
        intent.putExtra("msgUsername", mo103068y(bVar, f4Var));
        intent.putExtra("serverMsgID", Long.toString(j2));
        intent.putExtra("geta8key_scene", 1);
        intent.putExtra("KMsgType", f4Var.getType());
        if (bVar2 != null) {
            intent.putExtra("KAppMsgType", bVar2.f195582i);
        }
        intent.putExtra("prePublishId", "msg_" + Long.toString(j2));
        intent.putExtra("preUsername", mo103068y(bVar, f4Var));
        intent.putExtra("preChatName", bVar.mo91577r());
        intent.putExtra("preChatTYPE", C45629t0.m50815b(mo103068y(bVar, f4Var), bVar.mo91577r()));
        intent.putExtra("preMsgIndex", 0);
        intent.putExtra("key_enable_teen_mode_check", true);
        C88144b.m109791i(bVar.mo91565f(), "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
    }

    /* renamed from: C */
    public boolean mo82212C() {
        return !(this instanceof C74103m);
    }

    /* renamed from: D */
    public void mo103071D(C67391b bVar, C72963f4 f4Var, int i, boolean z, String str, boolean z2, String str2, int i2) {
        Class cls = C78732i.class;
        int i3 = bVar.mo91582w() ? 2 : 1;
        String r = bVar.mo91582w() ? bVar.mo91577r() : "0";
        String y = mo103068y(bVar, f4Var);
        String str3 = f4Var.mo108774y2() + "";
        String I80 = ((C78732i) C86312j.m106911c(cls)).I80();
        long MS = (long) ((C78732i) C86312j.m106911c(cls)).mo73878MS();
        int i4 = z2 ? 65 : 34;
        if (z) {
            C119179t tVar = C119157j.f356862d;
            C74024a aVar = r2;
            C74024a aVar2 = new C74024a(this, str, i, str2, i4, I80, str3, y, i3, r, MS, i2);
            ((C119157j) tVar).mo183875f(aVar);
            return;
        }
        C22613h1.m26479e(i, str2, i4, 0, "", I80, str3, y, i3, r, MS, (long) str.length(), i2, "", "", -1);
    }

    /* renamed from: E */
    public abstract View mo26231E(LayoutInflater layoutInflater, View view);

    /* renamed from: F */
    public void mo103072F(C67391b bVar, View view, Object obj) {
        view.setTag(obj);
        view.setOnClickListener(((C79368l) bVar.f193278b.mo102812a(C79368l.class)).mo108168D2());
    }

    /* renamed from: G */
    public void mo103073G(C67391b bVar, View view, Object obj) {
        view.setTag(obj);
        if (this.f217206p == null) {
            this.f217206p = new C73720i2(bVar);
        }
        view.setOnClickListener(this.f217206p);
    }

    /* renamed from: H */
    public void mo103074H(C67391b bVar, View view, C72963f4 f4Var, C68070l.C68072b bVar2, String str, long j) {
        if (!((C79138l) C86312j.m106911c(C79138l.class)).cg0(bVar2.f195562d)) {
            view.setTag(new x1$$d());
            return;
        }
        int i = bVar.mo91583x() ? 2 : 1;
        x1$$c x1__c = new x1$$c();
        x1__c.f212266a = bVar2.f195562d;
        x1__c.f212267b = str;
        x1__c.f212268c = mo103097o(bVar, f4Var);
        x1__c.f212269d = bVar2.f195582i;
        x1__c.f212270e = i;
        x1__c.f212271f = bVar2.f195536V;
        x1__c.f212272g = j;
        x1__c.f212273h = bVar.mo91577r();
        mo103075I(bVar, view, x1__c);
    }

    /* renamed from: I */
    public void mo103075I(C67391b bVar, View view, Object obj) {
        view.setTag(obj);
        view.setOnClickListener(((C79368l) bVar.f193278b.mo102812a(C79368l.class)).mo108165A1());
    }

    /* renamed from: J */
    public void mo103076J(C67391b bVar, View view, String str) {
        if (!((C79138l) C86312j.m106911c(C79138l.class)).cg0(str)) {
            view.setTag(new x1$$d());
            return;
        }
        x1$$d x1__d = new x1$$d();
        x1__d.f212274a = str;
        x1__d.f212275b = StateEvent.Name.MESSAGE;
        mo103075I(bVar, view, x1__d);
    }

    /* renamed from: K */
    public void mo103077K(C67391b bVar, ImageView imageView, Bitmap bitmap) {
        BitmapDrawable bitmapDrawable = new BitmapDrawable(bitmap);
        int dimension = (int) bVar.mo91572m().getDimension(C0966R.dimen.f3964lm);
        bitmapDrawable.setBounds(0, 0, dimension, dimension);
        imageView.setImageDrawable(bitmapDrawable);
        if (imageView instanceof WeImageView) {
            ((WeImageView) imageView).setImageBitmap(bitmap);
        }
    }

    /* renamed from: L */
    public void mo103078L(C67391b bVar, ImageView imageView, String str) {
        if (Util.isEqual("wx485a97c844086dc9", str)) {
            imageView.setImageResource(C0966R.raw.icons_outlined_shake_gray);
        } else if (!Util.isEqual("wxaf060266bfa9a35c", str) || !(imageView instanceof WeImageView)) {
            if (imageView instanceof WeImageView) {
                ((WeImageView) imageView).setIconColor(bVar.mo91565f().getResources().getColor(C0966R.color.ahf));
            }
            Bitmap ub = ((C79138l) C86312j.m106911c(C79138l.class)).mo74018ub(str, 2, C76577a.m92156g(bVar.mo91565f()));
            if (ub == null || ub.isRecycled()) {
                mo103077K(bVar, imageView, BitmapFactory.decodeResource(bVar.mo91572m(), C0966R.C0969drawable.biv));
            } else {
                mo103077K(bVar, imageView, ub);
            }
        } else {
            imageView.setImageResource(C0966R.raw.icons_outlined_tv);
            ((WeImageView) imageView).setIconColor(bVar.mo91565f().getResources().getColor(C0966R.color.FG_1));
        }
    }

    /* renamed from: M */
    public void mo103079M(C67391b bVar, TextView textView, String str) {
        Bitmap ub = ((C79138l) C86312j.m106911c(C79138l.class)).mo74018ub(str, 2, C76577a.m92156g(bVar.mo91565f()));
        if (ub == null || ub.isRecycled()) {
            BitmapDrawable bitmapDrawable = new BitmapDrawable(BitmapFactory.decodeResource(bVar.mo91572m(), C0966R.C0969drawable.biv));
            int dimension = (int) bVar.mo91572m().getDimension(C0966R.dimen.f3964lm);
            bitmapDrawable.setBounds(0, 0, dimension, dimension);
            textView.setCompoundDrawables(bitmapDrawable, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(ub);
        int dimension2 = (int) bVar.mo91572m().getDimension(C0966R.dimen.f3964lm);
        bitmapDrawable2.setBounds(0, 0, dimension2, dimension2);
        textView.setCompoundDrawables(bitmapDrawable2, (Drawable) null, (Drawable) null, (Drawable) null);
    }

    /* renamed from: N */
    public boolean mo103080N(C79368l lVar, long j) {
        return j > 0 && lVar.mo108177L4() == j;
    }

    /* renamed from: O */
    public boolean mo103081O(String str) {
        return (!C72996z1.m85793A5(str) && !C72996z1.m85816S4(str) && !C45628s0.m50738C(str) && !C45628s0.m50751P(str)) || C72996z1.m85820U5(str);
    }

    /* renamed from: P */
    public boolean mo103082P() {
        return this instanceof C74090l0.C74092b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0065, code lost:
        if ((eb0.C31543z5.m39453c() - r1) > r7) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006f, code lost:
        if ((eb0.C31543z5.m39453c() - r1) > 120000) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0073, code lost:
        if (r1 == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0075, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.ChattingItem", "isRevokeExpire, msg talker: %s, svr id: %s.", r16.mo108768t(), java.lang.Long.valueOf(r16.mo108774y2()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008c, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x008d, code lost:
        if (r17 == null) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009b, code lost:
        if (r17.mo91577r().equals(r17.mo91573n()) == false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a1, code lost:
        if (r16.getStatus() != 2) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a3, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        r1 = ((lc3.C10485b) f40.C86709a0.m107533q(lc3.C10485b.class)).vh0().mo107404b("ShowRevokeMsgEntry", 1);
        com.tencent.p014mm.sdk.platformtools.Log.m105925i("MicroMsg.ChattingItem", "[oneliang][isRevokeMsgEnable] enable:%d", java.lang.Integer.valueOf(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00c7, code lost:
        if (r16.getType() != 419430449) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c9, code lost:
        r2 = (long) ((h81.C32735h) di3.C86312j.m106911c(r0)).mo58779Qe(h81.C32735h.C32737c.clicfg_android_transfer_revoke_menu_config, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d6, code lost:
        if (r1 != 1) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00dc, code lost:
        if (r2 != 1) goto L_0x00df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00df, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00e1, code lost:
        if (1 != r1) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e4, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0052, code lost:
        if ((eb0.C31543z5.m39453c() - r1) > r3) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0054, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0056, code lost:
        r1 = false;
     */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo103083Q(com.tencent.p014mm.storage.C72963f4 r16, ck3.C67391b r17) {
        /*
            r15 = this;
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            long r1 = r16.getCreateTime()
            di3.d r3 = di3.C86312j.m106911c(r0)
            h81.h r3 = (h81.C32735h) r3
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_message_file_revoke_time
            r5 = 120000(0x1d4c0, double:5.9288E-319)
            long r3 = r3.mo58777He(r4, r5)
            di3.d r7 = di3.C86312j.m106911c(r0)
            h81.h r7 = (h81.C32735h) r7
            h81.h$c r8 = h81.C32735h.C32737c.clicfg_android_transfer_revoke_timelimit
            long r7 = r7.mo58777He(r8, r5)
            boolean r9 = r16.mo101020w3()
            r10 = 419430449(0x19000031, float:6.6174836E-24)
            java.lang.String r11 = "MicroMsg.ChattingItem"
            r12 = 1
            r13 = 0
            if (r9 == 0) goto L_0x0068
            java.lang.String r9 = r16.getContent()
            r14 = 0
            com.tencent.mm.message.l$b r9 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r9, r14)
            if (r9 == 0) goto L_0x0058
            int r9 = r9.f195582i
            r14 = 6
            if (r9 != r14) goto L_0x0058
            java.lang.Object[] r5 = new java.lang.Object[r12]
            java.lang.Long r6 = java.lang.Long.valueOf(r3)
            r5[r13] = r6
            java.lang.String r6 = "File revoke time is ：%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r6, r5)
            long r5 = eb0.C31543z5.m39453c()
            long r5 = r5 - r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0056
        L_0x0054:
            r1 = 1
            goto L_0x0072
        L_0x0056:
            r1 = 0
            goto L_0x0072
        L_0x0058:
            int r3 = r16.getType()
            if (r3 != r10) goto L_0x0068
            long r3 = eb0.C31543z5.m39453c()
            long r3 = r3 - r1
            int r1 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r1 <= 0) goto L_0x0056
            goto L_0x0054
        L_0x0068:
            long r3 = eb0.C31543z5.m39453c()
            long r3 = r3 - r1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0056
            goto L_0x0054
        L_0x0072:
            r2 = 2
            if (r1 == 0) goto L_0x008d
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = r16.mo108768t()
            r0[r13] = r1
            long r1 = r16.mo108774y2()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r0[r12] = r1
            java.lang.String r1 = "isRevokeExpire, msg talker: %s, svr id: %s."
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r1, r0)
            return r13
        L_0x008d:
            if (r17 == 0) goto L_0x00a4
            java.lang.String r1 = r17.mo91577r()
            java.lang.String r3 = r17.mo91573n()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a4
            int r1 = r16.getStatus()
            if (r1 != r2) goto L_0x00a4
            return r13
        L_0x00a4:
            java.lang.Class<lc3.b> r1 = lc3.C10485b.class
            k40.a r1 = f40.C86709a0.m107533q(r1)
            lc3.b r1 = (lc3.C10485b) r1
            pj.f r1 = r1.vh0()
            java.lang.String r2 = "ShowRevokeMsgEntry"
            int r1 = r1.mo107404b(r2, r12)
            java.lang.Object[] r2 = new java.lang.Object[r12]
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r2[r13] = r3
            java.lang.String r3 = "[oneliang][isRevokeMsgEnable] enable:%d"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r3, r2)
            int r2 = r16.getType()
            if (r2 != r10) goto L_0x00e1
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r2 = h81.C32735h.C32737c.clicfg_android_transfer_revoke_menu_config
            int r0 = r0.mo58779Qe(r2, r13)
            long r2 = (long) r0
            if (r1 != r12) goto L_0x00df
            r0 = 1
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x00df
            goto L_0x00e0
        L_0x00df:
            r12 = 0
        L_0x00e0:
            return r12
        L_0x00e1:
            if (r12 != r1) goto L_0x00e4
            goto L_0x00e5
        L_0x00e4:
            r12 = 0
        L_0x00e5:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.mo103083Q(com.tencent.mm.storage.f4, ck3.b):boolean");
    }

    /* renamed from: R */
    public abstract boolean mo26232R();

    /* renamed from: S */
    public boolean mo82213S() {
        return !(this instanceof C74103m);
    }

    /* renamed from: W */
    public boolean mo103084W(String str) {
        return ((C79138l) C86312j.m106911c(C79138l.class)).mo73993L1(str);
    }

    /* renamed from: X */
    public abstract boolean mo26233X(MenuItem menuItem, C67391b bVar, C72963f4 f4Var);

    /* renamed from: Y */
    public boolean mo26234Y(MenuItem menuItem, C67391b bVar, C74243t8 t8Var) {
        return false;
    }

    /* renamed from: Z */
    public abstract boolean mo26235Z(C76874e0 e0Var, View view, ContextMenu.ContextMenuInfo contextMenuInfo, C72963f4 f4Var);

    /* renamed from: a0 */
    public abstract boolean mo26236a0(View view, C67391b bVar, C72963f4 f4Var);

    /* renamed from: b0 */
    public void mo103085b0(C74026c cVar) {
    }

    /* renamed from: d */
    public C72963f4.C72966d mo82118d(C72963f4 f4Var, Context context, C39969i iVar) {
        return null;
    }

    /* renamed from: e */
    public boolean mo103086e(C67391b bVar, C44561j jVar) {
        C48477m a = C48477m.C13789a.m13091a();
        if (((C79138l) C86312j.m106911c(C79138l.class)).mo74016tz(bVar.mo91565f(), jVar) || a == null) {
            return false;
        }
        if (!Util.isNullOrNil(jVar.f149247P)) {
            boolean Qt0 = ((C45962f) C86312j.m106911c(C45962f.class)).Qt0(bVar.mo91565f(), jVar.f149247P);
            Log.m105925i("MicroMsg.ChattingItem", "oversea game info and gpdownload url is not empty, jump to google play directy:[%s], jump result: [%b]", jVar.f149247P, Boolean.valueOf(Qt0));
            if (Qt0) {
                return true;
            }
        }
        int i = bVar.mo91583x() ? 2 : 1;
        GameCenterOperationEvent gameCenterOperationEvent = new GameCenterOperationEvent();
        GameCenterOperationEvent.C40104a aVar = gameCenterOperationEvent.f107543d;
        aVar.f107544a = 2;
        aVar.f107549f = i;
        aVar.f107546c = jVar.field_appId;
        aVar.f107545b = bVar.mo91565f();
        gameCenterOperationEvent.publish();
        a.dn0(bVar.mo91565f(), jVar.field_appId, 1, i, i);
        return true;
    }

    /* renamed from: e0 */
    public void mo103087e0(C74026c cVar, C72963f4 f4Var, String str, boolean z, C67391b bVar, C73774p2 p2Var) {
        mo103088f0(cVar, f4Var, str, true, z, bVar, p2Var);
    }

    /* renamed from: f */
    public abstract void mo26237f(C74026c cVar, C67391b bVar, C72963f4 f4Var, String str);

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0064  */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo103088f0(com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.C74026c r4, com.tencent.p014mm.storage.C72963f4 r5, java.lang.String r6, boolean r7, boolean r8, ck3.C67391b r9, com.tencent.p014mm.p136ui.chatting.C73774p2 r10) {
        /*
            r3 = this;
            int r0 = r5.mo108769t2()
            r1 = 1
            if (r0 != r1) goto L_0x006b
            android.widget.ImageView r0 = r4.stateIV
            com.tencent.mm.ui.chatting.viewitems.t8 r2 = new com.tencent.mm.ui.chatting.viewitems.t8
            r2.<init>(r5, r8, r4, r6)
            r0.setTag(r2)
            android.widget.ImageView r6 = r4.stateIV
            com.tencent.mm.ui.chatting.f2 r8 = r3.f217208r
            if (r8 != 0) goto L_0x001e
            com.tencent.mm.ui.chatting.viewitems.k r8 = new com.tencent.mm.ui.chatting.viewitems.k
            r8.<init>(r3, r9, r10)
            r3.f217208r = r8
        L_0x001e:
            com.tencent.mm.ui.chatting.f2 r8 = r3.f217208r
            r6.setOnClickListener(r8)
            int r5 = r5.getStatus()
            r6 = -1
            if (r5 == r1) goto L_0x0042
            r8 = 2
            if (r5 == r8) goto L_0x0042
            r8 = 3
            if (r5 == r8) goto L_0x0042
            r8 = 4
            if (r5 == r8) goto L_0x0042
            r8 = 5
            if (r5 == r8) goto L_0x003e
            java.lang.String r5 = "MicroMsg.ChattingItem"
            java.lang.String r8 = "getMsgStateResId: not found this state"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r5, r8)
            goto L_0x0042
        L_0x003e:
            r5 = 2131235043(0x7f0810e3, float:1.8086269E38)
            goto L_0x0043
        L_0x0042:
            r5 = -1
        L_0x0043:
            if (r5 == r6) goto L_0x0064
            android.widget.ImageView r6 = r4.stateIV
            r6.setImageResource(r5)
            android.widget.ImageView r5 = r4.stateIV
            r6 = 0
            r5.setVisibility(r6)
            android.widget.ImageView r5 = r4.stateIV
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r9 = 2131833073(0x7f1130f1, float:1.9299218E38)
            java.lang.String r8 = r8.getString(r9)
            r5.setContentDescription(r8)
            r3.mo103093i0(r4, r6, r7)
            goto L_0x006b
        L_0x0064:
            android.widget.ImageView r4 = r4.stateIV
            r5 = 8
            r4.setVisibility(r5)
        L_0x006b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.mo103088f0(com.tencent.mm.ui.chatting.viewitems.i$c, com.tencent.mm.storage.f4, java.lang.String, boolean, boolean, ck3.b, com.tencent.mm.ui.chatting.p2):void");
    }

    /* renamed from: g */
    public void mo103089g(C74026c cVar, C67391b bVar, String str, C72963f4 f4Var) {
        C74243t8 t8Var;
        String str2;
        int i;
        C74352z3 z3Var;
        Class cls = C79368l.class;
        Class cls2 = C79348e.class;
        Class cls3 = C79336a.class;
        if (cVar.avatarIV != null) {
            if (!C45628s0.m50812z(str) || str.equals(C45628s0.f123409o[0])) {
                if (f4Var != null && !Util.isNullOrNil(f4Var.f230732P)) {
                    C68080d dVar = new C68080d();
                    dVar.f195673a = false;
                    dVar.f195674b = 0.1f;
                    t8Var = new C74243t8(str, bVar.mo91583x() ? bVar.mo91577r() : null);
                    t8Var.f217990x = f4Var.f230732P;
                    t8Var.f217991y = f4Var.f230739W;
                    ((C76705f) C86312j.m106911c(C76705f.class)).mo106825Nj(cVar.avatarIV, f4Var.f230732P, C0966R.C0969drawable.f357105be2, dVar);
                    if (C47987l.m53344l2(f4Var)) {
                        C47989m Gx0 = C48009v0.Gx0();
                        Class cls4 = C88274h0.class;
                        if (!Gx0.f128706f && C86312j.m106911c(cls4) != null) {
                            Log.m105924i("MicroMsg.BizKFService", "alvinluo checkAndPreloadKFGuideAppBrand");
                            Gx0.f128706f = true;
                            ((C88274h0) C86312j.m106911c(cls4)).mo113305TH(C88273g1.KF_GUIDE);
                        }
                    }
                } else if (f4Var != null && ((C79348e) bVar.f193278b.mo102812a(cls2)).mo70071q1()) {
                    C74243t8 t8Var2 = new C74243t8(f4Var.mo108760m2(), (String) null);
                    C20828a.m22825b().mo32519h(((C79348e) bVar.f193278b.mo102812a(cls2)).mo70053O(f4Var.mo108760m2()), cVar.avatarIV, ((C79368l) bVar.f193278b.mo102812a(cls)).mo108202j());
                    t8Var = t8Var2;
                } else if (f4Var == null || f4Var.mo108769t2() != 0 || bVar.f193278b.mo102812a(cls3) == null || Util.isNullOrNil(((C79336a) bVar.f193278b.mo102812a(cls3)).mo102373p5())) {
                    t8Var = new C74243t8(str, bVar.mo91583x() ? bVar.mo91577r() : null);
                    m87883d0(cVar.avatarIV, str);
                } else {
                    t8Var = new C74243t8(str, (String) null);
                    C20828a.m22825b().mo32519h(((C79336a) bVar.f193278b.mo102812a(cls3)).mo102373p5(), cVar.avatarIV, ((C79368l) bVar.f193278b.mo102812a(cls)).mo108202j());
                }
                cVar.avatarIV.setVisibility(0);
                cVar.avatarIV.setTag(t8Var);
                cVar.avatarIV.setTagUsername(str);
                cVar.avatarIV.setTagTalker(bVar.mo91577r());
                if (C72996z1.m85807K5(bVar.mo91577r())) {
                    cVar.avatarIV.setTagScene(2);
                } else {
                    cVar.avatarIV.setTagScene(1);
                }
                if (!this.f217201h) {
                    this.f217201h = true;
                    if (!(bVar.f193286j instanceof AppBrandServiceChattingUI.AppBrandServiceChattingFmUI) && !C45628s0.m50742G(bVar.mo91577r())) {
                        if (f4Var == null || Util.isNullOrNil(f4Var.f230732P)) {
                            this.f217202i = new C73326c2(bVar);
                            this.f217203j = new C73679e2(bVar);
                        } else {
                            Log.m105925i("MicroMsg.ChattingItem", "attachAvatarClickListener: getBizKfWorker:%s", f4Var.f230732P);
                            this.f217202i = new C73321b2(bVar);
                        }
                        cVar.avatarIV.setOnClickListener(this.f217202i);
                        cVar.avatarIV.setOnLongClickListener(this.f217203j);
                    }
                }
                ChattingAvatarImageView chattingAvatarImageView = cVar.avatarIV;
                if (this.f217204n == null) {
                    this.f217204n = new C73672d2(bVar);
                }
                chattingAvatarImageView.setOnDoubleClickListener(this.f217204n);
                if (C74346y1.m88788b()) {
                    ChattingAvatarImageView chattingAvatarImageView2 = cVar.avatarIV;
                    C74346y1.C74347b bVar2 = C74346y1.f218382b;
                    if (chattingAvatarImageView2 == null || bVar2 == null) {
                        Log.m105928w("MicroMsg.OnHoverCompatibleHelper", "view or callback is null.");
                    } else {
                        synchronized (C74352z3.class) {
                            if (C74352z3.f218403b == null) {
                                C74352z3.f218403b = new C74352z3();
                            }
                            z3Var = C74352z3.f218403b;
                        }
                        if (z3Var.f218404a == null) {
                            z3Var.f218404a = new C74352z3.C74353a(bVar2);
                        }
                        Object obj = z3Var.f218404a;
                        if (obj != null && (obj instanceof View.OnHoverListener)) {
                            chattingAvatarImageView2.setOnHoverListener((View.OnHoverListener) obj);
                        }
                    }
                }
                ChattingAvatarImageView chattingAvatarImageView3 = cVar.avatarIV;
                chattingAvatarImageView3.setContentDescription(((C75339i) C86312j.m106911c(C75339i.class)).getDisplayName(str) + bVar.mo91565f().getString(C0966R.string.a_r));
                if (cVar.sendFromWatchVS == null) {
                    return;
                }
                if (f4Var == null || (str2 = f4Var.f230724G) == null || !str2.contains("watch_msg_source_type")) {
                    cVar.sendFromWatchVS.setVisibility(8);
                    return;
                }
                try {
                    i = Integer.valueOf(XmlParser.parseXml(f4Var.f230724G, "msgsource", (String) null).get(".msgsource.watch_msg_source_type")).intValue();
                } catch (Exception unused) {
                    i = 0;
                }
                if (i <= 0 || i > 4) {
                    cVar.sendFromWatchVS.setVisibility(8);
                } else {
                    cVar.sendFromWatchVS.setVisibility(0);
                }
            } else {
                cVar.avatarIV.setVisibility(8);
            }
        }
    }

    /* renamed from: g0 */
    public void mo103090g0(C74026c cVar, CharSequence charSequence) {
        TextView textView;
        if (cVar != null && (textView = cVar.userTV) != null) {
            if (charSequence == null) {
                textView.setVisibility(8);
                return;
            }
            textView.setText(charSequence);
            cVar.userTV.setVisibility(0);
        }
    }

    /* renamed from: h */
    public void mo102973h(C74026c cVar, C67391b bVar, C72963f4 f4Var, String str) {
        Class cls = C76979h.class;
        Class cls2 = C79357g.class;
        if (str != null && cVar.userTV != null && f4Var != null) {
            CharSequence charSequence = null;
            if (f4Var.mo108769t2() == 0 && !Util.isNullOrNil(f4Var.f230732P)) {
                C47994n Hx0 = C48009v0.Hx0();
                C47987l Lo = Hx0.mo72780Lo(f4Var.f230732P);
                boolean z = true;
                if (Lo == null || Util.isNullOrNil(Lo.field_openId) || Util.isNullOrNil(Lo.field_nickname)) {
                    Log.m105924i("MicroMsg.ChattingItem", "fillingUsername:need getKfInfo");
                } else {
                    charSequence = Lo.field_nickname;
                    z = false;
                }
                if (z || Hx0.mo72782Yt(Lo)) {
                    C48009v0.Gx0().mo72774a(new C44864d(bVar, f4Var.f230732P));
                    C48009v0.Gx0().mo72777d(bVar.mo91577r(), f4Var.f230732P, f4Var.f230739W);
                }
            } else if (mo103045n0(bVar) && ((C79357g) bVar.f193278b.mo102812a(cls2)).mo102161o4()) {
                if (((C79348e) bVar.f193278b.mo102812a(C79348e.class)).mo70075s4()) {
                    charSequence = ((C76979h) C86312j.m106911c(cls)).yp0(bVar.mo91565f(), ((C79357g) bVar.f193278b.mo102812a(cls2)).getDisplayName(f4Var.mo108760m2()), cVar.userTV.getTextSize());
                } else {
                    SpannableString yp02 = ((C76979h) C86312j.m106911c(cls)).yp0(bVar.mo91565f(), ((C79357g) bVar.f193278b.mo102812a(cls2)).getDisplayName(str), cVar.userTV.getTextSize());
                    TextView textView = cVar.userTV;
                    charSequence = ((C79168k) C86312j.m106911c(C79168k.class)).mo74108Fe(textView, str, yp02, C63347a.C47892c.GROUP_CHAT, textView.getTextSize());
                }
            }
            mo103090g0(cVar, charSequence);
        }
    }

    /* renamed from: h0 */
    public void mo103091h0(C74026c cVar, boolean z) {
        mo103093i0(cVar, z, true);
    }

    /* renamed from: i */
    public void mo103092i(C67391b bVar, C68070l.C68072b bVar2, String str, C44561j jVar, long j, int i, String str2) {
        int i2 = 1;
        int i3 = bVar.mo91583x() ? 2 : 1;
        if (i == -1) {
            i = bVar2.f195582i == 7 ? (jVar == null || !C72688j0.m85020f(bVar.mo91565f(), jVar.field_packageName)) ? 6 : 0 : 3;
        }
        int i4 = bVar2.f195582i;
        if (i4 == 2) {
            i2 = 4;
        } else if (i4 != 5) {
            i2 = i;
        }
        ReportMsgClickEvent reportMsgClickEvent = new ReportMsgClickEvent();
        reportMsgClickEvent.f193900d.f193901a = bVar.mo91565f();
        ReportMsgClickEvent.C67778a aVar = reportMsgClickEvent.f193900d;
        aVar.f193907g = i3;
        aVar.f193902b = bVar2.f195562d;
        aVar.f193903c = jVar == null ? null : jVar.field_packageName;
        aVar.f193905e = bVar2.f195582i;
        aVar.f193904d = str;
        aVar.f193908h = i2;
        aVar.f193906f = bVar2.f195536V;
        aVar.f193909i = j;
        aVar.f193910j = "";
        aVar.f193911k = str2;
        C6690n nVar = (C6690n) bVar2.mo93555w(C6690n.class);
        if (nVar != null) {
            reportMsgClickEvent.f193900d.f193912l = nVar.f24054b;
        }
        reportMsgClickEvent.publish();
    }

    /* renamed from: i0 */
    public void mo103093i0(C74026c cVar, boolean z, boolean z2) {
        if (cVar.uploadingPB != null) {
            Log.m105919d("MicroMsg.ChattingItem", "showUploadingPB %s %s %s", cVar, Boolean.valueOf(z), Boolean.valueOf(z2));
            if (!z) {
                cVar.uploadingPB.setTag(C0966R.C0970id.b7q, Boolean.FALSE);
                Future future = this.f217209s;
                if (future != null) {
                    future.cancel(true);
                }
                cVar.uploadingPB.setVisibility(8);
            } else if (!z2) {
                cVar.uploadingPB.setVisibility(0);
                cVar.uploadingPB.setTag(C0966R.C0970id.b7q, Boolean.TRUE);
            } else {
                Object tag = cVar.uploadingPB.getTag(C0966R.C0970id.b7o);
                if (tag == null || ((Long) tag).longValue() >= C31543z5.m39453c() - 1000) {
                    Object tag2 = cVar.uploadingPB.getTag(C0966R.C0970id.b7q);
                    if (tag2 == null || !((Boolean) tag2).booleanValue()) {
                        C119179t tVar = C119157j.f356862d;
                        C74025b bVar = new C74025b(this, cVar);
                        C119157j jVar = (C119157j) tVar;
                        jVar.getClass();
                        this.f217209s = jVar.mo183892w(bVar, 1000, false);
                        return;
                    }
                    cVar.uploadingPB.setVisibility(0);
                    Log.m105919d("MicroMsg.ChattingItem", "showUploadingPB had delay visible %s", cVar);
                    return;
                }
                cVar.uploadingPB.setVisibility(0);
                cVar.uploadingPB.setTag(C0966R.C0970id.b7q, Boolean.TRUE);
                Log.m105919d("MicroMsg.ChattingItem", "showUploadingPB not init %s", cVar);
            }
        }
    }

    /* renamed from: j */
    public void mo103094j(C67391b bVar, C68070l.C68072b bVar2, String str, C44561j jVar, long j, String str2) {
        mo103092i(bVar, bVar2, str, jVar, j, -1, str2);
    }

    /* renamed from: k */
    public void mo103095k(C67391b bVar, C68070l.C68072b bVar2, C72963f4 f4Var) {
        C48477m a = C48477m.C13789a.m13091a();
        if (a != null) {
            int i = bVar.mo91583x() ? 2 : 1;
            String o = mo103097o(bVar, f4Var);
            C6690n nVar = (C6690n) bVar2.mo93555w(C6690n.class);
            a.mo65672zj(bVar.mo91565f(), bVar2.f195562d, o, bVar2.f195582i, i, bVar2.f195536V, f4Var.mo108774y2(), bVar.mo91577r(), nVar != null ? nVar.f24054b : 0);
        }
    }

    /* renamed from: k0 */
    public abstract boolean mo26238k0(int i, boolean z);

    /* renamed from: l0 */
    public boolean mo103033l0() {
        return this instanceof C74244u.C74261g;
    }

    /* renamed from: m0 */
    public boolean mo26239m0() {
        return !(this instanceof C74103m);
    }

    /* renamed from: n */
    public C73743l2 mo103096n(C67391b bVar) {
        if (this.f217207q == null) {
            this.f217207q = new C73743l2(bVar);
        }
        return this.f217207q;
    }

    /* renamed from: n0 */
    public boolean mo103045n0(C67391b bVar) {
        if (mo26232R()) {
            return false;
        }
        if (!bVar.mo91583x()) {
            return ((C79348e) bVar.f193278b.mo102812a(C79348e.class)).mo70071q1();
        }
    }

    /* renamed from: o */
    public String mo103097o(C67391b bVar, C72963f4 f4Var) {
        String r = bVar.mo91577r();
        return C72996z1.m85820U5(r) ? C75604z3.m90847s(f4Var.getContent()) : r;
    }

    /* renamed from: p */
    public C74027e mo103098p(C67391b bVar) {
        if (this.f217198e == null) {
            this.f217198e = new C74027e(bVar);
        }
        return this.f217198e;
    }

    /* renamed from: u */
    public C74035f mo103099u(C67391b bVar) {
        if (this.f217200g == null) {
            BaseChattingUIFragment baseChattingUIFragment = bVar.f193286j;
            if (baseChattingUIFragment instanceof AppBrandServiceChattingUI.AppBrandServiceChattingFmUI) {
                AppBrandServiceChattingUI.AppBrandServiceChattingFmUI appBrandServiceChattingFmUI = (AppBrandServiceChattingUI.AppBrandServiceChattingFmUI) baseChattingUIFragment;
                appBrandServiceChattingFmUI.getClass();
                this.f217200g = new C74350z(appBrandServiceChattingFmUI, appBrandServiceChattingFmUI.f215220f, this);
            } else {
                this.f217200g = new C74035f(bVar, this);
            }
        }
        return this.f217200g;
    }

    /* renamed from: v */
    public C78950d.C78963m mo103100v(C74027e eVar) {
        if (this.f217199f == null) {
            this.f217199f = new C74036g(eVar);
        }
        return this.f217199f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r5 = ((p763ym.C79138l) di3.C86312j.m106911c(p763ym.C79138l.class)).getAppInfo(r5);
     */
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.content.pm.PackageInfo mo103101w(android.content.Context r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 0
            if (r5 == 0) goto L_0x001c
            int r1 = r5.length()
            if (r1 != 0) goto L_0x000a
            goto L_0x001c
        L_0x000a:
            java.lang.Class<ym.l> r1 = p763ym.C79138l.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            ym.l r1 = (p763ym.C79138l) r1
            com.tencent.mm.pluginsdk.model.app.j r5 = r1.getAppInfo(r5)
            if (r5 != 0) goto L_0x0019
            goto L_0x001c
        L_0x0019:
            java.lang.String r5 = r5.field_packageName
            goto L_0x001d
        L_0x001c:
            r5 = r0
        L_0x001d:
            if (r5 != 0) goto L_0x0020
            return r0
        L_0x0020:
            r1 = 0
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch:{ NameNotFoundException -> 0x002a }
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r5, r1)     // Catch:{ NameNotFoundException -> 0x002a }
            return r4
        L_0x002a:
            r4 = move-exception
            java.lang.Object[] r5 = new java.lang.Object[r1]
            java.lang.String r1 = "MicroMsg.ChattingItem"
            java.lang.String r2 = ""
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r4, r2, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.viewitems.C74023i.mo103101w(android.content.Context, java.lang.String):android.content.pm.PackageInfo");
    }

    /* renamed from: x */
    public String mo103102x(C67391b bVar, C72963f4 f4Var) {
        String t = f4Var.mo108768t();
        C79348e eVar = (C79348e) bVar.f193278b.mo102812a(C79348e.class);
        return (!eVar.mo70071q1() || eVar.mo70076s5() == null) ? t : eVar.mo70076s5().field_bizChatServId;
    }

    /* renamed from: y */
    public String mo103068y(C67391b bVar, C72963f4 f4Var) {
        if (mo26232R()) {
            return bVar.mo91573n();
        }
        String r = bVar.mo91577r();
        if (!mo103045n0(bVar)) {
            return r;
        }
        if (!bVar.mo91583x()) {
            return f4Var != null ? f4Var.mo108760m2() : r;
        }
        String s = C75604z3.m90847s(f4Var.getContent());
        return (r == null || s == null || s.length() <= 0) ? r : s;
    }

    /* renamed from: z */
    public C73839r2 mo103103z(C67391b bVar) {
        if (this.f217205o == null) {
            this.f217205o = new C73839r2(bVar);
        }
        return this.f217205o;
    }

    /* renamed from: com.tencent.mm.ui.chatting.viewitems.i$c */
    public static class C74026c implements C78208e {
        public static final int STATUS_EDIT = 1;
        public static final int STATUS_NORMAL = 0;
        private byte _hellAccFlag_;
        public ChattingAvatarImageView avatarIV;
        private C78208e chatHolder = C78208e.C78209a.f229159a;
        public C74023i chattingItem;
        public CheckBox checkBox;
        public View clickArea;
        public ImageView colorMaskView;
        public View convertView;
        public View historyMsgTip;
        public View maskView;
        public View noMoreMsgTip;
        public String playingMsgId;
        public ViewStub sendFromWatchVS;
        public ImageView stateIV;
        public TextView timeTV;
        public ProgressBar uploadingPB;
        public TextView userTV;

        public C74026c() {
        }

        public void create(View view) {
            this.convertView = view;
            this.timeTV = (TextView) view.findViewById(C0966R.C0970id.b8z);
            this.avatarIV = (ChattingAvatarImageView) view.findViewById(C0966R.C0970id.b3s);
            this.historyMsgTip = view.findViewById(C0966R.C0970id.b5o);
            this.noMoreMsgTip = view.findViewById(C0966R.C0970id.f357687b83);
            this.checkBox = (CheckBox) view.findViewById(C0966R.C0970id.b46);
            this.clickArea = view.findViewById(C0966R.C0970id.b47);
            this.stateIV = (ImageView) view.findViewById(C0966R.C0970id.b8v);
            this.colorMaskView = (ImageView) view.findViewById(C0966R.C0970id.b48);
            this.sendFromWatchVS = null;
        }

        public int getAdapterPosition() {
            return this.chatHolder.getAdapterPosition();
        }

        public View getMainContainerView() {
            return this.clickArea;
        }

        public C0000n0 getViewHolderScope() {
            return this.chatHolder.getViewHolderScope();
        }

        public void resetChatBubbleWidth(View view, int i) {
            if (view != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = (int) (((float) i) / C88494d.f255615g);
                view.setLayoutParams(layoutParams);
                view.requestLayout();
            }
        }

        public void setChatHolder(C78208e eVar) {
            this.chatHolder = eVar;
        }

        public void setChattingItem(C74023i iVar) {
            this.chattingItem = iVar;
        }

        public void showColorMaskView(boolean z) {
            ImageView imageView = this.colorMaskView;
            if (imageView == null) {
                return;
            }
            if (z) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
        }

        public void showEditView(boolean z) {
            int i = z ? 0 : 8;
            CheckBox checkBox2 = this.checkBox;
            if (!(checkBox2 == null || checkBox2.getVisibility() == i)) {
                this.checkBox.setVisibility(i);
            }
            View view = this.maskView;
            if (view != null && view.getVisibility() != i) {
                View view2 = this.maskView;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(Integer.valueOf(i));
                View view3 = view2;
                C117292a.m165358d(view3, aVar.mo10232b(), "com/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder", "showEditView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/ui/chatting/viewitems/ChattingItem$BaseViewHolder", "showEditView", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }

        public C74026c(C74023i iVar, String str) {
            this.chattingItem = iVar;
            this.playingMsgId = str;
        }
    }
}
