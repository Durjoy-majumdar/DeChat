package com.tencent.p014mm.plugin.wallet_core.p125ui.view;

import a70.C112760b;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.midas.data.APMidasPluginInfo;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.StartAppBrandUIFromOuterEvent;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.wallet_core.p125ui.view.WalletScratchShakeView;
import com.tencent.p014mm.plugin.wallet_core.utils.C43423i0;
import com.tencent.p014mm.pluginsdk.p133ui.applet.CdnImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.p014mm.wallet_core.p137ui.C75228t;
import com.tencent.p014mm.wallet_core.p137ui.WalletBaseUI;
import g63.C75885i;
import g63.C75888m;
import g63.C75889n;
import g63.C75890o;
import g63.C75891p;
import gc0.C20828a;
import hc0.C20937c;
import ic0.C98661k;
import j20.C117292a;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import k20.C60958c;
import k20.C9556a;
import ob0.C117747y;
import org.json.JSONArray;
import org.json.JSONObject;
import p823sg.C90193h;
import p910lj.C76701a;
import t14.C77818a;
import t14.C77819b;
import t14.C77820c;
import t14.C77824g;
import t14.C77826i;
import te3.C48975ca0;
import te3.C50074k32;
import te3.C51926x50;
import ud3.C101998d;
import ul0.C90694b;
import v53.C52773m;
import v53.C52775o;
import v53.C52776p;

/* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget */
public class WalletSuccPageAwardWidget extends FrameLayout {

    /* renamed from: A */
    public boolean f210768A = false;

    /* renamed from: d */
    public CdnImageView f210769d;

    /* renamed from: e */
    public TextView f210770e;

    /* renamed from: f */
    public TextView f210771f;

    /* renamed from: g */
    public Button f210772g;

    /* renamed from: h */
    public ViewGroup f210773h;

    /* renamed from: i */
    public ImageView f210774i;

    /* renamed from: j */
    public ImageView f210775j;

    /* renamed from: n */
    public WalletScratchShakeView f210776n;

    /* renamed from: o */
    public WalletAwardShakeAnimView f210777o;

    /* renamed from: p */
    public C77820c f210778p;

    /* renamed from: q */
    public C77826i f210779q;

    /* renamed from: r */
    public String f210780r;

    /* renamed from: s */
    public WalletBaseUI f210781s;

    /* renamed from: t */
    public boolean f210782t;

    /* renamed from: u */
    public boolean f210783u = false;

    /* renamed from: v */
    public boolean f210784v = false;

    /* renamed from: w */
    public boolean f210785w = true;

    /* renamed from: x */
    public boolean f210786x = false;

    /* renamed from: y */
    public C77818a f210787y = null;

    /* renamed from: z */
    public MMHandler f210788z = new MMHandler(Looper.getMainLooper());

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget$a */
    public class C72451a implements Runnable {
        public C72451a() {
        }

        public void run() {
            WalletSuccPageAwardWidget.m84797c(WalletSuccPageAwardWidget.this);
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget$b */
    public class C72452b implements C98661k {

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget$b$a */
        public class C72453a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ NinePatchDrawable f210791d;

            /* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget$b$a$a */
            public class C72454a implements Runnable {
                public C72454a() {
                }

                public void run() {
                    ViewGroup.LayoutParams layoutParams = WalletSuccPageAwardWidget.this.f210774i.getLayoutParams();
                    layoutParams.height = WalletSuccPageAwardWidget.this.f210773h.getHeight();
                    layoutParams.width = WalletSuccPageAwardWidget.this.f210773h.getWidth();
                    WalletSuccPageAwardWidget.this.f210774i.setLayoutParams(layoutParams);
                    View findViewById = WalletSuccPageAwardWidget.this.findViewById(C0966R.C0970id.f358887ho0);
                    C9556a aVar = new C9556a();
                    ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                    aVar.mo10233c(8);
                    View view = findViewById;
                    C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget$6$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                    C117292a.m165359e(view, "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget$6$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    View findViewById2 = WalletSuccPageAwardWidget.this.findViewById(C0966R.C0970id.f358888ho1);
                    C9556a aVar2 = new C9556a();
                    aVar2.mo10233c(8);
                    C117292a.m165358d(findViewById2, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget$6$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                    C117292a.m165359e(findViewById2, "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget$6$1$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }

            public C72453a(NinePatchDrawable ninePatchDrawable) {
                this.f210791d = ninePatchDrawable;
            }

            public void run() {
                WalletSuccPageAwardWidget.this.f210774i.setImageDrawable(this.f210791d);
                WalletSuccPageAwardWidget.this.f210774i.setVisibility(0);
                WalletSuccPageAwardWidget.this.f210774i.post(new C72454a());
            }
        }

        public C72452b() {
        }

        /* renamed from: a */
        public void mo6935a(String str, View view, Bitmap bitmap, Object... objArr) {
            C77826i iVar;
            Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "load background_img finish, url: %s, bitmap: %s", str, bitmap);
            if (bitmap != null && (iVar = WalletSuccPageAwardWidget.this.f210779q) != null && !Util.isNullOrNil(iVar.f226755g) && WalletSuccPageAwardWidget.this.f210779q.f226755g.equals(str)) {
                WalletSuccPageAwardWidget.this.getClass();
                int[] iArr = {(bitmap.getWidth() / 2) - 3, (bitmap.getWidth() / 2) + 3};
                int[] iArr2 = {(bitmap.getHeight() / 2) - 3, (bitmap.getHeight() / 2) + 3};
                ByteBuffer order = ByteBuffer.allocate(84).order(ByteOrder.nativeOrder());
                order.put((byte) 1);
                order.put((byte) 2);
                order.put((byte) 2);
                order.put((byte) 9);
                order.putInt(0);
                order.putInt(0);
                order.putInt(0);
                order.putInt(0);
                order.putInt(0);
                order.putInt(0);
                order.putInt(0);
                order.putInt(iArr[0]);
                order.putInt(iArr[1]);
                order.putInt(iArr2[0]);
                order.putInt(iArr2[1]);
                for (int i = 0; i < 9; i++) {
                    order.putInt(1);
                }
                MMHandlerThread.postToMainThread(new C72453a(new NinePatchDrawable(WalletSuccPageAwardWidget.this.getResources(), new NinePatch(bitmap, order.array(), "widget_bg"))));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget$c */
    public class C72455c implements View.OnClickListener {

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget$c$a */
        public class C72456a implements Runnable {
            public C72456a() {
            }

            public void run() {
                WalletSuccPageAwardWidget.m84797c(WalletSuccPageAwardWidget.this);
            }
        }

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget$c$b */
        public class C72457b implements Runnable {
            public C72457b() {
            }

            public void run() {
                WalletSuccPageAwardWidget.m84797c(WalletSuccPageAwardWidget.this);
            }
        }

        public C72455c() {
        }

        public void onClick(View view) {
            C77818a aVar;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            WalletSuccPageAwardWidget walletSuccPageAwardWidget = WalletSuccPageAwardWidget.this;
            C77820c cVar = walletSuccPageAwardWidget.f210778p;
            if (!(cVar == null || (aVar = cVar.f226711h) == null)) {
                walletSuccPageAwardWidget.f210787y = aVar;
                Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "click btn, type: %s", Integer.valueOf(aVar.f226696f));
                WalletSuccPageAwardWidget walletSuccPageAwardWidget2 = WalletSuccPageAwardWidget.this;
                C77818a aVar2 = walletSuccPageAwardWidget2.f210787y;
                int i = aVar2.f226696f;
                int i2 = 2;
                if (i == 1) {
                    Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "click btn_info, type: %s, url: %s", Integer.valueOf(i), WalletSuccPageAwardWidget.this.f210787y.f226697g);
                    WalletSuccPageAwardWidget walletSuccPageAwardWidget3 = WalletSuccPageAwardWidget.this;
                    C75228t.m90219L(walletSuccPageAwardWidget3.f210781s, walletSuccPageAwardWidget3.f210787y.f226697g, false);
                    WalletSuccPageAwardWidget walletSuccPageAwardWidget4 = WalletSuccPageAwardWidget.this;
                    walletSuccPageAwardWidget4.f210783u = true;
                    walletSuccPageAwardWidget4.f210786x = true;
                    walletSuccPageAwardWidget4.f210768A = false;
                    walletSuccPageAwardWidget4.f210788z.postDelayed(new C72456a(), 3000);
                } else if (i == 2) {
                    C77824g gVar = aVar2.f226698h;
                    if (gVar != null) {
                        Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "click btn, jump tiny app, userName: %s, path: %s, version: %s", gVar.f226745d, gVar.f226746e, Integer.valueOf(gVar.f226747f));
                        StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
                        StartAppBrandUIFromOuterEvent.C1142a aVar3 = startAppBrandUIFromOuterEvent.f9522d;
                        aVar3.f9526a = gVar.f226745d;
                        aVar3.f9527b = Util.nullAs(gVar.f226746e, "");
                        StartAppBrandUIFromOuterEvent.C1142a aVar4 = startAppBrandUIFromOuterEvent.f9522d;
                        aVar4.f9529d = C90694b.CTRL_INDEX;
                        WalletSuccPageAwardWidget walletSuccPageAwardWidget5 = WalletSuccPageAwardWidget.this;
                        aVar4.f9530e = walletSuccPageAwardWidget5.f210780r;
                        aVar4.f9528c = 0;
                        int i3 = gVar.f226747f;
                        if (i3 > 0) {
                            aVar4.f9534i = i3;
                        }
                        aVar4.f9531f = walletSuccPageAwardWidget5.f210781s;
                        startAppBrandUIFromOuterEvent.publish();
                        WalletSuccPageAwardWidget walletSuccPageAwardWidget6 = WalletSuccPageAwardWidget.this;
                        walletSuccPageAwardWidget6.f210783u = true;
                        walletSuccPageAwardWidget6.f210768A = false;
                        walletSuccPageAwardWidget6.f210788z.postDelayed(new C72457b(), 3000);
                    }
                    WalletSuccPageAwardWidget.this.f210786x = true;
                } else if (i == 3) {
                    Log.m105924i("MicroMsg.WalletSuccPageAwardWidget", "click btn, do get lottery");
                    WalletSuccPageAwardWidget.m84795a(WalletSuccPageAwardWidget.this);
                    WalletSuccPageAwardWidget.this.f210786x = true;
                } else if (i == 5) {
                    Log.m105924i("MicroMsg.WalletSuccPageAwardWidget", "click btn, do nothing");
                } else if (i == 6) {
                    Log.m105924i("MicroMsg.WalletSuccPageAwardWidget", "click btn, show layer");
                    WalletSuccPageAwardWidget.this.f210786x = true;
                } else if (i == 7) {
                    Log.m105924i("MicroMsg.WalletSuccPageAwardWidget", "click btn, draw lottery");
                    WalletSuccPageAwardWidget.m84796b(WalletSuccPageAwardWidget.this, 3, true);
                    WalletSuccPageAwardWidget.this.f210786x = true;
                } else if (i == 8) {
                    WalletSuccPageAwardWidget.m84795a(walletSuccPageAwardWidget2);
                    Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "click btn_info, type: %s, url: %s", Integer.valueOf(WalletSuccPageAwardWidget.this.f210787y.f226696f), WalletSuccPageAwardWidget.this.f210787y.f226697g);
                    WalletSuccPageAwardWidget.this.f210786x = true;
                } else if (i == 9) {
                    WalletSuccPageAwardWidget.m84795a(walletSuccPageAwardWidget2);
                    WalletSuccPageAwardWidget.this.f210786x = true;
                }
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[2];
                objArr[0] = 2;
                if (!WalletSuccPageAwardWidget.this.f210783u) {
                    i2 = 1;
                }
                objArr[1] = Integer.valueOf(i2);
                nVar.mo160131h(15225, objArr);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget$d */
    public class C72458d implements Runnable {
        public C72458d() {
        }

        public void run() {
            try {
                if (WalletSuccPageAwardWidget.this.f210772g.getVisibility() == 0 && WalletSuccPageAwardWidget.this.f210770e.getRight() > 0 && WalletSuccPageAwardWidget.this.f210772g.getLeft() > 0 && WalletSuccPageAwardWidget.this.f210770e.getRight() >= WalletSuccPageAwardWidget.this.f210772g.getLeft() && !Util.isNullOrNil(WalletSuccPageAwardWidget.this.f210770e.getText())) {
                    float textSize = WalletSuccPageAwardWidget.this.f210770e.getTextSize();
                    Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "nameTv size exceed, nameTv.getRight(): %s, button.getLeft(): %s", Integer.valueOf(WalletSuccPageAwardWidget.this.f210770e.getRight()), Integer.valueOf(WalletSuccPageAwardWidget.this.f210772g.getLeft()));
                    Paint paint = new Paint();
                    paint.setTextSize(textSize);
                    String charSequence = WalletSuccPageAwardWidget.this.f210770e.getText().toString();
                    float left = (float) (WalletSuccPageAwardWidget.this.f210772g.getLeft() - WalletSuccPageAwardWidget.this.f210770e.getLeft());
                    int i = 1;
                    while (true) {
                        if (paint.measureText(charSequence.substring(0, (charSequence.length() - i) - 1)) <= left) {
                            break;
                        } else if (i > charSequence.length() - 1) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "nameTv, exceed len, final search count: %s, text.length: %s", Integer.valueOf(i), Integer.valueOf(charSequence.length()));
                    String substring = charSequence.substring(0, (charSequence.length() - i) - 1);
                    if (charSequence.length() > 9 && substring.length() < 9) {
                        substring = charSequence.substring(0, 9);
                    }
                    WalletSuccPageAwardWidget.this.f210770e.setText(substring);
                    WalletSuccPageAwardWidget.this.f210770e.append("...");
                }
            } catch (Exception e) {
                Log.printErrStackTrace("MicroMsg.WalletSuccPageAwardWidget", e, "calc nameTv len error: %s", e.getMessage());
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget$e */
    public class C72459e implements C98661k {

        /* renamed from: com.tencent.mm.plugin.wallet_core.ui.view.WalletSuccPageAwardWidget$e$a */
        public class C72460a implements Runnable {

            /* renamed from: d */
            public final /* synthetic */ Bitmap f210799d;

            public C72460a(Bitmap bitmap) {
                this.f210799d = bitmap;
            }

            public void run() {
                WalletSuccPageAwardWidget.this.f210775j.setScaleType(ImageView.ScaleType.CENTER_CROP);
                WalletSuccPageAwardWidget.this.f210775j.setImageBitmap(this.f210799d);
            }
        }

        public C72459e() {
        }

        /* renamed from: a */
        public void mo6935a(String str, View view, Bitmap bitmap, Object... objArr) {
            C77820c cVar;
            Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "load background_img_whole finish, url: %s, bitmap: %s", str, bitmap);
            if (bitmap != null && (cVar = WalletSuccPageAwardWidget.this.f210778p) != null && !Util.isNullOrNil(cVar.f226716p) && WalletSuccPageAwardWidget.this.f210778p.f226716p.equals(str)) {
                MMHandlerThread.postToMainThread(new C72460a(bitmap));
            }
        }
    }

    public WalletSuccPageAwardWidget(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo99835h(context);
    }

    /* renamed from: a */
    public static void m84795a(WalletSuccPageAwardWidget walletSuccPageAwardWidget) {
        walletSuccPageAwardWidget.f210781s.doSceneProgress(new C52775o(walletSuccPageAwardWidget.f210778p.f226711h.f226699i, walletSuccPageAwardWidget.f210782t));
    }

    /* renamed from: b */
    public static void m84796b(WalletSuccPageAwardWidget walletSuccPageAwardWidget, int i, boolean z) {
        Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "doDrawLottery, is_query_other: %s", Integer.valueOf(walletSuccPageAwardWidget.f210778p.f226708e));
        C77820c cVar = walletSuccPageAwardWidget.f210778p;
        if (cVar.f226708e != 0) {
            walletSuccPageAwardWidget.f210781s.doSceneProgress(new C52773m(cVar.f226709f, i, walletSuccPageAwardWidget.f210782t), z);
        }
    }

    /* renamed from: c */
    public static void m84797c(WalletSuccPageAwardWidget walletSuccPageAwardWidget) {
        Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "delayCheckStartMiniApp, isMiniAppReturn: %s", Boolean.valueOf(walletSuccPageAwardWidget.f210768A));
        if (!walletSuccPageAwardWidget.f210768A) {
            walletSuccPageAwardWidget.mo99843p();
            walletSuccPageAwardWidget.f210768A = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r0 = r1.f226707d;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m84798e(t14.C77820c r1) {
        /*
            if (r1 == 0) goto L_0x0012
            java.util.LinkedList<t14.i> r0 = r1.f226707d
            if (r0 == 0) goto L_0x000c
            int r0 = r0.size()
            if (r0 > 0) goto L_0x0010
        L_0x000c:
            t14.b r1 = r1.f226717q
            if (r1 == 0) goto L_0x0012
        L_0x0010:
            r1 = 1
            goto L_0x0013
        L_0x0012:
            r1 = 0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.wallet_core.p125ui.view.WalletSuccPageAwardWidget.m84798e(t14.c):boolean");
    }

    private String getAccImagesPath() {
        return C112760b.m154195C() + "wallet/images" + "/";
    }

    /* renamed from: d */
    public final String mo99831d(String str) {
        if (Util.isNullOrNil(new String[0])) {
            return null;
        }
        C86013q1.m106461v(getAccImagesPath());
        String str2 = getAccImagesPath() + C90193h.m112878f(str.getBytes());
        Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "buildImagePathByUrl, url: %s, path: %s", str, str2);
        return str2;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        WalletScratchShakeView walletScratchShakeView = this.f210776n;
        if (walletScratchShakeView != null && walletScratchShakeView.getVisibility() == 0) {
            WalletScratchShakeView walletScratchShakeView2 = this.f210776n;
            boolean z = false;
            if (walletScratchShakeView2 != null) {
                WalletScratchShakeView.C72449b bVar = walletScratchShakeView2.f210740d;
                if (bVar != null) {
                    bVar.mo99825a(motionEvent);
                }
                WalletScratchShakeView walletScratchShakeView3 = this.f210776n;
                WalletScratchShakeView.C72449b bVar2 = walletScratchShakeView3.f210740d;
                if (!(bVar2 != null ? bVar2.f210744A : true)) {
                    z = walletScratchShakeView3.dispatchTouchEvent(motionEvent);
                }
            }
            ViewGroup viewGroup = this.f210773h;
            if (viewGroup != null && !z) {
                return viewGroup.dispatchTouchEvent(motionEvent);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: f */
    public final String mo99833f(C77820c cVar) {
        if (cVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                LinkedList<C77826i> linkedList = cVar.f226707d;
                if (linkedList != null && linkedList.size() > 0) {
                    Iterator<C77826i> it = cVar.f226707d.iterator();
                    while (it.hasNext()) {
                        C77826i next = it.next();
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("logo", next.f226752d);
                        jSONObject2.put("award_name", next.f226753e);
                        jSONObject2.put("award_description", next.f226754f);
                        jSONObject2.put("background_img", next.f226755g);
                        jSONObject2.put("award_name_color", next.f226756h);
                        jSONObject2.put("award_description_color", next.f226757i);
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.put("single_exposure_info_list", jSONArray);
                jSONObject.put("is_query_others", cVar.f226708e);
                jSONObject.put("draw_lottery_params", cVar.f226709f);
                jSONObject.put("is_show_btn", cVar.f226710g);
                JSONObject jSONObject3 = new JSONObject();
                C77818a aVar = cVar.f226711h;
                if (aVar != null) {
                    jSONObject3.put("btn_words", aVar.f226694d);
                    jSONObject3.put("btn_color", cVar.f226711h.f226695e);
                    jSONObject3.put("btn_op_type", cVar.f226711h.f226696f);
                    jSONObject3.put("url", cVar.f226711h.f226697g);
                    JSONObject jSONObject4 = new JSONObject();
                    C77824g gVar = cVar.f226711h.f226698h;
                    if (gVar != null) {
                        jSONObject4.put("activity_tinyapp_username", gVar.f226745d);
                        jSONObject4.put("activity_tinyapp_path", cVar.f226711h.f226698h.f226746e);
                        jSONObject4.put("activity_tinyapp_version", cVar.f226711h.f226698h.f226747f);
                    }
                    jSONObject3.put("mini_app_info", jSONObject4);
                    jSONObject3.put("get_lottery_params", cVar.f226711h.f226699i);
                }
                jSONObject.put("btn_info", jSONObject3);
                jSONObject.put("exposure_info_modify_params", cVar.f226712i);
                jSONObject.put("user_opertaion_type", cVar.f226713j);
                jSONObject.put("is_show_layer", cVar.f226714n);
                jSONObject.put("background_img_whole", cVar.f226716p);
                if (cVar.f226717q != null) {
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("animation_wording", cVar.f226717q.f226702f);
                    jSONObject5.put("animation_wording_color", cVar.f226717q.f226703g);
                    jSONObject5.put("url", cVar.f226717q.f226701e);
                    jSONObject5.put("op_type", cVar.f226717q.f226704h);
                    jSONObject5.put("after_animation_wording", cVar.f226717q.f226705i);
                    jSONObject5.put("after_animation_wording_color", cVar.f226717q.f226706j);
                    JSONObject jSONObject6 = new JSONObject();
                    C77824g gVar2 = cVar.f226717q.f226700d;
                    if (gVar2 != null) {
                        jSONObject6.put("activity_tinyapp_username", gVar2.f226745d);
                        jSONObject6.put("activity_tinyapp_path", cVar.f226717q.f226700d.f226746e);
                        jSONObject6.put("activity_tinyapp_version", cVar.f226717q.f226700d.f226747f);
                    }
                    jSONObject5.put("mini_app_info", jSONObject6);
                    jSONObject.put("draw_lottery_info", jSONObject5);
                }
                return jSONObject.toString();
            } catch (Exception unused) {
            }
        }
        return "";
    }

    /* renamed from: g */
    public void mo99834g() {
        if (this.f210781s != null) {
            Log.m105924i("MicroMsg.WalletSuccPageAwardWidget", APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
            this.f210781s.addSceneEndListener(1859);
            this.f210781s.addSceneEndListener(2547);
            this.f210781s.addSceneEndListener(2803);
            this.f210781s.addSceneEndListener(2508);
            this.f210781s.addSceneEndListener(2529);
            this.f210781s.addSceneEndListener(2888);
        }
    }

    /* renamed from: h */
    public final void mo99835h(Context context) {
        C85868k2.m106137b(context).inflate(C0966R.C0971layout.cgj, this, true);
        this.f210773h = (ViewGroup) findViewById(C0966R.C0970id.brz);
        this.f210769d = (CdnImageView) findViewById(C0966R.C0970id.g6n);
        this.f210770e = (TextView) findViewById(C0966R.C0970id.h_d);
        this.f210771f = (TextView) findViewById(C0966R.C0970id.c2h);
        this.f210772g = (Button) findViewById(C0966R.C0970id.anq);
        this.f210776n = (WalletScratchShakeView) findViewById(C0966R.C0970id.j2u);
        this.f210774i = (ImageView) findViewById(C0966R.C0970id.a3a);
        this.f210777o = (WalletAwardShakeAnimView) findViewById(C0966R.C0970id.jhl);
        this.f210770e.setTextSize(1, 17.0f);
        this.f210771f.setTextSize(1, 14.0f);
        this.f210772g.setTextSize(1, 16.0f);
        this.f210769d.setRoundCorner(true);
        this.f210769d.setUseSdcardCache(true);
    }

    /* renamed from: i */
    public final void mo99836i() {
        C77818a aVar;
        boolean z;
        Log.m105924i("MicroMsg.WalletSuccPageAwardWidget", "initBaseLotteryView");
        LinkedList<C77826i> linkedList = this.f210778p.f226707d;
        int i = 2;
        Object[] objArr = new Object[2];
        objArr[0] = linkedList;
        objArr[1] = Integer.valueOf(linkedList != null ? linkedList.size() : 0);
        Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "singleExposureInfoList %s, size: %s", objArr);
        if (linkedList != null && linkedList.size() > 0) {
            this.f210779q = linkedList.get(0);
            C77826i iVar = this.f210779q;
            Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "singleExposureInfo %s, award_name: %s, award_description: %s, logo: %s", 0, iVar.f226753e, iVar.f226754f, iVar.f226752d);
            this.f210769d.setUrl(this.f210779q.f226752d);
            if (!Util.isNullOrNil(this.f210779q.f226752d)) {
                this.f210769d.setVisibility(0);
            }
            if (!Util.isNullOrNil(this.f210779q.f226753e)) {
                this.f210770e.setText(this.f210779q.f226753e);
                this.f210770e.setVisibility(0);
                try {
                    if (!Util.isNullOrNil(this.f210779q.f226756h)) {
                        this.f210770e.setTextColor(C43423i0.m46931b(this.f210779q.f226756h, true));
                    }
                } catch (Exception e) {
                    Log.printErrStackTrace("MicroMsg.WalletSuccPageAwardWidget", e, "parse award_name_color error: %s", e.getMessage());
                }
                z = true;
            } else {
                z = false;
            }
            if (!Util.isNullOrNil(this.f210779q.f226754f)) {
                this.f210771f.setText(this.f210779q.f226754f);
                this.f210771f.setVisibility(0);
                try {
                    if (!Util.isNullOrNil(this.f210779q.f226757i)) {
                        this.f210771f.setTextColor(C43423i0.m46931b(this.f210779q.f226757i, true));
                    }
                } catch (Exception e2) {
                    Log.printErrStackTrace("MicroMsg.WalletSuccPageAwardWidget", e2, "parse award_description_color error: %s", e2.getMessage());
                }
                z = true;
            }
            if (z) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f210770e.getLayoutParams();
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f210771f.getLayoutParams();
                if (!Util.isNullOrNil(this.f210779q.f226753e) && Util.isNullOrNil(this.f210779q.f226754f)) {
                    layoutParams.addRule(15, -1);
                    layoutParams2.addRule(15, 0);
                    this.f210770e.setLayoutParams(layoutParams);
                    this.f210771f.setLayoutParams(layoutParams2);
                    this.f210770e.setVisibility(0);
                    this.f210771f.setVisibility(8);
                } else if (!Util.isNullOrNil(this.f210779q.f226753e) || Util.isNullOrNil(this.f210779q.f226754f)) {
                    layoutParams.addRule(15, 0);
                    layoutParams2.addRule(15, 0);
                    this.f210770e.setLayoutParams(layoutParams);
                    this.f210771f.setLayoutParams(layoutParams2);
                    this.f210770e.setVisibility(0);
                    this.f210771f.setVisibility(0);
                } else {
                    layoutParams.addRule(15, 0);
                    layoutParams2.addRule(15, -1);
                    this.f210770e.setLayoutParams(layoutParams);
                    this.f210771f.setLayoutParams(layoutParams2);
                    this.f210770e.setVisibility(8);
                    this.f210771f.setVisibility(0);
                }
            }
            if (!Util.isNullOrNil(this.f210779q.f226755g)) {
                Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "background_img: %s", this.f210779q.f226755g);
                C20937c.C20939b bVar = new C20937c.C20939b();
                bVar.f59346b = true;
                bVar.f59347c = true;
                bVar.f59350f = mo99831d(this.f210779q.f226755g);
                C20828a.m22825b().mo32521j(this.f210779q.f226755g, (ImageView) null, bVar.mo32666a(), new C72452b());
            } else {
                this.f210774i.setVisibility(8);
                View findViewById = findViewById(C0966R.C0970id.f358887ho0);
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view = findViewById;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget", "initBaseLotteryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget", "initBaseLotteryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                View findViewById2 = findViewById(C0966R.C0970id.f358888ho1);
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                View view2 = findViewById2;
                C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget", "initBaseLotteryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget", "initBaseLotteryView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        Object[] objArr2 = new Object[3];
        objArr2[0] = Integer.valueOf(this.f210778p.f226710g);
        C77818a aVar4 = this.f210778p.f226711h;
        objArr2[1] = aVar4;
        objArr2[2] = aVar4 != null ? aVar4.f226694d : "";
        Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "is_show_btn: %s, btn_info: %s, btn_words: %s", objArr2);
        C77820c cVar = this.f210778p;
        if (cVar.f226710g == 0 || (aVar = cVar.f226711h) == null || Util.isNullOrNil(aVar.f226694d)) {
            this.f210772g.setVisibility(8);
        } else {
            C77818a aVar5 = this.f210778p.f226711h;
            if (aVar5 != null) {
                Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "btn_words: %s, type: %s, color: %s, url: %s", aVar5.f226694d, Integer.valueOf(aVar5.f226696f), aVar5.f226695e, aVar5.f226697g);
                this.f210772g.setText(aVar5.f226694d);
                if (!Util.isNullOrNil(aVar5.f226695e)) {
                    Drawable drawable = getContext().getResources().getDrawable(C0966R.C0969drawable.f4653j6);
                    drawable.setColorFilter(C43423i0.m46931b(aVar5.f226695e, false), PorterDuff.Mode.SRC);
                    this.f210772g.setBackground(drawable);
                }
                this.f210772g.setOnClickListener(new C72455c());
                this.f210772g.setVisibility(0);
                if (this.f210785w || this.f210783u) {
                    C115669n nVar = C115669n.INSTANCE;
                    Object[] objArr3 = new Object[2];
                    objArr3[0] = 1;
                    if (!this.f210783u) {
                        i = 1;
                    }
                    objArr3[1] = Integer.valueOf(i);
                    nVar.mo160131h(15225, objArr3);
                }
            }
        }
        if (this.f210770e.getVisibility() == 0) {
            this.f210770e.setSingleLine();
            this.f210770e.post(new C72458d());
        }
        if (this.f210772g.getVisibility() != 0) {
            this.f210770e.setEllipsize(TextUtils.TruncateAt.END);
        }
        int i2 = this.f210778p.f226714n;
        if (i2 != 0) {
            Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "exposureInfo.is_show_layer is true: %s, direct show layer", Integer.valueOf(i2));
        }
        if (!Util.isNullOrNil(this.f210778p.f226716p)) {
            Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "background_img_whole: %s", this.f210778p.f226716p);
            ImageView imageView = this.f210775j;
            if (imageView != null) {
                imageView.setVisibility(0);
                C20937c.C20939b bVar2 = new C20937c.C20939b();
                bVar2.f59346b = true;
                bVar2.f59347c = true;
                bVar2.f59350f = mo99831d(this.f210778p.f226716p);
                C20828a.m22825b().mo32521j(this.f210778p.f226716p, (ImageView) null, bVar2.mo32666a(), new C72459e());
            }
        }
    }

    /* renamed from: j */
    public void mo99837j() {
        WalletBaseUI walletBaseUI = this.f210781s;
        if (walletBaseUI != null) {
            walletBaseUI.removeSceneEndListener(1859);
            this.f210781s.removeSceneEndListener(2547);
            this.f210781s.removeSceneEndListener(2803);
            this.f210781s.removeSceneEndListener(2508);
            this.f210781s.removeSceneEndListener(2529);
            this.f210781s.removeSceneEndListener(2888);
            int i = 2;
            Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "onDestroy, isShakeOrScratch: %s, isClickAwardButton: %s", Boolean.valueOf(this.f210784v), Boolean.valueOf(this.f210786x));
            if (!this.f210784v && !this.f210786x) {
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[2];
                objArr[0] = 6;
                if (!this.f210783u) {
                    i = 1;
                }
                objArr[1] = Integer.valueOf(i);
                nVar.mo160131h(15225, objArr);
                Log.m105924i("MicroMsg.WalletSuccPageAwardWidget", "user do nothing and quit ui, call drawlottery");
                this.f210781s.doSceneProgress(new C52773m(this.f210778p.f226709f, 4, this.f210782t), false);
            }
        }
        WalletScratchShakeView walletScratchShakeView = this.f210776n;
        if (walletScratchShakeView != null) {
            walletScratchShakeView.mo99823a();
        }
        WalletAwardShakeAnimView walletAwardShakeAnimView = this.f210777o;
        if (walletAwardShakeAnimView != null) {
            walletAwardShakeAnimView.mo99803a();
        }
    }

    /* renamed from: k */
    public void mo99838k() {
        Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "onResume, isClickH5OrTinyApp: %s, exposureInfo: %s, isMiniAppReturn: %s", Boolean.valueOf(this.f210783u), mo99833f(this.f210778p), Boolean.valueOf(this.f210768A));
        if (!this.f210768A) {
            this.f210768A = true;
            mo99843p();
        }
    }

    /* renamed from: l */
    public boolean mo99839l(int i, int i2, String str, C117747y yVar) {
        LinkedList<C77826i> linkedList;
        C77824g gVar;
        int i3 = 0;
        Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "onSceneEnd, errType: %s, errCode: %s, errMsg: %s, scene: %s", Integer.valueOf(i), Integer.valueOf(i2), str, yVar);
        String str2 = "";
        if (yVar instanceof C52775o) {
            C52775o oVar = (C52775o) yVar;
            if (i == 0 && i2 == 0) {
                C50074k32 k322 = oVar.f147459d;
                if (k322 == null) {
                    Log.m105920e("MicroMsg.WalletSuccPageAwardWidget", "getLottery end, response is null!!");
                    return true;
                }
                Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "getLottery ret_code: %s, ret_msg: %s, alert_wording: %s, exposure_info: %s", Integer.valueOf(k322.f136530d), k322.f136531e, k322.f136533g, k322.f136532f);
                if (k322.f136530d != 0) {
                    Log.m105924i("MicroMsg.WalletSuccPageAwardWidget", "getLotteryFailed");
                    mo99842o();
                } else if (!Util.isNullOrNil(k322.f136533g)) {
                    C76701a.makeText(getContext(), (CharSequence) k322.f136533g, 1).show();
                    return true;
                } else {
                    C77820c cVar = k322.f136532f;
                    if (cVar != null) {
                        C77818a aVar = this.f210778p.f226711h;
                        int i4 = aVar != null ? aVar.f226696f : 0;
                        this.f210778p = cVar;
                        C77818a aVar2 = cVar.f226711h;
                        if (!(aVar2 == null || aVar2 == null)) {
                            Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "getLottery end, btn_op_type: %s", Integer.valueOf(aVar2.f226696f));
                            if (k322.f136532f.f226711h.f226696f == 4) {
                                Log.m105924i("MicroMsg.WalletSuccPageAwardWidget", "update exposureInfo, new btn_op_type is 4");
                                this.f210778p.f226711h.f226696f = i4;
                            }
                        }
                        Log.m105924i("MicroMsg.WalletSuccPageAwardWidget", "update exposureInfo");
                        mo99840m();
                    }
                    C77818a aVar3 = this.f210787y;
                    if (aVar3 != null && this.f210786x) {
                        int i5 = aVar3.f226696f;
                        if (i5 == 8) {
                            Log.m105924i("MicroMsg.WalletSuccPageAwardWidget", "on getLotteryEnd, btn_op_type==GET_LOTTERY_AND_JUMP_URL, goto h5");
                            C75228t.m90219L(this.f210781s, this.f210787y.f226697g, false);
                            this.f210783u = true;
                        } else if (i5 == 9 && (gVar = aVar3.f226698h) != null) {
                            Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "on getLotteryEnd, btn_op_type==GET_LOTTERY_AND_JUMP_MINI_APP, jump tiny app, userName: %s, path: %s, version: %s", gVar.f226745d, gVar.f226746e, Integer.valueOf(gVar.f226747f));
                            StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
                            StartAppBrandUIFromOuterEvent.C1142a aVar4 = startAppBrandUIFromOuterEvent.f9522d;
                            aVar4.f9526a = gVar.f226745d;
                            aVar4.f9527b = Util.nullAs(gVar.f226746e, str2);
                            StartAppBrandUIFromOuterEvent.C1142a aVar5 = startAppBrandUIFromOuterEvent.f9522d;
                            aVar5.f9529d = C90694b.CTRL_INDEX;
                            aVar5.f9530e = this.f210780r;
                            aVar5.f9528c = 0;
                            int i6 = gVar.f226747f;
                            if (i6 > 0) {
                                aVar5.f9534i = i6;
                            }
                            aVar5.f9531f = this.f210781s;
                            startAppBrandUIFromOuterEvent.publish();
                            this.f210783u = true;
                            this.f210768A = false;
                            this.f210788z.postDelayed(new C72451a(), 3000);
                        }
                    }
                    this.f210787y = null;
                }
            } else {
                mo99842o();
            }
            return true;
        } else if (yVar instanceof C52776p) {
            C52776p pVar = (C52776p) yVar;
            if (i == 0 && i2 == 0) {
                C48975ca0 ca02 = pVar.f147463d;
                if (ca02 == null) {
                    Log.m105920e("MicroMsg.WalletSuccPageAwardWidget", "modifyExposure end, response is null!!");
                    return true;
                }
                Object[] objArr = new Object[6];
                objArr[0] = Integer.valueOf(ca02.f131586d);
                objArr[1] = ca02.f131587e;
                objArr[2] = ca02.f131588f;
                objArr[3] = Integer.valueOf(ca02.f131589g);
                C77818a aVar6 = ca02.f131590h;
                objArr[4] = aVar6;
                objArr[5] = Integer.valueOf(aVar6 != null ? aVar6.f226696f : 0);
                Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "modifyExposure, ret_code: %s, ret_msg: %s, single_exposure_info_list: %s, is_show_btn: %s, btn_info: %s, btn_op_type: %s", objArr);
                if (ca02.f131586d == 0) {
                    C77820c cVar2 = this.f210778p;
                    cVar2.f226707d = ca02.f131588f;
                    cVar2.f226710g = ca02.f131589g;
                    C77818a aVar7 = cVar2.f226711h;
                    int i7 = aVar7 != null ? aVar7.f226696f : 0;
                    C77818a aVar8 = ca02.f131590h;
                    if (aVar8 != null) {
                        cVar2.f226711h = aVar8;
                        if (aVar8 != null && aVar8.f226696f == 4) {
                            Log.m105924i("MicroMsg.WalletSuccPageAwardWidget", "update exposureInfo, new btn_op_type is 4");
                            this.f210778p.f226711h.f226696f = i7;
                        }
                    }
                    Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "after modify, exposureInfo: %s", mo99833f(this.f210778p));
                    mo99836i();
                }
            }
            this.f210783u = false;
            return true;
        } else if (!(yVar instanceof C52773m)) {
            return false;
        } else {
            C52773m mVar = (C52773m) yVar;
            if (i == 0 && i2 == 0) {
                C51926x50 x502 = mVar.f147451d;
                if (x502 == null) {
                    Log.m105920e("MicroMsg.WalletSuccPageAwardWidget", "drawLottery end, response is null!!");
                    return true;
                }
                Object[] objArr2 = new Object[4];
                objArr2[0] = Integer.valueOf(x502.f144458d);
                objArr2[1] = x502.f144459e;
                C77820c cVar3 = x502.f144460f;
                objArr2[2] = cVar3;
                Object obj = str2;
                if (cVar3 != null) {
                    obj = cVar3.f226707d;
                }
                objArr2[3] = obj;
                Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "drawLottery end, retcode: %s, retmsg: %s, exposure_info: %s, single_exposure_info_list: %s", objArr2);
                C77820c cVar4 = x502.f144460f;
                if (cVar4 == null || (linkedList = cVar4.f226707d) == null || linkedList.size() <= 0) {
                    mo99842o();
                } else {
                    Object[] objArr3 = new Object[3];
                    C77820c cVar5 = x502.f144460f;
                    objArr3[0] = cVar5;
                    C77818a aVar9 = cVar5.f226711h;
                    objArr3[1] = aVar9;
                    objArr3[2] = Integer.valueOf(aVar9 != null ? aVar9.f226696f : 0);
                    Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "drawLottery end, exposureInfo: %s, btninfo: %s, btn_op_type: %s", objArr3);
                    C77818a aVar10 = this.f210778p.f226711h;
                    if (aVar10 != null) {
                        i3 = aVar10.f226696f;
                    }
                    C77820c cVar6 = x502.f144460f;
                    this.f210778p = cVar6;
                    C77818a aVar11 = cVar6.f226711h;
                    if (!(aVar11 == null || aVar11 == null || aVar11.f226696f != 4)) {
                        Log.m105924i("MicroMsg.WalletSuccPageAwardWidget", "update exposureInfo, new btn_op_type is 4");
                        this.f210778p.f226711h.f226696f = i3;
                    }
                    mo99840m();
                }
            } else {
                mo99842o();
            }
            return true;
        }
    }

    /* renamed from: m */
    public final void mo99840m() {
        int i = 2;
        Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "setViewByData, exposureInfo: %s, isFirstShow: %s", mo99833f(this.f210778p), Boolean.valueOf(this.f210785w));
        C77820c cVar = this.f210778p;
        if (cVar == null) {
            Log.m105920e("MicroMsg.WalletSuccPageAwardWidget", "setViewByData, exposureInfo is null!");
            return;
        }
        Log.printInfoStack("MicroMsg.WalletSuccPageAwardWidget", "setViewByData, user_operation_type: %s, single_exposure_info_list size: %s, isClickH5OrTinyApp: %s", Integer.valueOf(cVar.f226713j), Integer.valueOf(this.f210778p.f226707d.size()), Boolean.valueOf(this.f210783u));
        C77820c cVar2 = this.f210778p;
        int i2 = cVar2.f226713j;
        if (i2 >= 1 && i2 <= 5 && m84798e(cVar2)) {
            int i3 = this.f210778p.f226713j;
            if (i3 == 4) {
                mo99836i();
                if (this.f210776n.getVisibility() != 8) {
                    this.f210776n.setVisibility(8);
                    this.f210776n.mo99823a();
                }
                if (this.f210777o.getVisibility() != 8) {
                    this.f210777o.setVisibility(8);
                    this.f210777o.mo99803a();
                }
            } else if (i3 == 1 || i3 == 2 || i3 == 3) {
                mo99836i();
                if (this.f210777o.getVisibility() != 8) {
                    this.f210777o.setVisibility(8);
                    this.f210777o.mo99803a();
                }
                if (this.f210776n.getVisibility() != 0) {
                    this.f210776n.setVisibility(0);
                    this.f210776n.post(new C75888m(this));
                }
            } else if (i3 == 5) {
                mo99836i();
                if (this.f210776n.getVisibility() != 8) {
                    this.f210776n.setVisibility(8);
                    this.f210776n.mo99823a();
                }
                C77819b bVar = this.f210778p.f226717q;
                if (bVar != null) {
                    Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "setWithNewShakeView, op_type: %s", Integer.valueOf(bVar.f226704h));
                    C77819b bVar2 = this.f210778p.f226717q;
                    int i4 = bVar2.f226704h;
                    if (i4 == 1) {
                        if (this.f210777o.getVisibility() != 0) {
                            this.f210777o.setVisibility(0);
                            this.f210777o.post(new C75889n(this));
                        }
                        this.f210777o.mo99803a();
                        if (!Util.isNullOrNil(this.f210778p.f226717q.f226702f)) {
                            Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "animation_wording: %s", this.f210778p.f226717q.f226702f);
                            this.f210777o.setShakeHintWording(this.f210778p.f226717q.f226702f);
                        }
                        if (!Util.isNullOrNil(this.f210778p.f226717q.f226703g)) {
                            try {
                                Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "animation_wording_color: %s", this.f210778p.f226717q.f226703g);
                                this.f210777o.setShakeHintWordingColor(C43423i0.m46931b(this.f210778p.f226717q.f226703g, true));
                            } catch (Exception e) {
                                Log.printErrStackTrace("MicroMsg.WalletSuccPageAwardWidget", e, "parse animation_wording_color %s error %s", this.f210778p.f226717q.f226703g, e.getMessage());
                            }
                        }
                        if (!Util.isNullOrNil(this.f210778p.f226717q.f226705i)) {
                            Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "after_animation_wording: %s", this.f210778p.f226717q.f226705i);
                            this.f210777o.setAfterHintWording(this.f210778p.f226717q.f226705i);
                        }
                        if (!Util.isNullOrNil(this.f210778p.f226717q.f226706j)) {
                            Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "after_animation_wording_color: %s", this.f210778p.f226717q.f226706j);
                            try {
                                this.f210777o.setAfterHintWordingColor(C43423i0.m46931b(this.f210778p.f226717q.f226706j, true));
                            } catch (Exception e2) {
                                Log.printErrStackTrace("MicroMsg.WalletSuccPageAwardWidget", e2, "parse after_animation_wording_color %s error %s", this.f210778p.f226717q.f226706j, e2.getMessage());
                            }
                        }
                        this.f210777o.setShakeOrClickCallback(new C72468g(this));
                        WalletAwardShakeAnimView walletAwardShakeAnimView = this.f210777o;
                        walletAwardShakeAnimView.getClass();
                        Log.m105924i("MicroMsg.WalletAwardShakeAnimView", "startShake");
                        C101998d dVar = new C101998d(walletAwardShakeAnimView.getContext());
                        walletAwardShakeAnimView.f210714f = dVar;
                        dVar.mo141497a(new C75885i(walletAwardShakeAnimView));
                        walletAwardShakeAnimView.f210715g = Util.currentTicks();
                        walletAwardShakeAnimView.setOnClickListener(new C72462a(walletAwardShakeAnimView));
                        MMHandlerThread.removeRunnable(walletAwardShakeAnimView.f210724s);
                        MMHandlerThread.postToMainThreadDelayed(walletAwardShakeAnimView.f210724s, 3000);
                    } else if (i4 == 2) {
                        C77824g gVar = bVar2.f226700d;
                        if (gVar != null) {
                            Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "setWithNewShakeView, jump tiny app, userName: %s, path: %s, version: %s", gVar.f226745d, gVar.f226746e, Integer.valueOf(gVar.f226747f));
                            StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new StartAppBrandUIFromOuterEvent();
                            StartAppBrandUIFromOuterEvent.C1142a aVar = startAppBrandUIFromOuterEvent.f9522d;
                            aVar.f9526a = gVar.f226745d;
                            aVar.f9527b = Util.nullAs(gVar.f226746e, "");
                            StartAppBrandUIFromOuterEvent.C1142a aVar2 = startAppBrandUIFromOuterEvent.f9522d;
                            aVar2.f9529d = C90694b.CTRL_INDEX;
                            aVar2.f9530e = this.f210780r;
                            aVar2.f9528c = 0;
                            int i5 = gVar.f226747f;
                            if (i5 > 0) {
                                aVar2.f9534i = i5;
                            }
                            aVar2.f9531f = this.f210781s;
                            startAppBrandUIFromOuterEvent.publish();
                            this.f210783u = true;
                            this.f210768A = false;
                            this.f210788z.postDelayed(new C75890o(this), 3000);
                        }
                    } else if (i4 == 3) {
                        Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "setWithNewShakeView, goto h5, url: %s", bVar2.f226701e);
                        C75228t.m90219L(this.f210781s, this.f210778p.f226717q.f226701e, false);
                        this.f210783u = true;
                        this.f210768A = false;
                        this.f210788z.postDelayed(new C75891p(this), 3000);
                    } else if (i4 != 4) {
                        this.f210777o.setVisibility(8);
                        this.f210777o.mo99803a();
                    } else {
                        Log.m105924i("MicroMsg.WalletSuccPageAwardWidget", "setWithNewShakeView, directly show info");
                        this.f210776n.setVisibility(8);
                        this.f210776n.mo99823a();
                        this.f210777o.setVisibility(8);
                        this.f210777o.mo99803a();
                    }
                } else {
                    this.f210777o.setVisibility(8);
                    this.f210777o.mo99803a();
                }
            }
            if (this.f210785w || this.f210783u) {
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[2];
                objArr[0] = 3;
                if (!this.f210783u) {
                    i = 1;
                }
                objArr[1] = Integer.valueOf(i);
                nVar.mo160131h(15225, objArr);
            }
            this.f210785w = false;
        }
    }

    /* renamed from: n */
    public void mo99841n(WalletBaseUI walletBaseUI, C77820c cVar, String str, boolean z, ImageView imageView) {
        Object[] objArr = new Object[5];
        boolean z2 = false;
        objArr[0] = mo99833f(cVar);
        objArr[1] = Boolean.valueOf(cVar == null || cVar.f226715o == null);
        if (imageView == null) {
            z2 = true;
        }
        objArr[2] = Boolean.valueOf(z2);
        objArr[3] = Boolean.valueOf(this.f210783u);
        objArr[4] = Boolean.valueOf(z);
        Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "setWidgetData, exposureInfo: %s, layerInfo==null: %s, hostUIBackgroundView==null:%s, isClickH5OrTinyApp: %s, isF2F: %s", objArr);
        this.f210781s = walletBaseUI;
        this.f210778p = cVar;
        this.f210782t = z;
        this.f210780r = str;
        this.f210775j = imageView;
        mo99840m();
    }

    /* renamed from: o */
    public final void mo99842o() {
        Log.m105924i("MicroMsg.WalletSuccPageAwardWidget", "showNetFailedView");
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f210770e.getLayoutParams();
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f210771f.getLayoutParams();
        layoutParams.addRule(15, -1);
        layoutParams2.addRule(15, 0);
        this.f210770e.setLayoutParams(layoutParams);
        this.f210771f.setLayoutParams(layoutParams2);
        this.f210770e.setVisibility(0);
        this.f210771f.setVisibility(8);
        this.f210770e.setText(C0966R.string.l9i);
        this.f210770e.setTextColor(getResources().getColor(C0966R.color.a7f));
        this.f210771f.setTextColor(getResources().getColor(C0966R.color.f3563xt));
        this.f210774i.setVisibility(8);
        View findViewById = findViewById(C0966R.C0970id.f358887ho0);
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view = findViewById;
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget", "showNetFailedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget", "showNetFailedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View findViewById2 = findViewById(C0966R.C0970id.f358888ho1);
        C9556a aVar2 = new C9556a();
        aVar2.mo10233c(0);
        View view2 = findViewById2;
        C117292a.m165358d(view2, aVar2.mo10232b(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget", "showNetFailedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/wallet_core/ui/view/WalletSuccPageAwardWidget", "showNetFailedView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f210772g.setVisibility(8);
        this.f210769d.setVisibility(0);
        this.f210769d.setImageResource(C0966R.C0969drawable.cf9);
        this.f210776n.setVisibility(8);
        this.f210776n.mo99823a();
        this.f210777o.setVisibility(8);
        this.f210777o.mo99803a();
    }

    /* renamed from: p */
    public final void mo99843p() {
        Log.m105924i("MicroMsg.WalletSuccPageAwardWidget", "updateViewAfterMiniAppReturn");
        C77819b bVar = this.f210778p.f226717q;
        if (!(bVar == null || bVar.f226704h == 1)) {
            this.f210776n.setVisibility(8);
            this.f210776n.mo99823a();
            this.f210777o.setVisibility(8);
            this.f210777o.mo99803a();
        }
        Log.m105925i("MicroMsg.WalletSuccPageAwardWidget", "tryDoModifyExposure, isClickH5OrTinyApp: %s", Boolean.valueOf(this.f210783u));
        if (this.f210783u) {
            this.f210781s.doSceneProgress(new C52776p(this.f210778p.f226712i, this.f210782t), false);
        }
    }

    public WalletSuccPageAwardWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo99835h(context);
    }
}
