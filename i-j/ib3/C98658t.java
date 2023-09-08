package ib3;

import android.os.Message;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bb3.C92221d;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.wenote.model.nativenote.manager.C96679b;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.voiceview.C96750a;
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.voiceview.NoteVoiceView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import p371ph.C21967a;
import p375qh.C22086d;
import qd0.C101121a;
import xa3.C102587c;
import xa3.C102596l;

/* renamed from: ib3.t */
public class C98658t extends C98648o {

    /* renamed from: Q0 */
    public final MMHandler f289266Q0 = new C98660b();

    /* renamed from: V */
    public LinearLayout f289267V;

    /* renamed from: W */
    public LinearLayout f289268W;

    /* renamed from: X */
    public LinearLayout f289269X;

    /* renamed from: Y */
    public NoteVoiceView f289270Y;

    /* renamed from: Z */
    public ImageView f289271Z;

    /* renamed from: p0 */
    public TextView f289272p0;

    /* renamed from: x0 */
    public TextView f289273x0;

    /* renamed from: y0 */
    public C102596l f289274y0;

    /* renamed from: ib3.t$a */
    public class C98659a implements View.OnClickListener {
        public C98659a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteVoiceItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C102596l lVar = C98658t.this.f289274y0;
            if (lVar != null && lVar.f302088y.booleanValue()) {
                C98658t.this.f289274y0.f302089z = Boolean.TRUE;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteVoiceItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ib3.t$b */
    public class C98660b extends MMHandler {
        public C98660b() {
        }

        public void handleMessage(Message message) {
            C98658t tVar = C98658t.this;
            if (tVar.f289274y0.f302100q) {
                tVar.f289266Q0.removeMessages(4096);
                return;
            }
            C98658t.this.f289273x0.setText(" " + ((String) C101121a.m132522b(MMApplicationContext.getContext(), C98658t.this.f289274y0.f302131t)).toString());
            sendEmptyMessageDelayed(4096, 500);
        }
    }

    public C98658t(View view, C96679b bVar, C92221d dVar, C96750a aVar) {
        super(view, bVar, dVar);
        this.f289267V = (LinearLayout) view.findViewById(C0966R.C0970id.hj4);
        this.f289268W = (LinearLayout) view.findViewById(C0966R.C0970id.hj6);
        this.f289269X = (LinearLayout) view.findViewById(C0966R.C0970id.hj5);
        this.f289271Z = (ImageView) view.findViewById(C0966R.C0970id.hj7);
        this.f289272p0 = (TextView) view.findViewById(C0966R.C0970id.hj9);
        this.f289273x0 = (TextView) view.findViewById(C0966R.C0970id.hj_);
        NoteVoiceView noteVoiceView = (NoteVoiceView) view.findViewById(C0966R.C0970id.him);
        this.f289270Y = noteVoiceView;
        noteVoiceView.setVoiceHelper(aVar);
        this.f289267V.setVisibility(0);
        this.f289268W.setVisibility(8);
        this.f289269X.setVisibility(0);
        this.f289234B.setVisibility(8);
        this.f289237E.setVisibility(8);
        this.f289267V.setOnClickListener(new C98659a());
    }

    /* renamed from: y */
    public int mo138058y() {
        return 4;
    }

    /* renamed from: z */
    public void mo138059z(C102587c cVar, int i, int i2) {
        C22086d dVar;
        C22086d dVar2;
        C102587c cVar2 = cVar;
        C102596l lVar = (C102596l) cVar2;
        this.f289274y0 = lVar;
        if (lVar.f302100q) {
            this.f289267V.setBackgroundResource(0);
            this.f289269X.setVisibility(0);
            this.f289268W.setVisibility(8);
            this.f289267V.setPadding(0, 0, 0, 0);
            boolean z = cVar2.f302078i;
            NoteVoiceView noteVoiceView = this.f289270Y;
            C102596l lVar2 = this.f289274y0;
            String str = lVar2.f302101r;
            int i3 = lVar2.f302134w;
            int i4 = lVar2.f302135x;
            noteVoiceView.getClass();
            noteVoiceView.f283409n = Util.nullAs(str, "");
            noteVoiceView.f283410o = i3;
            noteVoiceView.f283408j = i4;
            if (z) {
                View view = noteVoiceView.f283407i;
                C9556a aVar = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar.mo10232b(), "com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteVoiceView", "updateInfo", "(Ljava/lang/String;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteVoiceView", "updateInfo", "(Ljava/lang/String;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view3 = noteVoiceView.f283407i;
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar2.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar2.mo10232b(), "com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteVoiceView", "updateInfo", "(Ljava/lang/String;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/wenote/ui/nativenote/voiceview/NoteVoiceView", "updateInfo", "(Ljava/lang/String;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (noteVoiceView.f283409n.equals(noteVoiceView.f283411p.f283421d)) {
                boolean z2 = true;
                double d = 0.0d;
                if (noteVoiceView.f283411p.mo135022e()) {
                    Log.m105924i("MicroMsg.NoteVoiceView", "updateInfo .isPlay()");
                    NoteVoiceView.C96749c cVar3 = noteVoiceView.f283412q;
                    C96750a aVar3 = noteVoiceView.f283411p;
                    if (!(aVar3.f283430p == null || (dVar2 = ((C21967a) aVar3.mo135021d()).f62200a) == null)) {
                        d = dVar2.mo33330f();
                    }
                    cVar3.mo135018c(d, i4, true);
                } else {
                    C96750a aVar4 = noteVoiceView.f283411p;
                    if (aVar4.f283430p == null || !((C21967a) aVar4.mo135021d()).mo35057a()) {
                        z2 = false;
                    }
                    if (z2) {
                        Log.m105924i("MicroMsg.NoteVoiceView", "updateInfo .isPause()");
                        NoteVoiceView.C96749c cVar4 = noteVoiceView.f283412q;
                        C96750a aVar5 = noteVoiceView.f283411p;
                        if (!(aVar5.f283430p == null || (dVar = ((C21967a) aVar5.mo135021d()).f62200a) == null)) {
                            d = dVar.mo33330f();
                        }
                        cVar4.mo135018c(d, i4, false);
                    } else {
                        noteVoiceView.f283412q.mo135016a(i4);
                    }
                }
            } else {
                noteVoiceView.f283412q.mo135016a(i4);
            }
        } else {
            this.f289267V.setBackgroundResource(C0966R.C0969drawable.b3l);
            this.f289267V.setPadding(26, 7, 0, 7);
            this.f289269X.setVisibility(8);
            this.f289268W.setVisibility(0);
            ImageView imageView = this.f289271Z;
            if (imageView.getAnimation() != null) {
                imageView.startAnimation(imageView.getAnimation());
            } else {
                AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
                alphaAnimation.setDuration(500);
                alphaAnimation.setInterpolator(new LinearInterpolator());
                alphaAnimation.setRepeatCount(-1);
                alphaAnimation.setRepeatMode(2);
                imageView.startAnimation(alphaAnimation);
            }
            if (this.f289274y0.f302088y.booleanValue()) {
                this.f289266Q0.sendEmptyMessage(4096);
                this.f289272p0.setText(C0966R.string.csg);
                this.f289273x0.setText(" " + ((String) C101121a.m132522b(MMApplicationContext.getContext(), this.f289274y0.f302131t)).toString());
            } else {
                this.f289272p0.setText(C0966R.string.csf);
                this.f289273x0.setText(" " + ((String) C101121a.m132522b(MMApplicationContext.getContext(), (int) C101121a.m132521a((long) this.f289274y0.f302135x))).toString());
            }
        }
        super.mo138059z(cVar, i, i2);
    }
}
