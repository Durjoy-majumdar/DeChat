package com.tencent.p014mm.p136ui.chatting.gallery;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelimage.C92839m;
import com.tencent.p014mm.p136ui.C6975i1;
import com.tencent.p014mm.p136ui.chatting.gallery.C73708v;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.model.app.C72683d;
import com.tencent.p014mm.pluginsdk.model.app.C72709y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.FileReaderHelper;
import di3.C86312j;
import eb0.C97625j3;
import hc0.C20937c;
import hd0.C98410o0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kg3.C76577a;
import p158gt.C98201k;
import p227rn.C48053v;
import p682rz.C101488s;

/* renamed from: com.tencent.mm.ui.chatting.gallery.n */
public class C73706n extends C6975i1<C72963f4> implements View.OnClickListener {

    /* renamed from: w */
    public static Map<String, Integer> f216414w;

    /* renamed from: x */
    public static Map<String, Integer> f216415x;

    /* renamed from: o */
    public LayoutInflater f216416o;

    /* renamed from: p */
    public boolean f216417p;

    /* renamed from: q */
    public String f216418q;

    /* renamed from: r */
    public boolean f216419r;

    /* renamed from: s */
    public long f216420s;

    /* renamed from: t */
    public final ImageGalleryGridUI f216421t;

    /* renamed from: u */
    public C20937c f216422u = null;

    /* renamed from: v */
    public boolean f216423v = false;

    /* renamed from: com.tencent.mm.ui.chatting.gallery.n$a */
    public static class C73707a {

        /* renamed from: a */
        public ImageView f216424a;

        /* renamed from: b */
        public ImageView f216425b;

        /* renamed from: c */
        public View f216426c;

        /* renamed from: d */
        public TextView f216427d;

        /* renamed from: e */
        public TextView f216428e;

        /* renamed from: f */
        public ImageView f216429f;

        /* renamed from: g */
        public View f216430g;

        /* renamed from: h */
        public View f216431h;

        /* renamed from: i */
        public CheckBox f216432i;

        /* renamed from: j */
        public View f216433j;
    }

    static {
        HashMap hashMap = new HashMap();
        f216414w = hashMap;
        Integer valueOf = Integer.valueOf(C0966R.raw.app_attach_file_icon_video_in_gird);
        hashMap.put("avi", valueOf);
        f216414w.put("m4v", valueOf);
        f216414w.put("vob", valueOf);
        f216414w.put("mpeg", valueOf);
        f216414w.put("mpe", valueOf);
        f216414w.put("asx", valueOf);
        f216414w.put("asf", valueOf);
        f216414w.put("f4v", valueOf);
        f216414w.put("flv", valueOf);
        f216414w.put("mkv", valueOf);
        f216414w.put("wmv", valueOf);
        f216414w.put("wm", valueOf);
        f216414w.put("3gp", valueOf);
        f216414w.put("mp4", valueOf);
        f216414w.put("rmvb", valueOf);
        f216414w.put("rm", valueOf);
        f216414w.put("ra", valueOf);
        f216414w.put("ram", valueOf);
        Map<String, Integer> map = f216414w;
        Integer valueOf2 = Integer.valueOf(C0966R.raw.app_attach_file_icon_music_in_gird);
        map.put("mp3pro", valueOf2);
        f216414w.put("vqf", valueOf2);
        f216414w.put("cd", valueOf2);
        f216414w.put("md", valueOf2);
        f216414w.put("mod", valueOf2);
        f216414w.put("vorbis", valueOf2);
        f216414w.put("au", valueOf2);
        f216414w.put("amr", valueOf2);
        f216414w.put("silk", valueOf2);
        f216414w.put("wma", valueOf2);
        f216414w.put("mmf", valueOf2);
        f216414w.put("mid", valueOf2);
        f216414w.put("midi", valueOf2);
        f216414w.put(FileReaderHelper.MP3_EXT, valueOf2);
        Map<String, Integer> map2 = f216414w;
        Object obj = FileReaderHelper.MP3_EXT;
        map2.put(FileReaderHelper.AAC_EXT, valueOf2);
        Map<String, Integer> map3 = f216414w;
        Object obj2 = FileReaderHelper.AAC_EXT;
        map3.put("ape", valueOf2);
        f216414w.put("aiff", valueOf2);
        f216414w.put("aif", valueOf2);
        f216414w.put(FileReaderHelper.DOC_EXT, Integer.valueOf(C0966R.raw.app_attach_file_icon_word_in_gird));
        f216414w.put(FileReaderHelper.DOCX_EXT, Integer.valueOf(C0966R.raw.app_attach_file_icon_word_in_gird));
        f216414w.put(FileReaderHelper.PPT_EXT, Integer.valueOf(C0966R.raw.app_attach_file_icon_ppt_in_gird));
        f216414w.put(FileReaderHelper.PPTX_EXT, Integer.valueOf(C0966R.raw.app_attach_file_icon_ppt_in_gird));
        f216414w.put(FileReaderHelper.XLS_EXT, Integer.valueOf(C0966R.raw.app_attach_file_icon_excel_in_gird));
        f216414w.put(FileReaderHelper.XLSX_EXT, Integer.valueOf(C0966R.raw.app_attach_file_icon_excel_in_gird));
        f216414w.put(FileReaderHelper.PDF_EXT, Integer.valueOf(C0966R.raw.app_attach_file_icon_pdf_in_gird));
        f216414w.put("unknown", Integer.valueOf(C0966R.raw.app_attach_file_icon_unknow_in_gird));
        HashMap hashMap2 = new HashMap();
        f216415x = hashMap2;
        hashMap2.put(FileReaderHelper.DOC_EXT, Integer.valueOf(C0966R.color.f3043d7));
        f216415x.put(FileReaderHelper.DOCX_EXT, Integer.valueOf(C0966R.color.f3043d7));
        f216415x.put(FileReaderHelper.PPT_EXT, Integer.valueOf(C0966R.color.f3046d_));
        f216415x.put(FileReaderHelper.PPTX_EXT, Integer.valueOf(C0966R.color.f3046d_));
        f216415x.put(FileReaderHelper.XLS_EXT, Integer.valueOf(C0966R.color.f3049dc));
        f216415x.put(FileReaderHelper.XLSX_EXT, Integer.valueOf(C0966R.color.f3049dc));
        f216415x.put(FileReaderHelper.PDF_EXT, Integer.valueOf(C0966R.color.f3045d9));
        f216415x.put("unknown", Integer.valueOf(C0966R.color.f3047da));
        Map<String, Integer> map4 = f216415x;
        Integer valueOf3 = Integer.valueOf(C0966R.color.f3044d8);
        map4.put("mp3pro", valueOf3);
        f216415x.put("vqf", valueOf3);
        f216415x.put("cd", valueOf3);
        f216415x.put("md", valueOf3);
        f216415x.put("mod", valueOf3);
        f216415x.put("vorbis", valueOf3);
        f216415x.put("au", valueOf3);
        f216415x.put("amr", valueOf3);
        f216415x.put("silk", valueOf3);
        f216415x.put("wma", valueOf3);
        f216415x.put("mmf", valueOf3);
        f216415x.put("mid", valueOf3);
        f216415x.put("midi", valueOf3);
        f216415x.put(obj, valueOf3);
        f216415x.put(obj2, valueOf3);
        f216415x.put("ape", valueOf3);
        f216415x.put("aiff", valueOf3);
        f216415x.put("aif", valueOf3);
    }

    public C73706n(Context context, C72963f4 f4Var, String str) {
        super(context, f4Var);
        this.f216421t = (ImageGalleryGridUI) context;
        this.f216418q = str;
        boolean OE = ((C48053v) C86312j.m106911c(C48053v.class)).mo72614OE(this.f216418q);
        this.f216419r = OE;
        if (OE) {
            this.f216420s = f4Var.mo108759l2();
        }
        this.f216417p = C97625j3.m125812b().mo105883I();
        this.f216416o = LayoutInflater.from(context);
        C20937c.C20939b bVar = new C20937c.C20939b();
        bVar.f59353i = 1;
        bVar.f59366v = true;
        bVar.f59355k = C76577a.m92145A(context) / 3;
        bVar.f59354j = C76577a.m92145A(context) / 3;
        bVar.f59361q = C0966R.color.a88;
        this.f216422u = bVar.mo32666a();
    }

    public boolean areAllItemsEnabled() {
        return false;
    }

    /* renamed from: d */
    public Object mo1330d(Object obj, Cursor cursor) {
        C72963f4 f4Var = (C72963f4) obj;
        C72963f4 f4Var2 = new C72963f4();
        f4Var2.convertFrom(cursor);
        return f4Var2;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: com.tencent.mm.ui.chatting.gallery.n$a} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r26, android.view.View r27, android.view.ViewGroup r28) {
        /*
            r25 = this;
            r0 = r25
            r1 = 8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r3 = 0
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            if (r27 != 0) goto L_0x013d
            android.view.LayoutInflater r5 = r0.f216416o
            r6 = 2131495987(0x7f0c0c33, float:1.8615526E38)
            r7 = r28
            android.view.View r5 = r5.inflate(r6, r7, r3)
            com.tencent.mm.ui.chatting.gallery.n$a r6 = new com.tencent.mm.ui.chatting.gallery.n$a
            r6.<init>()
            r7 = 2131305728(0x7f092500, float:1.8229635E38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r6.f216424a = r7
            r7 = 2131316238(0x7f094e0e, float:1.8250952E38)
            android.view.View r7 = r5.findViewById(r7)
            r6.f216426c = r7
            r7 = 2131302402(0x7f091802, float:1.822289E38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.f216427d = r7
            r7.setVisibility(r1)
            r7 = 2131302395(0x7f0917fb, float:1.8222875E38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            r6.f216425b = r7
            r7 = 2131316235(0x7f094e0b, float:1.8250946E38)
            android.view.View r7 = r5.findViewById(r7)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r6.f216428e = r7
            android.view.View r7 = r6.f216426c
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r8 = k20.C60958c.f173611a
            r15.mo10233c(r2)
            java.lang.Object[] r9 = r15.mo10232b()
            java.lang.String r10 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter"
            java.lang.String r11 = "getView"
            java.lang.String r12 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r13 = "android/view/View_EXEC_"
            java.lang.String r14 = "setVisibility"
            java.lang.String r16 = "(I)V"
            r8 = r7
            r1 = r15
            r15 = r16
            j20.C117292a.m165358d(r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.Object r1 = r1.mo10231a(r3)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r7.setVisibility(r1)
            java.lang.String r9 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter"
            java.lang.String r10 = "getView"
            java.lang.String r11 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            j20.C117292a.m165359e(r8, r9, r10, r11, r12, r13, r14)
            r1 = 2131313576(0x7f0943a8, float:1.8245553E38)
            android.view.View r1 = r5.findViewById(r1)
            r6.f216430g = r1
            k20.a r15 = new k20.a
            r15.<init>()
            r15.mo10233c(r2)
            java.lang.Object[] r8 = r15.mo10232b()
            java.lang.String r9 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter"
            java.lang.String r10 = "getView"
            java.lang.String r11 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r1
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r7 = r15.mo10231a(r3)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r1.setVisibility(r7)
            java.lang.String r8 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter"
            java.lang.String r9 = "getView"
            java.lang.String r10 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r7 = r1
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            r1 = 2131302410(0x7f09180a, float:1.8222905E38)
            android.view.View r1 = r5.findViewById(r1)
            r6.f216431h = r1
            k20.a r15 = new k20.a
            r15.<init>()
            r15.mo10233c(r2)
            java.lang.Object[] r8 = r15.mo10232b()
            java.lang.String r9 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter"
            java.lang.String r10 = "getView"
            java.lang.String r11 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r1
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r7 = r15.mo10231a(r3)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r1.setVisibility(r7)
            java.lang.String r8 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter"
            java.lang.String r9 = "getView"
            java.lang.String r10 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r7 = r1
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            r1 = 2131305732(0x7f092504, float:1.8229643E38)
            android.view.View r1 = r5.findViewById(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r6.f216429f = r1
            r1 = 2131309062(0x7f093206, float:1.8236397E38)
            android.view.View r1 = r5.findViewById(r1)
            android.widget.CheckBox r1 = (android.widget.CheckBox) r1
            r6.f216432i = r1
            r1 = 2131309063(0x7f093207, float:1.82364E38)
            android.view.View r1 = r5.findViewById(r1)
            r6.f216433j = r1
            r5.setTag(r6)
            goto L_0x0146
        L_0x013d:
            java.lang.Object r1 = r27.getTag()
            r6 = r1
            com.tencent.mm.ui.chatting.gallery.n$a r6 = (com.tencent.p014mm.p136ui.chatting.gallery.C73706n.C73707a) r6
            r5 = r27
        L_0x0146:
            android.view.View r1 = r6.f216430g
            k20.a r15 = new k20.a
            r15.<init>()
            java.lang.ThreadLocal<k20.a> r7 = k20.C60958c.f173611a
            r15.mo10233c(r2)
            java.lang.Object[] r8 = r15.mo10232b()
            java.lang.String r9 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter"
            java.lang.String r10 = "getView"
            java.lang.String r11 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r1
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r7 = r15.mo10231a(r3)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r1.setVisibility(r7)
            java.lang.String r8 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter"
            java.lang.String r9 = "getView"
            java.lang.String r10 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r7 = r1
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            android.view.View r1 = r6.f216426c
            k20.a r7 = new k20.a
            r7.<init>()
            r7.mo10233c(r2)
            java.lang.Object[] r18 = r7.mo10232b()
            java.lang.String r19 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter"
            java.lang.String r20 = "getView"
            java.lang.String r21 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r1
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r7 = r7.mo10231a(r3)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r1.setVisibility(r7)
            java.lang.String r18 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter"
            java.lang.String r19 = "getView"
            java.lang.String r20 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r21 = "android/view/View_EXEC_"
            java.lang.String r22 = "setVisibility"
            java.lang.String r23 = "(I)V"
            j20.C117292a.m165359e(r17, r18, r19, r20, r21, r22, r23)
            android.view.View r1 = r6.f216431h
            k20.a r15 = new k20.a
            r15.<init>()
            r15.mo10233c(r2)
            java.lang.Object[] r8 = r15.mo10232b()
            java.lang.String r9 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter"
            java.lang.String r10 = "getView"
            java.lang.String r11 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r1
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r7 = r15.mo10231a(r3)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r1.setVisibility(r7)
            java.lang.String r8 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter"
            java.lang.String r9 = "getView"
            java.lang.String r10 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            r7 = r1
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            android.widget.TextView r1 = r6.f216427d
            r7 = 8
            r1.setVisibility(r7)
            java.lang.Object r1 = r25.getItem(r26)
            com.tencent.mm.storage.f4 r1 = (com.tencent.p014mm.storage.C72963f4) r1
            if (r1 != 0) goto L_0x0209
            return r5
        L_0x0209:
            boolean r7 = r0.f216417p
            if (r7 == 0) goto L_0x0456
            com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI r7 = r0.f216421t
            boolean r7 = r7 instanceof com.tencent.p014mm.p136ui.chatting.gallery.ImageGalleryGridUI
            if (r7 == 0) goto L_0x044d
            java.lang.String r7 = r1.getContent()
            r8 = 0
            if (r7 == 0) goto L_0x0223
            java.lang.String r9 = r1.mo108775z2()
            com.tencent.mm.message.l$b r7 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r7, r9)
            goto L_0x0224
        L_0x0223:
            r7 = r8
        L_0x0224:
            com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI r9 = r0.f216421t
            int r9 = r9.f216372g
            r10 = 3
            r11 = r26
            if (r9 != r11) goto L_0x028a
            android.widget.ImageView r9 = r6.f216429f
            r9.setVisibility(r3)
            boolean r9 = com.tencent.p014mm.p136ui.chatting.gallery.C97056h.m124951E(r1)
            if (r9 == 0) goto L_0x025c
            if (r7 == 0) goto L_0x025c
            int r9 = r7.f195582i
            if (r9 == r10) goto L_0x025c
            android.widget.ImageView r9 = r6.f216425b
            com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI r10 = r0.f216421t
            android.content.res.Resources r10 = r10.getResources()
            int r11 = r0.mo102775t(r7)
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r11)
            r9.setImageDrawable(r10)
            android.widget.ImageView r9 = r6.f216424a
            int r10 = r0.mo102774s(r7)
            r9.setImageResource(r10)
            goto L_0x02e8
        L_0x025c:
            if (r7 == 0) goto L_0x0275
            int r9 = r7.f195582i
            if (r9 != r10) goto L_0x0275
            android.widget.ImageView r9 = r6.f216425b
            com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI r10 = r0.f216421t
            android.content.res.Resources r10 = r10.getResources()
            int r11 = r0.mo102775t(r7)
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r11)
            r9.setImageDrawable(r10)
        L_0x0275:
            gc0.a r9 = gc0.C20828a.m22825b()
            java.lang.String r10 = r0.mo102776u(r1)
            android.widget.ImageView r11 = r6.f216424a
            hc0.c r12 = r0.f216422u
            com.tencent.mm.ui.chatting.gallery.m r13 = new com.tencent.mm.ui.chatting.gallery.m
            r13.<init>(r0)
            r9.mo32521j(r10, r11, r12, r13)
            goto L_0x02e8
        L_0x028a:
            android.widget.ImageView r9 = r6.f216429f
            r9.setVisibility(r3)
            android.widget.ImageView r9 = r6.f216429f
            r11 = 2131100959(0x7f06051f, float:1.7814314E38)
            r9.setBackgroundResource(r11)
            boolean r9 = com.tencent.p014mm.p136ui.chatting.gallery.C97056h.m124951E(r1)
            if (r9 == 0) goto L_0x02c0
            if (r7 == 0) goto L_0x02c0
            int r9 = r7.f195582i
            if (r9 == r10) goto L_0x02c0
            android.widget.ImageView r9 = r6.f216425b
            com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI r10 = r0.f216421t
            android.content.res.Resources r10 = r10.getResources()
            int r11 = r0.mo102775t(r7)
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r11)
            r9.setImageDrawable(r10)
            android.widget.ImageView r9 = r6.f216424a
            int r10 = r0.mo102774s(r7)
            r9.setImageResource(r10)
            goto L_0x02e8
        L_0x02c0:
            if (r7 == 0) goto L_0x02d9
            int r9 = r7.f195582i
            if (r9 != r10) goto L_0x02d9
            android.widget.ImageView r9 = r6.f216425b
            com.tencent.mm.ui.chatting.gallery.ImageGalleryGridUI r10 = r0.f216421t
            android.content.res.Resources r10 = r10.getResources()
            int r11 = r0.mo102775t(r7)
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r11)
            r9.setImageDrawable(r10)
        L_0x02d9:
            gc0.a r9 = gc0.C20828a.m22825b()
            java.lang.String r10 = r0.mo102776u(r1)
            android.widget.ImageView r11 = r6.f216424a
            hc0.c r12 = r0.f216422u
            r9.mo32519h(r10, r11, r12)
        L_0x02e8:
            android.widget.ImageView r9 = r6.f216424a
            r9.setPadding(r3, r3, r3, r3)
            android.widget.ImageView r9 = r6.f216424a
            int r9 = r9.getMeasuredWidth()
            android.widget.ImageView r10 = r6.f216424a
            int r10 = r10.getMeasuredHeight()
            if (r9 <= 0) goto L_0x030d
            if (r10 > 0) goto L_0x02fe
            goto L_0x030d
        L_0x02fe:
            android.widget.ImageView r11 = r6.f216429f
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            r11.width = r9
            r11.height = r10
            android.widget.ImageView r9 = r6.f216429f
            r9.setLayoutParams(r11)
        L_0x030d:
            boolean r9 = com.tencent.p014mm.p136ui.chatting.gallery.C97056h.m124955K(r1)
            if (r9 == 0) goto L_0x0363
            android.view.View r10 = r6.f216426c
            k20.a r7 = new k20.a
            r7.<init>()
            r7.mo10233c(r4)
            java.lang.Object[] r18 = r7.mo10232b()
            java.lang.String r19 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter"
            java.lang.String r20 = "initVideoTips"
            java.lang.String r21 = "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter$ViewHolder;Lcom/tencent/mm/storage/MsgInfo;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r10
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r7 = r7.mo10231a(r3)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r10.setVisibility(r7)
            java.lang.String r11 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter"
            java.lang.String r12 = "initVideoTips"
            java.lang.String r13 = "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter$ViewHolder;Lcom/tencent/mm/storage/MsgInfo;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            hd0.n0 r7 = com.tencent.p014mm.p136ui.chatting.gallery.C97052g.m124927o(r1)
            if (r7 != 0) goto L_0x0356
            goto L_0x045e
        L_0x0356:
            android.widget.TextView r8 = r6.f216428e
            int r7 = r7.f288566m
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.formatSecToMin(r7)
            r8.setText(r7)
            goto L_0x045e
        L_0x0363:
            boolean r9 = com.tencent.p014mm.p136ui.chatting.gallery.C97056h.m124954I(r1)
            if (r9 == 0) goto L_0x03a6
            android.view.View r10 = r6.f216430g
            k20.a r7 = new k20.a
            r7.<init>()
            r7.mo10233c(r4)
            java.lang.Object[] r18 = r7.mo10232b()
            java.lang.String r19 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter"
            java.lang.String r20 = "getView"
            java.lang.String r21 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r10
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r7 = r7.mo10231a(r3)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r10.setVisibility(r7)
            java.lang.String r11 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter"
            java.lang.String r12 = "getView"
            java.lang.String r13 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x045e
        L_0x03a6:
            boolean r9 = com.tencent.p014mm.p136ui.chatting.gallery.C97056h.m124951E(r1)
            if (r9 == 0) goto L_0x045e
            java.lang.Class<ny.h> r9 = p629ny.C76979h.class
            android.view.View r10 = r6.f216431h
            k20.a r11 = new k20.a
            r11.<init>()
            r11.mo10233c(r4)
            java.lang.Object[] r18 = r11.mo10232b()
            java.lang.String r19 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter"
            java.lang.String r20 = "initFileName"
            java.lang.String r21 = "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter$ViewHolder;Lcom/tencent/mm/message/AppMessage$Content;)V"
            java.lang.String r22 = "android/view/View_EXEC_"
            java.lang.String r23 = "setVisibility"
            java.lang.String r24 = "(I)V"
            r17 = r10
            j20.C117292a.m165358d(r17, r18, r19, r20, r21, r22, r23, r24)
            java.lang.Object r11 = r11.mo10231a(r3)
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r10.setVisibility(r11)
            java.lang.String r11 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter"
            java.lang.String r12 = "initFileName"
            java.lang.String r13 = "(Lcom/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter$ViewHolder;Lcom/tencent/mm/message/AppMessage$Content;)V"
            java.lang.String r14 = "android/view/View_EXEC_"
            java.lang.String r15 = "setVisibility"
            java.lang.String r16 = "(I)V"
            j20.C117292a.m165359e(r10, r11, r12, r13, r14, r15, r16)
            android.widget.TextView r10 = r6.f216427d
            r10.setVisibility(r3)
            if (r7 == 0) goto L_0x045e
            r10 = 1
            java.lang.Object[] r10 = new java.lang.Object[r10]
            java.lang.String r11 = r7.f195570f
            java.lang.String r11 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r11)
            r10[r3] = r11
            java.lang.String r11 = "MicroMsg.ImageGalleryGridAdapter"
            java.lang.String r12 = "initFileName--->content:%s"
            com.tencent.p014mm.sdk.platformtools.Log.m105925i(r11, r12, r10)
            int r10 = r7.f195582i
            r11 = 24
            if (r10 == r11) goto L_0x0424
            android.widget.TextView r10 = r6.f216427d
            di3.d r9 = di3.C86312j.m106911c(r9)
            ny.h r9 = (p629ny.C76979h) r9
            java.lang.String r7 = r7.f195570f
            java.lang.String r7 = com.tencent.p014mm.sdk.platformtools.Util.nullAsNil((java.lang.String) r7)
            android.widget.TextView r11 = r6.f216427d
            float r11 = r11.getTextSize()
            android.text.SpannableString r7 = r9.yp0(r8, r7, r11)
            r10.setText(r7)
            goto L_0x045e
        L_0x0424:
            android.widget.TextView r7 = r6.f216427d
            di3.d r8 = di3.C86312j.m106911c(r9)
            ny.h r8 = (p629ny.C76979h) r8
            android.widget.TextView r9 = r6.f216427d
            android.content.Context r9 = r9.getContext()
            android.widget.TextView r10 = r6.f216427d
            android.content.Context r10 = r10.getContext()
            r11 = 2131825821(0x7f11149d, float:1.9284509E38)
            java.lang.String r10 = r10.getString(r11)
            android.widget.TextView r11 = r6.f216427d
            float r11 = r11.getTextSize()
            android.text.SpannableString r8 = r8.yp0(r9, r10, r11)
            r7.setText(r8)
            goto L_0x045e
        L_0x044d:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "the context should be ImageGalleryGridUI"
            r1.<init>(r2)
            throw r1
        L_0x0456:
            android.widget.ImageView r7 = r6.f216424a
            r8 = 2131234286(0x7f080dee, float:1.8084733E38)
            r7.setImageResource(r8)
        L_0x045e:
            android.widget.CheckBox r7 = r6.f216432i
            com.tencent.mm.ui.chatting.gallery.v r8 = com.tencent.p014mm.p136ui.chatting.gallery.C73708v.C73710b.f216437a
            boolean r9 = r8.mo102780d(r1)
            r7.setChecked(r9)
            android.widget.CheckBox r7 = r6.f216432i
            r7.setTag(r1)
            android.view.View r1 = r6.f216433j
            r1.setTag(r6)
            android.view.View r1 = r6.f216433j
            r1.setOnClickListener(r0)
            boolean r1 = r8.f216435b
            if (r1 == 0) goto L_0x04c1
            android.widget.CheckBox r1 = r6.f216432i
            r1.setVisibility(r3)
            android.view.View r1 = r6.f216433j
            k20.a r2 = new k20.a
            r2.<init>()
            r2.mo10233c(r4)
            java.lang.Object[] r8 = r2.mo10232b()
            java.lang.String r9 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter"
            java.lang.String r10 = "getView"
            java.lang.String r11 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r1
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r2 = r2.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r8 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter"
            java.lang.String r9 = "getView"
            java.lang.String r10 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            android.widget.ImageView r1 = r6.f216429f
            r1.setVisibility(r3)
            goto L_0x0509
        L_0x04c1:
            android.widget.CheckBox r1 = r6.f216432i
            r4 = 8
            r1.setVisibility(r4)
            android.view.View r1 = r6.f216433j
            k20.a r4 = new k20.a
            r4.<init>()
            r4.mo10233c(r2)
            java.lang.Object[] r8 = r4.mo10232b()
            java.lang.String r9 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter"
            java.lang.String r10 = "getView"
            java.lang.String r11 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r12 = "android/view/View_EXEC_"
            java.lang.String r13 = "setVisibility"
            java.lang.String r14 = "(I)V"
            r7 = r1
            j20.C117292a.m165358d(r7, r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object r2 = r4.mo10231a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r1.setVisibility(r2)
            java.lang.String r8 = "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter"
            java.lang.String r9 = "getView"
            java.lang.String r10 = "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;"
            java.lang.String r11 = "android/view/View_EXEC_"
            java.lang.String r12 = "setVisibility"
            java.lang.String r13 = "(I)V"
            j20.C117292a.m165359e(r7, r8, r9, r10, r11, r12, r13)
            android.widget.ImageView r1 = r6.f216429f
            r2 = 8
            r1.setVisibility(r2)
        L_0x0509:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.p136ui.chatting.gallery.C73706n.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* renamed from: l */
    public void mo1332l() {
        if (this.f216419r) {
            mo7998r(C97625j3.m125812b().mo105897l().mo100926j(this.f216418q, this.f216420s));
            return;
        }
        mo7998r(((C72972g4) C97625j3.m125812b().mo105911z()).mo101063DN(this.f216418q));
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    /* renamed from: o */
    public void mo1333o() {
        if (this.f216419r) {
            mo7998r(C97625j3.m125812b().mo105897l().mo100926j(this.f216418q, this.f216420s));
            return;
        }
        mo7998r(((C72972g4) C97625j3.m125812b().mo105911z()).mo101063DN(this.f216418q));
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        C73707a aVar = (C73707a) view.getTag();
        CheckBox checkBox = aVar.f216432i;
        if (checkBox == null) {
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C72963f4 f4Var = (C72963f4) checkBox.getTag();
        if (f4Var == null) {
            C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        C73708v vVar = C73708v.C73710b.f216437a;
        if (vVar.mo102780d(f4Var)) {
            vVar.mo102781e(f4Var);
        } else {
            vVar.mo102777a(f4Var);
        }
        if (vVar.mo102780d(f4Var)) {
            aVar.f216432i.setChecked(true);
            aVar.f216429f.setBackgroundResource(C0966R.color.f3552xi);
        } else {
            aVar.f216432i.setChecked(false);
            aVar.f216429f.setBackgroundResource(C0966R.color.f3599z6);
        }
        if (!this.f216423v && vVar.f216434a.size() > 1) {
            C115669n.INSTANCE.idkeyStat(219, 20, 1, true);
            this.f216423v = true;
        }
        C117292a.m165361g(this, "com/tencent/mm/ui/chatting/gallery/ImageGalleryGridAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: s */
    public final int mo102774s(C68070l.C68072b bVar) {
        if (bVar == null) {
            Log.m105924i("MicroMsg.ImageGalleryGridAdapter", "getIconId:2131100038");
            return C0966R.color.f3047da;
        }
        int i = bVar.f195582i;
        if (i == 5 || i == 7 || i == 15) {
            return C0966R.color.f3048db;
        }
        if (i == 6) {
            if (((HashMap) f216415x).containsKey(Util.nullAsNil(bVar.f195602n))) {
                Log.m105924i("MicroMsg.ImageGalleryGridAdapter", "getIconId:" + ((HashMap) f216415x).get(Util.nullAsNil(bVar.f195602n)));
                return ((Integer) ((HashMap) f216415x).get(Util.nullAsNil(bVar.f195602n))).intValue();
            }
        }
        return C0966R.color.f3047da;
    }

    /* renamed from: t */
    public final int mo102775t(C68070l.C68072b bVar) {
        if (bVar == null) {
            Log.m105924i("MicroMsg.ImageGalleryGridAdapter", "getIconId:2131755112");
            return C0966R.raw.app_attach_file_icon_unknow_in_gird;
        }
        int i = bVar.f195582i;
        if (i == 5 || i == 7 || i == 15) {
            return C0966R.raw.app_attach_file_icon_url_in_gird;
        }
        if (i == 3) {
            return C0966R.raw.app_attach_file_icon_music_in_gird;
        }
        if (i == 6) {
            if (((HashMap) f216414w).containsKey(Util.nullAsNil(bVar.f195602n))) {
                Log.m105924i("MicroMsg.ImageGalleryGridAdapter", "getIconId:" + ((HashMap) f216414w).get(Util.nullAsNil(bVar.f195602n)));
                return ((Integer) ((HashMap) f216414w).get(Util.nullAsNil(bVar.f195602n))).intValue();
            }
        }
        return C0966R.raw.app_attach_file_icon_unknow_in_gird;
    }

    /* renamed from: u */
    public final String mo102776u(C72963f4 f4Var) {
        String str;
        String str2;
        C72683d qq;
        if (f4Var.mo100994f4() || f4Var.mo100989b4()) {
            str = ((C98410o0) ((C101488s) C86312j.m106911c(C101488s.class)).Kj0()).mo137729r(f4Var.mo108765s2());
        } else {
            str = ((C92839m) ((C98201k) C86312j.m106911c(C98201k.class)).mo137277xi()).c40(f4Var.mo108765s2(), false, false);
            if (!Util.isNullOrNil(str) && !str.endsWith("hd")) {
                if (C86013q1.m106450k(str + "hd")) {
                    str = str + "hd";
                }
            }
        }
        Log.m105925i("MicroMsg.ImageGalleryGridAdapter", "MsgInfoForMonetUri imgPath : %s", str);
        if (!f4Var.mo100961A3()) {
            return str;
        }
        String str3 = null;
        C68070l.C68072b u = C68070l.C68072b.m80422u(f4Var.getContent(), (String) null);
        if (!(u == null || (str2 = u.f195606o) == null || str2.length() <= 0 || (qq = C72709y1.vx0().mo100154qq(u.f195606o)) == null)) {
            str3 = qq.field_fileFullPath;
        }
        return str3 != null ? str3 : str;
    }
}
