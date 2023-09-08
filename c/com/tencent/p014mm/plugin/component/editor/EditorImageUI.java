package com.tencent.p014mm.plugin.component.editor;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import aw0.C103928o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.GalleryTranslateReportStruct;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.tools.MMGestureGallery;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.component.editor.C93062a;
import com.tencent.p014mm.plugin.component.editor.C93065b;
import com.tencent.p014mm.plugin.fav.p047ui.C93687q;
import com.tencent.p014mm.plugin.fav.p047ui.PhotoTransControl;
import com.tencent.p014mm.plugin.scanner.C30391y;
import com.tencent.p014mm.plugin.scanner.ScanCodeSheetItemLogic;
import com.tencent.p014mm.plugin.scanner.word.C94533d;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96874n1;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.ForceGpuUtil;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import di3.C86312j;
import eb0.C45628s0;
import eb0.C75592q0;
import eb0.C86493v0;
import f40.C86709a0;
import j20.C117292a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76874e0;
import nj3.C76879j;
import nj3.C88989a;
import p200lx.C46896e0;
import p200lx.C46900z;
import p206nj.C11171e;
import p21.C100616a;
import p21.C100619d;
import pc0.C100760a0;
import qo3.C77407n;
import te3.C101834rc0;
import u21.C101941c;
import vo3.C90852c;
import xl2.C102690c;
import zt3.C119157j;

@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.component.editor.EditorImageUI */
public class EditorImageUI extends MMActivity implements C94533d.C94534a<String, C102690c>, PhotoTransControl.C93478b, C93687q.C93688a {

    /* renamed from: x */
    public static final /* synthetic */ int f267991x = 0;

    /* renamed from: d */
    public List<C100616a> f267992d;

    /* renamed from: e */
    public C93687q f267993e;

    /* renamed from: f */
    public MMGestureGallery f267994f;

    /* renamed from: g */
    public C93042m f267995g;

    /* renamed from: h */
    public int f267996h = 0;

    /* renamed from: i */
    public long f267997i = -1;

    /* renamed from: j */
    public String f267998j = null;

    /* renamed from: n */
    public C77407n f267999n;

    /* renamed from: o */
    public Map<String, C93043n> f268000o = new HashMap();

    /* renamed from: p */
    public boolean f268001p;

    /* renamed from: q */
    public boolean f268002q = C30391y.f81992d;

    /* renamed from: r */
    public PhotoTransControl f268003r;

    /* renamed from: s */
    public C46900z f268004s;

    /* renamed from: t */
    public C93065b.C93067b f268005t = new C93039j();

    /* renamed from: u */
    public C11184p0 f268006u = new C93029a();

    /* renamed from: v */
    public Runnable f268007v = new C93033d();

    /* renamed from: w */
    public IListener f268008w = new IListener<RecogQBarOfImageFileResultEvent>(C40008f.f107254d) {
        {
            this.__eventId = 812146647;
        }

        public boolean callback(IEvent iEvent) {
            RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = (RecogQBarOfImageFileResultEvent) iEvent;
            String str = recogQBarOfImageFileResultEvent.f265015d.f265016a;
            C93043n nVar = new C93043n();
            nVar.f268030a = recogQBarOfImageFileResultEvent;
            ((HashMap) EditorImageUI.this.f268000o).put(str, nVar);
            C77407n nVar2 = EditorImageUI.this.f267999n;
            if (nVar2 == null || !nVar2.mo107563h()) {
                return true;
            }
            EditorImageUI.this.mo127460I7(false);
            return true;
        }
    };

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorImageUI$a */
    public class C93029a implements C11184p0 {
        public C93029a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a4, code lost:
            r13 = (p21.C100619d) r11.f268010d.f267995g.mo127471a(r13);
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onMMMenuItemSelected(android.view.MenuItem r12, int r13) {
            /*
                r11 = this;
                int r12 = r12.getItemId()
                r13 = 0
                r0 = 1
                if (r12 == 0) goto L_0x00ea
                if (r12 == r0) goto L_0x00e4
                r1 = 2
                if (r12 == r1) goto L_0x00c9
                r2 = 4
                if (r12 == r2) goto L_0x007c
                r2 = 5
                if (r12 == r2) goto L_0x0015
                goto L_0x011e
            L_0x0015:
                com.tencent.mm.plugin.component.editor.EditorImageUI r12 = com.tencent.p014mm.plugin.component.editor.EditorImageUI.this
                int r2 = com.tencent.p014mm.plugin.component.editor.EditorImageUI.f267991x
                java.lang.String r2 = r12.mo127459H7()
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r13] = r2
                long r3 = r12.f267997i
                java.lang.Long r3 = java.lang.Long.valueOf(r3)
                r1[r0] = r3
                java.lang.String r0 = "MicroMsg.Editor.EditorImageUI"
                java.lang.String r3 = "edit image path:%s msgId:%s"
                com.tencent.p014mm.sdk.platformtools.Log.m105925i(r0, r3, r1)
                java.lang.String r0 = ""
                com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider r8 = com.tencent.p014mm.plugin.recordvideo.jumper.RecordConfigProvider.m119432b(r2, r0)
                r8.f272905F = r13
                com.tencent.mm.component.api.jumper.UICustomParam r13 = new com.tencent.mm.component.api.jumper.UICustomParam
                r13.<init>()
                java.util.Map<java.lang.String, java.lang.Boolean> r0 = r13.f266575h
                java.lang.Boolean r1 = java.lang.Boolean.TRUE
                java.util.HashMap r0 = (java.util.HashMap) r0
                java.lang.String r2 = "plugin_filter"
                r0.put(r2, r1)
                java.util.Map<java.lang.String, java.lang.Boolean> r0 = r13.f266575h
                java.util.HashMap r0 = (java.util.HashMap) r0
                java.lang.String r2 = "plugin_poi"
                r0.put(r2, r1)
                java.util.Map<java.lang.String, java.lang.Boolean> r0 = r13.f266575h
                java.util.HashMap r0 = (java.util.HashMap) r0
                java.lang.String r2 = "plugin_tip"
                r0.put(r2, r1)
                java.util.Map<java.lang.String, java.lang.Boolean> r0 = r13.f266575h
                java.util.HashMap r0 = (java.util.HashMap) r0
                java.lang.String r2 = "plugin_menu"
                r0.put(r2, r1)
                r8.f272927o = r13
                hh2.a r3 = hh2.C8532a.f27585a
                androidx.appcompat.app.AppCompatActivity r4 = r12.getContext()
                r5 = 4369(0x1111, float:6.122E-42)
                r6 = 2130772171(0x7f0100cb, float:1.7147453E38)
                r7 = -1
                r9 = 1
                r10 = 2
                r3.mo9446e(r4, r5, r6, r7, r8, r9, r10)
                goto L_0x011e
            L_0x007c:
                com.tencent.mm.sdk.platformtools.WeChatBrands$Business$Entries r12 = com.tencent.p014mm.sdk.platformtools.WeChatBrands.Business.Entries.ContextTranslate
                com.tencent.mm.plugin.component.editor.EditorImageUI r13 = com.tencent.p014mm.plugin.component.editor.EditorImageUI.this
                androidx.appcompat.app.AppCompatActivity r13 = r13.getContext()
                boolean r12 = r12.checkAvailable(r13)
                if (r12 != 0) goto L_0x008c
                goto L_0x011e
            L_0x008c:
                com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct r12 = new com.tencent.mm.autogen.mmdata.rpt.GalleryTranslateReportStruct
                r12.<init>()
                r0 = 3
                r12.f265619e = r0
                r0 = 5
                r12.f265620f = r0
                com.tencent.mm.plugin.component.editor.EditorImageUI r13 = com.tencent.p014mm.plugin.component.editor.EditorImageUI.this
                com.tencent.mm.ui.tools.MMGestureGallery r13 = r13.f267994f
                int r13 = r13.getSelectedItemPosition()
                r0 = -1
                if (r0 == r13) goto L_0x00be
                com.tencent.mm.plugin.component.editor.EditorImageUI r0 = com.tencent.p014mm.plugin.component.editor.EditorImageUI.this
                com.tencent.mm.plugin.component.editor.EditorImageUI$m r0 = r0.f267995g
                p21.a r13 = r0.getItem(r13)
                p21.d r13 = (p21.C100619d) r13
                te3.rc0 r0 = r13.f294808m
                if (r0 == 0) goto L_0x00be
                java.lang.String r0 = r0.f299325s
                r12.mo126621t(r0)
                te3.rc0 r13 = r13.f294808m
                java.lang.String r13 = r13.f299329u
                r12.mo126620s(r13)
            L_0x00be:
                r12.mo86054n()
                com.tencent.mm.plugin.component.editor.EditorImageUI r12 = com.tencent.p014mm.plugin.component.editor.EditorImageUI.this
                com.tencent.mm.plugin.fav.ui.PhotoTransControl r12 = r12.f268003r
                r12.mo128354a()
                goto L_0x011e
            L_0x00c9:
                com.tencent.mm.plugin.component.editor.EditorImageUI r12 = com.tencent.p014mm.plugin.component.editor.EditorImageUI.this
                int r13 = com.tencent.p014mm.plugin.component.editor.EditorImageUI.f267991x
                r12.getClass()
                java.lang.Class<cw.g> r13 = p140cw.C7138g.class
                di3.d r13 = di3.C86312j.m106911c(r13)
                cw.g r13 = (p140cw.C7138g) r13
                java.lang.String r0 = r12.mo127459H7()
                androidx.appcompat.app.AppCompatActivity r12 = r12.getContext()
                r13.he0(r0, r12)
                goto L_0x011e
            L_0x00e4:
                com.tencent.mm.plugin.component.editor.EditorImageUI r12 = com.tencent.p014mm.plugin.component.editor.EditorImageUI.this
                r12.getClass()
                goto L_0x011e
            L_0x00ea:
                com.tencent.mm.plugin.component.editor.EditorImageUI r12 = com.tencent.p014mm.plugin.component.editor.EditorImageUI.this
                int r1 = com.tencent.p014mm.plugin.component.editor.EditorImageUI.f267991x
                java.lang.String r1 = r12.mo127459H7()
                r12.f267998j = r1
                android.content.Intent r1 = new android.content.Intent
                r1.<init>()
                r2 = 3
                java.lang.String r3 = "Select_Conv_Type"
                r1.putExtra(r3, r2)
                java.lang.String r2 = "select_is_ret"
                r1.putExtra(r2, r0)
                java.lang.String r2 = "mutil_select_is_ret"
                r1.putExtra(r2, r0)
                java.lang.String r0 = "Retr_Msg_Type"
                r1.putExtra(r0, r13)
                java.lang.String r13 = r12.f267998j
                java.lang.String r0 = "image_path"
                r1.putExtra(r0, r13)
                r13 = 1001(0x3e9, float:1.403E-42)
                java.lang.String r0 = ".ui.transmit.SelectConversationUI"
                ke3.C88144b.m109802t(r12, r0, r1, r13)
            L_0x011e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.component.editor.EditorImageUI.C93029a.onMMMenuItemSelected(android.view.MenuItem, int):void");
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorImageUI$b */
    public class C93030b implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ Dialog f268011d;

        public C93030b(EditorImageUI editorImageUI, Dialog dialog) {
            this.f268011d = dialog;
        }

        public void run() {
            this.f268011d.dismiss();
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorImageUI$c */
    public class C93031c implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ List f268012d;

        /* renamed from: e */
        public final /* synthetic */ String f268013e;

        /* renamed from: f */
        public final /* synthetic */ Runnable f268014f;

        /* renamed from: com.tencent.mm.plugin.component.editor.EditorImageUI$c$a */
        public class C93032a implements Runnable {
            public C93032a() {
            }

            public void run() {
                EditorImageUI editorImageUI = EditorImageUI.this;
                C75026b.m89951a(editorImageUI, editorImageUI.getString(C0966R.string.a2x));
            }
        }

        public C93031c(List list, String str, Runnable runnable) {
            this.f268012d = list;
            this.f268013e = str;
            this.f268014f = runnable;
        }

        public void run() {
            for (String str : this.f268012d) {
                String s = C75592q0.m90789s();
                C100760a0.C100764f b = C100760a0.m131932b(C100760a0.C100763e.IMAGE);
                b.f295195i = 4;
                b.f295188b = s;
                b.f295187a = str;
                b.f295196j = EditorImageUI.this.f267998j;
                b.f295197k = 0;
                b.f295198l = null;
                b.f295200n = 0;
                b.f295204r = "";
                b.f295205s = "";
                b.f295202p = true;
                b.f295201o = C0966R.C0969drawable.by8;
                b.f295194h = 13;
                b.mo140195a().mo123694a();
                if (!Util.isNullOrNil(this.f268013e)) {
                    C100760a0.C100764f a = C100760a0.m131931a(str);
                    a.f295187a = str;
                    a.f295189c = this.f268013e;
                    a.f295190d = C45628s0.m50810y(str);
                    a.f295191e = 0;
                    a.f295194h = 4;
                    a.mo140195a().mo123694a();
                }
            }
            ((C119157j) C119157j.f356862d).mo183895z(new C93032a());
            MMHandlerThread.postToMainThread(this.f268014f);
        }

        public String toString() {
            return super.toString() + "|onActivityResult";
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorImageUI$d */
    public class C93033d implements Runnable {
        public C93033d() {
        }

        public void run() {
            EditorImageUI.this.f267995g.notifyDataSetChanged();
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorImageUI$e */
    public class C93034e implements AdapterView.OnItemSelectedListener {
        public C93034e() {
        }

        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(adapterView);
            arrayList.add(view);
            arrayList.add(Integer.valueOf(i));
            arrayList.add(Long.valueOf(j));
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/EditorImageUI$1", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
            if (C86013q1.m106450k(((C100619d) EditorImageUI.this.f267995g.getItem(i)).f294806s)) {
                EditorImageUI.this.setMMTitle(String.format("%d/%d", new Object[]{Integer.valueOf(i + 1), Integer.valueOf(((ArrayList) EditorImageUI.this.f267992d).size())}));
                EditorImageUI.this.enableOptionMenu(true);
            } else {
                EditorImageUI.this.enableOptionMenu(false);
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/EditorImageUI$1", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
        }

        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorImageUI$f */
    public class C93035f implements MMGestureGallery.C19842g {
        public C93035f() {
        }

        /* renamed from: a */
        public void mo26370a() {
            EditorImageUI editorImageUI = EditorImageUI.this;
            if (editorImageUI.f268003r.f269948d != 1) {
                editorImageUI.f267993e.mo128605a(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorImageUI$g */
    public class C93036g implements MMGestureGallery.C19841d {
        public C93036g() {
        }

        /* renamed from: a */
        public void mo26369a() {
            if (EditorImageUI.this.f268003r.f269948d != 1) {
                C86493v0.C86495c c = C86493v0.m107224d().mo120947c("basescanui@datacenter", true);
                c.mo120962i("key_basescanui_screen_position", Boolean.TRUE);
                c.mo120962i("key_basescanui_screen_x", Float.valueOf((float) EditorImageUI.this.f267994f.getXDown()));
                c.mo120962i("key_basescanui_screen_y", Float.valueOf((float) EditorImageUI.this.f267994f.getYDown()));
                EditorImageUI editorImageUI = EditorImageUI.this;
                int i = editorImageUI.f268003r.f269948d;
                if (i == 0 || i == 2) {
                    editorImageUI.mo127460I7(C30391y.m39058c());
                } else {
                    editorImageUI.mo127460I7(false);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorImageUI$h */
    public class C93037h implements MenuItem.OnMenuItemClickListener {
        public C93037h() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            EditorImageUI.this.f267993e.mo128605a(false);
            return true;
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorImageUI$i */
    public class C93038i implements C46900z.C46901a {
        public C93038i() {
        }

        /* renamed from: a */
        public void mo64788a() {
            C77407n nVar = EditorImageUI.this.f267999n;
            if (nVar != null && nVar.mo107563h()) {
                EditorImageUI.this.mo127460I7(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorImageUI$j */
    public class C93039j implements C93065b.C93067b {
        public C93039j() {
        }

        /* renamed from: a */
        public void mo127454a(C93062a aVar, C93062a.C93064b bVar) {
            MMHandlerThread.postToMainThread(EditorImageUI.this.f268007v);
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorImageUI$k */
    public class C93040k implements C11182m0 {

        /* renamed from: d */
        public final /* synthetic */ List f268024d;

        /* renamed from: e */
        public final /* synthetic */ C93043n f268025e;

        /* renamed from: f */
        public final /* synthetic */ List f268026f;

        public C93040k(List list, C93043n nVar, List list2) {
            this.f268024d = list;
            this.f268025e = nVar;
            this.f268026f = list2;
        }

        public void onCreateMMMenu(C76874e0 e0Var) {
            EditorImageUI.this.f267999n.mo107567l((View) null);
            e0Var.clear();
            e0Var.setHeaderTitle((CharSequence) "");
            for (int i = 0; i < this.f268024d.size(); i++) {
                if (((Integer) this.f268024d.get(i)).intValue() == 3) {
                    EditorImageUI editorImageUI = EditorImageUI.this;
                    C77407n nVar = editorImageUI.f267999n;
                    C93043n nVar2 = this.f268025e;
                    editorImageUI.getClass();
                    RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = nVar2.f268030a;
                    C96874n1 n1Var = C96874n1.f283849a;
                    int b = n1Var.mo135193b(recogQBarOfImageFileResultEvent);
                    int c = n1Var.mo135194c(recogQBarOfImageFileResultEvent);
                    String d = n1Var.mo135195d(recogQBarOfImageFileResultEvent);
                    C93072e eVar = new C93072e(editorImageUI, recogQBarOfImageFileResultEvent, d, b, c);
                    if (!nVar2.f268031b) {
                        nVar2.f268031b = true;
                        ((ScanCodeSheetItemLogic) editorImageUI.f268004s).mo67077h(b, d);
                    }
                    nVar.mo107567l(((ScanCodeSheetItemLogic) editorImageUI.f268004s).mo67071b(eVar, b, d, 5));
                } else {
                    e0Var.mo107142f(((Integer) this.f268024d.get(i)).intValue(), (CharSequence) this.f268026f.get(i));
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorImageUI$l */
    public class C93041l implements C77407n.C47880p {
        public C93041l() {
        }

        public void onDismiss() {
            EditorImageUI editorImageUI = EditorImageUI.this;
            editorImageUI.f267999n = null;
            ((ScanCodeSheetItemLogic) editorImageUI.f268004s).mo67083n();
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorImageUI$m */
    public static class C93042m extends BaseAdapter {

        /* renamed from: d */
        public List<C100616a> f268029d = new LinkedList();

        public C93042m(C93034e eVar) {
        }

        /* renamed from: a */
        public C100616a getItem(int i) {
            return this.f268029d.get(i);
        }

        public int getCount() {
            return this.f268029d.size();
        }

        public long getItemId(int i) {
            return (long) i;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            MultiTouchImageView multiTouchImageView;
            Bitmap f = C93088r.m117436f(((C100619d) getItem(i)).f294806s, (String) null);
            if (f == null) {
                Log.m105928w("MicroMsg.Editor.EditorImageUI", "get image fail");
                if (view == null || (view instanceof MultiTouchImageView)) {
                    view = View.inflate(viewGroup.getContext(), C0966R.C0971layout.cl4, (ViewGroup) null);
                }
                ImageView imageView = (ImageView) view.findViewById(C0966R.C0970id.f357835c02);
                imageView.setVisibility(0);
                imageView.setImageResource(C0966R.raw.download_image_icon);
                view.setLayoutParams(new Gallery.LayoutParams(-1, -1));
                return view;
            }
            Context context = viewGroup.getContext();
            if (view == null || !(view instanceof MultiTouchImageView)) {
                multiTouchImageView = new MultiTouchImageView(context, f.getWidth(), f.getHeight());
            } else {
                multiTouchImageView = (MultiTouchImageView) view;
                int width = f.getWidth();
                int height = f.getHeight();
                multiTouchImageView.f348280o = width;
                multiTouchImageView.f348281p = height;
            }
            ForceGpuUtil.decideLayerType(multiTouchImageView, f.getWidth(), f.getHeight());
            multiTouchImageView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
            multiTouchImageView.setImageBitmap(f);
            multiTouchImageView.setMaxZoomDoubleTab(true);
            return multiTouchImageView;
        }
    }

    /* renamed from: com.tencent.mm.plugin.component.editor.EditorImageUI$n */
    public static final class C93043n {

        /* renamed from: a */
        public RecogQBarOfImageFileResultEvent f268030a;

        /* renamed from: b */
        public boolean f268031b;
    }

    /* renamed from: A4 */
    public void mo86623A4() {
    }

    /* renamed from: H7 */
    public final String mo127459H7() {
        int selectedItemPosition = this.f267994f.getSelectedItemPosition();
        if (-1 == selectedItemPosition) {
            Log.m105928w("MicroMsg.Editor.EditorImageUI", "error position");
            return null;
        }
        String str = ((C100619d) this.f267995g.getItem(selectedItemPosition)).f294806s;
        Log.m105919d("MicroMsg.Editor.EditorImageUI", "cur pos %d path %s", Integer.valueOf(selectedItemPosition), str);
        return str;
    }

    /* renamed from: I7 */
    public final void mo127460I7(boolean z) {
        RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add(0);
        arrayList2.add(getString(C0966R.string.i4e));
        arrayList.add(2);
        arrayList2.add(getString(C0966R.string.iam));
        String H7 = mo127459H7();
        if ((this.f268002q || this.f268001p) && !Util.isNullOrNil(H7)) {
            arrayList.add(4);
            arrayList2.add(getString(C0966R.string.b8h));
        }
        arrayList.add(5);
        arrayList2.add(getString(C0966R.string.b8g));
        C93043n nVar = (C93043n) ((HashMap) this.f268000o).get(H7);
        if (nVar == null || (recogQBarOfImageFileResultEvent = nVar.f268030a) == null) {
            RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new RecogQBarOfImageFileEvent();
            recogQBarOfImageFileEvent.f107731d.f107732a = System.currentTimeMillis();
            recogQBarOfImageFileEvent.f107731d.f107733b = H7;
            recogQBarOfImageFileEvent.publish();
        } else if (!Util.isNullOrNil((List) recogQBarOfImageFileResultEvent.f265015d.f265017b)) {
            arrayList.add(3);
            arrayList2.add("");
        }
        if (!isFinishing()) {
            if (this.f267999n == null) {
                this.f267999n = new C77407n((Context) getContext(), 1, false);
            }
            C77407n nVar2 = this.f267999n;
            nVar2.f225771i = new C93040k(arrayList, nVar, arrayList2);
            nVar2.f225782p = this.f268006u;
            nVar2.f225761d = new C93041l();
            if (!getContext().isFinishing()) {
                this.f267999n.mo107573q();
            }
        }
        if (!Util.isNullOrNil(H7)) {
            C86709a0.m107528h();
            if (C86709a0.m107529k().f251779b.mo123467m() != 0 && z && !this.f268002q) {
                this.f268003r.mo128357d(H7);
            }
        }
    }

    public void dealContentView(View view) {
        C85875k4.m106179e0(C85875k4.m106172b(getWindow(), (View) null), getBodyView());
        ((ViewGroup) getBodyView().getParent()).removeView(getBodyView());
        ((ViewGroup) getWindow().getDecorView()).addView(getBodyView(), 0);
    }

    /* renamed from: g4 */
    public MultiTouchImageView mo127461g4() {
        int selectedItemPosition = this.f267994f.getSelectedItemPosition();
        MMGestureGallery mMGestureGallery = this.f267994f;
        View childAt = mMGestureGallery.getChildAt(selectedItemPosition - mMGestureGallery.getFirstVisiblePosition());
        if (childAt != null) {
            return childAt instanceof MultiTouchImageView ? (MultiTouchImageView) childAt : (MultiTouchImageView) childAt.findViewById(C0966R.C0970id.f4k);
        }
        Log.m105925i("MicroMsg.Editor.EditorImageUI", "getCurView() pos:%s firstPos:%s", Integer.valueOf(selectedItemPosition), Integer.valueOf(this.f267994f.getFirstVisiblePosition()));
        return null;
    }

    public String getAesKey() {
        C101834rc0 rc02;
        C100619d dVar = (C100619d) this.f267994f.getSelectedItem();
        if (dVar == null || (rc02 = dVar.f294808m) == null) {
            return null;
        }
        return rc02.f299329u;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359645cl3;
    }

    /* renamed from: j7 */
    public String mo127462j7() {
        return this.f267995g.getItem(this.f267994f.getSelectedItemPosition()).f294795a;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (1001 == i && -1 == i2) {
            String str = null;
            String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
            if (intent != null) {
                str = intent.getStringExtra("custom_send_text");
            }
            if (!Util.isNullOrNil(stringExtra)) {
                ArrayList<String> stringsToList = Util.stringsToList(stringExtra.split(","));
                if (Util.isNullOrNil((List) stringsToList)) {
                    Log.m105928w("MicroMsg.Editor.EditorImageUI", "want to send record msg, but toUser is null");
                    return;
                }
                ((C119157j) C119157j.f356862d).mo183875f(new C93031c(stringsToList, str, new C93030b(this, C76879j.m92723Q(getContext(), "", getString(C0966R.string.col), true, false, (DialogInterface.OnCancelListener) null))));
                return;
            }
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        hideTitleView();
        if (C11171e.m11046c(19)) {
            getWindow().setFlags(201327616, 201327616);
        } else {
            getWindow().setFlags(1024, 1024);
        }
        this.f268003r = new PhotoTransControl(this, this, this);
        String stringExtra = getIntent().getStringExtra("key_detail_data_id");
        C101941c q = C101941c.m134173q();
        q.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<C100616a> it = q.f300117a.iterator();
        while (it.hasNext()) {
            C100616a next = it.next();
            if (next.mo140076b() == 2) {
                arrayList.add(next);
            }
        }
        this.f267992d = arrayList;
        for (int i = 0; i < this.f267992d.size(); i++) {
            if (this.f267992d.get(i).f294795a.equals(stringExtra)) {
                this.f267996h = i;
            }
        }
        MMGestureGallery mMGestureGallery = (MMGestureGallery) findViewById(C0966R.C0970id.ehh);
        this.f267994f = mMGestureGallery;
        this.f267993e = new C93687q(mMGestureGallery, this, this);
        this.f267994f.setVerticalFadingEdgeEnabled(false);
        this.f267994f.setHorizontalFadingEdgeEnabled(false);
        C93042m mVar = new C93042m((C93034e) null);
        this.f267995g = mVar;
        mVar.f268029d = this.f267992d;
        this.f267994f.setAdapter(mVar);
        this.f267994f.setSelection(this.f267996h);
        this.f267994f.setOnItemSelectedListener(new C93034e());
        this.f267994f.setSingleClickOverListener(new C93035f());
        this.f267994f.setLongClickOverListener(new C93036g());
        fullScreenNoTitleBar(true);
        setBackBtn(new C93037h());
        this.f268008w.alive();
        this.f268004s = ((C46896e0) C86312j.m106911c(C46896e0.class)).mo71986Hu(this, new C93038i());
        C93065b.f268104d.mo127510b(this.f268005t);
    }

    public void onDestroy() {
        C93065b bVar = C93065b.f268104d;
        ((ArrayList) bVar.f268105a).remove(this.f268005t);
        PhotoTransControl photoTransControl = this.f268003r;
        if (photoTransControl != null) {
            photoTransControl.mo128356c();
        }
        C93687q qVar = this.f267993e;
        if (qVar != null) {
            qVar.f270474b = null;
            qVar.f270473a = null;
            qVar.f270477e = null;
        }
        this.f268008w.dead();
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        this.f267993e.mo128605a(false);
        return true;
    }

    public void onPause() {
        super.onPause();
        C103928o.m138642b();
    }

    public void onResume() {
        super.onResume();
        C103928o.m138641a(true, true, true);
    }

    /* renamed from: s2 */
    public String mo86626s2() {
        C101834rc0 rc02;
        C100619d dVar = (C100619d) this.f267994f.getSelectedItem();
        if (dVar == null || (rc02 = dVar.f294808m) == null) {
            return null;
        }
        return rc02.f299325s;
    }

    /* renamed from: u5 */
    public String mo86627u5() {
        return mo127459H7();
    }

    /* renamed from: w3 */
    public void mo86628w3(Object obj, Object obj2) {
        C102690c cVar = (C102690c) obj2;
        String H7 = mo127459H7();
        int b = C30391y.m39057b(cVar.f303305a);
        Log.m105925i("MicroMsg.Editor.EditorImageUI", "local translate, img %s, result %s, ratio %d", H7, cVar.f303305a, Integer.valueOf(b));
        if (((String) obj).equals(H7) && C30391y.m39062g(b)) {
            this.f268001p = true;
            GalleryTranslateReportStruct galleryTranslateReportStruct = new GalleryTranslateReportStruct();
            galleryTranslateReportStruct.f265619e = 2;
            galleryTranslateReportStruct.f265620f = 5;
            int selectedItemPosition = this.f267994f.getSelectedItemPosition();
            if (-1 != selectedItemPosition) {
                C100619d dVar = (C100619d) this.f267995g.getItem(selectedItemPosition);
                galleryTranslateReportStruct.mo126621t(dVar.f294808m.f299325s);
                galleryTranslateReportStruct.mo126620s(dVar.f294808m.f299329u);
            }
            galleryTranslateReportStruct.mo86054n();
            mo127460I7(false);
        }
    }

    /* renamed from: x3 */
    public void mo86629x3() {
    }
}
