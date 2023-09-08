package com.tencent.p014mm.p136ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c92.C104331h;
import ck3.C67391b;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.widget.imageview.WeImageView;
import com.tencent.p014mm.plugin.multitalk.model.C69856h;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.storage.C72996z1;
import dd0.C75349f;
import di3.C86312j;
import ed0.C75610d;
import j20.C117292a;
import java.util.ArrayList;
import java.util.List;
import k20.C60958c;
import k20.C9556a;
import ke3.C88144b;
import kg3.C76577a;
import nj3.C76879j;
import p196ln.C76705f;
import p749xh.C78815k6;
import p910lj.C76701a;
import t22.C77833z;

/* renamed from: com.tencent.mm.ui.MultiTalkRoomPopupNav */
public class MultiTalkRoomPopupNav extends LinearLayout {

    /* renamed from: B */
    public static final /* synthetic */ int f214529B = 0;

    /* renamed from: A */
    public int f214530A;

    /* renamed from: d */
    public LinearLayout f214531d;

    /* renamed from: e */
    public WeImageView f214532e;

    /* renamed from: f */
    public View f214533f;

    /* renamed from: g */
    public TextView f214534g;

    /* renamed from: h */
    public TextView f214535h;

    /* renamed from: i */
    public TextView f214536i;

    /* renamed from: j */
    public String f214537j;

    /* renamed from: n */
    public String f214538n;

    /* renamed from: o */
    public boolean f214539o;

    /* renamed from: p */
    public C73117g f214540p = C73117g.NotInTalking;

    /* renamed from: q */
    public C73116f f214541q;

    /* renamed from: r */
    public LinearLayout f214542r;

    /* renamed from: s */
    public LinearLayout f214543s;

    /* renamed from: t */
    public LinearLayout f214544t;

    /* renamed from: u */
    public C78815k6 f214545u = new C75349f();

    /* renamed from: v */
    public View f214546v;

    /* renamed from: w */
    public View f214547w;

    /* renamed from: x */
    public View f214548x;

    /* renamed from: y */
    public C67391b f214549y;

    /* renamed from: z */
    public C73115e f214550z;

    /* renamed from: com.tencent.mm.ui.MultiTalkRoomPopupNav$a */
    public class C73111a implements View.OnClickListener {
        public C73111a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/MultiTalkRoomPopupNav$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (C75610d.m90859a() != null && ((C69856h) C86312j.m106911c(C69856h.class)).mo96153zV(MultiTalkRoomPopupNav.this.getContext())) {
                Log.m105918d("MicroMsg.MultiTalkRoomPopupNav", "is voip talking");
                C117292a.m165361g(this, "com/tencent/mm/ui/MultiTalkRoomPopupNav$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else if (C75610d.m90859a() == null || !((C77833z) C75610d.m90859a()).mo107953f()) {
                MultiTalkRoomPopupNav.this.mo101467a();
                C117292a.m165361g(this, "com/tencent/mm/ui/MultiTalkRoomPopupNav$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            } else {
                C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.f360894fr0), 0).show();
                Log.m105918d("MicroMsg.MultiTalkRoomPopupNav", "is show loation");
                C117292a.m165361g(this, "com/tencent/mm/ui/MultiTalkRoomPopupNav$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.MultiTalkRoomPopupNav$b */
    public class C73112b implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f214552d;

        public C73112b(String str) {
            this.f214552d = str;
        }

        public void onClick(View view) {
            C73117g gVar = C73117g.Inviting;
            Class cls = C69856h.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/MultiTalkRoomPopupNav$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.MultiTalkRoomPopupNav", "click enter button..");
            int i = 0;
            if (this.f214552d != null) {
                if (((C69856h) C86312j.m106911c(cls)).mo96133ED()) {
                    Log.m105920e("MicroMsg.MultiTalkRoomPopupNav", "now is in other voip..");
                    C76879j.m92748s(MultiTalkRoomPopupNav.this.getContext(), MMApplicationContext.getContext().getString(C0966R.string.gzm), (String) null);
                    C117292a.m165361g(this, "com/tencent/mm/ui/MultiTalkRoomPopupNav$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                List<String> G10 = ((C69856h) C86312j.m106911c(cls)).G10(MultiTalkRoomPopupNav.this.f214537j);
                if (G10 != null && G10.size() == 1) {
                    MultiTalkRoomPopupNav multiTalkRoomPopupNav = MultiTalkRoomPopupNav.this;
                    String str = this.f214552d;
                    multiTalkRoomPopupNav.getClass();
                    Log.m105924i("MicroMsg.MultiTalkRoomPopupNav", "when only on menber do clear banner!");
                    ((C69856h) C86312j.m106911c(cls)).mo96147oW(str);
                    Log.m105924i("MicroMsg.MultiTalkRoomPopupNav", "when only on member do exit talk!");
                    if (!((C69856h) C86312j.m106911c(cls)).mo96136HE(str)) {
                        Log.m105924i("MicroMsg.MultiTalkRoomPopupNav", "when only on member do exit talk failure! groupId:" + str);
                    }
                    C115669n nVar = C115669n.INSTANCE;
                    MultiTalkRoomPopupNav multiTalkRoomPopupNav2 = MultiTalkRoomPopupNav.this;
                    nVar.mo160131h(13945, 1, 0, 0, 1, multiTalkRoomPopupNav2.f214537j, Integer.valueOf(multiTalkRoomPopupNav2.f214545u.field_roomId), Long.valueOf(MultiTalkRoomPopupNav.this.f214545u.field_roomKey));
                } else if (G10 != null && G10.size() >= C104331h.m139313e()) {
                    Log.m105920e("MicroMsg.MultiTalkRoomPopupNav", "now is up to the limit,memberList size:" + G10.size());
                    C76879j.m92748s(MultiTalkRoomPopupNav.this.getContext(), MMApplicationContext.getContext().getString(C0966R.string.gzw, new Object[]{Integer.valueOf(C104331h.m139313e())}), (String) null);
                    C115669n nVar2 = C115669n.INSTANCE;
                    Object[] objArr = new Object[7];
                    objArr[0] = 1;
                    if (MultiTalkRoomPopupNav.this.f214540p == gVar) {
                        i = 1;
                    }
                    objArr[1] = Integer.valueOf(i);
                    objArr[2] = 1;
                    objArr[3] = 1;
                    MultiTalkRoomPopupNav multiTalkRoomPopupNav3 = MultiTalkRoomPopupNav.this;
                    objArr[4] = multiTalkRoomPopupNav3.f214537j;
                    objArr[5] = Integer.valueOf(multiTalkRoomPopupNav3.f214545u.field_roomId);
                    objArr[6] = Long.valueOf(MultiTalkRoomPopupNav.this.f214545u.field_roomKey);
                    nVar2.mo160131h(13945, objArr);
                    C117292a.m165361g(this, "com/tencent/mm/ui/MultiTalkRoomPopupNav$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else if (((C69856h) C86312j.m106911c(cls)).mo96132Df()) {
                    Log.m105920e("MicroMsg.MultiTalkRoomPopupNav", "now is inviting other people voip..");
                    C76879j.m92748s(MultiTalkRoomPopupNav.this.getContext(), MMApplicationContext.getContext().getString(C0966R.string.gzj), (String) null);
                    C115669n nVar3 = C115669n.INSTANCE;
                    Object[] objArr2 = new Object[7];
                    objArr2[0] = 1;
                    objArr2[1] = Integer.valueOf(MultiTalkRoomPopupNav.this.f214540p == gVar ? 1 : 0);
                    objArr2[2] = 0;
                    objArr2[3] = 1;
                    MultiTalkRoomPopupNav multiTalkRoomPopupNav4 = MultiTalkRoomPopupNav.this;
                    objArr2[4] = multiTalkRoomPopupNav4.f214537j;
                    objArr2[5] = Integer.valueOf(multiTalkRoomPopupNav4.f214545u.field_roomId);
                    objArr2[6] = Long.valueOf(MultiTalkRoomPopupNav.this.f214545u.field_roomKey);
                    nVar3.mo160131h(13945, objArr2);
                    C117292a.m165361g(this, "com/tencent/mm/ui/MultiTalkRoomPopupNav$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                } else {
                    MultiTalkRoomPopupNav multiTalkRoomPopupNav5 = MultiTalkRoomPopupNav.this;
                    String str2 = this.f214552d;
                    multiTalkRoomPopupNav5.getClass();
                    Log.m105924i("MicroMsg.MultiTalkRoomPopupNav", "now try enter multitalk:" + str2);
                    boolean kJ = ((C69856h) C86312j.m106911c(cls)).mo96144kJ(str2);
                    if (!kJ) {
                        Log.m105920e("MicroMsg.MultiTalkRoomPopupNav", "try enter fail!" + str2);
                        C76701a.makeText(MMApplicationContext.getContext(), (CharSequence) MMApplicationContext.getContext().getString(C0966R.string.gz4), 0).show();
                        C115669n nVar4 = C115669n.INSTANCE;
                        Object[] objArr3 = new Object[7];
                        objArr3[0] = 1;
                        objArr3[1] = Integer.valueOf(multiTalkRoomPopupNav5.f214540p == gVar ? 1 : 0);
                        objArr3[2] = 0;
                        objArr3[3] = 1;
                        objArr3[4] = multiTalkRoomPopupNav5.f214537j;
                        objArr3[5] = Integer.valueOf(multiTalkRoomPopupNav5.f214545u.field_roomId);
                        objArr3[6] = Long.valueOf(multiTalkRoomPopupNav5.f214545u.field_roomKey);
                        nVar4.mo160131h(13945, objArr3);
                    } else {
                        ((C69856h) C86312j.m106911c(cls)).mo96141X8(str2);
                        C115669n nVar5 = C115669n.INSTANCE;
                        Object[] objArr4 = new Object[7];
                        objArr4[0] = 1;
                        objArr4[1] = Integer.valueOf(multiTalkRoomPopupNav5.f214540p == gVar ? 1 : 0);
                        objArr4[2] = 0;
                        objArr4[3] = 0;
                        objArr4[4] = multiTalkRoomPopupNav5.f214537j;
                        objArr4[5] = Integer.valueOf(multiTalkRoomPopupNav5.f214545u.field_roomId);
                        objArr4[6] = Long.valueOf(multiTalkRoomPopupNav5.f214545u.field_roomKey);
                        nVar5.mo160131h(13945, objArr4);
                    }
                    C73115e eVar = multiTalkRoomPopupNav5.f214550z;
                    if (eVar != null) {
                        eVar.mo101495a(kJ);
                    }
                }
            }
            C73116f.m86083a(MultiTalkRoomPopupNav.this.f214541q);
            MultiTalkRoomPopupNav.this.f214531d.setVisibility(0);
            MultiTalkRoomPopupNav.this.setNavBackgroundResource(C0966R.C0969drawable.axw);
            MultiTalkRoomPopupNav.this.f214532e.setVisibility(0);
            MultiTalkRoomPopupNav.this.f214542r.setVisibility(8);
            C117292a.m165361g(this, "com/tencent/mm/ui/MultiTalkRoomPopupNav$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.MultiTalkRoomPopupNav$c */
    public class C73113c implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ String f214554d;

        public C73113c(String str) {
            this.f214554d = str;
        }

        public void onClick(View view) {
            Class cls = C69856h.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/ui/MultiTalkRoomPopupNav$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105924i("MicroMsg.MultiTalkRoomPopupNav", "click cancel button..");
            if (MultiTalkRoomPopupNav.this.f214540p == C73117g.Inviting) {
                Log.m105924i("MicroMsg.MultiTalkRoomPopupNav", "reject multiTalk!");
                boolean TS = ((C69856h) C86312j.m106911c(cls)).mo96138TS(this.f214554d);
                ((C69856h) C86312j.m106911c(cls)).mo96141X8(this.f214554d);
                C115669n nVar = C115669n.INSTANCE;
                MultiTalkRoomPopupNav multiTalkRoomPopupNav = MultiTalkRoomPopupNav.this;
                nVar.mo160131h(13945, 3, 1, 0, Integer.valueOf(TS ^ true ? 1 : 0), multiTalkRoomPopupNav.f214537j, Integer.valueOf(multiTalkRoomPopupNav.f214545u.field_roomId), Long.valueOf(MultiTalkRoomPopupNav.this.f214545u.field_roomKey));
            } else {
                C115669n nVar2 = C115669n.INSTANCE;
                MultiTalkRoomPopupNav multiTalkRoomPopupNav2 = MultiTalkRoomPopupNav.this;
                nVar2.mo160131h(13945, 2, 0, 0, 0, multiTalkRoomPopupNav2.f214537j, Integer.valueOf(multiTalkRoomPopupNav2.f214545u.field_roomId), Long.valueOf(MultiTalkRoomPopupNav.this.f214545u.field_roomKey));
            }
            C73116f.m86083a(MultiTalkRoomPopupNav.this.f214541q);
            MultiTalkRoomPopupNav.this.f214531d.setVisibility(0);
            MultiTalkRoomPopupNav.this.setNavBackgroundResource(C0966R.C0969drawable.axw);
            MultiTalkRoomPopupNav.this.f214532e.setVisibility(0);
            MultiTalkRoomPopupNav.this.f214542r.setVisibility(8);
            C117292a.m165361g(this, "com/tencent/mm/ui/MultiTalkRoomPopupNav$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.ui.MultiTalkRoomPopupNav$d */
    public class C73114d implements Animation.AnimationListener {

        /* renamed from: a */
        public final /* synthetic */ LinearLayout f214556a;

        public C73114d(MultiTalkRoomPopupNav multiTalkRoomPopupNav, LinearLayout linearLayout) {
            this.f214556a = linearLayout;
        }

        public void onAnimationEnd(Animation animation) {
            this.f214556a.setVisibility(8);
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: com.tencent.mm.ui.MultiTalkRoomPopupNav$e */
    public interface C73115e {
        /* renamed from: a */
        void mo101495a(boolean z);
    }

    /* renamed from: com.tencent.mm.ui.MultiTalkRoomPopupNav$f */
    public class C73116f {

        /* renamed from: a */
        public LinearLayout f214557a;

        /* renamed from: b */
        public View f214558b;

        /* renamed from: c */
        public TextView f214559c;

        public C73116f(boolean z, C73111a aVar) {
            this.f214558b = MultiTalkRoomPopupNav.this.findViewById(C0966R.C0970id.beq);
            this.f214559c = (TextView) MultiTalkRoomPopupNav.this.findViewById(C0966R.C0970id.f358801h53);
            this.f214557a = (LinearLayout) MultiTalkRoomPopupNav.this.findViewById(C0966R.C0970id.c6v);
        }

        /* renamed from: a */
        public static void m86083a(C73116f fVar) {
            MultiTalkRoomPopupNav multiTalkRoomPopupNav = MultiTalkRoomPopupNav.this;
            int i = MultiTalkRoomPopupNav.f214529B;
            multiTalkRoomPopupNav.mo101476i(false);
            if (fVar.f214557a.getVisibility() == 0) {
                MultiTalkRoomPopupNav.this.mo101478k(fVar.f214557a, 300);
            }
        }
    }

    /* renamed from: com.tencent.mm.ui.MultiTalkRoomPopupNav$g */
    public enum C73117g {
        Inviting,
        Talking,
        NotInTalking
    }

    public MultiTalkRoomPopupNav(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo101471e();
    }

    private void setDefaultBannerStyle(String str) {
        this.f214534g.setTextColor(getResources().getColor(C0966R.color.a6b));
        this.f214534g.setText(str);
        LinearLayout linearLayout = this.f214542r;
        if (linearLayout == null || linearLayout.getVisibility() != 0) {
            this.f214534g.setVisibility(0);
            this.f214536i.setVisibility(8);
            this.f214535h.setVisibility(8);
            this.f214542r.setVisibility(8);
        }
    }

    private void setInvitingBannerStyle(String str) {
        this.f214535h.setTextColor(getResources().getColor(C0966R.color.a6b));
        this.f214535h.setText(str);
        this.f214534g.setVisibility(8);
        this.f214536i.setVisibility(0);
        this.f214535h.setVisibility(0);
        this.f214542r.setVisibility(8);
    }

    private void setInvitingBannerStyleWithText(String str) {
        throw null;
    }

    private void setTalkingBannerStyle(String str) {
        this.f214534g.setTextColor(getResources().getColor(C0966R.color.a6d));
        this.f214534g.setText(str);
        this.f214534g.setVisibility(0);
        this.f214536i.setVisibility(8);
        this.f214535h.setVisibility(8);
    }

    /* renamed from: a */
    public void mo101467a() {
        char c;
        C73117g gVar = C73117g.Inviting;
        Class cls = C69856h.class;
        String str = this.f214537j;
        if (str == null || this.f214538n == null) {
            Log.m105920e("MicroMsg.MultiTalkRoomPopupNav", "groupUserName or currentSenderUserName is null! groupUserName:" + this.f214537j + ",currentSenderUserName:" + this.f214538n);
            return;
        }
        int i = 0;
        if (!C72996z1.m85820U5(str) || this.f214539o) {
            String str2 = this.f214537j;
            if (!((C69856h) C86312j.m106911c(cls)).mo96150sV(str2)) {
                Log.m105920e("MicroMsg.MultiTalkRoomPopupNav", "dealWithMultiTalkroomClick multiTalkInfo is null!");
                C76879j.m92748s(getContext(), MMApplicationContext.getContext().getString(C0966R.string.f361069h13), (String) null);
                mo101470d();
                C115669n nVar = C115669n.INSTANCE;
                Object[] objArr = new Object[7];
                objArr[0] = 4;
                objArr[1] = Integer.valueOf(this.f214540p == gVar ? 1 : 0);
                objArr[2] = 0;
                objArr[3] = 1;
                objArr[4] = this.f214537j;
                objArr[5] = Integer.valueOf(this.f214545u.field_roomId);
                objArr[6] = Long.valueOf(this.f214545u.field_roomKey);
                nVar.mo160131h(13945, objArr);
                return;
            }
            List<String> G10 = ((C69856h) C86312j.m106911c(cls)).G10(str2);
            if (G10.size() == 0) {
                Log.m105920e("MicroMsg.MultiTalkRoomPopupNav", "dealWithMultiTalkroomClick multiTalkMemberList is empty!");
                C76879j.m92748s(getContext(), MMApplicationContext.getContext().getString(C0966R.string.f361069h13), (String) null);
                mo101470d();
                C115669n nVar2 = C115669n.INSTANCE;
                Object[] objArr2 = new Object[7];
                objArr2[0] = 4;
                objArr2[1] = Integer.valueOf(this.f214540p == gVar ? 1 : 0);
                objArr2[2] = 0;
                objArr2[3] = 1;
                objArr2[4] = this.f214537j;
                objArr2[5] = Integer.valueOf(this.f214545u.field_roomId);
                objArr2[6] = Long.valueOf(this.f214545u.field_roomKey);
                nVar2.mo160131h(13945, objArr2);
                return;
            }
            if (G10.size() == 1) {
                Log.m105924i("MicroMsg.MultiTalkRoomPopupNav", "just one now member now! wait for back service process!");
            }
            C73117g gVar2 = this.f214540p;
            if (gVar2 == C73117g.Talking) {
                Intent intent = new Intent();
                intent.putExtra("enterMainUiSource", 2);
                intent.putExtra("enterMainUiWxGroupId", str2);
                C88144b.m109791i(MMApplicationContext.getContext(), "multitalk", ".ui.MultiTalkMainUI", intent, (Bundle) null);
                C115669n nVar3 = C115669n.INSTANCE;
                Object[] objArr3 = new Object[7];
                objArr3[0] = 4;
                objArr3[1] = Integer.valueOf(this.f214540p == gVar ? 1 : 0);
                objArr3[2] = 0;
                objArr3[3] = 0;
                objArr3[4] = this.f214537j;
                objArr3[5] = Integer.valueOf(this.f214545u.field_roomId);
                objArr3[6] = Long.valueOf(this.f214545u.field_roomKey);
                nVar3.mo160131h(13945, objArr3);
            } else if (gVar2 == gVar) {
                String xC = ((C69856h) C86312j.m106911c(cls)).mo96152xC(str2, this.f214538n);
                if (xC != null) {
                    c = 1;
                    mo101473g(MMApplicationContext.getContext().getString(C0966R.string.cam, new Object[]{((C69856h) C86312j.m106911c(cls)).getDisplayName(xC)}), mo101468b(G10, this.f214538n), str2, G10.size(), 300);
                } else {
                    c = 1;
                }
                C115669n nVar4 = C115669n.INSTANCE;
                Object[] objArr4 = new Object[7];
                objArr4[0] = 4;
                objArr4[c] = Integer.valueOf(this.f214540p == gVar ? 1 : 0);
                objArr4[2] = 0;
                objArr4[3] = 0;
                objArr4[4] = this.f214537j;
                objArr4[5] = Integer.valueOf(this.f214545u.field_roomId);
                objArr4[6] = Long.valueOf(this.f214545u.field_roomKey);
                nVar4.mo160131h(13945, objArr4);
            } else if (((C69856h) C86312j.m106911c(cls)).mo96133ED()) {
                C76879j.m92748s(getContext(), MMApplicationContext.getContext().getString(C0966R.string.gzm), (String) null);
                C115669n nVar5 = C115669n.INSTANCE;
                Object[] objArr5 = new Object[7];
                objArr5[0] = 4;
                objArr5[1] = Integer.valueOf(this.f214540p == gVar ? 1 : 0);
                objArr5[2] = 0;
                objArr5[3] = 1;
                objArr5[4] = this.f214537j;
                objArr5[5] = Integer.valueOf(this.f214545u.field_roomId);
                objArr5[6] = Long.valueOf(this.f214545u.field_roomKey);
                nVar5.mo160131h(13945, objArr5);
            } else if (G10.size() >= C104331h.m139313e()) {
                Context context = getContext();
                Context context2 = MMApplicationContext.getContext();
                C76879j.m92748s(context, context2.getString(C0966R.string.gzw, new Object[]{C104331h.m139313e() + ""}), (String) null);
                C115669n nVar6 = C115669n.INSTANCE;
                Object[] objArr6 = new Object[7];
                objArr6[0] = 4;
                if (this.f214540p == gVar) {
                    i = 1;
                }
                objArr6[1] = Integer.valueOf(i);
                objArr6[2] = 1;
                objArr6[3] = 1;
                objArr6[4] = this.f214537j;
                objArr6[5] = Integer.valueOf(this.f214545u.field_roomId);
                objArr6[6] = Long.valueOf(this.f214545u.field_roomKey);
                nVar6.mo160131h(13945, objArr6);
            } else {
                mo101473g(MMApplicationContext.getContext().getString(C0966R.string.h1f), mo101468b(G10, ""), str2, G10.size(), 300);
                C115669n.INSTANCE.mo160131h(13945, 4, 0, 0, 0, this.f214537j, Integer.valueOf(this.f214545u.field_roomId), Long.valueOf(this.f214545u.field_roomKey));
            }
        } else {
            C76879j.m92748s(getContext(), MMApplicationContext.getContext().getString(C0966R.string.h0i), (String) null);
            mo101470d();
            ((C69856h) C86312j.m106911c(cls)).mo96142c(this.f214537j);
            C115669n nVar7 = C115669n.INSTANCE;
            Object[] objArr7 = new Object[7];
            objArr7[0] = 4;
            objArr7[1] = Integer.valueOf(this.f214540p == gVar ? 1 : 0);
            objArr7[2] = 0;
            objArr7[3] = 1;
            objArr7[4] = this.f214537j;
            objArr7[5] = Integer.valueOf(this.f214545u.field_roomId);
            objArr7[6] = Long.valueOf(this.f214545u.field_roomKey);
            nVar7.mo160131h(13945, objArr7);
        }
    }

    /* renamed from: b */
    public List<String> mo101468b(List<String> list, String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (!(str == null || str == "")) {
            for (String next : list) {
                if (next != null && !next.equals(str)) {
                    arrayList2.add(next);
                }
            }
            list = arrayList2;
        }
        for (String add : list) {
            arrayList.add(add);
        }
        return arrayList;
    }

    /* renamed from: c */
    public void mo101469c() {
        LinearLayout linearLayout;
        C73116f fVar = this.f214541q;
        if (fVar != null && (linearLayout = fVar.f214557a) != null && linearLayout.getVisibility() == 0) {
            C73116f.m86083a(this.f214541q);
            this.f214541q.f214557a.setVisibility(8);
        }
    }

    /* renamed from: d */
    public void mo101470d() {
        setVisibility(8);
        C73116f fVar = this.f214541q;
        if (fVar != null) {
            C73116f.m86083a(fVar);
        }
    }

    /* renamed from: e */
    public final void mo101471e() {
        View.inflate(getContext(), getInitViewId(), this);
        this.f214546v = findViewById(C0966R.C0970id.iwl);
        this.f214547w = findViewById(C0966R.C0970id.agz);
        this.f214531d = (LinearLayout) findViewById(C0966R.C0970id.h4n);
        this.f214534g = (TextView) findViewById(C0966R.C0970id.h54);
        this.f214535h = (TextView) findViewById(C0966R.C0970id.h55);
        this.f214536i = (TextView) findViewById(C0966R.C0970id.h56);
        this.f214542r = (LinearLayout) findViewById(C0966R.C0970id.h4c);
        this.f214543s = (LinearLayout) findViewById(C0966R.C0970id.h4b);
        this.f214544t = (LinearLayout) findViewById(C0966R.C0970id.h4a);
        this.f214532e = (WeImageView) findViewById(C0966R.C0970id.f6145yj);
        this.f214533f = findViewById(C0966R.C0970id.h_j);
        this.f214531d.setOnClickListener(new C73111a());
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) MMApplicationContext.getContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        this.f214530A = (int) Math.floor((double) (((float) (displayMetrics.widthPixels - C74942w4.m89784a(getContext(), 56))) / ((float) C74942w4.m89784a(getContext(), 48))));
    }

    /* renamed from: f */
    public boolean mo101472f(int i) {
        return true;
    }

    /* renamed from: g */
    public void mo101473g(String str, List<String> list, String str2, int i, long j) {
        setNavBackgroundColor(0);
        this.f214532e.setVisibility(4);
        C73116f fVar = new C73116f(this.f214540p == C73117g.Inviting, (C73111a) null);
        this.f214541q = fVar;
        C73112b bVar = new C73112b(str2);
        C73113c cVar = new C73113c(str2);
        fVar.f214559c.setText(str);
        this.f214542r.setVisibility(0);
        this.f214542r.removeAllViews();
        if (list != null) {
            if (list.size() > this.f214530A) {
                this.f214543s.setVisibility(0);
                this.f214543s.removeAllViews();
            }
            if (list.size() > this.f214530A * 2) {
                this.f214544t.setVisibility(0);
                this.f214544t.removeAllViews();
            }
        }
        int i2 = 0;
        for (String next : list) {
            ImageView imageView = new ImageView(MultiTalkRoomPopupNav.this.getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C76577a.m92151b(MMApplicationContext.getContext(), 40), C76577a.m92151b(MMApplicationContext.getContext(), 40));
            layoutParams.rightMargin = C76577a.m92151b(MMApplicationContext.getContext(), 8);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setLayoutParams(layoutParams);
            MultiTalkRoomPopupNav multiTalkRoomPopupNav = MultiTalkRoomPopupNav.this;
            int i3 = multiTalkRoomPopupNav.f214530A;
            if (i2 < i3) {
                multiTalkRoomPopupNav.f214542r.addView(imageView);
            } else if (i2 >= i3 && i2 < i3 * 2) {
                multiTalkRoomPopupNav.f214543s.addView(imageView);
            } else if (i2 >= i3 * 2 && i2 < i3 * 3) {
                multiTalkRoomPopupNav.f214544t.addView(imageView);
            }
            ((C76705f) C86312j.m106911c(C76705f.class)).mo106849z(imageView, next);
            i2++;
        }
        ((Button) MultiTalkRoomPopupNav.this.findViewById(C0966R.C0970id.f358792h42)).setOnClickListener(bVar);
        fVar.f214558b.setOnClickListener(cVar);
        View view = MultiTalkRoomPopupNav.this.f214548x;
        if (view != null) {
            view.setOnClickListener(cVar);
        }
        if (fVar.f214557a.getVisibility() != 0) {
            fVar.f214557a.setVisibility(0);
            MultiTalkRoomPopupNav.this.mo101477j(fVar.f214557a, j);
            MultiTalkRoomPopupNav.this.mo101476i(true);
            MultiTalkRoomPopupNav multiTalkRoomPopupNav2 = MultiTalkRoomPopupNav.this;
            View view2 = multiTalkRoomPopupNav2.f214548x;
            if (view2 != null) {
                view2.startAnimation(AnimationUtils.loadAnimation(multiTalkRoomPopupNav2.getContext(), C0966R.C0968anim.f2393bw));
            }
        }
    }

    public int getInitViewId() {
        return C0966R.C0971layout.bhm;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a5 A[SYNTHETIC, Splitter:B:29:0x00a5] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00d7  */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo101475h(boolean r13) {
        /*
            r12 = this;
            com.tencent.mm.ui.MultiTalkRoomPopupNav$g r0 = com.tencent.p014mm.p136ui.MultiTalkRoomPopupNav.C73117g.NotInTalking
            java.lang.Class<com.tencent.mm.plugin.multitalk.model.h> r1 = com.tencent.p014mm.plugin.multitalk.model.C69856h.class
            java.lang.String r2 = r12.f214537j
            if (r2 == 0) goto L_0x0240
            java.lang.String r3 = r12.f214538n
            if (r3 != 0) goto L_0x000e
            goto L_0x0240
        L_0x000e:
            di3.d r3 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.multitalk.model.h r3 = (com.tencent.p014mm.plugin.multitalk.model.C69856h) r3
            boolean r3 = r3.mo96150sV(r2)
            if (r3 != 0) goto L_0x001e
            r12.mo101470d()
            return
        L_0x001e:
            di3.d r3 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.multitalk.model.h r3 = (com.tencent.p014mm.plugin.multitalk.model.C69856h) r3
            java.util.List r3 = r3.G10(r2)
            int r4 = r3.size()
            if (r4 != 0) goto L_0x003b
            di3.d r13 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.multitalk.model.h r13 = (com.tencent.p014mm.plugin.multitalk.model.C69856h) r13
            r13.mo96142c(r2)
            r12.mo101470d()
            return
        L_0x003b:
            di3.d r4 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.multitalk.model.h r4 = (com.tencent.p014mm.plugin.multitalk.model.C69856h) r4
            java.lang.String r5 = r12.f214538n
            int r4 = r4.Vq0(r2, r5)
            java.lang.String r5 = ""
            r6 = 0
            r7 = 1
            if (r4 != r7) goto L_0x00dc
            com.tencent.mm.ui.MultiTalkRoomPopupNav$g r0 = com.tencent.p014mm.p136ui.MultiTalkRoomPopupNav.C73117g.Inviting
            r12.setUserTalkingStatus(r0)
            di3.d r0 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.multitalk.model.h r0 = (com.tencent.p014mm.plugin.multitalk.model.C69856h) r0
            boolean r0 = r0.wd0(r2)
            if (r0 == 0) goto L_0x0068
            boolean r0 = r12.mo101472f(r4)
            if (r0 == 0) goto L_0x0068
            r12.mo101470d()
            return
        L_0x0068:
            java.lang.Class<h81.h> r0 = h81.C32735h.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            h81.h r0 = (h81.C32735h) r0
            h81.h$c r4 = h81.C32735h.C32737c.clicfg_multitalk_navpop_wording
            java.lang.String r0 = r0.Y60(r4, r5)
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            r8 = 0
            java.lang.String r9 = "MicroMsg.MultitalkUtils"
            if (r4 != 0) goto L_0x009e
            c30.g r4 = new c30.g     // Catch:{ Exception -> 0x0096 }
            r4.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r0 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getApplicationLanguage()     // Catch:{ Exception -> 0x0096 }
            java.lang.String r10 = "getMultitalkNavpopWording, langCode:%s"
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ Exception -> 0x0096 }
            r11[r6] = r0     // Catch:{ Exception -> 0x0096 }
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r9, r10, r11)     // Catch:{ Exception -> 0x0096 }
            java.lang.String r0 = r4.optString(r0)     // Catch:{ Exception -> 0x0096 }
            goto L_0x009f
        L_0x0096:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.String r10 = "getMultitalkNavpopWording error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r10, r4)
        L_0x009e:
            r0 = r8
        L_0x009f:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r4 != 0) goto L_0x00ba
            c30.g r4 = new c30.g     // Catch:{ Exception -> 0x00b2 }
            r4.<init>((java.lang.String) r0)     // Catch:{ Exception -> 0x00b2 }
            java.lang.String r0 = "waiting"
            java.lang.String r8 = r4.optString(r0)     // Catch:{ Exception -> 0x00b2 }
            goto L_0x00ba
        L_0x00b2:
            r0 = move-exception
            java.lang.Object[] r4 = new java.lang.Object[r6]
            java.lang.String r10 = "getMultitalkWaitingAcceptWording error"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r9, r0, r10, r4)
        L_0x00ba:
            if (r8 != 0) goto L_0x00d7
            di3.d r0 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.multitalk.model.h r0 = (com.tencent.p014mm.plugin.multitalk.model.C69856h) r0
            di3.d r1 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.multitalk.model.h r1 = (com.tencent.p014mm.plugin.multitalk.model.C69856h) r1
            java.lang.String r4 = r12.f214538n
            java.lang.String r1 = r1.mo96152xC(r2, r4)
            java.lang.String r0 = r0.getDisplayName(r1)
            r12.setInvitingBannerStyle(r0)
            goto L_0x0155
        L_0x00d7:
            r12.setInvitingBannerStyleWithText(r8)
            goto L_0x0155
        L_0x00dc:
            r8 = 10
            r9 = 2131833244(0x7f11319c, float:1.9299565E38)
            if (r4 != r8) goto L_0x0135
            com.tencent.mm.ui.MultiTalkRoomPopupNav$g r8 = com.tencent.p014mm.p136ui.MultiTalkRoomPopupNav.C73117g.Talking
            r12.setUserTalkingStatus(r8)
            di3.d r8 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.multitalk.model.h r8 = (com.tencent.p014mm.plugin.multitalk.model.C69856h) r8
            boolean r2 = r8.wd0(r2)
            if (r2 == 0) goto L_0x00fe
            boolean r2 = r12.mo101472f(r4)
            if (r2 == 0) goto L_0x00fe
            r12.mo101470d()
            return
        L_0x00fe:
            di3.d r1 = di3.C86312j.m106911c(r1)
            com.tencent.mm.plugin.multitalk.model.h r1 = (com.tencent.p014mm.plugin.multitalk.model.C69856h) r1
            boolean r1 = r1.mo96149qn()
            if (r1 == 0) goto L_0x0114
            boolean r1 = r12.mo101472f(r4)
            if (r1 == 0) goto L_0x0114
            r12.mo101470d()
            return
        L_0x0114:
            java.lang.String r1 = c92.C104331h.m139312d()
            r12.setUserTalkingStatus(r0)
            if (r1 != 0) goto L_0x0131
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.Object[] r1 = new java.lang.Object[r7]
            int r2 = r3.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r6] = r2
            java.lang.String r1 = r0.getString(r9, r1)
        L_0x0131:
            r12.setDefaultBannerStyle(r1)
            goto L_0x0155
        L_0x0135:
            r12.setUserTalkingStatus(r0)
            java.lang.String r0 = c92.C104331h.m139312d()
            if (r0 != 0) goto L_0x0152
            android.content.Context r0 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.Object[] r1 = new java.lang.Object[r7]
            int r2 = r3.size()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1[r6] = r2
            java.lang.String r0 = r0.getString(r9, r1)
        L_0x0152:
            r12.setDefaultBannerStyle(r0)
        L_0x0155:
            r12.setVisibility(r6)
            android.widget.LinearLayout r0 = r12.f214531d
            r0.setVisibility(r6)
            android.widget.LinearLayout r0 = r12.f214531d
            r1 = 32768(0x8000, float:4.5918E-41)
            r0.sendAccessibilityEvent(r1)
            com.tencent.mm.ui.MultiTalkRoomPopupNav$f r0 = r12.f214541q
            if (r0 == 0) goto L_0x017a
            if (r13 != 0) goto L_0x0175
            android.widget.LinearLayout r13 = r12.f214542r
            if (r13 == 0) goto L_0x0175
            int r13 = r13.getVisibility()
            if (r13 == 0) goto L_0x017a
        L_0x0175:
            com.tencent.mm.ui.MultiTalkRoomPopupNav$f r13 = r12.f214541q
            com.tencent.p014mm.p136ui.MultiTalkRoomPopupNav.C73116f.m86083a(r13)
        L_0x017a:
            java.util.List r13 = r12.mo101468b(r3, r5)
            android.widget.LinearLayout r0 = r12.f214542r
            if (r0 == 0) goto L_0x018f
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x018f
            android.widget.LinearLayout r0 = r12.f214542r
            r0.removeAllViews()
            r0 = 1
            goto L_0x0190
        L_0x018f:
            r0 = 0
        L_0x0190:
            android.widget.LinearLayout r1 = r12.f214543s
            if (r1 == 0) goto L_0x01a0
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x01a0
            android.widget.LinearLayout r0 = r12.f214543s
            r0.removeAllViews()
            r0 = 1
        L_0x01a0:
            android.widget.LinearLayout r1 = r12.f214544t
            if (r1 == 0) goto L_0x01b0
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L_0x01b0
            android.widget.LinearLayout r0 = r12.f214544t
            r0.removeAllViews()
            r0 = 1
        L_0x01b0:
            if (r0 == 0) goto L_0x022a
            java.util.ArrayList r13 = (java.util.ArrayList) r13
            java.util.Iterator r13 = r13.iterator()
            r0 = 0
        L_0x01b9:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x022a
            java.lang.Object r1 = r13.next()
            java.lang.String r1 = (java.lang.String) r1
            android.widget.ImageView r2 = new android.widget.ImageView
            android.content.Context r3 = r12.getContext()
            r2.<init>(r3)
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r5 = 40
            int r4 = kg3.C76577a.m92151b(r4, r5)
            android.content.Context r8 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            int r5 = kg3.C76577a.m92151b(r8, r5)
            r3.<init>(r4, r5)
            android.content.Context r4 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            r5 = 8
            int r4 = kg3.C76577a.m92151b(r4, r5)
            r3.rightMargin = r4
            android.widget.ImageView$ScaleType r4 = android.widget.ImageView.ScaleType.FIT_CENTER
            r2.setScaleType(r4)
            r2.setLayoutParams(r3)
            int r3 = r12.f214530A
            if (r0 >= r3) goto L_0x0203
            android.widget.LinearLayout r3 = r12.f214542r
            r3.addView(r2)
            goto L_0x021c
        L_0x0203:
            if (r0 < r3) goto L_0x020f
            int r4 = r3 * 2
            if (r0 >= r4) goto L_0x020f
            android.widget.LinearLayout r3 = r12.f214543s
            r3.addView(r2)
            goto L_0x021c
        L_0x020f:
            int r4 = r3 * 2
            if (r0 < r4) goto L_0x021c
            int r3 = r3 * 3
            if (r0 >= r3) goto L_0x021c
            android.widget.LinearLayout r3 = r12.f214544t
            r3.addView(r2)
        L_0x021c:
            java.lang.Class<ln.f> r3 = p196ln.C76705f.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ln.f r3 = (p196ln.C76705f) r3
            r3.mo106849z(r2, r1)
            int r0 = r0 + 1
            goto L_0x01b9
        L_0x022a:
            com.tencent.mm.ui.MultiTalkRoomPopupNav$f r13 = r12.f214541q
            if (r13 == 0) goto L_0x023f
            android.widget.LinearLayout r13 = r13.f214557a
            if (r13 == 0) goto L_0x023f
            int r13 = r13.getVisibility()
            if (r13 != 0) goto L_0x023c
            r12.mo101476i(r7)
            goto L_0x023f
        L_0x023c:
            r12.mo101476i(r6)
        L_0x023f:
            return
        L_0x0240:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "groupUserName or currentSenderUserName is null! groupUserName:"
            r13.append(r0)
            java.lang.String r0 = r12.f214537j
            r13.append(r0)
            java.lang.String r0 = ",currentSenderUserName:"
            r13.append(r0)
            java.lang.String r0 = r12.f214538n
            r13.append(r0)
            java.lang.String r13 = r13.toString()
            java.lang.String r0 = "MicroMsg.MultiTalkRoomPopupNav"
            com.tencent.p014mm.sdk.platformtools.Log.m105920e(r0, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.MultiTalkRoomPopupNav.mo101475h(boolean):void");
    }

    /* renamed from: i */
    public final void mo101476i(boolean z) {
        View view = this.f214548x;
        if (view == null) {
            return;
        }
        if (z) {
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(0);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/ui/MultiTalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/ui/MultiTalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            View view2 = this.f214547w;
            if (view2 != null) {
                C9556a aVar2 = new C9556a();
                aVar2.mo10233c(8);
                View view3 = view2;
                C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/ui/MultiTalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view3, "com/tencent/mm/ui/MultiTalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            setNavBackgroundColor(0);
            WeImageView weImageView = this.f214532e;
            if (weImageView != null) {
                weImageView.setVisibility(4);
            }
            C67391b bVar = this.f214549y;
            if (bVar != null) {
                bVar.mo91578s();
                return;
            }
            return;
        }
        C9556a aVar3 = new C9556a();
        ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
        aVar3.mo10233c(8);
        C117292a.m165358d(view, aVar3.mo10232b(), "com/tencent/mm/ui/MultiTalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/ui/MultiTalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        View view4 = this.f214547w;
        if (view4 != null) {
            C9556a aVar4 = new C9556a();
            aVar4.mo10233c(0);
            View view5 = view4;
            C117292a.m165358d(view5, aVar4.mo10232b(), "com/tencent/mm/ui/MultiTalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/ui/MultiTalkRoomPopupNav", "showRootTipsBarBg", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        setNavBackgroundResource(C0966R.C0969drawable.axw);
        WeImageView weImageView2 = this.f214532e;
        if (weImageView2 != null) {
            weImageView2.setVisibility(0);
        }
    }

    /* renamed from: j */
    public void mo101477j(LinearLayout linearLayout, long j) {
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2468ds);
        loadAnimation.setDuration(j);
        linearLayout.startAnimation(loadAnimation);
    }

    /* renamed from: k */
    public void mo101478k(LinearLayout linearLayout, long j) {
        Animation loadAnimation = AnimationUtils.loadAnimation(getContext(), C0966R.C0968anim.f2472dw);
        loadAnimation.setAnimationListener(new C73114d(this, linearLayout));
        linearLayout.startAnimation(loadAnimation);
    }

    public void setChattingContext(C67391b bVar) {
        this.f214549y = bVar;
    }

    public void setCurrentSenderUserName(String str) {
        this.f214538n = str;
    }

    public void setEnterMultiTalkListener(C73115e eVar) {
        this.f214550z = eVar;
    }

    public void setGroupUserName(String str) {
        this.f214537j = str;
    }

    public void setInChatRoom(boolean z) {
        this.f214539o = z;
    }

    public void setMultiTalkInfo(C78815k6 k6Var) {
        this.f214545u = k6Var;
    }

    public void setNavBackgroundColor(int i) {
        LinearLayout linearLayout = this.f214531d;
        if (linearLayout != null) {
            linearLayout.setBackgroundColor(i);
        }
    }

    public void setNavBackgroundResource(int i) {
        LinearLayout linearLayout = this.f214531d;
        if (linearLayout != null) {
            linearLayout.setBackgroundResource(i);
        }
    }

    public void setRootTipsBarBackground(View view) {
        this.f214548x = view;
    }

    public void setUserTalkingStatus(C73117g gVar) {
        this.f214540p = gVar;
    }

    public MultiTalkRoomPopupNav(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo101471e();
    }
}
