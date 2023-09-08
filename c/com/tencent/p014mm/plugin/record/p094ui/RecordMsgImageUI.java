package com.tencent.p014mm.plugin.record.p094ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import aw0.C103928o;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.DoFavoriteEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileEvent;
import com.tencent.p014mm.autogen.events.RecogQBarOfImageFileResultEvent;
import com.tencent.p014mm.autogen.mmdata.rpt.GalleryTranslateReportStruct;
import com.tencent.p014mm.modelcdntran.C92795s;
import com.tencent.p014mm.p136ui.C85875k4;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.base.MultiTouchImageView;
import com.tencent.p014mm.p136ui.component.UIComponent;
import com.tencent.p014mm.p136ui.tools.MMGestureGallery;
import com.tencent.p014mm.p136ui.widget.snackbar.C75026b;
import com.tencent.p014mm.plugin.fav.p047ui.C93594f1;
import com.tencent.p014mm.plugin.fav.p047ui.C93687q;
import com.tencent.p014mm.plugin.fav.p047ui.PhotoTransControl;
import com.tencent.p014mm.plugin.fav.p047ui.gallery.C93624e;
import com.tencent.p014mm.plugin.fav.p047ui.widget.FavVideoView;
import com.tencent.p014mm.plugin.scanner.C30391y;
import com.tencent.p014mm.plugin.scanner.word.C94533d;
import com.tencent.p014mm.pluginsdk.model.C96787m0;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandlerThread;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.vfs.C86013q1;
import d62.C7250m;
import di3.C86312j;
import eb0.C45628s0;
import f40.C86709a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import nj3.C11182m0;
import nj3.C11184p0;
import nj3.C76879j;
import nj3.C88989a;
import og2.C100336e;
import og2.C100339h;
import og2.C100344n;
import p200lx.C46900z;
import p433g.C27075b;
import p663qo.C63287k;
import qg2.C101136b0;
import qg2.C101141g0;
import qg2.C101147j0;
import qo3.C77407n;
import vo3.C90852c;
import xl2.C102690c;

@C88989a(3)
@C90852c(0)
/* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgImageUI */
public class RecordMsgImageUI extends MMActivity implements C100339h, C94533d.C94534a<String, C102690c>, PhotoTransControl.C93478b, C93687q.C93688a {

    /* renamed from: H */
    public static final /* synthetic */ int f272623H = 0;

    /* renamed from: A */
    public FavVideoView f272624A = null;

    /* renamed from: B */
    public AdapterView.OnItemSelectedListener f272625B = new RecordMsgImageUI$$l(this);

    /* renamed from: C */
    public C11184p0 f272626C = new RecordMsgImageUI$$b(this);

    /* renamed from: D */
    public C11184p0 f272627D = new RecordMsgImageUI$$c(this);

    /* renamed from: E */
    public Runnable f272628E = new RecordMsgImageUI$$g(this);

    /* renamed from: F */
    public IListener f272629F = new IListener<RecogQBarOfImageFileResultEvent>(C40008f.f107254d) {
        {
            this.__eventId = 812146647;
        }

        public boolean callback(IEvent iEvent) {
            RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent = (RecogQBarOfImageFileResultEvent) iEvent;
            String str = recogQBarOfImageFileResultEvent.f265015d.f265016a;
            RecordMsgImageUI$$q recordMsgImageUI$$q = new RecordMsgImageUI$$q();
            recordMsgImageUI$$q.f272679a = recogQBarOfImageFileResultEvent;
            ((HashMap) RecordMsgImageUI.this.f272642r).put(str, recordMsgImageUI$$q);
            C77407n nVar = RecordMsgImageUI.this.f272641q;
            if (nVar == null || !nVar.mo107563h()) {
                return true;
            }
            RecordMsgImageUI.this.mo129711M7(false);
            return true;
        }
    };

    /* renamed from: G */
    public C92795s f272630G = new RecordMsgImageUI$$a(this);

    /* renamed from: d */
    public List<C93624e> f272631d = new LinkedList();

    /* renamed from: e */
    public List<FavVideoView> f272632e = new ArrayList();

    /* renamed from: f */
    public HashMap<String, List<View>> f272633f = new HashMap<>();

    /* renamed from: g */
    public C93687q f272634g;

    /* renamed from: h */
    public MMGestureGallery f272635h;

    /* renamed from: i */
    public RecordMsgImageUI$$p f272636i;

    /* renamed from: j */
    public int f272637j = 0;

    /* renamed from: n */
    public long f272638n = -1;

    /* renamed from: o */
    public String f272639o = null;

    /* renamed from: p */
    public C101141g0 f272640p;

    /* renamed from: q */
    public C77407n f272641q;

    /* renamed from: r */
    public Map<String, RecordMsgImageUI$$q> f272642r = new HashMap();

    /* renamed from: s */
    public boolean f272643s;

    /* renamed from: t */
    public boolean f272644t = C30391y.f81992d;

    /* renamed from: u */
    public PhotoTransControl f272645u;

    /* renamed from: v */
    public C46900z f272646v;

    /* renamed from: w */
    public int f272647w = -1;

    /* renamed from: x */
    public int f272648x = -1;

    /* renamed from: y */
    public boolean f272649y = false;

    /* renamed from: z */
    public int f272650z = 0;

    /* renamed from: A4 */
    public void mo86623A4() {
    }

    /* renamed from: H7 */
    public void mo129706H7() {
        DoFavoriteEvent doFavoriteEvent = new DoFavoriteEvent();
        C96787m0.m124252f(doFavoriteEvent, getIntent().getIntExtra("key_favorite_source_type", 1), mo129709K7());
        DoFavoriteEvent.C92474a aVar = doFavoriteEvent.f264674d;
        aVar.f264688m = 10;
        aVar.f264684i = this;
        doFavoriteEvent.publish();
    }

    /* renamed from: I7 */
    public final void mo129707I7() {
        if (this.f272634g == null || !mo129710L7()) {
            finish();
        } else {
            this.f272634g.mo128605a(false);
        }
    }

    /* renamed from: J7 */
    public C93624e mo129708J7() {
        return this.f272636i.getItem(this.f272635h.getSelectedItemPosition());
    }

    /* renamed from: K7 */
    public final String mo129709K7() {
        int selectedItemPosition = this.f272635h.getSelectedItemPosition();
        if (-1 == selectedItemPosition) {
            Log.m105928w("MicroMsg.ShowImageUI", "error position");
            return null;
        }
        String q = C101147j0.m132636q(this.f272636i.getItem(selectedItemPosition).mo128528n(), this.f272638n, 1);
        Log.m105919d("MicroMsg.ShowImageUI", "cur pos %d path %s", Integer.valueOf(selectedItemPosition), q);
        return q;
    }

    /* renamed from: L7 */
    public final boolean mo129710L7() {
        C93624e a = this.f272636i.getItem(this.f272635h.getSelectedItemPosition());
        return a != null && a.mo128525k() == 2;
    }

    /* renamed from: M7 */
    public final void mo129711M7(boolean z) {
        C11182m0 m0Var;
        C11184p0 p0Var;
        RecogQBarOfImageFileResultEvent recogQBarOfImageFileResultEvent;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (mo129710L7()) {
            arrayList.add(0);
            arrayList2.add(getString(C0966R.string.i4e));
            arrayList.add(1);
            arrayList2.add(getString(C0966R.string.f361137hk2));
            arrayList.add(2);
            arrayList2.add(getString(C0966R.string.iam));
            String K7 = mo129709K7();
            if ((this.f272644t || this.f272643s) && !Util.isNullOrNil(K7)) {
                arrayList.add(4);
                arrayList2.add(getString(C0966R.string.b8h));
            }
            arrayList.add(5);
            arrayList2.add(getString(C0966R.string.b8g));
            RecordMsgImageUI$$q recordMsgImageUI$$q = (RecordMsgImageUI$$q) ((HashMap) this.f272642r).get(K7);
            if (recordMsgImageUI$$q == null || (recogQBarOfImageFileResultEvent = recordMsgImageUI$$q.f272679a) == null) {
                RecogQBarOfImageFileEvent recogQBarOfImageFileEvent = new RecogQBarOfImageFileEvent();
                recogQBarOfImageFileEvent.f107731d.f107732a = System.currentTimeMillis();
                recogQBarOfImageFileEvent.f107731d.f107733b = K7;
                recogQBarOfImageFileEvent.publish();
            } else if (!Util.isNullOrNil((List) recogQBarOfImageFileResultEvent.f265015d.f265017b)) {
                arrayList.add(3);
                arrayList2.add("");
            }
            if (!Util.isNullOrNil(K7)) {
                C86709a0.m107528h();
                if (C86709a0.m107529k().f251779b.mo123467m() != 0 && z && !this.f272644t) {
                    this.f272645u.mo128357d(K7);
                }
            }
            m0Var = new RecordMsgImageUI$$m(this, arrayList, recordMsgImageUI$$q, arrayList2);
            p0Var = this.f272626C;
        } else {
            if (C86013q1.m106450k(mo129708J7().mo128524j())) {
                if (mo129708J7().mo128516b()) {
                    arrayList.add(0);
                    arrayList2.add(getString(C0966R.string.crb));
                }
                arrayList.add(2);
                arrayList2.add(getString(C0966R.string.iar));
            }
            m0Var = new RecordMsgImageUI$$n(this, arrayList, arrayList2);
            p0Var = this.f272627D;
        }
        if (!isFinishing()) {
            if (this.f272641q == null) {
                this.f272641q = new C77407n((Context) getContext(), 1, false);
            }
            C77407n nVar = this.f272641q;
            nVar.f225771i = m0Var;
            nVar.f225782p = p0Var;
            nVar.f225761d = new RecordMsgImageUI$$o(this);
            if (!getContext().isFinishing()) {
                this.f272641q.mo107573q();
            }
        }
    }

    public void dealContentView(View view) {
        C85875k4.m106179e0(C85875k4.m106172b(getWindow(), (View) null), getBodyView());
        ((ViewGroup) getBodyView().getParent()).removeView(getBodyView());
        ((ViewGroup) getWindow().getDecorView()).addView(getBodyView(), 0);
    }

    public void finish() {
        Intent intent = new Intent();
        intent.putExtra("KEY_VIEW_PIC_CNT", this.f272650z);
        setResult(0, intent);
        super.finish();
    }

    /* renamed from: g4 */
    public MultiTouchImageView mo127461g4() {
        int selectedItemPosition = this.f272635h.getSelectedItemPosition();
        MMGestureGallery mMGestureGallery = this.f272635h;
        View childAt = mMGestureGallery.getChildAt(selectedItemPosition - mMGestureGallery.getFirstVisiblePosition());
        if (childAt == null) {
            Log.m105925i("MicroMsg.ShowImageUI", "getCurView() pos:%s firstPos:%s", Integer.valueOf(selectedItemPosition), Integer.valueOf(this.f272635h.getFirstVisiblePosition()));
            return null;
        } else if (childAt instanceof MultiTouchImageView) {
            return (MultiTouchImageView) childAt;
        } else {
            View findViewById = childAt.findViewById(C0966R.C0970id.f4k);
            if (findViewById instanceof MultiTouchImageView) {
                return (MultiTouchImageView) findViewById;
            }
            return null;
        }
    }

    public String getAesKey() {
        int selectedItemPosition = this.f272635h.getSelectedItemPosition();
        if (-1 != selectedItemPosition) {
            return this.f272636i.getItem(selectedItemPosition).mo128519e();
        }
        return null;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.bz_;
    }

    /* renamed from: i1 */
    public void mo128649i1(int i, C100344n nVar) {
        int k = mo129708J7().mo128525k();
        if (!(k == 15 || k == 4)) {
            for (C93624e i2 : this.f272631d) {
                if (i2.mo128523i().equals(nVar.field_dataId)) {
                    MMHandlerThread.postToMainThread(this.f272628E);
                    return;
                }
            }
        }
    }

    /* renamed from: j7 */
    public String mo127462j7() {
        return this.f272636i.getItem(this.f272635h.getSelectedItemPosition()).mo128523i();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = i;
        int i4 = i2;
        Intent intent2 = intent;
        String str = null;
        if (1001 == i3 && -1 == i4) {
            String stringExtra = intent2 == null ? null : intent2.getStringExtra("Select_Conv_User");
            if (intent2 != null) {
                str = intent2.getStringExtra("custom_send_text");
            }
            if (!Util.isNullOrNil(stringExtra)) {
                ArrayList<String> stringsToList = Util.stringsToList(stringExtra.split(","));
                if (Util.isNullOrNil((List) stringsToList)) {
                    Log.m105928w("MicroMsg.ShowImageUI", "want to send record msg, but toUser is null");
                } else {
                    C86709a0.m107525e().postToWorker(new RecordMsgImageUI$$e(this, stringsToList, str, new RecordMsgImageUI$$d(this, C76879j.m92723Q(getContext(), "", getString(C0966R.string.col), true, false, (DialogInterface.OnCancelListener) null))));
                }
            }
        } else if (1 == i3 && -1 == i4) {
            String stringExtra2 = intent2 == null ? null : intent2.getStringExtra("Select_Conv_User");
            if (intent2 != null) {
                str = intent2.getStringExtra("custom_send_text");
            }
            RecordMsgImageUI$$f recordMsgImageUI$$f = new RecordMsgImageUI$$f(this, C76879j.m92723Q(getContext(), "", getString(C0966R.string.col), true, false, (DialogInterface.OnCancelListener) null));
            if (!Util.isNullOrNil(stringExtra2)) {
                ArrayList<String> stringsToList2 = Util.stringsToList(stringExtra2.split(","));
                C93624e J7 = mo129708J7();
                String j = J7.mo128524j();
                String w = J7.mo128537w();
                for (String next : stringsToList2) {
                    C93594f1.m118182j(getContext(), next, j, w, J7.mo128527m(), "", recordMsgImageUI$$f, J7.mo128534t());
                    if (!Util.isNullOrNil(str)) {
                        C7250m.m7431a().mo136257Tm(next, str, C45628s0.m50810y(next), 0);
                    }
                }
                C75026b.m89951a(this, getString(C0966R.string.cmm));
            }
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x015c  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0165  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r10) {
        /*
            r9 = this;
            super.onCreate(r10)
            r9.hideTitleView()
            r10 = 19
            boolean r10 = p206nj.C11171e.m11046c(r10)
            if (r10 == 0) goto L_0x0019
            android.view.Window r10 = r9.getWindow()
            r0 = 201327616(0xc000400, float:9.861965E-32)
            r10.setFlags(r0, r0)
            goto L_0x0022
        L_0x0019:
            android.view.Window r10 = r9.getWindow()
            r0 = 1024(0x400, float:1.435E-42)
            r10.setFlags(r0, r0)
        L_0x0022:
            com.tencent.mm.plugin.fav.ui.PhotoTransControl r10 = new com.tencent.mm.plugin.fav.ui.PhotoTransControl
            r10.<init>(r9, r9, r9)
            r9.f272645u = r10
            qg2.g0 r10 = new qg2.g0
            r10.<init>()
            r9.f272640p = r10
            android.content.Intent r10 = r9.getIntent()
            r0 = -1
            java.lang.String r2 = "message_id"
            long r0 = r10.getLongExtra(r2, r0)
            r9.f272638n = r0
            android.content.Intent r10 = r9.getIntent()
            java.lang.String r0 = "record_data_id"
            java.lang.String r10 = r10.getStringExtra(r0)
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r1 = "record_xml"
            java.lang.String r0 = r0.getStringExtra(r1)
            te3.dp3 r0 = qg2.C101147j0.m132643x(r0)
            eb0.c r1 = eb0.C97625j3.m125812b()
            g62.l r1 = r1.mo105911z()
            long r2 = r9.f272638n
            com.tencent.mm.storage.g4 r1 = (com.tencent.p014mm.storage.C72972g4) r1
            com.tencent.mm.storage.f4 r1 = r1.b00(r2)
            android.content.Intent r2 = r9.getIntent()
            java.lang.String r3 = "from_scene"
            r4 = 0
            int r2 = r2.getIntExtra(r3, r4)
            r9.f272647w = r2
            android.content.Intent r2 = r9.getIntent()
            r3 = -1
            java.lang.String r5 = "chatTypeForAppbrand"
            int r2 = r2.getIntExtra(r5, r3)
            r9.f272648x = r2
            if (r0 != 0) goto L_0x0099
            java.lang.String r2 = r1.getContent()
            java.lang.String r1 = r1.mo108775z2()
            com.tencent.mm.message.l$b r1 = com.tencent.p014mm.message.C68070l.C68072b.m80422u(r2, r1)
            if (r1 == 0) goto L_0x0099
            java.lang.String r0 = r1.f195571f0
            te3.dp3 r0 = qg2.C101147j0.m132631l(r0, r10)
        L_0x0099:
            java.lang.String r1 = "MicroMsg.ShowImageUI"
            if (r0 != 0) goto L_0x00a6
            java.lang.String r10 = "get record msg data error, empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r10)
            r9.finish()
            return
        L_0x00a6:
            android.content.Intent r2 = r9.getIntent()
            java.lang.String r3 = "KEY_MEDIA_FAV_PREVIEW_DATA"
            byte[] r2 = r2.getByteArrayExtra(r3)
            bb3.f r3 = bb3.C28293f.f77884a
            boolean r3 = r3.mo55909a()
            r5 = 0
            if (r3 == 0) goto L_0x00cd
            if (r2 == 0) goto L_0x00cd
            te3.hd0 r3 = new te3.hd0     // Catch:{ all -> 0x00c4 }
            r3.<init>()     // Catch:{ all -> 0x00c4 }
            r3.parseFrom(r2)     // Catch:{ all -> 0x00c4 }
            goto L_0x00ce
        L_0x00c4:
            r2 = move-exception
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.String r6 = "parse err"
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r2, r6, r3)
        L_0x00cd:
            r3 = r5
        L_0x00ce:
            java.util.LinkedList<te3.rc0> r0 = r0.f227155f
            java.util.Iterator r0 = r0.iterator()
        L_0x00d4:
            boolean r2 = r0.hasNext()
            r6 = 1
            if (r2 == 0) goto L_0x0154
            java.lang.Object r2 = r0.next()
            te3.rc0 r2 = (te3.C101834rc0) r2
            int r7 = r2.f299258I
            r8 = 8
            if (r7 != r8) goto L_0x00fa
            java.lang.Class<xq.e> r7 = p272xq.C102712e.class
            di3.d r7 = di3.C86312j.m106911c(r7)
            xq.e r7 = (p272xq.C102712e) r7
            java.lang.String r7 = r7.mo142091L2(r2)
            boolean r7 = com.tencent.p014mm.sdk.platformtools.ImgUtil.isGif((java.lang.String) r7)
            if (r7 != 0) goto L_0x00fa
            goto L_0x00d4
        L_0x00fa:
            int r7 = r2.f299258I
            r8 = 4
            if (r7 != r8) goto L_0x0131
            if (r3 == 0) goto L_0x00d4
            java.util.LinkedList<te3.id0> r7 = r3.f183477d
            int r7 = r7.size()
            if (r7 <= 0) goto L_0x00d4
            java.util.LinkedList<te3.id0> r7 = r3.f183477d
            java.lang.Object r7 = r7.remove(r4)
            te3.id0 r7 = (te3.C64443id0) r7
            com.tencent.mm.plugin.fav.ui.gallery.d r8 = new com.tencent.mm.plugin.fav.ui.gallery.d
            r8.<init>(r7)
            java.util.List<com.tencent.mm.plugin.fav.ui.gallery.e> r7 = r9.f272631d
            java.util.LinkedList r7 = (java.util.LinkedList) r7
            r7.add(r8)
            java.lang.String r2 = r2.f299280T
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L_0x00d4
            java.util.List<com.tencent.mm.plugin.fav.ui.gallery.e> r2 = r9.f272631d
            java.util.LinkedList r2 = (java.util.LinkedList) r2
            int r2 = r2.size()
            int r2 = r2 - r6
            r9.f272637j = r2
            goto L_0x00d4
        L_0x0131:
            r8 = 2
            if (r7 != r8) goto L_0x00d4
            com.tencent.mm.plugin.fav.ui.gallery.c r7 = new com.tencent.mm.plugin.fav.ui.gallery.c
            r7.<init>(r5, r2)
            java.util.List<com.tencent.mm.plugin.fav.ui.gallery.e> r8 = r9.f272631d
            java.util.LinkedList r8 = (java.util.LinkedList) r8
            r8.add(r7)
            java.lang.String r2 = r2.f299280T
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L_0x00d4
            java.util.List<com.tencent.mm.plugin.fav.ui.gallery.e> r2 = r9.f272631d
            java.util.LinkedList r2 = (java.util.LinkedList) r2
            int r2 = r2.size()
            int r2 = r2 - r6
            r9.f272637j = r2
            goto L_0x00d4
        L_0x0154:
            java.util.List<com.tencent.mm.plugin.fav.ui.gallery.e> r10 = r9.f272631d
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x0165
            java.lang.String r10 = "get image data error, empty"
            com.tencent.p014mm.sdk.platformtools.Log.m105928w(r1, r10)
            r9.finish()
            return
        L_0x0165:
            r10 = 2131305324(0x7f09236c, float:1.8228816E38)
            android.view.View r10 = r9.findViewById(r10)
            com.tencent.mm.ui.tools.MMGestureGallery r10 = (com.tencent.p014mm.p136ui.tools.MMGestureGallery) r10
            r9.f272635h = r10
            com.tencent.mm.plugin.fav.ui.q r0 = new com.tencent.mm.plugin.fav.ui.q
            r0.<init>(r10, r9, r9)
            r9.f272634g = r0
            com.tencent.mm.ui.tools.MMGestureGallery r10 = r9.f272635h
            r10.setVerticalFadingEdgeEnabled(r4)
            com.tencent.mm.ui.tools.MMGestureGallery r10 = r9.f272635h
            r10.setHorizontalFadingEdgeEnabled(r4)
            com.tencent.mm.plugin.record.ui.RecordMsgImageUI$$p r10 = new com.tencent.mm.plugin.record.ui.RecordMsgImageUI$$p
            r10.<init>(r9, r5)
            r9.f272636i = r10
            java.util.List<com.tencent.mm.plugin.fav.ui.gallery.e> r0 = r9.f272631d
            r10.f272674d = r0
            long r0 = r9.f272638n
            r10.f272675e = r0
            qg2.g0 r0 = r9.f272640p
            r10.f272676f = r0
            com.tencent.mm.ui.tools.MMGestureGallery r0 = r9.f272635h
            r0.setAdapter(r10)
            com.tencent.mm.ui.tools.MMGestureGallery r10 = r9.f272635h
            int r0 = r9.f272637j
            r10.setSelection(r0)
            com.tencent.mm.ui.tools.MMGestureGallery r10 = r9.f272635h
            android.widget.AdapterView$OnItemSelectedListener r0 = r9.f272625B
            r10.setOnItemSelectedListener(r0)
            com.tencent.mm.ui.tools.MMGestureGallery r10 = r9.f272635h
            com.tencent.mm.plugin.record.ui.RecordMsgImageUI$$h r0 = new com.tencent.mm.plugin.record.ui.RecordMsgImageUI$$h
            r0.<init>(r9)
            r10.setSingleClickOverListener(r0)
            com.tencent.mm.ui.tools.MMGestureGallery r10 = r9.f272635h
            com.tencent.mm.plugin.record.ui.RecordMsgImageUI$$i r0 = new com.tencent.mm.plugin.record.ui.RecordMsgImageUI$$i
            r0.<init>(r9)
            r10.setLongClickOverListener(r0)
            r9.fullScreenNoTitleBar(r6)
            com.tencent.mm.plugin.record.ui.RecordMsgImageUI$$j r10 = new com.tencent.mm.plugin.record.ui.RecordMsgImageUI$$j
            r10.<init>(r9)
            r9.setBackBtn(r10)
            java.lang.Class<og2.e> r10 = og2.C100336e.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            og2.e r10 = (og2.C100336e) r10
            og2.i r10 = r10.mo139410hi()
            qg2.b0 r10 = (qg2.C101136b0) r10
            r10.mo140583jo(r9)
            java.lang.Class<qo.k> r10 = p663qo.C63287k.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            qo.k r10 = (p663qo.C63287k) r10
            com.tencent.mm.modelcdntran.s r0 = r9.f272630G
            r10.mo88185wy(r0)
            com.tencent.mm.sdk.event.IListener r10 = r9.f272629F
            r10.alive()
            java.lang.Class<lx.e0> r10 = p200lx.C46896e0.class
            di3.d r10 = di3.C86312j.m106911c(r10)
            lx.e0 r10 = (p200lx.C46896e0) r10
            com.tencent.mm.plugin.record.ui.RecordMsgImageUI$$k r0 = new com.tencent.mm.plugin.record.ui.RecordMsgImageUI$$k
            r0.<init>(r9)
            lx.z r10 = r10.mo71986Hu(r9, r0)
            r9.f272646v = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.record.p094ui.RecordMsgImageUI.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        ((C101136b0) ((C100336e) C86312j.m106911c(C100336e.class)).mo139410hi()).mo140582bD(this);
        ((C63287k) C86312j.m106911c(C63287k.class)).mo88181kj(this.f272630G);
        this.f272640p.mo140590f();
        Iterator it = ((ArrayList) this.f272632e).iterator();
        while (it.hasNext()) {
            FavVideoView favVideoView = (FavVideoView) it.next();
            if (favVideoView != null) {
                favVideoView.mo128629d();
            }
        }
        PhotoTransControl photoTransControl = this.f272645u;
        if (photoTransControl != null) {
            photoTransControl.mo128356c();
        }
        C93687q qVar = this.f272634g;
        if (qVar != null) {
            qVar.f270474b = null;
            qVar.f270473a = null;
            qVar.f270477e = null;
        }
        this.f272629F.dead();
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        mo129707I7();
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
        int selectedItemPosition = this.f272635h.getSelectedItemPosition();
        if (-1 != selectedItemPosition) {
            return this.f272636i.getItem(selectedItemPosition).mo128520f();
        }
        return null;
    }

    public void superImportUIComponents(HashSet<Class<? extends UIComponent>> hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(C27075b.class);
    }

    /* renamed from: u5 */
    public String mo86627u5() {
        return mo129709K7();
    }

    /* renamed from: w3 */
    public void mo86628w3(Object obj, Object obj2) {
        C102690c cVar = (C102690c) obj2;
        String K7 = mo129709K7();
        int b = C30391y.m39057b(cVar.f303305a);
        Log.m105925i("MicroMsg.ShowImageUI", "local translate, img %s, result %s, ratio %d", K7, cVar.f303305a, Integer.valueOf(b));
        if (((String) obj).equals(K7) && C30391y.m39062g(b)) {
            this.f272643s = true;
            GalleryTranslateReportStruct galleryTranslateReportStruct = new GalleryTranslateReportStruct();
            galleryTranslateReportStruct.f265619e = 2;
            galleryTranslateReportStruct.f265620f = 5;
            int selectedItemPosition = this.f272635h.getSelectedItemPosition();
            if (-1 != selectedItemPosition) {
                C93624e a = this.f272636i.getItem(selectedItemPosition);
                galleryTranslateReportStruct.mo126621t(a.mo128520f());
                galleryTranslateReportStruct.mo126620s(a.mo128519e());
            }
            galleryTranslateReportStruct.mo86054n();
            mo129711M7(false);
        }
    }

    /* renamed from: x3 */
    public void mo86629x3() {
    }
}
