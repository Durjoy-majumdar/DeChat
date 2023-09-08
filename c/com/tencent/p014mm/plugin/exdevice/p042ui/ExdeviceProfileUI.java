package com.tencent.p014mm.plugin.exdevice.p042ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.GestureDetector;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;
import c81.C39904a;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.OplogServiceResultEvent;
import com.tencent.p014mm.p136ui.base.MMPullDownView;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.plugin.exdevice.model.C41158q1;
import com.tencent.p014mm.plugin.exdevice.model.C41166r1;
import com.tencent.p014mm.plugin.secdata.p843ui.MMSecDataActivity;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72996z1;
import com.tencent.p014mm.vfs.C86009m1;
import eb0.C45628s0;
import eb0.C75592q0;
import f40.C86709a0;
import f62.C75700k0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import m71.C46948b;
import nj3.C11184p0;
import nj3.C76879j;
import ob0.C117747y;
import qo3.C77407n;
import qo3.C89779i0;
import sn0.C90259e;
import t71.C48540e;
import t71.C48544g;
import t71.C48545h;
import t71.C48546i;
import t71.C48551m;
import te3.r85;
import tv2.C14096e;
import u71.C52451c;
import u71.C52452d;
import u71.C52453e;
import v71.C37687a;

/* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI */
public class ExdeviceProfileUI extends MMSecDataActivity implements C52453e {

    /* renamed from: M */
    public static int f111160M;

    /* renamed from: A */
    public boolean f111161A;

    /* renamed from: B */
    public String f111162B;

    /* renamed from: C */
    public C46948b<C48546i> f111163C = new C41278c();

    /* renamed from: D */
    public TextPaint f111164D = new TextPaint(1);

    /* renamed from: E */
    public int f111165E = 0;

    /* renamed from: F */
    public C11184p0 f111166F = new C41283h();

    /* renamed from: G */
    public C46948b<C48545h> f111167G = new C41285i();

    /* renamed from: H */
    public C46948b<C48544g> f111168H = new C41276a();

    /* renamed from: I */
    public C46948b<C48544g> f111169I = new C41280e();

    /* renamed from: J */
    public IListener<OplogServiceResultEvent> f111170J = new IListener<OplogServiceResultEvent>(C40008f.f107254d) {
        {
            this.__eventId = 1984241019;
        }

        public boolean callback(IEvent iEvent) {
            OplogServiceResultEvent oplogServiceResultEvent = (OplogServiceResultEvent) iEvent;
            oplogServiceResultEvent.f107687d.getClass();
            OplogServiceResultEvent.C40152a aVar = oplogServiceResultEvent.f107687d;
            Log.m105925i("MicroMsg.Sport.ExdeviceProfileUI", "count: %d ret: %s title: %s content: %s", 0, Integer.valueOf(oplogServiceResultEvent.f107687d.f107688a), aVar.f107689b, aVar.f107690c);
            C89779i0 i0Var = ExdeviceProfileUI.this.f111192z;
            if (i0Var != null && i0Var.isShowing()) {
                ExdeviceProfileUI.this.f111192z.dismiss();
            }
            ExdeviceProfileUI.this.f111170J.dead();
            Intent intent = new Intent();
            intent.putExtra("KeyNeedUpdateRank", true);
            ExdeviceProfileUI.this.setResult(-1, intent);
            ExdeviceProfileUI.this.finish();
            return false;
        }
    };

    /* renamed from: K */
    public GestureDetector f111171K;

    /* renamed from: L */
    public MMPullDownView.C44709b f111172L = new C41282g();

    /* renamed from: d */
    public String f111173d;

    /* renamed from: e */
    public String f111174e;

    /* renamed from: f */
    public String f111175f;

    /* renamed from: g */
    public String f111176g;

    /* renamed from: h */
    public C37687a f111177h;

    /* renamed from: i */
    public ArrayList<String> f111178i;

    /* renamed from: j */
    public r85 f111179j;

    /* renamed from: n */
    public ExdeviceProfileAffectedUserView f111180n;

    /* renamed from: o */
    public ImageView f111181o;

    /* renamed from: p */
    public ListView f111182p;

    /* renamed from: q */
    public ExdeviceProfileListHeader f111183q;

    /* renamed from: r */
    public C41377v f111184r;

    /* renamed from: s */
    public View f111185s;

    /* renamed from: t */
    public String f111186t;

    /* renamed from: u */
    public String f111187u;

    /* renamed from: v */
    public boolean f111188v;

    /* renamed from: w */
    public boolean f111189w;

    /* renamed from: x */
    public int f111190x;

    /* renamed from: y */
    public boolean f111191y = false;

    /* renamed from: z */
    public C89779i0 f111192z = null;

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI$a */
    public class C41276a implements C46948b<C48544g> {
        public C41276a() {
        }

        /* renamed from: a */
        public void mo64355a(int i, int i2, String str, C117747y yVar) {
            C48544g gVar = (C48544g) yVar;
            Log.m105924i("MicroMsg.Sport.ExdeviceProfileUI", "on NetSceneAddFollow end,errType:" + i + "  errCode:" + i2 + "  errMsg:" + str);
            if (i == 0 && i2 == 0) {
                Intent intent = new Intent();
                intent.putExtra("KeyNeedUpdateRank", true);
                ExdeviceProfileUI.this.setResult(-1, intent);
                ExdeviceProfileUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI$b */
    public class C41277b implements View.OnClickListener {
        public C41277b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C14096e.m13447a(18);
            C48540e.m53922d(ExdeviceProfileUI.this);
            C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI$c */
    public class C41278c implements C46948b<C48546i> {
        public C41278c() {
        }

        /* renamed from: a */
        public void mo64355a(int i, int i2, String str, C117747y yVar) {
            C48546i iVar = (C48546i) yVar;
            if (!ExdeviceProfileUI.this.isFinishing()) {
                ExdeviceProfileUI exdeviceProfileUI = ExdeviceProfileUI.this;
                if (!exdeviceProfileUI.f111191y) {
                    if (i == 0 && i2 == 0 && iVar != null) {
                        exdeviceProfileUI.runOnUiThread(new C41383z(this, iVar));
                        ExdeviceProfileUI exdeviceProfileUI2 = ExdeviceProfileUI.this;
                        exdeviceProfileUI2.f111179j = iVar.f129839q;
                        exdeviceProfileUI2.f111187u = iVar.f129837o;
                        exdeviceProfileUI2.f111188v = iVar.f129842t;
                        exdeviceProfileUI2.f111190x = iVar.f129843u;
                        exdeviceProfileUI2.f111161A = iVar.f129844v;
                        exdeviceProfileUI2.f111162B = iVar.f129834i;
                        exdeviceProfileUI2.runOnUiThread(new C41316a0(this));
                        ExdeviceProfileUI exdeviceProfileUI3 = ExdeviceProfileUI.this;
                        if (!exdeviceProfileUI3.f111189w) {
                            exdeviceProfileUI3.runOnUiThread(new C41320b0(exdeviceProfileUI3));
                        }
                        ExdeviceProfileUI exdeviceProfileUI4 = ExdeviceProfileUI.this;
                        exdeviceProfileUI4.getClass();
                        exdeviceProfileUI4.runOnUiThread(new C41362p0(exdeviceProfileUI4));
                        return;
                    }
                    return;
                }
            }
            ExdeviceProfileUI exdeviceProfileUI5 = ExdeviceProfileUI.this;
            int i3 = ExdeviceProfileUI.f111160M;
            exdeviceProfileUI5.getClass();
            exdeviceProfileUI5.runOnUiThread(new C41362p0(exdeviceProfileUI5));
            Log.m105924i("MicroMsg.Sport.ExdeviceProfileUI", "ExdeviceProfileUI has been destroyed.");
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI$d */
    public class C41279d implements View.OnClickListener {
        public C41279d() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            ExdeviceProfileUI exdeviceProfileUI = ExdeviceProfileUI.this;
            int i = ExdeviceProfileUI.f111160M;
            C77407n nVar = new C77407n((Context) exdeviceProfileUI.getContext(), 1, false);
            nVar.f225771i = new C41366r0(exdeviceProfileUI);
            nVar.f225782p = exdeviceProfileUI.f111166F;
            nVar.mo107573q();
            C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI$20", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI$e */
    public class C41280e implements C46948b<C48544g> {
        public C41280e() {
        }

        /* renamed from: a */
        public void mo64355a(int i, int i2, String str, C117747y yVar) {
            C48544g gVar = (C48544g) yVar;
            if (i == 0 && i2 == 0) {
                ExdeviceProfileUI exdeviceProfileUI = ExdeviceProfileUI.this;
                int i3 = ExdeviceProfileUI.f111160M;
                exdeviceProfileUI.getClass();
                exdeviceProfileUI.runOnUiThread(new C41362p0(exdeviceProfileUI));
                ExdeviceProfileUI.this.runOnUiThread(new C41340k0(this));
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI$f */
    public class C41281f implements Runnable {
        public C41281f() {
        }

        public void run() {
            ExdeviceProfileUI exdeviceProfileUI = ExdeviceProfileUI.this;
            int i = ExdeviceProfileUI.f111160M;
            exdeviceProfileUI.mo64354K7();
            ExdeviceProfileUI.this.f111184r.notifyDataSetChanged();
            ExdeviceProfileUI.this.mo64353J7();
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI$g */
    public class C41282g implements MMPullDownView.C44709b {
        public C41282g() {
        }

        /* renamed from: a */
        public boolean mo64359a(MotionEvent motionEvent) {
            GestureDetector gestureDetector = ExdeviceProfileUI.this.f111171K;
            C9556a aVar = new C9556a();
            aVar.mo10233c(motionEvent);
            GestureDetector gestureDetector2 = gestureDetector;
            C117292a.m165358d(gestureDetector2, aVar.mo10232b(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI$29", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            boolean onTouchEvent = gestureDetector.onTouchEvent((MotionEvent) aVar.mo10231a(0));
            C117292a.m165360f(gestureDetector2, onTouchEvent, "com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI$29", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
            return onTouchEvent;
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI$h */
    public class C41283h implements C11184p0 {

        /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI$h$a */
        public class C41284a implements DialogInterface.OnClickListener {
            public C41284a() {
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(ExdeviceProfileUI.this.f111174e);
                C14096e.m13447a(37);
                C45628s0.m50793p0(z1Var);
                ExdeviceProfileUI.this.f111170J.alive();
                C89779i0 i0Var = ExdeviceProfileUI.this.f111192z;
                if (i0Var != null) {
                    i0Var.show();
                }
            }
        }

        public C41283h() {
        }

        public void onMMMenuItemSelected(MenuItem menuItem, int i) {
            int itemId = menuItem.getItemId();
            String str = "--";
            if (itemId == 0) {
                C14096e.m13447a(26);
                ExdeviceProfileUI exdeviceProfileUI = ExdeviceProfileUI.this;
                int i2 = exdeviceProfileUI.f111190x;
                if (i2 != 0) {
                    str = String.valueOf(i2);
                }
                String str2 = str;
                r85 r85 = exdeviceProfileUI.f111179j;
                new C41158q1().mo64223b(exdeviceProfileUI, str2, r85 != null ? String.valueOf(r85.f140768e) : "__", exdeviceProfileUI.f111186t, new C41349m0(exdeviceProfileUI));
            } else if (itemId == 1) {
                C14096e.m13447a(27);
                ExdeviceProfileUI exdeviceProfileUI2 = ExdeviceProfileUI.this;
                int i3 = ExdeviceProfileUI.f111160M;
                C41158q1 q1Var = new C41158q1();
                int i4 = exdeviceProfileUI2.f111190x;
                if (i4 != 0) {
                    str = String.valueOf(i4);
                }
                String str3 = str;
                r85 r852 = exdeviceProfileUI2.f111179j;
                q1Var.mo64223b(exdeviceProfileUI2, str3, r852 != null ? String.valueOf(r852.f140768e) : "0", exdeviceProfileUI2.f111186t, new C41344l0(exdeviceProfileUI2));
            } else if (itemId == 2) {
                ExdeviceProfileUI exdeviceProfileUI3 = ExdeviceProfileUI.this;
                Log.m105925i("MicroMsg.Sport.ExdeviceProfileUI", "ap: start to del: %s", exdeviceProfileUI3.f111174e);
                C86709a0.m107529k().f251779b.mo123460f(new C48545h(exdeviceProfileUI3.f111174e, exdeviceProfileUI3.f111167G));
            } else if (itemId == 3) {
                C76879j.m92714H(ExdeviceProfileUI.this.getContext(), ExdeviceProfileUI.this.getString(C0966R.string.cga), (String) null, true, new C41284a(), (DialogInterface.OnClickListener) null);
            } else if (itemId == 4) {
                ExdeviceProfileUI.this.f111161A = true;
                C14096e.m13447a(10);
                C52451c Gx0 = C41166r1.Gx0();
                ExdeviceProfileUI exdeviceProfileUI4 = ExdeviceProfileUI.this;
                String str4 = exdeviceProfileUI4.f111176g;
                String str5 = exdeviceProfileUI4.f111174e;
                Gx0.getClass();
                C86709a0.m107529k().f251779b.mo123460f(new C48551m(str5, str4, 3, ""));
            } else if (itemId == 5) {
                C14096e.m13447a(41);
                Intent intent = new Intent();
                intent.putExtra("rawUrl", ExdeviceProfileUI.this.f111162B);
                C88144b.m109791i(ExdeviceProfileUI.this, "webview", ".ui.tools.WebViewUI", intent, (Bundle) null);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI$i */
    public class C41285i implements C46948b<C48545h> {
        public C41285i() {
        }

        /* renamed from: a */
        public void mo64355a(int i, int i2, String str, C117747y yVar) {
            C48545h hVar = (C48545h) yVar;
            Log.m105924i("MicroMsg.Sport.ExdeviceProfileUI", "on NetSceneDelFollow end,errType:" + i + "  errCode:" + i2 + "  errMsg:" + str);
            if (i == 0 && i2 == 0) {
                Intent intent = new Intent();
                intent.putExtra("KeyNeedUpdateRank", true);
                ExdeviceProfileUI.this.setResult(-1, intent);
                ExdeviceProfileUI.this.finish();
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI$j */
    public class C41286j extends GestureDetector.SimpleOnGestureListener {
        public C41286j(ExdeviceProfileUI exdeviceProfileUI, C41278c cVar) {
        }

        public boolean onContextClick(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI$YScrollDetector", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onContextClick = super.onContextClick(motionEvent);
            C117292a.m165362h(onContextClick, this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI$YScrollDetector", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
            return onContextClick;
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI$YScrollDetector", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
            boolean onDoubleTap = super.onDoubleTap(motionEvent);
            C117292a.m165362h(onDoubleTap, this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI$YScrollDetector", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
            return onDoubleTap;
        }

        public void onLongPress(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI$YScrollDetector", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V", this, array);
            super.onLongPress(motionEvent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI$YScrollDetector", "android/view/GestureDetector$SimpleOnGestureListener", C90259e.C90260a.NAME, "(Landroid/view/MotionEvent;)V");
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            return Math.abs(f2) < Math.abs(f);
        }

        public boolean onSingleTapUp(MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI$YScrollDetector", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
            C117292a.m165362h(true, this, "com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI$YScrollDetector", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: H7 */
    public static void m44679H7(ExdeviceProfileUI exdeviceProfileUI) {
        Class cls = C75700k0.class;
        exdeviceProfileUI.removeAllOptionMenu();
        if (C75592q0.m90789s().equals(exdeviceProfileUI.f111174e)) {
            exdeviceProfileUI.addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C41334j0(exdeviceProfileUI));
            return;
        }
        boolean s3 = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().mo69724s3(exdeviceProfileUI.f111174e);
        boolean z = (((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(exdeviceProfileUI.f111174e).getType() & 524288) != 0;
        if (exdeviceProfileUI.f111188v && s3) {
            exdeviceProfileUI.addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C41353n0(exdeviceProfileUI));
        } else if (!z) {
            exdeviceProfileUI.addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C41357o0(exdeviceProfileUI));
        }
    }

    /* renamed from: I7 */
    public static void m44680I7(ExdeviceProfileUI exdeviceProfileUI) {
        float f;
        float f2;
        View childAt = exdeviceProfileUI.f111182p.getChildAt(0);
        int[] iArr = new int[2];
        if (childAt != null && exdeviceProfileUI.f111182p.getFirstVisiblePosition() == 0) {
            childAt.getLocationOnScreen(iArr);
            if (f111160M == 0) {
                f111160M = iArr[1];
            }
            int i = iArr[1];
            int i2 = f111160M;
            if (i > (-i2) / 2) {
                if (i > 0) {
                    f2 = (float) (i * 2);
                    f = ((float) i2) * 2.0f;
                } else {
                    f2 = (float) i;
                    f = (float) i2;
                }
                exdeviceProfileUI.f111180n.setAlpha(f2 / f);
                exdeviceProfileUI.f111180n.setVisibility(0);
                return;
            }
            exdeviceProfileUI.f111180n.setAlpha(0.0f);
            exdeviceProfileUI.f111180n.setVisibility(8);
        }
    }

    /* renamed from: I6 */
    public void mo64352I6(String str, C52452d dVar) {
        if ("HardDeviceChampionInfo".equals(str) && this.f111174e.equals(dVar.f146567b)) {
            Log.m105918d("MicroMsg.Sport.ExdeviceProfileUI", "hy: url may changed. maybe reload background");
            this.f111177h = C41166r1.vx0().mo61492jo(this.f111174e);
            runOnUiThread(new C41281f());
        }
    }

    /* renamed from: J7 */
    public final void mo64353J7() {
        C37687a aVar = this.f111177h;
        if (aVar != null) {
            String str = this.f111186t;
            String str2 = aVar.field_championUrl;
            if (str == str2) {
                return;
            }
            if (str == null || !str.equals(str2)) {
                C48540e.m53920b(this, this.f111181o, this.f111177h.field_championUrl, C0966R.color.f3281m3);
                this.f111186t = this.f111177h.field_championUrl;
                return;
            }
            return;
        }
        this.f111181o.setImageResource(C0966R.color.f3281m3);
        this.f111186t = null;
    }

    /* renamed from: K7 */
    public final void mo64354K7() {
        ExdeviceProfileListHeader exdeviceProfileListHeader;
        View view;
        String s = C75592q0.m90789s();
        View view2 = this.f111185s;
        if (view2 != null) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI", "updateChangeCoverViewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view2, "com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI", "updateChangeCoverViewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (Util.isNullOrNil(s) || !s.equals(this.f111174e)) {
            C37687a aVar2 = this.f111177h;
            if (aVar2 != null && !Util.isNullOrNil(aVar2.field_championUrl) && (exdeviceProfileListHeader = this.f111183q) != null) {
                exdeviceProfileListHeader.setOnClickListener(new C41279d());
                return;
            }
            return;
        }
        C37687a aVar3 = this.f111177h;
        if (!(aVar3 == null || !Util.isNullOrNil(aVar3.field_championUrl) || (view = this.f111185s) == null)) {
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar4.mo10233c(0);
            C117292a.m165358d(view, aVar4.mo10232b(), "com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI", "updateChangeCoverViewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/exdevice/ui/ExdeviceProfileUI", "updateChangeCoverViewStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        ExdeviceProfileListHeader exdeviceProfileListHeader2 = this.f111183q;
        if (exdeviceProfileListHeader2 != null) {
            exdeviceProfileListHeader2.setOnClickListener(new C41277b());
        }
    }

    public int getLayoutId() {
        return C0966R.C0971layout.a4q;
    }

    public Set<Class<? extends UIComponent>> importUIComponents() {
        HashSet hashSet = new HashSet(super.importUIComponents());
        hashSet.add(C39904a.class);
        return hashSet;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        ArrayList<String> stringsToList;
        super.onActivityResult(i, i2, intent);
        if (!C48540e.m53919a(this, i, i2, intent, this.f111176g)) {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3 && i2 == -1 && (stringsToList = Util.stringsToList(intent.getStringExtra("Select_Contact").split(","))) != null) {
                        C89779i0 i0Var = this.f111192z;
                        if (i0Var != null) {
                            i0Var.show();
                        }
                        C86709a0.m107529k().f251779b.mo123460f(new C48544g(stringsToList, this.f111169I));
                    }
                } else if (i2 == -1) {
                    Toast.makeText(this, C0966R.string.j6i, 1).show();
                }
            } else if (i2 == -1) {
                String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
                String i3 = new C86009m1(getCacheDir(), "sport_share_bitmap.jpg").mo119971i();
                if (stringExtra == null || stringExtra.length() == 0) {
                    Log.m105920e("MicroMsg.Sport.ExdeviceProfileUI", "select conversation failed, toUser is null.");
                    return;
                }
                C41158q1.m44600c(this, stringExtra, i3, intent.getStringExtra("custom_send_text"), this.f111187u);
                C76879j.m92726T(getContext(), getResources().getString(C0966R.string.f360099a34));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0264, code lost:
        if (r4 <= 0) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0274, code lost:
        if (r12.f111165E > 0) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0276, code lost:
        r12.f111165E = 60;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0278, code lost:
        com.tencent.p014mm.sdk.platformtools.Log.m105919d("MicroMsg.Sport.ExdeviceProfileUI", "ap: ellipsizeWidth: %s", java.lang.Integer.valueOf(r12.f111165E));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x028a, code lost:
        if (r12.f111189w == false) goto L_0x0294;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x028c, code lost:
        r13 = getString(com.tencent.p014mm.C0966R.string.f360394cf0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0294, code lost:
        r2 = (p629ny.C76979h) di3.C86312j.m106911c(r13);
        r6 = new java.lang.Object[1];
        r7 = r12.f111174e;
        r8 = r12.f111165E;
        r9 = ((d62.C75339i) di3.C86312j.m106911c(d62.C75339i.class)).getDisplayName(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x02b3, code lost:
        if (r7.equalsIgnoreCase(r9) == false) goto L_0x02ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x02bb, code lost:
        if (com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil(r12.f111175f) != false) goto L_0x02ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x02bd, code lost:
        r13 = ((p629ny.C76979h) di3.C86312j.m106911c(r13)).mo107057T1(getContext(), r12.f111175f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x02ce, code lost:
        r13 = ((p629ny.C76979h) di3.C86312j.m106911c(r13)).mo107057T1(getContext(), r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x02dc, code lost:
        r7 = android.text.TextUtils.ellipsize(r13, r12.f111164D, (float) r8, android.text.TextUtils.TruncateAt.END);
        com.tencent.p014mm.sdk.platformtools.Log.m105919d("MicroMsg.Sport.ExdeviceProfileUI", " width: %d, ap: username %s, ellipseize username %s", java.lang.Integer.valueOf(r8), r13, r7);
        r6[0] = r7;
        r13 = r2.mo107057T1(r12, getString(com.tencent.p014mm.C0966R.string.cf4, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0300, code lost:
        setMMTitle(r13);
        setBackBtn(new com.tencent.p014mm.plugin.exdevice.p042ui.C41364q0(r12));
        com.tencent.p014mm.sdk.platformtools.Log.m105924i("MicroMsg.Sport.ExdeviceProfileUI", "mUsername:" + r12.f111174e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x032b, code lost:
        if (eb0.C75592q0.m90789s().equals(r12.f111174e) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x032d, code lost:
        ((tv2.C78112d) com.tencent.p014mm.sdk.event.MvvmEventCenter.getEvent(tv2.C78112d.class)).publish(3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            super.onCreate(r13)
            java.lang.Class<c81.a> r13 = c81.C39904a.class
            android.content.Intent r0 = r12.getIntent()
            java.lang.String r1 = "rank_id"
            java.lang.String r1 = r0.getStringExtra(r1)
            r12.f111173d = r1
            java.lang.String r1 = "username"
            java.lang.String r1 = r0.getStringExtra(r1)
            r12.f111174e = r1
            java.lang.String r1 = "usernickname"
            java.lang.String r0 = r0.getStringExtra(r1)
            r12.f111175f = r0
            java.lang.String r0 = eb0.C75592q0.m90789s()
            if (r0 == 0) goto L_0x0032
            java.lang.String r1 = r12.f111174e
            boolean r0 = r0.equals(r1)
            r12.f111189w = r0
        L_0x0032:
            android.content.Intent r0 = r12.getIntent()
            java.lang.String r1 = "app_username"
            java.lang.String r0 = r0.getStringExtra(r1)
            r12.f111176g = r0
            w71.a r0 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Ax0()
            java.lang.String r1 = r12.f111174e
            boolean r0 = r0.mo61489jo(r1)
            r12.f111188v = r0
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "MicroMsg.Sport.ExdeviceProfileUI"
            java.lang.String r4 = "is follow %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r4, r2)
            java.lang.String r2 = r12.f111174e
            boolean r2 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r2)
            r2 = r2 ^ r1
            junit.framework.Assert.assertTrue(r2)
            w71.b r2 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.vx0()
            java.lang.String r4 = r12.f111174e
            v71.a r2 = r2.mo61492jo(r4)
            r12.f111177h = r2
            android.content.Intent r2 = r12.getIntent()
            java.lang.String r4 = "key_affected_semi"
            java.util.ArrayList r2 = r2.getStringArrayListExtra(r4)
            r12.f111178i = r2
            bl3.r r2 = bl3.C39818r.f106831a
            bl3.r$a r4 = r2.mo62444c(r12)
            androidx.lifecycle.i0 r4 = r4.mo75002a(r13)
            c81.a r4 = (c81.C39904a) r4
            java.lang.String r5 = r12.f111173d
            r4.mo62524e3(r5)
            bl3.r$a r4 = r2.mo62444c(r12)
            androidx.lifecycle.i0 r13 = r4.mo75002a(r13)
            c81.a r13 = (c81.C39904a) r13
            java.lang.String r4 = r12.f111176g
            r13.mo62522c3(r4)
            androidx.appcompat.app.AppCompatActivity r13 = r12.getContext()
            bl3.r$a r13 = r2.mo62444c(r13)
            java.lang.Class<yk3.d> r2 = yk3.C53531d.class
            androidx.lifecycle.i0 r13 = r13.mo75002a(r2)
            yk3.d r13 = (yk3.C53531d) r13
            r13.mo74202c3()
            r13 = 2131821704(0x7f110488, float:1.9276159E38)
            java.lang.String r5 = r12.getString(r13)
            r13 = 2131832197(0x7f112d85, float:1.9297441E38)
            java.lang.String r6 = r12.getString(r13)
            com.tencent.mm.plugin.exdevice.ui.c0 r9 = new com.tencent.mm.plugin.exdevice.ui.c0
            r9.<init>(r12)
            r7 = 1
            r8 = 1
            r4 = r12
            qo3.i0 r13 = nj3.C76879j.m92724R(r4, r5, r6, r7, r8, r9)
            r12.f111192z = r13
            r13 = 2131301739(0x7f09156b, float:1.8221544E38)
            android.view.View r13 = r12.findViewById(r13)
            com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileAffectedUserView r13 = (com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceProfileAffectedUserView) r13
            r12.f111180n = r13
            r13 = 2131301742(0x7f09156e, float:1.822155E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.ImageView r13 = (android.widget.ImageView) r13
            r12.f111181o = r13
            r13 = 2131301756(0x7f09157c, float:1.8221579E38)
            android.view.View r13 = r12.findViewById(r13)
            android.widget.ListView r13 = (android.widget.ListView) r13
            r12.f111182p = r13
            r13 = 2131311546(0x7f093bba, float:1.8241435E38)
            android.view.View r13 = r12.findViewById(r13)
            com.tencent.mm.ui.base.MMPullDownView r13 = (com.tencent.p014mm.p136ui.base.MMPullDownView) r13
            com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileAffectedUserView r2 = r12.f111180n
            java.util.ArrayList<java.lang.String> r4 = r12.f111178i
            r2.setAffectedUserInfo(r4)
            r12.mo64353J7()
            r2 = 2131313229(0x7f09424d, float:1.8244849E38)
            android.view.View r2 = r12.findViewById(r2)
            r12.f111185s = r2
            android.view.GestureDetector r2 = new android.view.GestureDetector
            androidx.appcompat.app.AppCompatActivity r4 = r12.getContext()
            com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI$j r5 = new com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI$j
            r6 = 0
            r5.<init>(r12, r6)
            r2.<init>(r4, r5)
            r12.f111171K = r2
            r13.setIsBottomShowAll(r3)
            r13.setTopViewVisible(r3)
            r13.setBottomViewVisible(r3)
            r13.setIsBottomShowAll(r3)
            r13.setIsTopShowAll(r3)
            r13.setCanOverScrool(r1)
            com.tencent.mm.ui.base.MMPullDownView$b r2 = r12.f111172L
            r13.setOnInterceptTouchEventListener(r2)
            com.tencent.mm.plugin.exdevice.ui.d0 r2 = new com.tencent.mm.plugin.exdevice.ui.d0
            r2.<init>(r12)
            r13.setAtBottomCallBack(r2)
            com.tencent.mm.plugin.exdevice.ui.e0 r2 = new com.tencent.mm.plugin.exdevice.ui.e0
            r2.<init>(r12)
            r13.setAtTopCallBack(r2)
            com.tencent.mm.plugin.exdevice.ui.f0 r2 = new com.tencent.mm.plugin.exdevice.ui.f0
            r2.<init>(r12)
            r13.setOnBottomLoadDataListener(r2)
            com.tencent.mm.plugin.exdevice.ui.g0 r2 = new com.tencent.mm.plugin.exdevice.ui.g0
            r2.<init>(r12)
            r13.setOnScrollChangedListener(r2)
            com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileListHeader r2 = new com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileListHeader
            r2.<init>(r12)
            android.content.res.Resources r4 = r12.getResources()
            r5 = 2131165384(0x7f0700c8, float:1.7944984E38)
            int r4 = r4.getDimensionPixelSize(r5)
            int r4 = d81.C45288e.m50133d(r12, r4)
            android.content.res.Resources r5 = r12.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r7 = r5.widthPixels
            int r5 = r5.heightPixels
            if (r7 <= r5) goto L_0x017f
            android.content.res.Resources r5 = r12.getResources()
            r7 = 2131165255(0x7f070047, float:1.7944722E38)
            int r5 = r5.getDimensionPixelSize(r7)
            goto L_0x018a
        L_0x017f:
            android.content.res.Resources r5 = r12.getResources()
            r7 = 2131165256(0x7f070048, float:1.7944724E38)
            int r5 = r5.getDimensionPixelSize(r7)
        L_0x018a:
            android.content.res.Resources r7 = r12.getResources()
            r8 = 2131165394(0x7f0700d2, float:1.7945004E38)
            int r7 = r7.getDimensionPixelSize(r8)
            android.content.res.Resources r8 = r12.getResources()
            r9 = 2131165393(0x7f0700d1, float:1.7945002E38)
            int r8 = r8.getDimensionPixelSize(r9)
            android.view.WindowManager r9 = r12.getWindowManager()
            android.view.Display r9 = r9.getDefaultDisplay()
            int r10 = r9.getHeight()
            r11 = 2
            int r10 = r10 / r11
            int r10 = r10 - r4
            int r10 = r10 - r5
            int r7 = r7 / r11
            int r10 = r10 - r7
            int r10 = r10 - r8
            int r7 = r9.getHeight()
            if (r7 <= 0) goto L_0x01bb
            if (r10 > 0) goto L_0x01c6
        L_0x01bb:
            android.content.res.Resources r7 = r12.getResources()
            r8 = 2131165378(0x7f0700c2, float:1.7944971E38)
            int r10 = r7.getDimensionPixelSize(r8)
        L_0x01c6:
            r2.setMinimumHeight(r10)
            int r7 = r9.getWidth()
            r2.setMinimumWidth(r7)
            int r7 = r9.getHeight()
            int r7 = r7 / r11
            int r7 = r7 - r4
            int r7 = r7 - r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r2.setTag(r4)
            r12.f111183q = r2
            android.widget.ListView r4 = r12.f111182p
            r4.addHeaderView(r2, r6, r3)
            com.tencent.mm.plugin.exdevice.ui.v r2 = new com.tencent.mm.plugin.exdevice.ui.v
            androidx.appcompat.app.AppCompatActivity r4 = r12.getContext()
            java.lang.String r5 = r12.f111174e
            r2.<init>(r4, r5)
            r12.f111184r = r2
            android.widget.ListView r4 = r12.f111182p
            r4.setAdapter(r2)
            android.widget.ListView r2 = r12.f111182p
            com.tencent.mm.plugin.exdevice.ui.h0 r4 = new com.tencent.mm.plugin.exdevice.ui.h0
            r4.<init>(r12)
            r2.setOnScrollListener(r4)
            com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileAffectedUserView r2 = r12.f111180n
            java.lang.String r4 = r12.f111174e
            r2.setUsername(r4)
            android.view.View r2 = r12.f111185s
            com.tencent.mm.plugin.exdevice.ui.i0 r4 = new com.tencent.mm.plugin.exdevice.ui.i0
            r4.<init>(r12)
            r2.setOnClickListener(r4)
            r13.setCanOverScrool(r3)
            int r13 = kg3.C76577a.m92145A(r12)
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileListHeader r4 = r12.f111183q
            java.lang.Object r4 = r4.getTag()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r2.<init>(r13, r4)
            android.widget.ImageView r13 = r12.f111181o
            r13.setLayoutParams(r2)
            r12.mo64354K7()
            u71.a r13 = com.tencent.p014mm.plugin.exdevice.model.C41166r1.Ix0()
            r13.mo73405b(r12)
            f40.g r13 = f40.C86709a0.m107529k()
            ob0.b0 r13 = r13.mo121127b()
            t71.i r2 = new t71.i
            java.lang.String r4 = r12.f111174e
            java.lang.String r5 = r12.f111176g
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            m71.b<t71.i> r6 = r12.f111163C
            r2.<init>(r12, r4, r5, r6)
            r13.mo123460f(r2)
            java.lang.Class<ny.h> r13 = p629ny.C76979h.class
            r2 = 60
            android.content.res.Resources r4 = r12.getResources()     // Catch:{ Exception -> 0x026a }
            r5 = 2131165403(0x7f0700db, float:1.7945022E38)
            int r4 = r4.getDimensionPixelSize(r5)     // Catch:{ Exception -> 0x026a }
            r12.f111165E = r4     // Catch:{ Exception -> 0x026a }
            if (r4 > 0) goto L_0x0278
            goto L_0x0276
        L_0x0267:
            r13 = move-exception
            goto L_0x033d
        L_0x026a:
            r4 = move-exception
            java.lang.String r5 = ""
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ all -> 0x0267 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r0, r4, r5, r6)     // Catch:{ all -> 0x0267 }
            int r4 = r12.f111165E
            if (r4 > 0) goto L_0x0278
        L_0x0276:
            r12.f111165E = r2
        L_0x0278:
            java.lang.Object[] r2 = new java.lang.Object[r1]
            int r4 = r12.f111165E
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            java.lang.String r4 = "ap: ellipsizeWidth: %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r4, r2)
            boolean r2 = r12.f111189w
            r4 = 3
            if (r2 == 0) goto L_0x0294
            r13 = 2131825306(0x7f11129a, float:1.9283464E38)
            java.lang.String r13 = r12.getString(r13)
            goto L_0x0300
        L_0x0294:
            di3.d r2 = di3.C86312j.m106911c(r13)
            ny.h r2 = (p629ny.C76979h) r2
            r5 = 2131825310(0x7f11129e, float:1.9283473E38)
            java.lang.Object[] r6 = new java.lang.Object[r1]
            java.lang.String r7 = r12.f111174e
            int r8 = r12.f111165E
            java.lang.Class<d62.i> r9 = d62.C75339i.class
            di3.d r9 = di3.C86312j.m106911c(r9)
            d62.i r9 = (d62.C75339i) r9
            java.lang.String r9 = r9.getDisplayName(r7)
            boolean r7 = r7.equalsIgnoreCase(r9)
            if (r7 == 0) goto L_0x02ce
            java.lang.String r7 = r12.f111175f
            boolean r7 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r7)
            if (r7 != 0) goto L_0x02ce
            di3.d r13 = di3.C86312j.m106911c(r13)
            ny.h r13 = (p629ny.C76979h) r13
            androidx.appcompat.app.AppCompatActivity r7 = r12.getContext()
            java.lang.String r9 = r12.f111175f
            android.text.SpannableString r13 = r13.mo107057T1(r7, r9)
            goto L_0x02dc
        L_0x02ce:
            di3.d r13 = di3.C86312j.m106911c(r13)
            ny.h r13 = (p629ny.C76979h) r13
            androidx.appcompat.app.AppCompatActivity r7 = r12.getContext()
            android.text.SpannableString r13 = r13.mo107057T1(r7, r9)
        L_0x02dc:
            android.text.TextPaint r7 = r12.f111164D
            float r9 = (float) r8
            android.text.TextUtils$TruncateAt r10 = android.text.TextUtils.TruncateAt.END
            java.lang.CharSequence r7 = android.text.TextUtils.ellipsize(r13, r7, r9, r10)
            java.lang.Object[] r9 = new java.lang.Object[r4]
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r9[r3] = r8
            r9[r1] = r13
            r9[r11] = r7
            java.lang.String r13 = " width: %d, ap: username %s, ellipseize username %s"
            com.tencent.p014mm.sdk.platformtools.Log.m105919d(r0, r13, r9)
            r6[r3] = r7
            java.lang.String r13 = r12.getString(r5, r6)
            android.text.SpannableString r13 = r2.mo107057T1(r12, r13)
        L_0x0300:
            r12.setMMTitle((java.lang.CharSequence) r13)
            com.tencent.mm.plugin.exdevice.ui.q0 r13 = new com.tencent.mm.plugin.exdevice.ui.q0
            r13.<init>(r12)
            r12.setBackBtn(r13)
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r1 = "mUsername:"
            r13.append(r1)
            java.lang.String r1 = r12.f111174e
            r13.append(r1)
            java.lang.String r13 = r13.toString()
            com.tencent.p014mm.sdk.platformtools.Log.m105924i(r0, r13)
            java.lang.String r13 = eb0.C75592q0.m90789s()
            java.lang.String r0 = r12.f111174e
            boolean r13 = r13.equals(r0)
            if (r13 == 0) goto L_0x033c
            java.lang.Class<tv2.d> r13 = tv2.C78112d.class
            androidx.lifecycle.i0 r13 = com.tencent.p014mm.sdk.event.MvvmEventCenter.getEvent(r13)
            tv2.d r13 = (tv2.C78112d) r13
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r13.publish(r0)
        L_0x033c:
            return
        L_0x033d:
            int r0 = r12.f111165E
            if (r0 > 0) goto L_0x0343
            r12.f111165E = r2
        L_0x0343:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.exdevice.p042ui.ExdeviceProfileUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        this.f111170J.dead();
        this.f111191y = true;
        super.onDestroy();
        C41166r1.Ix0().mo73406c(this);
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
        Log.m105926v("MicroMsg.Sport.ExdeviceProfileUI", "ExdeviceProfileUI: onResume");
        runOnUiThread(new C41362p0(this));
        if (!this.f111189w) {
            C41166r1.Ax0().mo61489jo(this.f111174e);
            runOnUiThread(new C41320b0(this));
        }
    }
}
