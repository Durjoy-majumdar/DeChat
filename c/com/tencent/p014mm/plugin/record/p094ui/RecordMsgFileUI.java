package com.tencent.p014mm.plugin.record.p094ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import c02.C92331c;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.booter.C92614a;
import com.tencent.p014mm.message.C68070l;
import com.tencent.p014mm.modelcdntran.C92795s;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.p136ui.MMImageView;
import com.tencent.p014mm.plugin.handoff.model.AbsHandOffFile;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96875r0;
import com.tencent.p014mm.pluginsdk.p133ui.tools.C96895y1;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import com.tencent.p014mm.vfs.C86009m1;
import di3.C86312j;
import eb0.C31543z5;
import eb0.C97625j3;
import f40.C86709a0;
import f62.C75700k0;
import i21.C98591h;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kj2.C117407d;
import lc3.C10485b;
import nj3.C76879j;
import og2.C100336e;
import og2.C100339h;
import og2.C100344n;
import p206nj.C76861g;
import p262wm.C22921c;
import p272xq.C102712e;
import p444at.C92087b;
import p645pj.C77092c;
import p663qo.C63287k;
import p823sg.C90193h;
import qg2.C101136b0;
import qg2.C101141g0;
import qg2.C101147j0;
import qo3.C89779i0;
import te3.C101834rc0;
import te3.C101849uc0;
import wc3.C102430l;

/* renamed from: com.tencent.mm.plugin.record.ui.RecordMsgFileUI */
public class RecordMsgFileUI extends MMActivity implements C100339h {

    /* renamed from: E */
    public static final long f272576E = C77092c.m93047i();

    /* renamed from: F */
    public static final /* synthetic */ int f272577F = 0;

    /* renamed from: A */
    public boolean f272578A = false;

    /* renamed from: B */
    public boolean f272579B = false;

    /* renamed from: C */
    public boolean f272580C;

    /* renamed from: D */
    public C92795s f272581D = new RecordMsgFileUI$$a(this);

    /* renamed from: d */
    public Button f272582d;

    /* renamed from: e */
    public Button f272583e;

    /* renamed from: f */
    public Button f272584f;

    /* renamed from: g */
    public MMImageView f272585g;

    /* renamed from: h */
    public TextView f272586h;

    /* renamed from: i */
    public TextView f272587i;

    /* renamed from: j */
    public ProgressBar f272588j;

    /* renamed from: n */
    public TextView f272589n;

    /* renamed from: o */
    public View f272590o;

    /* renamed from: p */
    public View f272591p;

    /* renamed from: q */
    public C96875r0 f272592q = null;

    /* renamed from: r */
    public MMHandler f272593r = new MMHandler();

    /* renamed from: s */
    public long f272594s;

    /* renamed from: t */
    public String f272595t;

    /* renamed from: u */
    public C101834rc0 f272596u;

    /* renamed from: v */
    public C72963f4 f272597v;

    /* renamed from: w */
    public AbsHandOffFile f272598w;

    /* renamed from: x */
    public C101141g0 f272599x;

    /* renamed from: y */
    public boolean f272600y = false;

    /* renamed from: z */
    public boolean f272601z = false;

    /* renamed from: H7 */
    public final int mo129684H7() {
        int i = this.f272596u.f299258I;
        if (i == 15) {
            return 4;
        }
        return i;
    }

    /* renamed from: I7 */
    public final String mo129685I7() {
        C86009m1 m1Var = new C86009m1(C101147j0.m132611D(this.f272596u, this.f272594s, 1));
        if (m1Var.mo119967g()) {
            return m1Var.mo119971i();
        }
        return C97625j3.m125812b().mo105892g() + "web/" + C90193h.m112878f(Util.nullAs(this.f272596u.f299254G, "").getBytes());
    }

    /* renamed from: J7 */
    public final void mo129686J7() {
        this.f272584f.setVisibility(8);
        this.f272582d.setVisibility(8);
        this.f272583e.setVisibility(8);
        this.f272587i.setVisibility(8);
        View view = this.f272590o;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(0);
        View view2 = view;
        C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initDownloadingStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view2, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initDownloadingStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo129693Q7(((C101136b0) ((C100336e) C86312j.m106911c(C100336e.class)).mo139410hi()).mo140585qq(this.f272595t));
    }

    /* renamed from: K7 */
    public final void mo129687K7() {
        C101849uc0 uc02;
        Class cls = C92331c.class;
        if (this.f272598w.getFileStatus() != 1) {
            this.f272598w.setFileStatus(1);
            this.f272598w.setFullPath(Util.nullAsNil(C101147j0.m132636q(this.f272596u, this.f272594s, 1)));
            ((C92331c) C86312j.m106911c(cls)).mo58375rt(this.f272598w);
            ((C92331c) C86312j.m106911c(cls)).Gg0(this.f272598w);
        }
        if (mo129684H7() == 15 && (uc02 = this.f272596u.f299306h1) != null && !Util.isNullOrNil(uc02.f299610d) && !Util.isNullOrNil(this.f272596u.f299306h1.f299613g)) {
            this.f272601z = true;
            this.f272585g.setVisibility(8);
            View view = this.f272590o;
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(view, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f272584f.setVisibility(8);
            this.f272582d.setVisibility(8);
            this.f272583e.setVisibility(8);
            this.f272587i.setVisibility(8);
            String q = C101147j0.m132636q(this.f272596u, this.f272594s, 1);
            Log.m105918d("MicroMsg.RecordMsgFileUI", C76861g.m92659b() + " initView: fullpath:" + q);
            this.f272592q = C96895y1.m124471a(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.addRule(13);
            ((ViewGroup) findViewById(C0966R.C0970id.f359485l50)).addView((View) this.f272592q, 0, layoutParams);
            this.f272592q.setVideoCallback(new RecordMsgFileUI$$l(this));
            Log.m105918d("MicroMsg.RecordMsgFileUI", C76861g.m92659b() + " initView :" + q);
            if (q != null) {
                this.f272592q.stop();
                this.f272592q.setVideoPath(q);
            }
            Log.m105918d("MicroMsg.RecordMsgFileUI", C76861g.m92659b() + " initView");
            if (C97625j3.m125813c() != null) {
                ((C92614a) C97625j3.m125813c()).mo126634a();
            }
        }
        if (mo129684H7() != 15 && mo129684H7() != 4) {
            View view2 = this.f272590o;
            C9556a aVar2 = new C9556a();
            ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
            aVar2.mo10233c(8);
            View view3 = view2;
            C117292a.m165358d(view3, aVar2.mo10232b(), "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
            C117292a.m165359e(view3, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f272584f.setVisibility(4);
            if (Util.isNullOrNil(this.f272596u.f299242A)) {
                this.f272582d.setVisibility(8);
            } else {
                this.f272582d.setVisibility(0);
            }
            this.f272583e.setVisibility(0);
            this.f272587i.setVisibility(0);
        } else if (!this.f272601z) {
            View view4 = this.f272590o;
            C9556a aVar3 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar3.mo10233c(8);
            View view5 = view4;
            C117292a.m165358d(view5, aVar3.mo10232b(), "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
            C117292a.m165359e(view5, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initOpenFileStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f272584f.setVisibility(8);
            this.f272582d.setVisibility(8);
            this.f272583e.setVisibility(0);
            this.f272583e.setText(C0966R.string.f360425cp0);
            this.f272587i.setVisibility(8);
            mo129691O7();
        }
    }

    /* renamed from: L7 */
    public final void mo129688L7() {
        this.f272584f.setVisibility(8);
        this.f272582d.setVisibility(8);
        this.f272583e.setVisibility(8);
        View view = this.f272590o;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initOutOfDateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initOutOfDateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f272587i.setVisibility(0);
        if (this.f272596u.f299258I == 4) {
            this.f272587i.setGravity(17);
            this.f272587i.setText(C0966R.string.cpm);
            return;
        }
        this.f272587i.setGravity(17);
        this.f272587i.setText(C0966R.string.cpl);
        if (!this.f272580C) {
            this.f272580C = true;
            mo129692P7(8, 6);
        }
    }

    /* renamed from: M7 */
    public final void mo129689M7() {
        View view = this.f272590o;
        C9556a aVar = new C9556a();
        ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
        aVar.mo10233c(8);
        C117292a.m165358d(view, aVar.mo10232b(), "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initWaitDownloadStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
        C117292a.m165359e(view, "com/tencent/mm/plugin/record/ui/RecordMsgFileUI", "initWaitDownloadStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f272583e.setVisibility(8);
        if (Util.isNullOrNil(this.f272596u.f299242A)) {
            this.f272582d.setVisibility(8);
        } else {
            this.f272582d.setVisibility(0);
        }
        this.f272584f.setVisibility(0);
        this.f272584f.setText(C0966R.string.coy);
        this.f272587i.setVisibility(8);
    }

    /* renamed from: N7 */
    public final void mo129690N7(C100344n nVar, boolean z) {
        if (1 == nVar.field_type) {
            int i = nVar.field_fileType;
            if ((i == 7 || i == 5) && this.f272579B) {
                try {
                    ((C98591h) C86312j.m106911c(C98591h.class)).mo137975se(false, nVar.field_dataId, ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(Long.valueOf(nVar.field_mediaId.split("@")[2]).longValue()).mo108774y2(), z, false);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: O7 */
    public final void mo129691O7() {
        if (!this.f272578A) {
            this.f272578A = true;
            Intent intent = new Intent();
            intent.putExtra("key_detail_fav_path", C101147j0.m132636q(this.f272596u, this.f272594s, 1));
            intent.putExtra("key_detail_fav_thumb_path", C101147j0.m132611D(this.f272596u, this.f272594s, 1));
            intent.putExtra("key_detail_fav_video_duration", this.f272596u.f299338y);
            intent.putExtra("key_detail_statExtStr", this.f272596u.f299311k1);
            intent.putExtra("key_detail_fav_video_scene_from", 1);
            intent.putExtra("key_detail_msg_uuid", this.f272596u.f299259I1);
            ((C102712e) C86312j.m106911c(C102712e.class)).F20(this, ".ui.detail.FavoriteVideoPlayUI", intent);
            finish();
        }
    }

    /* renamed from: P7 */
    public final void mo129692P7(int i, int i2) {
        if (8 == mo129684H7()) {
            int i3 = this.f272596u.f299276R > 26214400 ? 7 : 5;
            C117407d.INSTANCE.idkeyStat(1203, (long) i2, 1, false);
            String format = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s,%s", new Object[]{this.f272596u.f299325s, Integer.valueOf(i3), Long.valueOf(this.f272596u.f299276R), Integer.valueOf(i), Long.valueOf((C31543z5.m39453c() - this.f272597v.getCreateTime()) / 1000), this.f272596u.f299262K, this.f272597v.mo108768t(), 2, this.f272596u.f299280T, Long.valueOf(this.f272597v.mo108774y2()), Long.valueOf(this.f272597v.getCreateTime()), Long.valueOf(C31543z5.m39451a()), 1});
            Log.m105925i("MicroMsg.RecordMsgFileUI", "reportKVStat 14665 %s", format);
            C115669n.INSTANCE.kvStat(14665, format);
        }
    }

    /* renamed from: Q7 */
    public final void mo129693Q7(C100344n nVar) {
        int i;
        int i2;
        int i3 = 0;
        if (nVar != null) {
            i3 = (int) ((((float) nVar.field_offset) / ((float) Math.max(1, nVar.field_totalLen))) * 100.0f);
            i2 = nVar.field_offset;
            i = nVar.field_totalLen;
        } else {
            i = (int) this.f272596u.f299276R;
            i2 = 0;
        }
        this.f272593r.post(new RecordMsgFileUI$$c(this, i3, i2, i));
    }

    public int getForceOrientation() {
        return 1;
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f359675a83;
    }

    /* renamed from: i1 */
    public void mo128649i1(int i, C100344n nVar) {
        if (nVar == null) {
            Log.m105928w("MicroMsg.RecordMsgFileUI", "on cdn info changed, but cdn info is null");
            return;
        }
        Log.m105927v("MicroMsg.RecordMsgFileUI", "cur mediaid[%s], notify mediaid[%s]", this.f272595t, nVar.field_mediaId);
        if (this.f272595t.equals(nVar.field_mediaId)) {
            int i2 = nVar.field_status;
            if (i2 == 2) {
                this.f272593r.post(new RecordMsgFileUI$$d(this));
                mo129690N7(nVar, true);
                mo129692P7(0, 2);
                C117407d.INSTANCE.idkeyStat(1203, 5, this.f272596u.f299276R, false);
            } else if (i2 == 3) {
                this.f272593r.post(new RecordMsgFileUI$$f(this));
                mo129690N7(nVar, false);
                mo129692P7(1, 4);
            } else if (i2 != 4) {
                mo129693Q7(nVar);
            } else {
                mo129690N7(nVar, false);
                this.f272593r.post(new RecordMsgFileUI$$e(this));
                mo129692P7(1, 3);
            }
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        ((C22921c) C86312j.m106911c(C22921c.class)).mo35885Yc(this, i, i2, intent, true, C0966R.string.c1b, C0966R.string.c1c, 5);
        if (i2 == -1 && i == 1001) {
            String str = null;
            String stringExtra = intent == null ? null : intent.getStringExtra("Select_Conv_User");
            if (intent != null) {
                str = intent.getStringExtra("custom_send_text");
            }
            C89779i0 Q = C76879j.m92723Q(getContext(), "", getString(C0966R.string.col), true, false, (DialogInterface.OnCancelListener) null);
            Log.m105919d("MicroMsg.RecordMsgFileUI", "do share msg, fav msg type %d", Integer.valueOf(mo129684H7()));
            RecordMsgFileUI$$m recordMsgFileUI$$m = new RecordMsgFileUI$$m(this, Q);
            if (!Util.isNullOrNil(stringExtra)) {
                ArrayList<String> stringsToList = Util.stringsToList(stringExtra.split(","));
                if (mo129684H7() == 4 || mo129684H7() == 15) {
                    C86709a0.m107525e().postToWorker(new RecordMsgFileUI$$n(this, stringsToList, str, recordMsgFileUI$$m));
                } else {
                    C86709a0.m107525e().postToWorker(new RecordMsgFileUI$$b(this, stringsToList, str, recordMsgFileUI$$m));
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        Class cls = C100336e.class;
        super.onCreate(bundle);
        this.f272599x = new C101141g0();
        this.f272594s = getIntent().getLongExtra("message_id", -1);
        this.f272597v = ((C72972g4) ((C75700k0) C86709a0.m107533q(C75700k0.class)).mo96095LE()).b00(this.f272594s);
        String stringExtra = getIntent().getStringExtra("record_data_id");
        if (this.f272597v == null) {
            Log.m105928w("MicroMsg.RecordMsgFileUI", "get record msg data error, msg null");
            finish();
            return;
        }
        C101834rc0 k = C101147j0.m132630k(getIntent().getStringExtra("record_xml"), stringExtra);
        this.f272596u = k;
        if (k == null) {
            C68070l.C68072b u = C68070l.C68072b.m80422u(this.f272597v.getContent(), this.f272597v.mo108775z2());
            if (u == null) {
                Log.m105928w("MicroMsg.RecordMsgFileUI", "get record msg data error, content null");
                finish();
                return;
            }
            this.f272596u = C101147j0.m132630k(u.f195571f0, stringExtra);
        }
        C101834rc0 rc02 = this.f272596u;
        if (rc02 == null) {
            Log.m105928w("MicroMsg.RecordMsgFileUI", "get data error, empty");
            finish();
            return;
        }
        this.f272595t = C101147j0.m132641v(rc02.f299280T, this.f272594s, true);
        this.f272582d = (Button) findViewById(C0966R.C0970id.f358953i20);
        this.f272583e = (Button) findViewById(C0966R.C0970id.hma);
        this.f272584f = (Button) findViewById(C0966R.C0970id.c9o);
        this.f272585g = (MMImageView) findViewById(C0966R.C0970id.f2a);
        this.f272586h = (TextView) findViewById(C0966R.C0970id.h_d);
        this.f272587i = (TextView) findViewById(C0966R.C0970id.knp);
        this.f272591p = findViewById(C0966R.C0970id.c_h);
        this.f272590o = findViewById(C0966R.C0970id.c_c);
        this.f272588j = (ProgressBar) findViewById(C0966R.C0970id.c_a);
        this.f272589n = (TextView) findViewById(C0966R.C0970id.c_e);
        if (4 == mo129684H7()) {
            setMMTitle((int) C0966R.string.cs8);
        } else if (15 == mo129684H7()) {
            setMMTitle((int) C0966R.string.crc);
            findViewById(C0966R.C0970id.f359485l50).setBackgroundResource(C0966R.color.f3131gg);
        } else {
            setMMTitle((int) C0966R.string.coj);
        }
        if (mo129684H7() == 4) {
            this.f272585g.setImageResource(C0966R.raw.app_attach_file_icon_video);
        } else {
            this.f272585g.setImageResource(C102430l.m135146a(this.f272596u.f299262K));
        }
        this.f272586h.setText(this.f272596u.f299297d);
        setBackBtn(new RecordMsgFileUI$$g(this));
        this.f272583e.setOnClickListener(new RecordMsgFileUI$$h(this));
        String str = this.f272596u.f299242A;
        if (!Util.isNullOrNil(str)) {
            this.f272582d.setOnClickListener(new RecordMsgFileUI$$i(this, str));
        }
        this.f272584f.setOnClickListener(new RecordMsgFileUI$$j(this));
        this.f272591p.setOnClickListener(new RecordMsgFileUI$$k(this));
        Class cls2 = C92331c.class;
        AbsHandOffFile NN = ((C92087b) C86312j.m106911c(C92087b.class)).mo126070NN(this.f272596u, (String) null, ((C72972g4) C97625j3.m125812b().mo105911z()).b00(this.f272594s), ((C102712e) C86312j.m106911c(C102712e.class)).mo142091L2((C101834rc0) null));
        this.f272598w = NN;
        NN.setSource(1);
        this.f272598w.setFileStatus(C101147j0.m132614G(this.f272596u, this.f272594s) ? 1 : 2);
        ((C92331c) C86312j.m106911c(cls2)).mo58375rt(this.f272598w);
        ((C92331c) C86312j.m106911c(cls2)).mo58377tt(this.f272598w);
        if (mo129684H7() != 15 || Util.safeParseInt(((C10485b) C86709a0.m107533q(C10485b.class)).vh0().mo107405c("SightForwardEnable")) == 1) {
            addIconOptionMenu(0, C0966R.raw.icons_outlined_more, new C94366k(this));
        } else {
            Log.m105928w("MicroMsg.RecordMsgFileUI", "can not retransmit sight msg");
        }
        boolean z = Util.isNullOrNil(this.f272596u.f299325s) || Util.isNullOrNil(this.f272596u.f299329u);
        boolean z2 = Util.isNullOrNil(this.f272596u.f299342z1) || Util.isNullOrNil(this.f272596u.f299337x1);
        if (z && z2) {
            mo129688L7();
        } else if (C101147j0.m132614G(this.f272596u, this.f272594s)) {
            enableOptionMenu(true);
            mo129687K7();
        } else {
            C100344n qq = ((C101136b0) ((C100336e) C86312j.m106911c(cls)).mo139410hi()).mo140585qq(this.f272595t);
            if (qq == null || 2 == (i = qq.field_status)) {
                mo129689M7();
            } else if (4 == i) {
                mo129688L7();
            } else if (i == 0 || 1 == i) {
                mo129686J7();
            } else {
                Log.m105928w("MicroMsg.RecordMsgFileUI", "other status, not done, downloading, uploading, downloadfail, uploadfail");
                mo129689M7();
            }
            enableOptionMenu(false);
        }
        ((C101136b0) ((C100336e) C86312j.m106911c(cls)).mo139410hi()).mo140583jo(this);
        ((C63287k) C86312j.m106911c(C63287k.class)).mo88185wy(this.f272581D);
        if (8 == mo129684H7()) {
            ((C98591h) C86312j.m106911c(C98591h.class)).Fn0(stringExtra, this.f272597v.mo108774y2(), this.f272579B);
        }
        mo129692P7(4, 0);
    }

    public void onDestroy() {
        C96875r0 r0Var = this.f272592q;
        if (r0Var != null) {
            r0Var.setVideoCallback((C96875r0.C96876a) null);
            this.f272592q.stop();
            this.f272592q.onDetach();
            if (C97625j3.m125813c() != null) {
                ((C92614a) C97625j3.m125813c()).mo126635b();
            }
        }
        super.onDestroy();
        ((C101136b0) ((C100336e) C86312j.m106911c(C100336e.class)).mo139410hi()).mo140582bD(this);
        ((C63287k) C86312j.m106911c(C63287k.class)).mo88181kj(this.f272581D);
        if (this.f272598w != null) {
            ((C92331c) C86312j.m106911c(C92331c.class)).A70(this.f272598w);
        }
        this.f272599x.mo140590f();
    }

    public void onPause() {
        super.onPause();
        C96875r0 r0Var = this.f272592q;
        if (r0Var != null) {
            r0Var.stop();
        }
    }

    public void onResume() {
        super.onResume();
        C96875r0 r0Var = this.f272592q;
        if (r0Var != null) {
            r0Var.start();
        }
    }
}
