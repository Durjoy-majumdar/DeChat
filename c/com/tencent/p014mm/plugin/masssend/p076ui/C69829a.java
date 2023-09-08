package com.tencent.p014mm.plugin.masssend.p076ui;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C67654r1;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.C85868k2;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.AnimImageView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C97625j3;
import f12.C7970a;
import hd0.C98403m0;
import hd0.C98410o0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import k20.C9556a;
import ke3.C88144b;
import nj3.C76912y0;
import p214om.C11502f;
import p682rz.C101488s;
import p910lj.C76701a;
import td3.C13875a;
import w52.C38023l;
import w52.C78517d;
import w52.C78518e;
import wc3.C15141z;

/* renamed from: com.tencent.mm.plugin.masssend.ui.a */
public class C69829a extends C6975i1<C78517d> {

    /* renamed from: o */
    public short[] f201471o;

    /* renamed from: p */
    public List<String> f201472p;

    /* renamed from: q */
    public String f201473q = "";

    /* renamed from: r */
    public int f201474r;

    /* renamed from: s */
    public int f201475s;

    /* renamed from: t */
    public MMActivity f201476t;

    /* renamed from: u */
    public C69832e f201477u;

    /* renamed from: v */
    public LayoutInflater f201478v;

    /* renamed from: com.tencent.mm.plugin.masssend.ui.a$a */
    public class C4891a implements View.OnClickListener {

        /* renamed from: d */
        public String f19977d;

        /* renamed from: e */
        public int f19978e;

        public C4891a(String str, int i) {
            this.f19977d = str;
            this.f19978e = i;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$OnImageClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            Log.m105926v("MicroMsg.HistoryAdapter", "image clicked:" + this.f19977d);
            if (!C97625j3.m125812b().mo105883I()) {
                C76912y0.m92771j(C69829a.this.f201476t, (View) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$OnImageClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            StringBuilder sb = new StringBuilder();
            C97625j3.m125812b().getClass();
            sb.append(C7970a.m8127a());
            sb.append(this.f19977d);
            String sb4 = sb.toString();
            if (sb4 == null || sb4.equals("") || !C86013q1.m106450k(sb4)) {
                Log.m105918d("MicroMsg.HistoryAdapter", "showImg : imgPath is null");
                C117292a.m165361g(this, "com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$OnImageClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            Intent intent = new Intent();
            intent.putExtra("key_compress_type", this.f19978e);
            intent.putExtra("key_favorite", false);
            intent.putExtra("key_image_path", sb4);
            ((C67654r1) ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM()).mo93188u(C69829a.this.f201476t, intent);
            C117292a.m165361g(this, "com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$OnImageClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.masssend.ui.a$c */
    public class C4892c implements View.OnClickListener {

        /* renamed from: d */
        public String f19980d;

        /* renamed from: e */
        public int f19981e;

        /* renamed from: f */
        public int f19982f;

        /* renamed from: g */
        public int f19983g;

        public C4892c(String str, int i, int i2, int i3) {
            this.f19980d = str;
            this.f19981e = i;
            this.f19983g = i3;
            this.f19982f = i2;
        }

        public void onClick(View view) {
            Class cls = C101488s.class;
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$OnVideoClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            if (!C97625j3.m125812b().mo105883I()) {
                C76912y0.m92771j(C69829a.this.f201476t, (View) null);
                C117292a.m165361g(this, "com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$OnVideoClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            boolean z = this.f19981e == 2;
            boolean c = C98403m0.m127703c(((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137728q(this.f19980d));
            Log.m105925i("MicroMsg.HistoryAdapter", "video clicked, path:%s, isExport:%b, typeQt:%b", this.f19980d, Boolean.valueOf(z), Boolean.valueOf(c));
            C15141z yM = ((C11502f) C86312j.m106911c(C11502f.class)).mo11462yM();
            MMActivity mMActivity = C69829a.this.f201476t;
            String str = this.f19980d;
            int i = this.f19983g;
            int i2 = this.f19982f;
            ((C67654r1) yM).getClass();
            if (!z && !c) {
                Intent intent = new Intent();
                intent.putExtra("VideoPlayer_File_nam", str);
                intent.putExtra("VideoRecorder_VideoLength", i);
                intent.putExtra("VideoRecorder_VideoSize", i2);
                C88144b.m109791i(mMActivity, "subapp", ".ui.video.VideoPlayerUI", intent, (Bundle) null);
            } else if (!C13875a.m13189a(((C98410o0) ((C101488s) C86312j.m106911c(cls)).Kj0()).mo137728q(str), mMActivity, c)) {
                C76701a.makeText((Context) mMActivity, (CharSequence) mMActivity.getString(C0966R.string.f361493kb3), 0).show();
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$OnVideoClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.masssend.ui.a$b */
    public class C69830b implements View.OnClickListener {

        /* renamed from: d */
        public String f201479d;

        public C69830b(String str) {
            this.f201479d = str;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$OnSendAgainClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C78517d Lo = C38023l.wx0().mo108476Lo(this.f201479d);
            Intent intent = new Intent(C69829a.this.f201476t, MassSendMsgUI.class);
            intent.putExtra("mass_send_contact_list", Lo.mo108467f());
            intent.putExtra("mass_send_again", true);
            MMActivity mMActivity = C69829a.this.f201476t;
            C9556a aVar = new C9556a();
            aVar.mo10233c(intent);
            MMActivity mMActivity2 = mMActivity;
            C117292a.m165358d(mMActivity2, aVar.mo10232b(), "com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$OnSendAgainClickListener", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            mMActivity.startActivity((Intent) aVar.mo10231a(0));
            C117292a.m165359e(mMActivity2, "com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$OnSendAgainClickListener", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            C117292a.m165361g(this, "com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$OnSendAgainClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.masssend.ui.a$d */
    public class C69831d implements View.OnClickListener {

        /* renamed from: d */
        public String f201481d;

        public C69831d(String str) {
            this.f201481d = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0089, code lost:
            if (r0.f201493a.mo96014H7(r1) != false) goto L_0x008e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onClick(android.view.View r8) {
            /*
                r7 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r0.add(r8)
                java.lang.Object[] r6 = r0.toArray()
                r0.clear()
                java.lang.String r1 = "com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$OnVoiceClickListener"
                java.lang.String r2 = "android/view/View$OnClickListener"
                java.lang.String r3 = "onClick"
                java.lang.String r4 = "(Landroid/view/View;)V"
                r5 = r7
                j20.C117292a.m165356b(r1, r2, r3, r4, r5, r6)
                java.lang.StringBuilder r8 = new java.lang.StringBuilder
                r8.<init>()
                java.lang.String r0 = "voice clicked:"
                r8.append(r0)
                java.lang.String r0 = r7.f201481d
                r8.append(r0)
                java.lang.String r8 = r8.toString()
                java.lang.String r0 = "MicroMsg.HistoryAdapter"
                com.tencent.p014mm.sdk.platformtools.Log.m105926v(r0, r8)
                com.tencent.mm.plugin.masssend.ui.a r8 = com.tencent.p014mm.plugin.masssend.p076ui.C69829a.this
                com.tencent.mm.plugin.masssend.ui.a$e r0 = r8.f201477u
                if (r0 == 0) goto L_0x0095
                java.lang.String r1 = r7.f201481d
                com.tencent.mm.plugin.masssend.ui.b r0 = (com.tencent.p014mm.plugin.masssend.p076ui.C69834b) r0
                eb0.c r2 = eb0.C97625j3.m125812b()
                boolean r2 = r2.mo105883I()
                if (r2 != 0) goto L_0x004f
                com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI r0 = r0.f201493a
                r1 = 0
                nj3.C76912y0.m92771j(r0, r1)
                goto L_0x008c
            L_0x004f:
                java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r1)
                com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI r2 = r0.f201493a
                ph.a r2 = r2.f201417g
                boolean r2 = r2.mo35058b()
                if (r2 == 0) goto L_0x0083
                com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI r2 = r0.f201493a
                com.tencent.mm.plugin.masssend.ui.a r2 = r2.f201415e
                java.lang.String r2 = r2.f201473q
                boolean r2 = r1.equals(r2)
                if (r2 == 0) goto L_0x0083
                com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI r1 = r0.f201493a
                r1.getClass()
                com.tencent.mm.sdk.platformtools.SensorController r1 = com.tencent.p014mm.plugin.masssend.p076ui.MassSendHistoryUI.f201413p
                r1.removeSensorCallBack()
                com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI r1 = r0.f201493a
                android.widget.ListView r1 = r1.f201414d
                r2 = 0
                r1.setKeepScreenOn(r2)
                com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI r0 = r0.f201493a
                ph.a r0 = r0.f201417g
                r0.mo35070n(r2)
                goto L_0x008c
            L_0x0083:
                com.tencent.mm.plugin.masssend.ui.MassSendHistoryUI r0 = r0.f201493a
                boolean r0 = r0.mo96014H7(r1)
                if (r0 == 0) goto L_0x008c
                goto L_0x008e
            L_0x008c:
                java.lang.String r1 = ""
            L_0x008e:
                r8.f201473q = r1
                com.tencent.mm.plugin.masssend.ui.a r8 = com.tencent.p014mm.plugin.masssend.p076ui.C69829a.this
                r8.notifyDataSetChanged()
            L_0x0095:
                java.lang.String r8 = "com/tencent/mm/plugin/masssend/ui/MassSendHistoryAdapter$OnVoiceClickListener"
                java.lang.String r0 = "android/view/View$OnClickListener"
                java.lang.String r1 = "onClick"
                java.lang.String r2 = "(Landroid/view/View;)V"
                j20.C117292a.m165361g(r7, r8, r0, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.masssend.p076ui.C69829a.C69831d.onClick(android.view.View):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.masssend.ui.a$e */
    public interface C69832e {
    }

    /* renamed from: com.tencent.mm.plugin.masssend.ui.a$f */
    public static class C69833f {

        /* renamed from: a */
        public TextView f201483a;

        /* renamed from: b */
        public TextView f201484b;

        /* renamed from: c */
        public TextView f201485c;

        /* renamed from: d */
        public TextView f201486d;

        /* renamed from: e */
        public ImageView f201487e;

        /* renamed from: f */
        public TextView f201488f;

        /* renamed from: g */
        public AnimImageView f201489g;

        /* renamed from: h */
        public View f201490h;

        /* renamed from: i */
        public TextView f201491i;

        /* renamed from: j */
        public short f201492j;
    }

    public C69829a(Context context) {
        super(context, new C78517d());
        this.f201476t = (MMActivity) context;
        this.f201472p = new LinkedList();
        this.f201474r = 10;
        this.f201475s = 10;
        this.f201478v = C85868k2.m106137b(context);
    }

    /* renamed from: d */
    public Object mo1330d(Object obj, Cursor cursor) {
        C78517d dVar = (C78517d) obj;
        if (dVar == null) {
            dVar = new C78517d();
        }
        dVar.mo108462a(cursor);
        return dVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x0478  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x04c6  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x04d2  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0515  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0214  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r19, android.view.View r20, android.view.ViewGroup r21) {
        /*
            r18 = this;
            r6 = r18
            java.lang.Object r0 = r18.getItem(r19)
            w52.d r0 = (w52.C78517d) r0
            r7 = 2
            r9 = 1
            if (r19 == 0) goto L_0x0046
            int r0 = r19 + -1
            java.lang.Object r0 = r6.getItem(r0)
            w52.d r0 = (w52.C78517d) r0
            long r0 = r0.f229977c
            java.lang.Object r2 = r18.getItem(r19)
            w52.d r2 = (w52.C78517d) r2
            long r3 = r2.f229977c
            long r3 = r3 - r0
            r0 = 60000(0xea60, double:2.9644E-319)
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 >= 0) goto L_0x0028
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            r10 = 180000(0x2bf20, double:8.8932E-319)
            long r3 = r3 / r10
            r10 = 1
            int r1 = (r3 > r10 ? 1 : (r3 == r10 ? 0 : -1))
            if (r1 >= 0) goto L_0x0035
            r1 = 1
            goto L_0x0036
        L_0x0035:
            r1 = 0
        L_0x0036:
            if (r0 != 0) goto L_0x0040
            if (r1 == 0) goto L_0x003b
            goto L_0x0040
        L_0x003b:
            short[] r0 = r6.f201471o
            r0[r19] = r9
            goto L_0x0044
        L_0x0040:
            short[] r0 = r6.f201471o
            r0[r19] = r7
        L_0x0044:
            r10 = r2
            goto L_0x004b
        L_0x0046:
            short[] r1 = r6.f201471o
            r1[r19] = r9
            r10 = r0
        L_0x004b:
            short[] r0 = r6.f201471o
            short r0 = r0[r19]
            if (r0 != r9) goto L_0x005b
            long r0 = r10.f229977c
            r2 = 1000(0x3e8, double:4.94E-321)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x005b
            r0 = 1
            goto L_0x005c
        L_0x005b:
            r0 = 0
        L_0x005c:
            int r1 = r10.f229983i
            r2 = 2131309027(0x7f0931e3, float:1.8236326E38)
            r3 = 2131309037(0x7f0931ed, float:1.8236346E38)
            r4 = 2131309026(0x7f0931e2, float:1.8236324E38)
            r5 = 2131309031(0x7f0931e7, float:1.8236334E38)
            r11 = 2131309028(0x7f0931e4, float:1.8236328E38)
            r12 = 3
            r13 = 0
            r14 = 34
            r15 = 43
            if (r1 == r9) goto L_0x0193
            r8 = 2131309033(0x7f0931e9, float:1.8236338E38)
            if (r1 == r12) goto L_0x0145
            if (r1 == r14) goto L_0x00dc
            if (r1 == r15) goto L_0x0080
            goto L_0x01a5
        L_0x0080:
            com.tencent.mm.plugin.masssend.ui.a$f r1 = new com.tencent.mm.plugin.masssend.ui.a$f
            r1.<init>()
            if (r20 == 0) goto L_0x0093
            java.lang.Object r16 = r20.getTag()
            r15 = r16
            com.tencent.mm.plugin.masssend.ui.a$f r15 = (com.tencent.p014mm.plugin.masssend.p076ui.C69829a.C69833f) r15
            short r15 = r15.f201492j
            if (r15 == r12) goto L_0x01a5
        L_0x0093:
            android.view.LayoutInflater r15 = r6.f201478v
            r14 = 2131496472(0x7f0c0e18, float:1.861651E38)
            android.view.View r14 = r15.inflate(r14, r13)
            android.view.View r11 = r14.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r1.f201483a = r11
            android.view.View r5 = r14.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r1.f201484b = r5
            android.view.View r5 = r14.findViewById(r8)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r1.f201487e = r5
            r5 = 2131309034(0x7f0931ea, float:1.823634E38)
            android.view.View r5 = r14.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r1.f201486d = r5
            android.view.View r4 = r14.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r1.f201488f = r4
            android.view.View r3 = r14.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r1.f201491i = r3
            android.view.View r2 = r14.findViewById(r2)
            r1.f201490h = r2
            r1.f201492j = r12
            r14.setTag(r1)
            goto L_0x01e8
        L_0x00dc:
            com.tencent.mm.plugin.masssend.ui.a$f r1 = new com.tencent.mm.plugin.masssend.ui.a$f
            r1.<init>()
            r8 = 4
            if (r20 == 0) goto L_0x00ee
            java.lang.Object r14 = r20.getTag()
            com.tencent.mm.plugin.masssend.ui.a$f r14 = (com.tencent.p014mm.plugin.masssend.p076ui.C69829a.C69833f) r14
            short r14 = r14.f201492j
            if (r14 == r8) goto L_0x01a5
        L_0x00ee:
            android.view.LayoutInflater r14 = r6.f201478v
            r15 = 2131496473(0x7f0c0e19, float:1.8616512E38)
            android.view.View r14 = r14.inflate(r15, r13)
            android.view.View r11 = r14.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r1.f201483a = r11
            android.view.View r5 = r14.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r1.f201484b = r5
            r5 = 2131309029(0x7f0931e5, float:1.823633E38)
            android.view.View r5 = r14.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r1.f201486d = r5
            r5 = 2131309036(0x7f0931ec, float:1.8236344E38)
            android.view.View r5 = r14.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r1.f201485c = r5
            r5 = 2131309035(0x7f0931eb, float:1.8236342E38)
            android.view.View r5 = r14.findViewById(r5)
            com.tencent.mm.ui.base.AnimImageView r5 = (com.tencent.p014mm.p136ui.base.AnimImageView) r5
            r1.f201489g = r5
            android.view.View r4 = r14.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r1.f201488f = r4
            android.view.View r3 = r14.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r1.f201491i = r3
            android.view.View r2 = r14.findViewById(r2)
            r1.f201490h = r2
            r1.f201492j = r8
            r14.setTag(r1)
            goto L_0x01e8
        L_0x0145:
            com.tencent.mm.plugin.masssend.ui.a$f r1 = new com.tencent.mm.plugin.masssend.ui.a$f
            r1.<init>()
            if (r20 == 0) goto L_0x0156
            java.lang.Object r14 = r20.getTag()
            com.tencent.mm.plugin.masssend.ui.a$f r14 = (com.tencent.p014mm.plugin.masssend.p076ui.C69829a.C69833f) r14
            short r14 = r14.f201492j
            if (r14 == r7) goto L_0x01a5
        L_0x0156:
            android.view.LayoutInflater r14 = r6.f201478v
            r15 = 2131496470(0x7f0c0e16, float:1.8616506E38)
            android.view.View r14 = r14.inflate(r15, r13)
            android.view.View r11 = r14.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r1.f201483a = r11
            android.view.View r5 = r14.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r1.f201484b = r5
            android.view.View r5 = r14.findViewById(r8)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r1.f201487e = r5
            android.view.View r4 = r14.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r1.f201488f = r4
            android.view.View r3 = r14.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r1.f201491i = r3
            android.view.View r2 = r14.findViewById(r2)
            r1.f201490h = r2
            r1.f201492j = r7
            r14.setTag(r1)
            goto L_0x01e8
        L_0x0193:
            com.tencent.mm.plugin.masssend.ui.a$f r1 = new com.tencent.mm.plugin.masssend.ui.a$f
            r1.<init>()
            if (r20 == 0) goto L_0x01a8
            java.lang.Object r8 = r20.getTag()
            com.tencent.mm.plugin.masssend.ui.a$f r8 = (com.tencent.p014mm.plugin.masssend.p076ui.C69829a.C69833f) r8
            short r8 = r8.f201492j
            if (r8 == r9) goto L_0x01a5
            goto L_0x01a8
        L_0x01a5:
            r14 = r20
            goto L_0x01e8
        L_0x01a8:
            android.view.LayoutInflater r8 = r6.f201478v
            r14 = 2131496471(0x7f0c0e17, float:1.8616508E38)
            android.view.View r8 = r8.inflate(r14, r13)
            android.view.View r11 = r8.findViewById(r11)
            android.widget.TextView r11 = (android.widget.TextView) r11
            r1.f201483a = r11
            android.view.View r5 = r8.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r1.f201484b = r5
            r5 = 2131309032(0x7f0931e8, float:1.8236336E38)
            android.view.View r5 = r8.findViewById(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r1.f201485c = r5
            android.view.View r4 = r8.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r1.f201488f = r4
            android.view.View r3 = r8.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r1.f201491i = r3
            android.view.View r2 = r8.findViewById(r2)
            r1.f201490h = r2
            r1.f201492j = r9
            r8.setTag(r1)
            r14 = r8
        L_0x01e8:
            java.lang.Object r1 = r14.getTag()
            com.tencent.mm.plugin.masssend.ui.a$f r1 = (com.tencent.p014mm.plugin.masssend.p076ui.C69829a.C69833f) r1
            r8 = 8
            if (r0 == 0) goto L_0x0206
            android.widget.TextView r0 = r1.f201491i
            r2 = 0
            r0.setVisibility(r2)
            android.widget.TextView r0 = r1.f201491i
            com.tencent.mm.ui.MMActivity r1 = r6.f201476t
            long r3 = r10.f229977c
            java.lang.CharSequence r1 = com.tencent.p014mm.pluginsdk.platformtools.C72715f.m85112e(r1, r3, r2)
            r0.setText(r1)
            goto L_0x020b
        L_0x0206:
            android.widget.TextView r0 = r1.f201491i
            r0.setVisibility(r8)
        L_0x020b:
            java.lang.Class<ny.h> r11 = p629ny.C76979h.class
            int r0 = r10.f229983i
            java.lang.String r15 = ""
            r5 = -1
            if (r0 == r9) goto L_0x0478
            if (r0 == r12) goto L_0x0394
            r1 = 34
            if (r0 == r1) goto L_0x02cd
            r1 = 43
            if (r0 == r1) goto L_0x0222
            r16 = -1
            goto L_0x0476
        L_0x0222:
            java.lang.Object r0 = r14.getTag()
            r12 = r0
            com.tencent.mm.plugin.masssend.ui.a$f r12 = (com.tencent.p014mm.plugin.masssend.p076ui.C69829a.C69833f) r12
            java.lang.Class<rz.s> r0 = p682rz.C101488s.class
            di3.d r0 = di3.C86312j.m106911c(r0)
            rz.s r0 = (p682rz.C101488s) r0
            rz.t r0 = r0.Kj0()
            java.lang.String r1 = r10.mo108464c()
            hd0.o0 r0 = (hd0.C98410o0) r0
            java.lang.String r0 = r0.mo137729r(r1)
            java.lang.Class<gt.k> r1 = p158gt.C98201k.class
            di3.d r1 = di3.C86312j.m106911c(r1)
            gt.k r1 = (p158gt.C98201k) r1
            gt.m r1 = r1.mo137277xi()
            android.widget.ImageView r2 = r12.f201487e
            android.content.Context r2 = r2.getContext()
            float r2 = kg3.C76577a.m92156g(r2)
            com.tencent.mm.ui.MMActivity r3 = r6.f201476t
            com.tencent.mm.modelimage.m r1 = (com.tencent.p014mm.modelimage.C92839m) r1
            android.graphics.Bitmap r0 = r1.fq0(r0, r2, r3, r5)
            if (r0 != 0) goto L_0x0287
            eb0.c r0 = eb0.C97625j3.m125812b()
            boolean r0 = r0.mo105883I()
            if (r0 != 0) goto L_0x0278
            android.widget.ImageView r0 = r12.f201487e
            com.tencent.mm.ui.MMActivity r1 = r6.f201476t
            r2 = 2131757107(0x7f100833, float:1.914514E38)
            android.graphics.drawable.Drawable r1 = kg3.C76577a.m92158i(r1, r2)
            r0.setImageDrawable(r1)
            goto L_0x028c
        L_0x0278:
            android.widget.ImageView r0 = r12.f201487e
            com.tencent.mm.ui.MMActivity r1 = r6.f201476t
            r2 = 2131100893(0x7f0604dd, float:1.781418E38)
            android.graphics.drawable.Drawable r1 = kg3.C76577a.m92158i(r1, r2)
            r0.setImageDrawable(r1)
            goto L_0x028c
        L_0x0287:
            android.widget.ImageView r1 = r12.f201487e
            r1.setImageBitmap(r0)
        L_0x028c:
            android.widget.ImageView r4 = r12.f201487e
            com.tencent.mm.plugin.masssend.ui.a$c r3 = new com.tencent.mm.plugin.masssend.ui.a$c
            java.lang.String r2 = r10.mo108464c()
            int r1 = r10.f229989o
            int r0 = r10.f229986l
            int r5 = r10.f229984j
            r16 = r0
            r0 = r3
            r17 = r1
            r1 = r18
            r9 = r3
            r3 = r17
            r13 = r4
            r4 = r16
            r16 = -1
            r0.<init>(r2, r3, r4, r5)
            r13.setOnClickListener(r9)
            int r0 = r10.f229989o
            if (r0 != r7) goto L_0x02ba
            android.widget.TextView r0 = r12.f201486d
            r0.setVisibility(r8)
            goto L_0x0476
        L_0x02ba:
            android.widget.TextView r0 = r12.f201486d
            r1 = 0
            r0.setVisibility(r1)
            android.widget.TextView r0 = r12.f201486d
            int r1 = r10.f229984j
            java.lang.String r1 = com.tencent.p014mm.sdk.platformtools.Util.formatSecToMin(r1)
            r0.setText(r1)
            goto L_0x0476
        L_0x02cd:
            r16 = -1
            java.lang.Object r0 = r14.getTag()
            com.tencent.mm.plugin.masssend.ui.a$f r0 = (com.tencent.p014mm.plugin.masssend.p076ui.C69829a.C69833f) r0
            int r1 = r10.f229984j
            java.lang.Class<dn.t> r2 = p492dn.C75415t.class
            di3.d r2 = di3.C86312j.m106911c(r2)
            dn.t r2 = (p492dn.C75415t) r2
            long r3 = (long) r1
            float r1 = r2.F30(r3)
            java.lang.String r2 = r10.mo108463b()
            java.lang.String r3 = r6.f201473q
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0302
            com.tencent.mm.ui.base.AnimImageView r2 = r0.f201489g
            r3 = 0
            r2.setVisibility(r3)
            com.tencent.mm.ui.base.AnimImageView r2 = r0.f201489g
            r2.mo101601b()
            android.widget.TextView r2 = r0.f201485c
            r3 = 0
            r2.setCompoundDrawablesWithIntrinsicBounds(r3, r3, r3, r3)
            goto L_0x031f
        L_0x0302:
            r3 = 0
            com.tencent.mm.ui.base.AnimImageView r2 = r0.f201489g
            r2.setVisibility(r8)
            com.tencent.mm.ui.base.AnimImageView r2 = r0.f201489g
            r2.mo101602c()
            android.widget.TextView r2 = r0.f201485c
            com.tencent.mm.ui.MMActivity r4 = r6.f201476t
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131755379(0x7f100173, float:1.9141636E38)
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)
            r2.setCompoundDrawablesWithIntrinsicBounds(r3, r3, r4, r3)
        L_0x031f:
            android.widget.TextView r2 = r0.f201486d
            com.tencent.mm.ui.MMActivity r3 = r6.f201476t
            r4 = 2131830388(0x7f112674, float:1.9293772E38)
            r5 = 1
            java.lang.Object[] r9 = new java.lang.Object[r5]
            int r1 = (int) r1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r1)
            r12 = 0
            r9[r12] = r5
            java.lang.String r3 = r3.getString(r4, r9)
            r2.setText(r3)
            android.widget.TextView r2 = r0.f201485c
            android.content.Context r3 = r2.getContext()
            r4 = 204(0xcc, float:2.86E-43)
            r5 = 60
            r9 = 10
            r12 = 100
            if (r1 > r7) goto L_0x034b
            r13 = 100
            goto L_0x035c
        L_0x034b:
            if (r1 >= r9) goto L_0x0350
            int r13 = r1 + -2
            goto L_0x0356
        L_0x0350:
            if (r1 >= r5) goto L_0x035a
            int r13 = r1 / 10
            int r13 = r13 + 7
        L_0x0356:
            int r13 = r13 * 8
            int r13 = r13 + r12
            goto L_0x035c
        L_0x035a:
            r13 = 204(0xcc, float:2.86E-43)
        L_0x035c:
            int r3 = kg3.C76577a.m92151b(r3, r13)
            r2.setWidth(r3)
            com.tencent.mm.ui.base.AnimImageView r2 = r0.f201489g
            android.widget.TextView r3 = r0.f201485c
            android.content.Context r3 = r3.getContext()
            if (r1 > r7) goto L_0x0370
            r4 = 100
            goto L_0x037d
        L_0x0370:
            if (r1 >= r9) goto L_0x0374
            int r1 = r1 - r7
            goto L_0x0379
        L_0x0374:
            if (r1 >= r5) goto L_0x037d
            int r1 = r1 / r9
            int r1 = r1 + 7
        L_0x0379:
            int r1 = r1 * 8
            int r4 = r1 + 100
        L_0x037d:
            int r1 = kg3.C76577a.m92151b(r3, r4)
            r2.setWidth(r1)
            android.widget.TextView r0 = r0.f201485c
            com.tencent.mm.plugin.masssend.ui.a$d r1 = new com.tencent.mm.plugin.masssend.ui.a$d
            java.lang.String r2 = r10.mo108463b()
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            goto L_0x0476
        L_0x0394:
            r16 = -1
            java.lang.Object r0 = r14.getTag()
            com.tencent.mm.plugin.masssend.ui.a$f r0 = (com.tencent.p014mm.plugin.masssend.p076ui.C69829a.C69833f) r0
            eb0.c r1 = eb0.C97625j3.m125812b()
            boolean r1 = r1.mo105883I()
            if (r1 == 0) goto L_0x0458
            w52.e r1 = w52.C38023l.wx0()
            java.lang.String r2 = r10.mo108464c()
            r1.getClass()
            if (r2 == 0) goto L_0x03f0
            int r1 = r2.length()
            if (r1 > 0) goto L_0x03ba
            goto L_0x03f0
        L_0x03ba:
            java.lang.String r1 = r2.trim()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            eb0.c r3 = eb0.C97625j3.m125812b()
            r3.getClass()
            java.lang.String r3 = f12.C7970a.m8127a()
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            int r2 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.ExifHelper.getExifOrientation(r1)
            java.lang.Class<xs.b> r3 = p755xs.C102720b.class
            di3.d r3 = di3.C86312j.m106911c(r3)
            xs.b r3 = (p755xs.C102720b) r3
            android.graphics.Bitmap r3 = r3.mo142105Ou(r1)
            if (r2 == 0) goto L_0x03f1
            float r1 = (float) r2
            android.graphics.Bitmap r3 = com.tencent.p014mm.sdk.platformtools.BitmapUtil.rotate(r3, r1)
            goto L_0x03f1
        L_0x03f0:
            r3 = 0
        L_0x03f1:
            if (r3 == 0) goto L_0x03f9
            android.widget.ImageView r1 = r0.f201487e
            r1.setImageBitmap(r3)
            goto L_0x0466
        L_0x03f9:
            w52.e r1 = w52.C38023l.wx0()
            java.lang.String r2 = r10.f229980f
            if (r2 != 0) goto L_0x0402
            r2 = r15
        L_0x0402:
            android.widget.ImageView r3 = r0.f201487e
            android.content.Context r3 = r3.getContext()
            float r3 = kg3.C76577a.m92156g(r3)
            r1.getClass()
            int r1 = r2.length()
            if (r1 > 0) goto L_0x0417
            r3 = 0
            goto L_0x0452
        L_0x0417:
            java.lang.String r1 = r2.trim()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            eb0.c r4 = eb0.C97625j3.m125812b()
            r4.getClass()
            java.lang.String r4 = f12.C7970a.m8127a()
            r2.append(r4)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            android.graphics.Bitmap r1 = com.tencent.p014mm.sdk.platformtools.BackwardSupportUtil.BitmapFactory.decodeFile(r1, r3)
            if (r1 == 0) goto L_0x0451
            int r2 = r1.getWidth()
            float r2 = (float) r2
            float r2 = r2 * r3
            int r2 = (int) r2
            int r4 = r1.getHeight()
            float r4 = (float) r4
            float r4 = r4 * r3
            int r3 = (int) r4
            r4 = 1
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createScaledBitmap(r1, r2, r3, r4)
            goto L_0x0452
        L_0x0451:
            r3 = r1
        L_0x0452:
            android.widget.ImageView r1 = r0.f201487e
            r1.setImageBitmap(r3)
            goto L_0x0466
        L_0x0458:
            android.widget.ImageView r1 = r0.f201487e
            com.tencent.mm.ui.MMActivity r2 = r6.f201476t
            r3 = 2131234286(0x7f080dee, float:1.8084733E38)
            android.graphics.drawable.Drawable r2 = kg3.C76577a.m92158i(r2, r3)
            r1.setImageDrawable(r2)
        L_0x0466:
            android.widget.ImageView r0 = r0.f201487e
            com.tencent.mm.plugin.masssend.ui.a$a r1 = new com.tencent.mm.plugin.masssend.ui.a$a
            java.lang.String r2 = r10.mo108464c()
            int r3 = r10.f229990p
            r1.<init>(r2, r3)
            r0.setOnClickListener(r1)
        L_0x0476:
            r2 = 1
            goto L_0x0495
        L_0x0478:
            r16 = -1
            java.lang.Object r0 = r14.getTag()
            com.tencent.mm.plugin.masssend.ui.a$f r0 = (com.tencent.p014mm.plugin.masssend.p076ui.C69829a.C69833f) r0
            android.widget.TextView r1 = r0.f201485c
            java.lang.String r2 = r10.mo108464c()
            r1.setText(r2)
            di3.d r1 = di3.C86312j.m106911c(r11)
            ny.h r1 = (p629ny.C76979h) r1
            android.widget.TextView r0 = r0.f201485c
            r2 = 1
            r1.mo107079pD(r0, r2)
        L_0x0495:
            java.lang.Object r0 = r14.getTag()
            com.tencent.mm.plugin.masssend.ui.a$f r0 = (com.tencent.p014mm.plugin.masssend.p076ui.C69829a.C69833f) r0
            android.widget.TextView r1 = r0.f201483a
            com.tencent.mm.ui.MMActivity r3 = r6.f201476t
            android.content.res.Resources r3 = r3.getResources()
            int r4 = r10.f229982h
            java.lang.Object[] r5 = new java.lang.Object[r2]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r7 = 0
            r5[r7] = r2
            r2 = 2131689492(0x7f0f0014, float:1.9008E38)
            java.lang.String r2 = r3.getQuantityString(r2, r4, r5)
            r1.setText(r2)
            java.util.List<java.lang.String> r1 = r6.f201472p
            java.lang.String r2 = r10.mo108463b()
            java.util.LinkedList r1 = (java.util.LinkedList) r1
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x04d2
            android.widget.TextView r1 = r0.f201484b
            r1.setSingleLine(r7)
            android.widget.TextView r1 = r0.f201484b
            r2 = 0
            r1.setEllipsize(r2)
            goto L_0x04df
        L_0x04d2:
            android.widget.TextView r1 = r0.f201484b
            r2 = 1
            r1.setSingleLine(r2)
            android.widget.TextView r1 = r0.f201484b
            android.text.TextUtils$TruncateAt r2 = android.text.TextUtils.TruncateAt.END
            r1.setEllipsize(r2)
        L_0x04df:
            android.widget.TextView r1 = r0.f201484b
            di3.d r2 = di3.C86312j.m106911c(r11)
            ny.h r2 = (p629ny.C76979h) r2
            com.tencent.mm.ui.MMActivity r3 = r6.f201476t
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.lang.String r5 = r10.mo108467f()
            if (r5 == 0) goto L_0x055a
            java.lang.String r5 = r10.mo108467f()
            boolean r5 = r5.equals(r15)
            if (r5 == 0) goto L_0x04ff
            goto L_0x055a
        L_0x04ff:
            java.lang.String r5 = r10.mo108467f()
            java.lang.String r8 = ";"
            java.lang.String[] r5 = r5.split(r8)
            if (r5 == 0) goto L_0x0512
            int r8 = r5.length
            if (r8 <= 0) goto L_0x0512
            java.util.ArrayList r4 = com.tencent.p014mm.sdk.platformtools.Util.stringsToList(r5)
        L_0x0512:
            if (r4 != 0) goto L_0x0515
            goto L_0x055a
        L_0x0515:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r8 = 0
        L_0x051b:
            int r7 = r4.size()
            if (r8 >= r7) goto L_0x0556
            java.lang.Class<d62.i> r7 = d62.C75339i.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            d62.i r7 = (d62.C75339i) r7
            java.lang.Object r9 = r4.get(r8)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r7 = r7.getDisplayName(r9)
            int r9 = r4.size()
            int r9 = r9 + -1
            if (r8 != r9) goto L_0x053f
            r5.append(r7)
            goto L_0x0553
        L_0x053f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r7)
            java.lang.String r7 = ", "
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            r5.append(r7)
        L_0x0553:
            int r8 = r8 + 1
            goto L_0x051b
        L_0x0556:
            java.lang.String r15 = r5.toString()
        L_0x055a:
            android.widget.TextView r4 = r0.f201484b
            float r4 = r4.getTextSize()
            android.text.SpannableString r2 = r2.yp0(r3, r15, r4)
            r1.setText(r2)
            android.widget.TextView r1 = r0.f201484b
            float r1 = r1.getTextSize()
            int r1 = (int) r1
            android.widget.TextView r2 = r0.f201484b
            java.lang.CharSequence r2 = r2.getText()
            java.lang.String r2 = r2.toString()
            com.tencent.mm.ui.MMActivity r3 = r6.f201476t
            r4 = 255(0xff, float:3.57E-43)
            kg3.C76577a.m92151b(r3, r4)
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            float r1 = (float) r1
            r3.setTextSize(r1)
            r3.measureText(r2)
            android.widget.TextView r0 = r0.f201488f
            com.tencent.mm.plugin.masssend.ui.a$b r1 = new com.tencent.mm.plugin.masssend.ui.a$b
            java.lang.String r2 = r10.mo108463b()
            r1.<init>(r2)
            r0.setOnClickListener(r1)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.masssend.p076ui.C69829a.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* renamed from: l */
    public void mo1332l() {
        mo1333o();
    }

    /* renamed from: o */
    public void mo1333o() {
        Cursor rawQuery = C38023l.wx0().f229995d.rawQuery("SELECT count(*) FROM massendinfo", (String[]) null, 2);
        int i = 0;
        if (rawQuery.moveToFirst()) {
            i = rawQuery.getInt(0);
        }
        rawQuery.close();
        this.f201475s = i;
        C78518e wx02 = C38023l.wx0();
        int i2 = this.f201474r;
        wx02.getClass();
        String str = "select massendinfo.clientid,massendinfo.status,massendinfo.createtime,massendinfo.lastmodifytime,massendinfo.filename,massendinfo.thumbfilename,massendinfo.tolist,massendinfo.tolistcount,massendinfo.msgtype,massendinfo.mediatime,massendinfo.datanetoffset,massendinfo.datalen,massendinfo.thumbnetoffset,massendinfo.thumbtotallen,massendinfo.reserved1,massendinfo.reserved2,massendinfo.reserved3,massendinfo.reserved4 from massendinfo   ORDER BY createtime ASC  LIMIT " + i2 + " offset (SELECT count(*) FROM " + "massendinfo" + " ) -" + i2;
        Log.m105926v("MicroMsg.MasSendInfoStorage", "getCursor sql:" + str);
        mo7998r(wx02.f229995d.rawQuery(str, (String[]) null));
        int count = getCount();
        if (count > 0) {
            this.f201471o = new short[count];
        }
        notifyDataSetChanged();
    }
}
