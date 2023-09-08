package com.tencent.p014mm.plugin.subapp.p109ui.voicetranstext;

import android.database.Cursor;
import android.os.Bundle;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.ActionBar;
import androidx.exifinterface.media.ExifInterface;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.app.C40008f;
import com.tencent.p014mm.autogen.events.NotifyCanPullVoiceTransResEvent;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.sdk.event.IEvent;
import com.tencent.p014mm.sdk.event.IListener;
import com.tencent.p014mm.sdk.platformtools.ClipboardHelper;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.MTimerHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import com.tencent.p014mm.sdk.storage.ISQLiteDatabase;
import com.tencent.p014mm.storage.C30745h5;
import com.tencent.p014mm.storage.C30747i5;
import com.tencent.p014mm.storage.C72963f4;
import com.tencent.p014mm.storage.C72972g4;
import eb0.C97625j3;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import kd0.C76546u;
import kd0.C76550x;
import kd0.C76551y;
import nj3.C76879j;
import ob0.C11385n;
import ob0.C117747y;
import ob0.C89137b0;
import te3.C50147kl3;
import te3.rt4;
import te3.yn4;

/* renamed from: com.tencent.mm.plugin.subapp.ui.voicetranstext.VoiceTransTextUI */
public class VoiceTransTextUI extends MMActivity implements C11385n, View.OnClickListener {

    /* renamed from: L */
    public static final /* synthetic */ int f206382L = 0;

    /* renamed from: A */
    public int f206383A;

    /* renamed from: B */
    public int f206384B;

    /* renamed from: C */
    public int f206385C;

    /* renamed from: D */
    public boolean f206386D = false;

    /* renamed from: E */
    public boolean f206387E = false;

    /* renamed from: F */
    public long f206388F = 0;

    /* renamed from: G */
    public int f206389G;

    /* renamed from: H */
    public View.OnTouchListener f206390H;

    /* renamed from: I */
    public View.OnClickListener f206391I = new C5517a();

    /* renamed from: J */
    public View.OnLongClickListener f206392J = new C71296b();

    /* renamed from: K */
    public MMHandler f206393K = new C71299d();

    /* renamed from: d */
    public View f206394d = null;

    /* renamed from: e */
    public View f206395e = null;

    /* renamed from: f */
    public View f206396f = null;

    /* renamed from: g */
    public LinearLayout f206397g = null;

    /* renamed from: h */
    public TextView f206398h = null;

    /* renamed from: i */
    public Button f206399i = null;

    /* renamed from: j */
    public ScrollView f206400j = null;

    /* renamed from: n */
    public C43182a f206401n;

    /* renamed from: o */
    public C43184c f206402o;

    /* renamed from: p */
    public C43183b f206403p;

    /* renamed from: q */
    public volatile boolean f206404q = false;

    /* renamed from: r */
    public MTimerHandler f206405r;

    /* renamed from: s */
    public int f206406s = 6;

    /* renamed from: t */
    public boolean f206407t = false;

    /* renamed from: u */
    public boolean f206408u = false;

    /* renamed from: v */
    public long f206409v;

    /* renamed from: w */
    public C76551y f206410w;

    /* renamed from: x */
    public C30745h5 f206411x;

    /* renamed from: y */
    public C72963f4 f206412y;

    /* renamed from: z */
    public IListener f206413z;

    /* renamed from: com.tencent.mm.plugin.subapp.ui.voicetranstext.VoiceTransTextUI$a */
    public class C5517a implements View.OnClickListener {
        public C5517a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/voicetranstext/VoiceTransTextUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            VoiceTransTextUI.this.finish();
            C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/voicetranstext/VoiceTransTextUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.voicetranstext.VoiceTransTextUI$b */
    public class C71296b implements View.OnLongClickListener {

        /* renamed from: com.tencent.mm.plugin.subapp.ui.voicetranstext.VoiceTransTextUI$b$a */
        public class C71297a implements C76879j.C11180n {
            public C71297a() {
            }

            /* renamed from: j */
            public void mo782j(int i) {
                TextView textView;
                if (i == 0 && (textView = VoiceTransTextUI.this.f206398h) != null) {
                    ClipboardHelper.setText(textView.getText());
                }
            }
        }

        public C71296b() {
        }

        public boolean onLongClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/voicetranstext/VoiceTransTextUI$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
            Log.m105918d("MicroMsg.VoiceTransTextUI", "onLongClick");
            VoiceTransTextUI voiceTransTextUI = VoiceTransTextUI.this;
            C76879j.m92736g(voiceTransTextUI, "", new String[]{voiceTransTextUI.getString(C0966R.string.f7936wt)}, "", new C71297a());
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/subapp/ui/voicetranstext/VoiceTransTextUI$2", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.voicetranstext.VoiceTransTextUI$c */
    public class C71298c implements View.OnTouchListener {
        public C71298c() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            arrayList.add(motionEvent);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/voicetranstext/VoiceTransTextUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
            int action = motionEvent.getAction();
            if (action == 0) {
                VoiceTransTextUI voiceTransTextUI = VoiceTransTextUI.this;
                int i = VoiceTransTextUI.f206382L;
                voiceTransTextUI.getClass();
                voiceTransTextUI.f206388F = Util.currentTicks();
                VoiceTransTextUI.this.f206383A = view.getScrollY();
                VoiceTransTextUI voiceTransTextUI2 = VoiceTransTextUI.this;
                voiceTransTextUI2.f206384B = voiceTransTextUI2.f206383A;
                voiceTransTextUI2.f206393K.removeMessages(0);
                VoiceTransTextUI voiceTransTextUI3 = VoiceTransTextUI.this;
                if (voiceTransTextUI3.f206386D) {
                    voiceTransTextUI3.f206386D = false;
                    voiceTransTextUI3.f206387E = true;
                }
            } else if (action == 1 || action == 3 || action == 4) {
                int abs = Math.abs(VoiceTransTextUI.this.f206384B - view.getScrollY());
                VoiceTransTextUI voiceTransTextUI4 = VoiceTransTextUI.this;
                if (abs > voiceTransTextUI4.f206385C) {
                    MMHandler mMHandler = voiceTransTextUI4.f206393K;
                    mMHandler.sendMessage(mMHandler.obtainMessage(0, view));
                }
                VoiceTransTextUI voiceTransTextUI5 = VoiceTransTextUI.this;
                voiceTransTextUI5.getClass();
                if (Util.currentTicks() - voiceTransTextUI5.f206388F < 800) {
                    int abs2 = Math.abs(VoiceTransTextUI.this.f206384B - view.getScrollY());
                    VoiceTransTextUI voiceTransTextUI6 = VoiceTransTextUI.this;
                    if (abs2 <= voiceTransTextUI6.f206385C && !voiceTransTextUI6.f206387E) {
                        voiceTransTextUI6.f206393K.removeMessages(0);
                        VoiceTransTextUI voiceTransTextUI7 = VoiceTransTextUI.this;
                        voiceTransTextUI7.f206383A = 0;
                        voiceTransTextUI7.f206384B = 0;
                        voiceTransTextUI7.f206386D = false;
                        voiceTransTextUI7.f206387E = false;
                        voiceTransTextUI7.f206393K.removeMessages(0);
                        VoiceTransTextUI.this.finish();
                    }
                }
                VoiceTransTextUI.this.f206387E = false;
            }
            C117292a.m165362h(false, this, "com/tencent/mm/plugin/subapp/ui/voicetranstext/VoiceTransTextUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.voicetranstext.VoiceTransTextUI$d */
    public class C71299d extends MMHandler {
        public C71299d() {
        }

        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                VoiceTransTextUI voiceTransTextUI = VoiceTransTextUI.this;
                int i2 = VoiceTransTextUI.f206382L;
                voiceTransTextUI.mo98153I7(true);
            } else if (i == 2) {
                VoiceTransTextUI voiceTransTextUI2 = VoiceTransTextUI.this;
                int i3 = VoiceTransTextUI.f206382L;
                voiceTransTextUI2.mo98153I7(false);
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.voicetranstext.VoiceTransTextUI$e */
    public class C71300e implements Runnable {

        /* renamed from: d */
        public final /* synthetic */ boolean f206419d;

        public C71300e(boolean z) {
            this.f206419d = z;
        }

        public void run() {
            if (VoiceTransTextUI.this.f206400j.getMeasuredHeight() >= VoiceTransTextUI.this.f206397g.getMeasuredHeight()) {
                VoiceTransTextUI.this.f206400j.fullScroll(130);
                int scrollY = VoiceTransTextUI.this.f206400j.getScrollY();
                VoiceTransTextUI voiceTransTextUI = VoiceTransTextUI.this;
                voiceTransTextUI.f206389G = voiceTransTextUI.f206400j.getPaddingTop();
                VoiceTransTextUI voiceTransTextUI2 = VoiceTransTextUI.this;
                int i = voiceTransTextUI2.f206389G - scrollY;
                voiceTransTextUI2.f206389G = i;
                if (this.f206419d) {
                    voiceTransTextUI2.f206400j.setPadding(0, 0, 0, 0);
                    VoiceTransTextUI.this.f206399i.setVisibility(8);
                    VoiceTransTextUI.this.f206399i.setHeight(0);
                } else if (i > 0) {
                    voiceTransTextUI2.f206400j.setPadding(0, i, 0, 0);
                }
            }
        }
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.voicetranstext.VoiceTransTextUI$f */
    public enum C71301f {
        CHECK,
        UPLOAD,
        UPLOAD_MORE,
        GET
    }

    /* renamed from: com.tencent.mm.plugin.subapp.ui.voicetranstext.VoiceTransTextUI$g */
    public enum C71302g {
        done,
        loading,
        fail
    }

    /* renamed from: H7 */
    public final void mo98152H7() {
        Log.m105918d("MicroMsg.VoiceTransTextUI", "cancel all net");
        if (this.f206401n != null) {
            C97625j3.m125815e().mo123458d(this.f206401n);
            C89137b0 e = C97625j3.m125815e();
            this.f206401n.getClass();
            e.mo123470p(546, this);
        }
        if (this.f206402o != null) {
            C97625j3.m125815e().mo123458d(this.f206402o);
            C89137b0 e2 = C97625j3.m125815e();
            this.f206402o.getClass();
            e2.mo123470p(547, this);
        }
        if (this.f206403p != null) {
            C97625j3.m125815e().mo123458d(this.f206403p);
            C89137b0 e3 = C97625j3.m125815e();
            this.f206403p.getClass();
            e3.mo123470p(548, this);
        }
    }

    /* renamed from: I7 */
    public final void mo98153I7(boolean z) {
        if (this.f206400j != null && this.f206397g != null) {
            this.f206393K.postDelayed(new C71300e(z), 5);
        }
    }

    /* renamed from: J7 */
    public final String mo98154J7() {
        C76551y yVar = this.f206410w;
        if (yVar != null) {
            return yVar.f224053d;
        }
        return this.f206412y.mo108768t() + this.f206412y.getMsgId() + ExifInterface.GPS_DIRECTION_TRUE + this.f206412y.getCreateTime();
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038 A[Catch:{ all -> 0x001a, all -> 0x0050, all -> 0x004f }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x003e A[SYNTHETIC, Splitter:B:15:0x003e] */
    /* renamed from: K7 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo98155K7() {
        /*
            r6 = this;
            java.lang.Class<dn.t> r0 = p492dn.C75415t.class
            java.lang.String r1 = "MicroMsg.VoiceTransTextUI"
            r2 = -1
            r3 = 0
            kd0.y r4 = r6.f206410w     // Catch:{ all -> 0x001a }
            if (r4 == 0) goto L_0x001c
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x001a }
            dn.t r0 = (p492dn.C75415t) r0     // Catch:{ all -> 0x001a }
            kd0.y r4 = r6.f206410w     // Catch:{ all -> 0x001a }
            java.lang.String r4 = r4.f224051b     // Catch:{ all -> 0x001a }
            kd0.d r0 = r0.w20(r4)     // Catch:{ all -> 0x001a }
        L_0x0018:
            r3 = r0
            goto L_0x0036
        L_0x001a:
            r0 = move-exception
            goto L_0x0042
        L_0x001c:
            com.tencent.mm.storage.f4 r4 = r6.f206412y     // Catch:{ all -> 0x001a }
            if (r4 == 0) goto L_0x0031
            di3.d r0 = di3.C86312j.m106911c(r0)     // Catch:{ all -> 0x001a }
            dn.t r0 = (p492dn.C75415t) r0     // Catch:{ all -> 0x001a }
            com.tencent.mm.storage.f4 r4 = r6.f206412y     // Catch:{ all -> 0x001a }
            java.lang.String r4 = r4.mo108765s2()     // Catch:{ all -> 0x001a }
            kd0.d r0 = r0.w20(r4)     // Catch:{ all -> 0x001a }
            goto L_0x0018
        L_0x0031:
            java.lang.String r0 = "error why get fileOperator, already has transContent. "
            com.tencent.p014mm.sdk.platformtools.Log.m105918d(r1, r0)     // Catch:{ all -> 0x001a }
        L_0x0036:
            if (r3 == 0) goto L_0x003c
            int r2 = r3.getFormat()     // Catch:{ all -> 0x001a }
        L_0x003c:
            if (r3 == 0) goto L_0x0041
            r3.mo106769b()     // Catch:{ all -> 0x0041 }
        L_0x0041:
            return r2
        L_0x0042:
            java.lang.String r4 = "[-] Fail to get format of amr file."
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ all -> 0x0050 }
            com.tencent.p014mm.sdk.platformtools.Log.printErrStackTrace(r1, r0, r4, r5)     // Catch:{ all -> 0x0050 }
            if (r3 == 0) goto L_0x004f
            r3.mo106769b()     // Catch:{ all -> 0x004f }
        L_0x004f:
            return r2
        L_0x0050:
            r0 = move-exception
            if (r3 == 0) goto L_0x0056
            r3.mo106769b()     // Catch:{ all -> 0x0056 }
        L_0x0056:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.p014mm.plugin.subapp.p109ui.voicetranstext.VoiceTransTextUI.mo98155K7():int");
    }

    /* renamed from: L7 */
    public final void mo98156L7(String str) {
        this.f206407t = true;
        if (!Util.isNullOrNil(str)) {
            C30747i5 wx02 = C76546u.wx0();
            C30745h5 h5Var = new C30745h5();
            h5Var.field_msgId = this.f206409v;
            String J7 = mo98154J7();
            if (!Util.isNullOrNil(J7)) {
                h5Var.field_cmsgId = J7;
            }
            h5Var.field_content = str;
            wx02.insert(h5Var);
        }
        mo98158N7(C71302g.done, str);
    }

    /* renamed from: M7 */
    public final void mo98157M7(C71301f fVar) {
        mo98152H7();
        int ordinal = fVar.ordinal();
        if (ordinal == 0) {
            Log.m105924i("MicroMsg.VoiceTransTextUI", "net check");
            C76551y yVar = this.f206410w;
            long j = -1;
            if ((yVar == null ? -1 : yVar.f224054e) > 0) {
                Object[] objArr = new Object[1];
                objArr[0] = Long.valueOf(yVar == null ? -1 : yVar.f224054e);
                Log.m105925i("MicroMsg.VoiceTransTextUI", "has msg svr id: %d", objArr);
                String J7 = mo98154J7();
                C76551y yVar2 = this.f206410w;
                int d = yVar2 != null ? yVar2.f224057h : C76550x.m92055d(this.f206412y.mo108765s2());
                int K7 = mo98155K7();
                C76551y yVar3 = this.f206410w;
                if (yVar3 != null) {
                    j = yVar3.f224054e;
                }
                this.f206401n = new C43182a(J7, d, K7, j, yVar3 != null ? yVar3.f224051b : this.f206412y.mo108765s2());
            } else {
                Object[] objArr2 = new Object[1];
                if (yVar != null) {
                    j = yVar.f224054e;
                }
                objArr2[0] = Long.valueOf(j);
                Log.m105925i("MicroMsg.VoiceTransTextUI", "not existex msg svr id: %d", objArr2);
                String J72 = mo98154J7();
                C76551y yVar4 = this.f206410w;
                int d2 = yVar4 != null ? yVar4.f224057h : C76550x.m92055d(this.f206412y.mo108765s2());
                C76551y yVar5 = this.f206410w;
                this.f206401n = new C43182a(J72, d2, yVar5 != null ? yVar5.f224051b : this.f206412y.mo108765s2());
            }
            C97625j3.m125815e().mo123460f(this.f206401n);
            C89137b0 e = C97625j3.m125815e();
            this.f206401n.getClass();
            e.mo123455a(546, this);
            IListener iListener = this.f206413z;
            if (iListener == null) {
                if (iListener == null) {
                    this.f206413z = new IListener<NotifyCanPullVoiceTransResEvent>(C40008f.f107254d) {
                        {
                            this.__eventId = 2039482412;
                        }

                        public boolean callback(IEvent iEvent) {
                            NotifyCanPullVoiceTransResEvent notifyCanPullVoiceTransResEvent = (NotifyCanPullVoiceTransResEvent) iEvent;
                            Log.m105924i("MicroMsg.VoiceTransTextUI", "receive notify, process----> may be pass.");
                            VoiceTransTextUI voiceTransTextUI = VoiceTransTextUI.this;
                            C43182a aVar = voiceTransTextUI.f206401n;
                            if (aVar == null || voiceTransTextUI.f206407t || !(notifyCanPullVoiceTransResEvent instanceof NotifyCanPullVoiceTransResEvent) || notifyCanPullVoiceTransResEvent.f193749d.f193750a != aVar.f116848t) {
                                return false;
                            }
                            Log.m105924i("MicroMsg.VoiceTransTextUI", "");
                            if (VoiceTransTextUI.this.f206404q) {
                                Log.m105924i("MicroMsg.VoiceTransTextUI", "has new result! but need wait. so, wait.");
                                VoiceTransTextUI.this.f206408u = true;
                                return false;
                            }
                            new MMHandler(VoiceTransTextUI.this.getMainLooper()).post(new C71304f(this));
                            return false;
                        }
                    };
                }
                this.f206413z.alive();
            }
        } else if (ordinal == 1) {
            Log.m105924i("MicroMsg.VoiceTransTextUI", "net upload");
            if (this.f206401n == null) {
                Log.m105920e("MicroMsg.VoiceTransTextUI", "request upload must after check!");
            } else if (mo98155K7() == -1) {
                Log.m105920e("MicroMsg.VoiceTransTextUI", "can't get format!");
            } else {
                String J73 = mo98154J7();
                yn4 yn4 = this.f206401n.f116846r;
                int K72 = mo98155K7();
                C76551y yVar6 = this.f206410w;
                this.f206402o = new C43184c(J73, yn4, K72, yVar6 != null ? yVar6.f224051b : this.f206412y.mo108765s2());
                C97625j3.m125815e().mo123460f(this.f206402o);
                C89137b0 e2 = C97625j3.m125815e();
                this.f206402o.getClass();
                e2.mo123455a(547, this);
            }
        } else if (ordinal == 2) {
            Log.m105924i("MicroMsg.VoiceTransTextUI", "net upload more");
            C43184c cVar = this.f206402o;
            if (cVar == null) {
                Log.m105918d("MicroMsg.VoiceTransTextUI", "upload more need has upload netScene!");
                return;
            }
            this.f206402o = new C43184c(cVar);
            C97625j3.m125815e().mo123460f(this.f206402o);
            C89137b0 e3 = C97625j3.m125815e();
            this.f206402o.getClass();
            e3.mo123455a(547, this);
        } else if (ordinal == 3) {
            this.f206408u = false;
            if (this.f206404q) {
                Log.m105924i("MicroMsg.VoiceTransTextUI", "pulling so pass");
                return;
            }
            Log.m105924i("MicroMsg.VoiceTransTextUI", "net get");
            if (this.f206401n == null) {
                Log.m105918d("MicroMsg.VoiceTransTextUI", "request get must after check!");
                return;
            }
            this.f206404q = true;
            this.f206403p = new C43183b(mo98154J7());
            C97625j3.m125815e().mo123460f(this.f206403p);
            C89137b0 e4 = C97625j3.m125815e();
            this.f206403p.getClass();
            e4.mo123455a(548, this);
        }
    }

    /* renamed from: N7 */
    public final void mo98158N7(C71302g gVar, String str) {
        C71302g gVar2 = gVar;
        String str2 = str;
        C71302g gVar3 = C71302g.fail;
        int ordinal = gVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                this.f206397g.setVisibility(0);
                View view = this.f206395e;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/subapp/ui/voicetranstext/VoiceTransTextUI", "switchUI", "(Lcom/tencent/mm/plugin/subapp/ui/voicetranstext/VoiceTransTextUI$uiState;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/subapp/ui/voicetranstext/VoiceTransTextUI", "switchUI", "(Lcom/tencent/mm/plugin/subapp/ui/voicetranstext/VoiceTransTextUI$uiState;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f206399i.setVisibility(0);
                if (str2 != null) {
                    this.f206398h.setText(str2);
                    mo98153I7(false);
                }
            } else if (ordinal == 2) {
                this.f206397g.setVisibility(8);
                View view3 = this.f206395e;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/subapp/ui/voicetranstext/VoiceTransTextUI", "switchUI", "(Lcom/tencent/mm/plugin/subapp/ui/voicetranstext/VoiceTransTextUI$uiState;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/subapp/ui/voicetranstext/VoiceTransTextUI", "switchUI", "(Lcom/tencent/mm/plugin/subapp/ui/voicetranstext/VoiceTransTextUI$uiState;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                this.f206399i.setHeight(0);
                this.f206399i.setVisibility(8);
                View view5 = this.f206396f;
                C9556a aVar3 = new C9556a();
                aVar3.mo10233c(0);
                View view6 = view5;
                C117292a.m165358d(view6, aVar3.mo10232b(), "com/tencent/mm/plugin/subapp/ui/voicetranstext/VoiceTransTextUI", "switchUI", "(Lcom/tencent/mm/plugin/subapp/ui/voicetranstext/VoiceTransTextUI$uiState;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view6, "com/tencent/mm/plugin/subapp/ui/voicetranstext/VoiceTransTextUI", "switchUI", "(Lcom/tencent/mm/plugin/subapp/ui/voicetranstext/VoiceTransTextUI$uiState;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (Util.isNullOrNil(str)) {
            mo98158N7(gVar3, (String) null);
            return;
        } else {
            this.f206397g.setVisibility(0);
            View view7 = this.f206395e;
            C9556a aVar4 = new C9556a();
            ThreadLocal<C9556a> threadLocal3 = C60958c.f173611a;
            aVar4.mo10233c(8);
            View view8 = view7;
            C117292a.m165358d(view8, aVar4.mo10232b(), "com/tencent/mm/plugin/subapp/ui/voicetranstext/VoiceTransTextUI", "switchUI", "(Lcom/tencent/mm/plugin/subapp/ui/voicetranstext/VoiceTransTextUI$uiState;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
            C117292a.m165359e(view8, "com/tencent/mm/plugin/subapp/ui/voicetranstext/VoiceTransTextUI", "switchUI", "(Lcom/tencent/mm/plugin/subapp/ui/voicetranstext/VoiceTransTextUI$uiState;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f206399i.setVisibility(4);
            View view9 = this.f206396f;
            C9556a aVar5 = new C9556a();
            aVar5.mo10233c(8);
            View view10 = view9;
            C117292a.m165358d(view10, aVar5.mo10232b(), "com/tencent/mm/plugin/subapp/ui/voicetranstext/VoiceTransTextUI", "switchUI", "(Lcom/tencent/mm/plugin/subapp/ui/voicetranstext/VoiceTransTextUI$uiState;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((Integer) aVar5.mo10231a(0)).intValue());
            C117292a.m165359e(view10, "com/tencent/mm/plugin/subapp/ui/voicetranstext/VoiceTransTextUI", "switchUI", "(Lcom/tencent/mm/plugin/subapp/ui/voicetranstext/VoiceTransTextUI$uiState;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f206398h.setText(str2);
            mo98153I7(true);
        }
        if (gVar2 == C71302g.done || gVar2 == gVar3) {
            this.f206400j.setOnTouchListener(this.f206390H);
            this.f206394d.setOnClickListener(this.f206391I);
            return;
        }
        this.f206400j.setOnTouchListener((View.OnTouchListener) null);
        this.f206394d.setOnClickListener((View.OnClickListener) null);
    }

    public int getLayoutId() {
        return C0966R.C0971layout.cct;
    }

    public void initView() {
        boolean z;
        setMMTitle((int) C0966R.string.kea);
        this.f206399i.setOnClickListener(this);
        C30745h5 h5Var = this.f206411x;
        if (h5Var == null || Util.isNullOrNil(h5Var.field_content)) {
            z = false;
        } else {
            mo98158N7(C71302g.done, this.f206411x.field_content);
            if (!(this.f206400j == null || this.f206397g == null)) {
                this.f206393K.postDelayed(new C71305g(this), 5);
            }
            z = true;
        }
        if (!z) {
            mo98158N7(C71302g.loading, (String) null);
            mo98157M7(C71301f.CHECK);
        }
    }

    public void onClick(View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(view);
        Object[] array = arrayList.toArray();
        arrayList.clear();
        C117292a.m165356b("com/tencent/mm/plugin/subapp/ui/voicetranstext/VoiceTransTextUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        finish();
        C117292a.m165361g(this, "com/tencent/mm/plugin/subapp/ui/voicetranstext/VoiceTransTextUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void onCreate(Bundle bundle) {
        C30745h5 h5Var;
        super.onCreate(bundle);
        this.f206385C = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f206394d = findViewById(C0966R.C0970id.lbx);
        this.f206395e = findViewById(C0966R.C0970id.lbo);
        this.f206396f = findViewById(C0966R.C0970id.lbu);
        this.f206398h = (TextView) findViewById(C0966R.C0970id.lbs);
        this.f206399i = (Button) findViewById(C0966R.C0970id.lbq);
        this.f206397g = (LinearLayout) findViewById(C0966R.C0970id.lbt);
        this.f206400j = (ScrollView) findViewById(C0966R.C0970id.f358335eh1);
        this.f206390H = new C71298c();
        this.f206398h.setOnLongClickListener(this.f206392J);
        this.f206398h.setOnClickListener(this.f206391I);
        long j = getIntent().getExtras().getLong("voice_trans_text_msg_id", -1);
        this.f206409v = j;
        boolean z = false;
        if (j >= 0) {
            Log.m105925i("MicroMsg.VoiceTransTextUI", "msg Id:%d", Long.valueOf(j));
            C30747i5 wx02 = C76546u.wx0();
            long j2 = this.f206409v;
            wx02.getClass();
            if (j2 < 0) {
                h5Var = null;
            } else {
                C30745h5 h5Var2 = new C30745h5();
                ISQLiteDatabase iSQLiteDatabase = wx02.f82689d;
                Cursor query = iSQLiteDatabase.query("VoiceTransText", (String[]) null, "msgId=?", new String[]{"" + j2}, (String) null, (String) null, (String) null, 2);
                if (query.moveToFirst()) {
                    h5Var2.convertFrom(query);
                }
                query.close();
                h5Var = h5Var2;
            }
            this.f206411x = h5Var;
            if (h5Var == null || Util.isNullOrNil(h5Var.field_content)) {
                String string = getIntent().getExtras().getString("voice_trans_text_img_path");
                if (!Util.isNullOrNil(string)) {
                    C76551y jo = C76546u.yx0().mo106785jo(string);
                    this.f206410w = jo;
                    if (jo != null) {
                        Log.m105924i("MicroMsg.VoiceTransTextUI", "get voiceInfo");
                    } else {
                        this.f206412y = ((C72972g4) C97625j3.m125812b().mo105911z()).b00(this.f206409v);
                        Log.m105924i("MicroMsg.VoiceTransTextUI", "get MsgInfo");
                    }
                }
            } else {
                Log.m105924i("MicroMsg.VoiceTransTextUI", "get voiceTransText");
            }
            z = true;
        }
        if (!z) {
            Log.m105918d("MicroMsg.VoiceTransTextUI", "error invalid msgId");
            return;
        }
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo91104o();
        }
        initView();
    }

    public void onDestroy() {
        mo98152H7();
        MTimerHandler mTimerHandler = this.f206405r;
        if (mTimerHandler != null) {
            mTimerHandler.stopTimer();
        }
        IListener iListener = this.f206413z;
        if (iListener != null) {
            iListener.dead();
            this.f206413z = null;
        }
        super.onDestroy();
    }

    public void onSceneEnd(int i, int i2, String str, C117747y yVar) {
        C71302g gVar = C71302g.loading;
        C71301f fVar = C71301f.GET;
        boolean z = true;
        String str2 = null;
        if (i == 0 && i2 == 0) {
            switch (yVar.getType()) {
                case 546:
                    C43182a aVar = this.f206401n;
                    int i3 = aVar.f116845q;
                    if (i3 == 3) {
                        Log.m105924i("MicroMsg.VoiceTransTextUI", "check result: done");
                        rt4 rt4 = this.f206401n.f116844p;
                        if (rt4 == null || Util.isNullOrNil(rt4.f141148f)) {
                            z = false;
                        }
                        if (z) {
                            str2 = this.f206401n.f116844p.f141148f;
                        }
                        mo98156L7(str2);
                        return;
                    } else if (i3 == 2) {
                        rt4 rt42 = aVar.f116844p;
                        if (rt42 != null && Util.isNullOrNil(rt42.f141148f)) {
                            mo98158N7(gVar, this.f206401n.f116844p.f141148f);
                        }
                        Log.m105924i("MicroMsg.VoiceTransTextUI", "check result: processing");
                        mo98157M7(fVar);
                        return;
                    } else if (i3 == 1) {
                        Log.m105924i("MicroMsg.VoiceTransTextUI", "check result: not exist");
                        mo98157M7(C71301f.UPLOAD);
                        return;
                    } else {
                        C50147kl3 kl32 = aVar.f116847s;
                        if (kl32 != null) {
                            this.f206406s = kl32.f136881d;
                            return;
                        }
                        return;
                    }
                case 547:
                    yn4 yn4 = this.f206402o.f116856f;
                    if (yn4 == null || yn4.f145425f <= 0) {
                        Log.m105924i("MicroMsg.VoiceTransTextUI", "succeed upload");
                        mo98157M7(fVar);
                        return;
                    }
                    Log.m105919d("MicroMsg.VoiceTransTextUI", "start upload more: start:%d, len:%d", Integer.valueOf(yn4.f145424e), Integer.valueOf(this.f206402o.f116856f.f145425f));
                    mo98157M7(C71301f.UPLOAD_MORE);
                    return;
                case 548:
                    this.f206406s = this.f206403p.f116852g;
                    this.f206404q = false;
                    C43183b bVar = this.f206403p;
                    rt4 rt43 = bVar.f116853h;
                    if (!(rt43 != null && rt43.f141147e == 1) && bVar.mo67410j1()) {
                        mo98158N7(gVar, this.f206403p.f116853h.f141148f);
                        Log.m105919d("MicroMsg.VoiceTransTextUI", "result valid:%s", this.f206403p.f116853h.f141148f);
                    } else if (!this.f206403p.mo67410j1()) {
                        Log.m105918d("MicroMsg.VoiceTransTextUI", "result not valid");
                    }
                    rt4 rt44 = this.f206403p.f116853h;
                    if (rt44 != null && rt44.f141147e == 1) {
                        Log.m105924i("MicroMsg.VoiceTransTextUI", "succeed get");
                        if (this.f206403p.mo67410j1()) {
                            str2 = this.f206403p.f116853h.f141148f;
                        }
                        mo98156L7(str2);
                        return;
                    } else if (this.f206408u) {
                        Log.m105924i("MicroMsg.VoiceTransTextUI", "do get now! --- Notify new result");
                        mo98157M7(fVar);
                        return;
                    } else {
                        Log.m105925i("MicroMsg.VoiceTransTextUI", "do get again after:%ds", Integer.valueOf(this.f206406s));
                        int i4 = this.f206406s;
                        if (!this.f206407t) {
                            if (this.f206405r == null) {
                                this.f206405r = new MTimerHandler(new C71303e(this, i4), false);
                            }
                            this.f206405r.startTimer((long) (i4 * 1000));
                            return;
                        }
                        return;
                    }
                default:
                    return;
            }
        } else {
            this.f206407t = true;
            mo98158N7(C71302g.fail, (String) null);
        }
    }
}
