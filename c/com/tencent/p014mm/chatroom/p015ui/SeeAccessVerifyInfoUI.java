package com.tencent.p014mm.chatroom.p015ui;

import a11.C39479c;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.Scopes;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.autogen.events.SetLocalQQMobileEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.mmsight.segment.FFmpegMetadataRetriever;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.sdk.platformtools.LocaleUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C44651a5;
import com.tencent.p014mm.storage.C44661m1;
import com.tencent.p014mm.storage.C44662n1;
import com.tencent.p014mm.storage.C44673z4;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.storage.C72996z1;
import di3.C86312j;
import f40.C86709a0;
import f62.C75700k0;
import gc0.C20828a;
import hc0.C20937c;
import hp3.C87581a;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import ke3.C88144b;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89132b;
import p148ei.C7660a;
import p203mi.C47036d;
import p239sv.C13786m;
import p239sv.C36838i;
import p239sv.C77792p;
import p629ny.C76979h;
import p749xh.C38533b7;
import qo3.C89779i0;
import re0.C36315l;
import te3.C49953j7;
import te3.C50225l7;

/* renamed from: com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI */
public class SeeAccessVerifyInfoUI extends MMActivity implements C11385n {

    /* renamed from: A */
    public TextView f194917A;

    /* renamed from: B */
    public TextView f194918B;

    /* renamed from: C */
    public GridView f194919C;

    /* renamed from: D */
    public C89779i0 f194920D;

    /* renamed from: E */
    public boolean f194921E = false;

    /* renamed from: F */
    public boolean f194922F = false;

    /* renamed from: G */
    public boolean f194923G = false;

    /* renamed from: d */
    public C44661m1 f194924d;

    /* renamed from: e */
    public C67916g f194925e;

    /* renamed from: f */
    public String f194926f;

    /* renamed from: g */
    public String f194927g;

    /* renamed from: h */
    public String f194928h;

    /* renamed from: i */
    public String f194929i;

    /* renamed from: j */
    public String f194930j;

    /* renamed from: n */
    public String f194931n;

    /* renamed from: o */
    public String f194932o;

    /* renamed from: p */
    public String f194933p;

    /* renamed from: q */
    public String f194934q;

    /* renamed from: r */
    public long f194935r;

    /* renamed from: s */
    public long f194936s;

    /* renamed from: t */
    public String f194937t;

    /* renamed from: u */
    public String f194938u;

    /* renamed from: v */
    public String f194939v;

    /* renamed from: w */
    public TextView f194940w;

    /* renamed from: x */
    public TextView f194941x;

    /* renamed from: y */
    public ImageView f194942y;

    /* renamed from: z */
    public TextView f194943z;

    /* renamed from: com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI$a */
    public class C67908a implements MenuItem.OnMenuItemClickListener {
        public C67908a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            SeeAccessVerifyInfoUI.this.finish();
            return true;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI$b */
    public class C67909b implements View.OnClickListener {
        public C67909b() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/chatroom/ui/SeeAccessVerifyInfoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(Util.nullAsNil(SeeAccessVerifyInfoUI.this.f194932o));
            String nickname = z1Var.getNickname();
            String str = null;
            SeeAccessVerifyInfoUI seeAccessVerifyInfoUI = SeeAccessVerifyInfoUI.this;
            C44661m1 m1Var = seeAccessVerifyInfoUI.f194924d;
            if (m1Var != null) {
                str = m1Var.mo69789q2(seeAccessVerifyInfoUI.f194932o);
            }
            if (Util.isNullOrNil(str)) {
                str = z1Var.mo62898f();
            }
            SeeAccessVerifyInfoUI seeAccessVerifyInfoUI2 = SeeAccessVerifyInfoUI.this;
            SeeAccessVerifyInfoUI.m80281H7(seeAccessVerifyInfoUI2, seeAccessVerifyInfoUI2.f194932o, str, nickname, false);
            C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/SeeAccessVerifyInfoUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI$c */
    public class C67910c implements View.OnTouchListener {
        public C67910c(SeeAccessVerifyInfoUI seeAccessVerifyInfoUI) {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/chatroom/ui/SeeAccessVerifyInfoUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            C117292a.m165362h(true, this, "com/tencent/mm/chatroom/ui/SeeAccessVerifyInfoUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI$d */
    public class C67911d implements Runnable {
        public C67911d() {
        }

        public void run() {
            int i;
            float f;
            float f2;
            SeeAccessVerifyInfoUI seeAccessVerifyInfoUI = SeeAccessVerifyInfoUI.this;
            TextView textView = seeAccessVerifyInfoUI.f194943z;
            if (textView != null) {
                if (seeAccessVerifyInfoUI.f194921E) {
                    f2 = ((float) (textView.getHeight() * 2)) + SeeAccessVerifyInfoUI.this.getResources().getDimension(C0966R.dimen.f3627k);
                    f = SeeAccessVerifyInfoUI.this.getResources().getDimension(C0966R.dimen.f3919iy);
                } else {
                    f2 = ((float) textView.getHeight()) + SeeAccessVerifyInfoUI.this.getResources().getDimension(C0966R.dimen.f3627k);
                    f = SeeAccessVerifyInfoUI.this.getResources().getDimension(C0966R.dimen.f3919iy);
                }
                i = (int) (f2 + f);
            } else {
                i = 0;
            }
            if (SeeAccessVerifyInfoUI.this.f194925e.getCount() / 4 > 0) {
                i *= (SeeAccessVerifyInfoUI.this.f194925e.getCount() / 4) + 1;
            }
            SeeAccessVerifyInfoUI.this.f194919C.setLayoutParams(new LinearLayout.LayoutParams(SeeAccessVerifyInfoUI.this.f194919C.getWidth(), i));
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI$e */
    public class C67912e implements View.OnClickListener {

        /* renamed from: com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI$e$a */
        public class C67913a implements C87581a<Void, C89132b.C89134c<C50225l7>> {
            public C67913a() {
            }

            public Object call(Object obj) {
                C89132b.C89134c cVar = (C89132b.C89134c) obj;
                Class cls = C75700k0.class;
                C89779i0 i0Var = SeeAccessVerifyInfoUI.this.f194920D;
                if (i0Var != null && i0Var.isShowing()) {
                    SeeAccessVerifyInfoUI.this.f194920D.dismiss();
                }
                C7660a a = C7660a.m7782a(cVar.f256795c);
                if (a != null) {
                    a.mo8792b(SeeAccessVerifyInfoUI.this, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
                } else if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                    if (cVar.f256797e.getType() == 941) {
                        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(SeeAccessVerifyInfoUI.this.f194935r);
                        b002.mo108743W2(b002.f230723F | 128);
                        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).yy0(b002.mo108774y2(), b002);
                        SeeAccessVerifyInfoUI.this.f194918B.setBackgroundResource(C0966R.C0969drawable.f4659ja);
                        SeeAccessVerifyInfoUI seeAccessVerifyInfoUI = SeeAccessVerifyInfoUI.this;
                        seeAccessVerifyInfoUI.f194918B.setTextColor(seeAccessVerifyInfoUI.getResources().getColor(C0966R.color.f3547xc));
                        SeeAccessVerifyInfoUI seeAccessVerifyInfoUI2 = SeeAccessVerifyInfoUI.this;
                        seeAccessVerifyInfoUI2.f194918B.setText(seeAccessVerifyInfoUI2.getString(C0966R.string.fjd));
                        SeeAccessVerifyInfoUI.this.f194918B.setEnabled(false);
                        C115669n.INSTANCE.idkeyStat(219, 23, 1, true);
                    }
                } else if (cVar.f256797e.getType() == 941) {
                    Log.m105925i("MicroMsg.SeeAccessVerifyInfoUI", "scene type:%s errCode:%s, errType:%s, errMsg:%s", 941, Integer.valueOf(cVar.f256794b), Integer.valueOf(cVar.f256793a), Util.nullAsNil(cVar.f256795c));
                    C76879j.m92748s(SeeAccessVerifyInfoUI.this.getContext(), SeeAccessVerifyInfoUI.this.getString(C0966R.string.f7349dr), SeeAccessVerifyInfoUI.this.getString(C0966R.string.a3h));
                }
                return null;
            }
        }

        /* renamed from: com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI$e$b */
        public class C67914b implements C87581a<Void, C89132b.C89134c<C49953j7>> {
            public C67914b() {
            }

            public Object call(Object obj) {
                C89132b.C89134c cVar = (C89132b.C89134c) obj;
                Class cls = C75700k0.class;
                C89779i0 i0Var = SeeAccessVerifyInfoUI.this.f194920D;
                if (i0Var != null && i0Var.isShowing()) {
                    SeeAccessVerifyInfoUI.this.f194920D.dismiss();
                }
                C7660a a = C7660a.m7782a(cVar.f256795c);
                if (a != null) {
                    a.mo8792b(SeeAccessVerifyInfoUI.this, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
                } else if (cVar.f256793a == 0 && cVar.f256794b == 0) {
                    if (cVar.f256797e.getType() == 774) {
                        C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(SeeAccessVerifyInfoUI.this.f194935r);
                        b002.mo108743W2(b002.f230723F | 128);
                        ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).yy0(b002.mo108774y2(), b002);
                        SeeAccessVerifyInfoUI.this.f194918B.setBackgroundResource(C0966R.C0969drawable.f4659ja);
                        SeeAccessVerifyInfoUI seeAccessVerifyInfoUI = SeeAccessVerifyInfoUI.this;
                        seeAccessVerifyInfoUI.f194918B.setTextColor(seeAccessVerifyInfoUI.getResources().getColor(C0966R.color.f3547xc));
                        SeeAccessVerifyInfoUI seeAccessVerifyInfoUI2 = SeeAccessVerifyInfoUI.this;
                        seeAccessVerifyInfoUI2.f194918B.setText(seeAccessVerifyInfoUI2.getString(C0966R.string.fjd));
                        SeeAccessVerifyInfoUI.this.f194918B.setEnabled(false);
                        C115669n.INSTANCE.idkeyStat(219, 23, 1, true);
                    }
                } else if (cVar.f256797e.getType() == 774) {
                    Log.m105925i("MicroMsg.SeeAccessVerifyInfoUI", "scene type:%s errCode:%s, errType:%s, errMsg:%s", 774, Integer.valueOf(cVar.f256794b), Integer.valueOf(cVar.f256793a), Util.nullAsNil(cVar.f256795c));
                    C76879j.m92748s(SeeAccessVerifyInfoUI.this.getContext(), SeeAccessVerifyInfoUI.this.getString(C0966R.string.f7349dr), SeeAccessVerifyInfoUI.this.getString(C0966R.string.a3h));
                }
                return null;
            }
        }

        public C67912e() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/chatroom/ui/SeeAccessVerifyInfoUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            SeeAccessVerifyInfoUI seeAccessVerifyInfoUI = SeeAccessVerifyInfoUI.this;
            seeAccessVerifyInfoUI.f194920D = C76879j.m92723Q(seeAccessVerifyInfoUI.getContext(), SeeAccessVerifyInfoUI.this.getString(C0966R.string.a3h), SeeAccessVerifyInfoUI.this.getString(C0966R.string.f7361dx), true, false, (DialogInterface.OnCancelListener) null);
            if (C72996z1.m85847r5(SeeAccessVerifyInfoUI.this.f194937t)) {
                SeeAccessVerifyInfoUI seeAccessVerifyInfoUI2 = SeeAccessVerifyInfoUI.this;
                C89132b<C50225l7> Bu = ((C13786m) C86312j.m106911c(C13786m.class)).mo12976Bu(seeAccessVerifyInfoUI2.f194932o, seeAccessVerifyInfoUI2.f194937t, seeAccessVerifyInfoUI2.f194939v, new LinkedList(Util.stringToList(SeeAccessVerifyInfoUI.this.f194927g, ",")));
                Bu.f256791h = true;
                Bu.mo9225i().mo11397F(SeeAccessVerifyInfoUI.this).mo123062e(new C67913a());
            } else {
                SeeAccessVerifyInfoUI seeAccessVerifyInfoUI3 = SeeAccessVerifyInfoUI.this;
                C47036d dVar = new C47036d(seeAccessVerifyInfoUI3.f194936s, seeAccessVerifyInfoUI3.f194932o, seeAccessVerifyInfoUI3.f194937t, seeAccessVerifyInfoUI3.f194939v, new LinkedList(Util.stringsToList(SeeAccessVerifyInfoUI.this.f194927g.split(","))));
                dVar.f256791h = true;
                dVar.mo9225i().mo11397F(SeeAccessVerifyInfoUI.this).mo123062e(new C67914b());
            }
            C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/SeeAccessVerifyInfoUI$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI$f */
    public class C67915f {

        /* renamed from: a */
        public String f194950a;

        /* renamed from: b */
        public String f194951b;

        /* renamed from: c */
        public String f194952c;

        /* renamed from: d */
        public String f194953d;

        /* renamed from: e */
        public String f194954e;

        public C67915f(SeeAccessVerifyInfoUI seeAccessVerifyInfoUI, String str, String str2, String str3, String str4, String str5) {
            this.f194950a = str;
            this.f194951b = str2;
            this.f194953d = str3;
            this.f194952c = str4;
            this.f194954e = str5;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI$g */
    public class C67916g extends BaseAdapter {

        /* renamed from: d */
        public List<C67915f> f194955d = new ArrayList();

        /* renamed from: e */
        public Context f194956e;

        /* renamed from: f */
        public C20937c f194957f;

        /* renamed from: com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI$g$a */
        public class C67917a implements View.OnClickListener {

            /* renamed from: d */
            public final /* synthetic */ int f194959d;

            public C67917a(int i) {
                this.f194959d = i;
            }

            public void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(view);
                Object[] array = arrayList.toArray();
                arrayList.clear();
                C117292a.m165356b("com/tencent/mm/chatroom/ui/SeeAccessVerifyInfoUI$InviteesAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                String str = ((C67915f) ((ArrayList) C67916g.this.f194955d).get(this.f194959d)).f194951b;
                String str2 = null;
                C67916g gVar = C67916g.this;
                C44661m1 m1Var = SeeAccessVerifyInfoUI.this.f194924d;
                if (m1Var != null) {
                    str2 = m1Var.mo69789q2(((C67915f) ((ArrayList) gVar.f194955d).get(this.f194959d)).f194950a);
                }
                if (Util.isNullOrNil(str2)) {
                    str2 = ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96097Ni().get(Util.nullAsNil(((C67915f) ((ArrayList) C67916g.this.f194955d).get(this.f194959d)).f194950a)).mo62898f();
                }
                C67916g gVar2 = C67916g.this;
                SeeAccessVerifyInfoUI.m80281H7(SeeAccessVerifyInfoUI.this, ((C67915f) ((ArrayList) gVar2.f194955d).get(this.f194959d)).f194950a, str2, str, true);
                C117292a.m165361g(this, "com/tencent/mm/chatroom/ui/SeeAccessVerifyInfoUI$InviteesAdapter$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        }

        public C67916g(Context context) {
            String[] strArr;
            String[] strArr2;
            String[] strArr3 = null;
            this.f194957f = null;
            this.f194956e = context;
            if (!Util.isNullOrNil(SeeAccessVerifyInfoUI.this.f194927g)) {
                String[] split = SeeAccessVerifyInfoUI.this.f194927g.split(",");
                if (!Util.isNullOrNil(SeeAccessVerifyInfoUI.this.f194926f)) {
                    String[] split2 = SeeAccessVerifyInfoUI.this.f194926f.split(",");
                    if (!Util.isNullOrNil(SeeAccessVerifyInfoUI.this.f194929i)) {
                        strArr = SeeAccessVerifyInfoUI.this.f194929i.split(",");
                    } else {
                        Log.m105928w("MicroMsg.SeeAccessVerifyInfoUI", "mInviteesAppids null");
                        strArr = null;
                    }
                    if (!Util.isNullOrNil(SeeAccessVerifyInfoUI.this.f194928h)) {
                        strArr2 = SeeAccessVerifyInfoUI.this.f194928h.split(",");
                    } else {
                        Log.m105928w("MicroMsg.SeeAccessVerifyInfoUI", "mInviteesDescids null");
                        strArr2 = null;
                    }
                    if (!Util.isNullOrNil(SeeAccessVerifyInfoUI.this.f194930j)) {
                        strArr3 = SeeAccessVerifyInfoUI.this.f194930j.split(",");
                    } else {
                        Log.m105928w("MicroMsg.SeeAccessVerifyInfoUI", "mInviteesHeadimgurls null");
                    }
                    this.f194955d.clear();
                    int i = 0;
                    while (i < split.length) {
                        List<C67915f> list = this.f194955d;
                        SeeAccessVerifyInfoUI seeAccessVerifyInfoUI = SeeAccessVerifyInfoUI.this;
                        String str = split[i];
                        String str2 = (split2.length <= i || Util.isNullOrNil(split2[i])) ? split[i] : split2[i];
                        String str3 = "";
                        String str4 = (strArr == null || strArr.length <= i || Util.isNullOrNil(strArr[i])) ? str3 : strArr[i];
                        String str5 = (strArr2 == null || strArr2.length <= i || Util.isNullOrNil(strArr2[i])) ? str3 : strArr2[i];
                        if (strArr3 != null && strArr3.length > i && !Util.isNullOrNil(strArr3[i])) {
                            str3 = strArr3[i];
                        }
                        list.add(new C67915f(seeAccessVerifyInfoUI, str, str2, str4, str5, str3));
                        i++;
                    }
                } else {
                    Log.m105928w("MicroMsg.SeeAccessVerifyInfoUI", "mInviteesNicknames null");
                }
            } else {
                Log.m105928w("MicroMsg.SeeAccessVerifyInfoUI", "mInviteesUsernames null");
            }
            C20937c.C20939b bVar = new C20937c.C20939b();
            bVar.f59346b = true;
            bVar.f59363s = true;
            bVar.f59359o = C0966R.raw.default_avatar;
            this.f194957f = bVar.mo32666a();
        }

        public int getCount() {
            return ((ArrayList) this.f194955d).size();
        }

        public Object getItem(int i) {
            return ((ArrayList) this.f194955d).get(i);
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            C67918h hVar;
            Class cls = C77792p.class;
            if (view == null) {
                view = View.inflate(this.f194956e, C0966R.C0971layout.btx, (ViewGroup) null);
                hVar = SeeAccessVerifyInfoUI.this.mo93305I7(view);
            } else {
                hVar = (C67918h) view.getTag();
                if (hVar == null) {
                    hVar = SeeAccessVerifyInfoUI.this.mo93305I7(view);
                }
            }
            hVar.f194961a.setVisibility(0);
            hVar.f194962b.setVisibility(0);
            C20828a.m22825b().mo32519h(((C67915f) ((ArrayList) this.f194955d).get(i)).f194954e, hVar.f194961a, this.f194957f);
            hVar.f194962b.setText(((C76979h) C86312j.m106911c(C76979h.class)).yp0(this.f194956e, Util.nullAsNil(((C67915f) ((ArrayList) this.f194955d).get(i)).f194951b), hVar.f194962b.getTextSize()));
            if (C72996z1.m85843n5(((C67915f) ((ArrayList) this.f194955d).get(i)).f194950a)) {
                SeeAccessVerifyInfoUI.this.f194921E = true;
                C38533b7 b7Var = new C38533b7();
                b7Var.field_appid = Util.nullAsNil(((C67915f) ((ArrayList) this.f194955d).get(i)).f194953d);
                b7Var.field_wordingId = Util.nullAsNil(((C67915f) ((ArrayList) this.f194955d).get(i)).f194952c);
                b7Var.field_language = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
                ((C36315l) ((C77792p) C86312j.m106911c(cls)).mo107738m7()).mo60615jo(b7Var, new String[]{"appid", "wordingId", FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE});
                if (!TextUtils.isEmpty(b7Var.field_wording)) {
                    hVar.f194963c.setVisibility(0);
                    TextView textView = hVar.f194963c;
                    textView.setText("＠" + b7Var.field_wording);
                } else {
                    if (!Util.isNullOrNil(b7Var.field_appid) && !Util.isNullOrNil(b7Var.field_wordingId)) {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(b7Var.field_wordingId);
                        if (!Util.isEqual(hVar.f194963c.getTag(), (Object) "first")) {
                            SeeAccessVerifyInfoUI.this.f194922F = true;
                            C86709a0.m107529k().f251779b.mo123460f((C117747y) ((C77792p) C86312j.m106911c(cls)).Hf0(b7Var.field_appid, b7Var.field_language, linkedList));
                        }
                    }
                    hVar.f194963c.setVisibility(4);
                    hVar.f194963c.setTag("first");
                }
            } else {
                hVar.f194963c.setVisibility(8);
            }
            view.setOnClickListener(new C67917a(i));
            return view;
        }
    }

    /* renamed from: com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI$h */
    public class C67918h {

        /* renamed from: a */
        public ImageView f194961a;

        /* renamed from: b */
        public TextView f194962b;

        /* renamed from: c */
        public TextView f194963c;

        public C67918h(SeeAccessVerifyInfoUI seeAccessVerifyInfoUI) {
        }
    }

    /* renamed from: H7 */
    public static void m80281H7(SeeAccessVerifyInfoUI seeAccessVerifyInfoUI, String str, String str2, String str3, boolean z) {
        C44673z4 Lo;
        seeAccessVerifyInfoUI.getClass();
        Class cls = C75700k0.class;
        if (Util.isNullOrNil(str2) && (Lo = ((C44651a5) ((C75700k0) C86709a0.m107533q(cls)).mm0()).mo69630Lo(str)) != null && !Util.isNullOrNil(Lo.field_encryptUsername)) {
            str2 = Lo.field_conRemark;
        }
        if (!Util.isNullOrNil(str)) {
            Intent intent = new Intent();
            intent.putExtra("Contact_User", str);
            intent.putExtra("Contact_RemarkName", str2);
            Log.m105925i("MicroMsg.SeeAccessVerifyInfoUI", "mTicket:%s", seeAccessVerifyInfoUI.f194939v);
            intent.putExtra("key_add_contact_verify_ticket", seeAccessVerifyInfoUI.f194939v);
            C44661m1 m1Var = seeAccessVerifyInfoUI.f194924d;
            if (m1Var != null) {
                intent.putExtra("Contact_RoomNickname", m1Var.mo69789q2(str));
            }
            intent.putExtra("Contact_Nick", str3);
            intent.putExtra("Contact_RoomMember", true);
            intent.putExtra("room_name", seeAccessVerifyInfoUI.f194937t);
            intent.putExtra("CONTACT_INFO_UI_SOURCE", 16);
            C72996z1 z1Var = ((C75700k0) C86709a0.m107533q(cls)).mo96097Ni().get(str);
            if (z1Var != null && ((int) z1Var.f108320R1) > 0 && z1Var.mo62927s3()) {
                SetLocalQQMobileEvent setLocalQQMobileEvent = new SetLocalQQMobileEvent();
                SetLocalQQMobileEvent.C1133a aVar = setLocalQQMobileEvent.f9501d;
                aVar.f9503a = intent;
                aVar.f9504b = str;
                setLocalQQMobileEvent.publish();
            }
            if (z1Var != null && z1Var.mo62916m3()) {
                C115669n nVar = C115669n.INSTANCE;
                nVar.kvStat(10298, z1Var.getUsername() + "," + 14);
            }
            if (z) {
                intent.putExtra("Contact_Scene", 96);
            } else {
                intent.putExtra("Contact_Scene", 14);
            }
            intent.putExtra("Is_RoomOwner", true);
            intent.putExtra("Contact_ChatRoomId", seeAccessVerifyInfoUI.f194937t);
            C88144b.m109791i(seeAccessVerifyInfoUI, Scopes.PROFILE, ".ui.ContactInfoUI", intent, (Bundle) null);
        }
    }

    /* renamed from: I7 */
    public C67918h mo93305I7(View view) {
        C67918h hVar = new C67918h(this);
        hVar.f194961a = (ImageView) view.findViewById(C0966R.C0970id.iwa);
        hVar.f194962b = (TextView) view.findViewById(C0966R.C0970id.iw8);
        hVar.f194963c = (TextView) view.findViewById(C0966R.C0970id.iw_);
        return hVar;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bvp;
    }

    /* JADX WARNING: type inference failed for: r6v14, types: [android.text.SpannableString] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void initView() {
        /*
            r9 = this;
            java.lang.Class<sv.p> r0 = p239sv.C77792p.class
            java.lang.Class<f62.k0> r1 = f62.C75700k0.class
            java.lang.Class<ny.h> r2 = p629ny.C76979h.class
            r3 = 2131306523(0x7f09281b, float:1.8231247E38)
            android.view.View r3 = r9.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r9.f194940w = r3
            r3 = 2131306522(0x7f09281a, float:1.8231245E38)
            android.view.View r3 = r9.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r9.f194941x = r3
            r3 = 2131312627(0x7f093ff3, float:1.8243628E38)
            android.view.View r3 = r9.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r9.f194943z = r3
            r3 = 2131312629(0x7f093ff5, float:1.8243632E38)
            android.view.View r3 = r9.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r9.f194917A = r3
            r3 = 2131312630(0x7f093ff6, float:1.8243634E38)
            android.view.View r3 = r9.findViewById(r3)
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            r9.f194942y = r3
            r3 = 2131296349(0x7f09005d, float:1.8210612E38)
            android.view.View r3 = r9.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r9.f194918B = r3
            r3 = 2131297711(0x7f0905af, float:1.8213375E38)
            android.view.View r3 = r9.findViewById(r3)
            android.widget.GridView r3 = (android.widget.GridView) r3
            r9.f194919C = r3
            com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI$g r4 = r9.f194925e
            r3.setAdapter(r4)
            android.widget.ImageView r3 = r9.f194942y
            if (r3 == 0) goto L_0x0064
            com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI$b r4 = new com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI$b
            r4.<init>()
            r3.setOnClickListener(r4)
        L_0x0064:
            android.widget.GridView r3 = r9.f194919C
            com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI$c r4 = new com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI$c
            r4.<init>(r9)
            r3.setOnTouchListener(r4)
            android.widget.GridView r3 = r9.f194919C
            com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI$d r4 = new com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI$d
            r4.<init>()
            r5 = 100
            r3.postDelayed(r4, r5)
            android.widget.ImageView r3 = r9.f194942y
            if (r3 == 0) goto L_0x0091
            java.lang.Class<ln.f> r3 = p196ln.C76705f.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            ln.f r3 = (p196ln.C76705f) r3
            android.widget.ImageView r4 = r9.f194942y
            java.lang.String r5 = r9.f194932o
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            r3.mo106849z(r4, r5)
        L_0x0091:
            android.widget.TextView r3 = r9.f194943z
            if (r3 == 0) goto L_0x00fd
            java.lang.String r4 = r9.f194932o
            java.lang.String r4 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            android.widget.TextView r5 = r9.f194943z
            r6 = 0
            if (r5 != 0) goto L_0x00a1
            goto L_0x00fa
        L_0x00a1:
            k40.a r7 = f40.C86709a0.m107533q(r1)
            f62.k0 r7 = (f62.C75700k0) r7
            com.tencent.mm.storage.u3 r7 = r7.mo96097Ni()
            java.lang.String r8 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r4)
            com.tencent.mm.storage.z1 r7 = r7.get(r8)
            if (r7 != 0) goto L_0x00bd
            java.lang.String r4 = "MicroMsg.SeeAccessVerifyInfoUI"
            java.lang.String r5 = "ct == null"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r4, r5)
            goto L_0x00fa
        L_0x00bd:
            java.lang.String r8 = r7.mo73969n2()
            boolean r8 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r8)
            if (r8 != 0) goto L_0x00cc
            java.lang.String r6 = r7.mo73969n2()
            goto L_0x00d4
        L_0x00cc:
            com.tencent.mm.storage.m1 r8 = r9.f194924d
            if (r8 == 0) goto L_0x00d4
            java.lang.String r6 = r8.mo69789q2(r4)
        L_0x00d4:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r4 == 0) goto L_0x00de
            java.lang.String r6 = r7.mo73969n2()
        L_0x00de:
            boolean r4 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r6)
            if (r4 == 0) goto L_0x00e8
            java.lang.String r6 = r7.mo62909j3()
        L_0x00e8:
            di3.d r4 = di3.C86312j.m106911c(r2)
            ny.h r4 = (p629ny.C76979h) r4
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            float r5 = r5.getTextSize()
            android.text.SpannableString r6 = r4.yp0(r9, r6, r5)
        L_0x00fa:
            r3.setText(r6)
        L_0x00fd:
            android.widget.TextView r3 = r9.f194917A
            r4 = 0
            if (r3 == 0) goto L_0x01ae
            java.lang.String r3 = r9.f194937t
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85847r5(r3)
            if (r3 == 0) goto L_0x01a7
            java.lang.String r3 = r9.f194932o
            boolean r3 = com.tencent.p014mm.storage.C72996z1.m85843n5(r3)
            if (r3 == 0) goto L_0x01a7
            xh.b7 r3 = new xh.b7
            r3.<init>()
            java.lang.String r5 = r9.f194933p
            r3.field_appid = r5
            java.lang.String r5 = r9.f194934q
            r3.field_wordingId = r5
            android.content.Context r5 = com.tencent.p014mm.sdk.platformtools.MMApplicationContext.getContext()
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.LocaleUtil.getCurrentLanguage(r5)
            r3.field_language = r5
            di3.d r5 = di3.C86312j.m106911c(r0)
            sv.p r5 = (p239sv.C77792p) r5
            sv.s r5 = r5.mo107738m7()
            java.lang.String r6 = "appid"
            java.lang.String r7 = "wordingId"
            java.lang.String r8 = "language"
            java.lang.String[] r6 = new java.lang.String[]{r6, r7, r8}
            re0.l r5 = (re0.C36315l) r5
            r5.mo60615jo(r3, r6)
            java.lang.String r5 = r3.field_wording
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x016a
            android.widget.TextView r0 = r9.f194917A
            r0.setVisibility(r4)
            android.widget.TextView r0 = r9.f194917A
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "＠"
            r5.append(r6)
            java.lang.String r3 = r3.field_wording
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r0.setText(r3)
            goto L_0x01ae
        L_0x016a:
            java.lang.String r5 = r9.f194934q
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x01a0
            java.lang.String r5 = r9.f194933p
            boolean r5 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r5)
            if (r5 != 0) goto L_0x01a0
            r5 = 1
            r9.f194923G = r5
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            java.lang.String r6 = r9.f194934q
            r5.add(r6)
            f40.g r6 = f40.C86709a0.m107529k()
            ob0.b0 r6 = r6.f251779b
            di3.d r0 = di3.C86312j.m106911c(r0)
            sv.p r0 = (p239sv.C77792p) r0
            java.lang.String r7 = r9.f194933p
            java.lang.String r3 = r3.field_language
            sv.i r0 = r0.Hf0(r7, r3, r5)
            ob0.y r0 = (ob0.C117747y) r0
            r6.mo123460f(r0)
        L_0x01a0:
            android.widget.TextView r0 = r9.f194917A
            r3 = 4
            r0.setVisibility(r3)
            goto L_0x01ae
        L_0x01a7:
            android.widget.TextView r0 = r9.f194917A
            r3 = 8
            r0.setVisibility(r3)
        L_0x01ae:
            android.widget.TextView r0 = r9.f194940w
            if (r0 == 0) goto L_0x01c5
            di3.d r3 = di3.C86312j.m106911c(r2)
            ny.h r3 = (p629ny.C76979h) r3
            java.lang.String r5 = r9.f194931n
            java.lang.String r5 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r5)
            android.text.SpannableString r3 = r3.mo107057T1(r9, r5)
            r0.setText(r3)
        L_0x01c5:
            android.widget.TextView r0 = r9.f194941x
            if (r0 == 0) goto L_0x01fa
            java.lang.String r0 = r9.f194938u
            boolean r0 = com.tencent.p014mm.sdk.platformtools.Util.isNullOrNil((java.lang.String) r0)
            if (r0 != 0) goto L_0x01fa
            android.widget.TextView r0 = r9.f194941x
            di3.d r2 = di3.C86312j.m106911c(r2)
            ny.h r2 = (p629ny.C76979h) r2
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "\""
            r3.append(r5)
            java.lang.String r6 = r9.f194938u
            java.lang.String r6 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r6)
            r3.append(r6)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            android.text.SpannableString r2 = r2.mo107057T1(r9, r3)
            r0.setText(r2)
        L_0x01fa:
            android.widget.TextView r0 = r9.f194918B
            if (r0 == 0) goto L_0x0206
            com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI$e r2 = new com.tencent.mm.chatroom.ui.SeeAccessVerifyInfoUI$e
            r2.<init>()
            r0.setOnClickListener(r2)
        L_0x0206:
            android.widget.TextView r0 = r9.f194918B
            if (r0 == 0) goto L_0x024b
            k40.a r0 = f40.C86709a0.m107533q(r1)
            f62.k0 r0 = (f62.C75700k0) r0
            g62.l r0 = r0.mo96095LE()
            long r1 = r9.f194935r
            com.tencent.mm.storage.g4 r0 = (com.tencent.p014mm.storage.C72972g4) r0
            com.tencent.mm.storage.f4 r0 = r0.b00(r1)
            boolean r0 = r0.mo100978Q3()
            if (r0 == 0) goto L_0x024b
            android.widget.TextView r0 = r9.f194918B
            r1 = 2131231398(0x7f0802a6, float:1.8078876E38)
            r0.setBackgroundResource(r1)
            android.widget.TextView r0 = r9.f194918B
            android.content.res.Resources r1 = r9.getResources()
            r2 = 2131100891(0x7f0604db, float:1.7814176E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            android.widget.TextView r0 = r9.f194918B
            r1 = 2131831217(0x7f1129b1, float:1.9295453E38)
            java.lang.String r1 = r9.getString(r1)
            r0.setText(r1)
            android.widget.TextView r0 = r9.f194918B
            r0.setEnabled(r4)
        L_0x024b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.chatroom.p015ui.SeeAccessVerifyInfoUI.initView():void");
    }

    public void onCreate(Bundle bundle) {
        Class cls = C75700k0.class;
        super.onCreate(bundle);
        Log.m105924i("MicroMsg.SeeAccessVerifyInfoUI", "[onCreate]");
        setMMTitle(getString(C0966R.string.f7350ds));
        this.f194935r = getIntent().getLongExtra("msgLocalId", 0);
        this.f194936s = getIntent().getLongExtra("msgSvrId", 0);
        this.f194931n = getIntent().getStringExtra("invitertitle");
        this.f194932o = getIntent().getStringExtra("inviterusername");
        this.f194933p = getIntent().getStringExtra("inviterappid");
        this.f194934q = getIntent().getStringExtra("inviterdescid");
        this.f194937t = getIntent().getStringExtra("chatroom");
        this.f194938u = getIntent().getStringExtra("invitationreason");
        this.f194939v = getIntent().getStringExtra("ticket");
        this.f194927g = getIntent().getStringExtra("username");
        this.f194926f = getIntent().getStringExtra("nickname");
        this.f194928h = getIntent().getStringExtra("descid");
        this.f194929i = getIntent().getStringExtra("appid");
        this.f194930j = getIntent().getStringExtra("headimgurl");
        this.f194924d = ((C44662n1) ((C39479c) C86709a0.m107533q(C39479c.class)).mo62084mr()).mo69801SE(Util.nullAsNil(this.f194937t));
        this.f194925e = new C67916g(this);
        String[] split = this.f194927g.split(",");
        if (split != null && split.length > 0) {
            String str = split[0];
            Log.m105925i("MicroMsg.SeeAccessVerifyInfoUI", "[%s] has been in chatroom![%s]", str, this.f194937t);
            if (this.f194924d.mo69790r2() != null && this.f194924d.mo69790r2().contains(str)) {
                C72963f4 b002 = ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).b00(this.f194935r);
                if (!b002.mo100978Q3()) {
                    b002.mo108743W2(b002.f230723F | 128);
                    ((C72972g4) ((C75700k0) C86709a0.m107533q(cls)).mo96095LE()).xy0(this.f194935r, b002);
                }
            }
        }
        initView();
        setBackBtn(new C67908a());
    }

    public void onDestroy() {
        super.onDestroy();
        C86709a0.m107529k().f251779b.mo123470p(453, this);
    }

    public void onResume() {
        Log.m105924i("MicroMsg.SeeAccessVerifyInfoUI", "[onResume]");
        C86709a0.m107529k().f251779b.mo123455a(453, this);
        super.onResume();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        Class cls = C77792p.class;
        if ((yVar instanceof C36838i) && i == 0 && i2 == 0) {
            if (this.f194923G && Util.isNullOrNil(this.f194917A.getText())) {
                this.f194923G = false;
                C38533b7 b7Var = new C38533b7();
                b7Var.field_appid = this.f194933p;
                b7Var.field_wordingId = this.f194934q;
                b7Var.field_language = LocaleUtil.getCurrentLanguage(MMApplicationContext.getContext());
                ((C36315l) ((C77792p) C86312j.m106911c(cls)).mo107738m7()).mo60615jo(b7Var, new String[]{"appid", "wordingId", FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE});
                if (!TextUtils.isEmpty(b7Var.field_wording)) {
                    this.f194917A.setVisibility(0);
                    TextView textView = this.f194917A;
                    textView.setText("＠" + b7Var.field_wording);
                } else {
                    if (!Util.isNullOrNil(this.f194934q) && !Util.isNullOrNil(this.f194933p)) {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(this.f194934q);
                        C86709a0.m107529k().f251779b.mo123460f((C117747y) ((C77792p) C86312j.m106911c(cls)).Hf0(this.f194933p, b7Var.field_language, linkedList));
                    }
                    this.f194917A.setVisibility(4);
                }
            }
            if (this.f194922F) {
                this.f194925e.notifyDataSetChanged();
            }
        }
    }
}
