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
import com.tencent.p014mm.plugin.wenote.p131ui.nativenote.voiceview.NoteEditorVoiceBaseView;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import qd0.C101121a;
import xa3.C102587c;
import xa3.C102596l;

/* renamed from: ib3.c */
public class C98630c extends C98648o {

    /* renamed from: V */
    public LinearLayout f289193V;

    /* renamed from: W */
    public LinearLayout f289194W;

    /* renamed from: X */
    public NoteEditorVoiceBaseView f289195X;

    /* renamed from: Y */
    public ImageView f289196Y;

    /* renamed from: Z */
    public TextView f289197Z;

    /* renamed from: p0 */
    public TextView f289198p0;

    /* renamed from: x0 */
    public C102596l f289199x0;

    /* renamed from: y0 */
    public final MMHandler f289200y0 = new C98632b();

    /* renamed from: ib3.c$a */
    public class C98631a implements View.OnClickListener {
        public C98631a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteChatVoiceItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C102596l lVar = C98630c.this.f289199x0;
            if (lVar != null && lVar.f302088y.booleanValue()) {
                C98630c.this.f289199x0.f302089z = Boolean.TRUE;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/wenote/ui/nativenote/itemholder/NoteChatVoiceItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: ib3.c$b */
    public class C98632b extends MMHandler {
        public C98632b() {
        }

        public void handleMessage(Message message) {
            C98630c cVar = C98630c.this;
            if (cVar.f289199x0.f302100q) {
                cVar.f289200y0.removeMessages(4096);
                return;
            }
            C98630c.this.f289198p0.setText(" " + ((String) C101121a.m132522b(MMApplicationContext.getContext(), C98630c.this.f289199x0.f302131t)).toString());
            sendEmptyMessageDelayed(4096, 500);
        }
    }

    public C98630c(View view, C96679b bVar, C92221d dVar, C96750a aVar) {
        super(view, bVar, dVar);
        this.f289193V = (LinearLayout) view.findViewById(C0966R.C0970id.hj6);
        this.f289194W = (LinearLayout) view.findViewById(C0966R.C0970id.hif);
        this.f289196Y = (ImageView) view.findViewById(C0966R.C0970id.hj7);
        this.f289197Z = (TextView) view.findViewById(C0966R.C0970id.hj9);
        this.f289198p0 = (TextView) view.findViewById(C0966R.C0970id.hj_);
        NoteEditorVoiceBaseView noteEditorVoiceBaseView = (NoteEditorVoiceBaseView) view.findViewById(C0966R.C0970id.hik);
        this.f289195X = noteEditorVoiceBaseView;
        noteEditorVoiceBaseView.setVoiceHelper(aVar);
        this.f289242J.setVisibility(0);
        this.f289193V.setVisibility(8);
        this.f289194W.setVisibility(0);
        this.f289234B.setVisibility(8);
        this.f289237E.setVisibility(8);
        this.f289242J.setOnClickListener(new C98631a());
    }

    /* renamed from: y */
    public int mo138058y() {
        return 20;
    }

    /* renamed from: z */
    public void mo138059z(C102587c cVar, int i, int i2) {
        C102596l lVar = (C102596l) cVar;
        this.f289199x0 = lVar;
        if (lVar.f302100q) {
            this.f289194W.setVisibility(0);
            this.f289193V.setVisibility(8);
            this.f289242J.setPadding(0, 0, 0, 0);
            if (cVar.f302078i) {
                this.f289195X.setBackgroundResource(C0966R.C0969drawable.b3_);
            } else {
                this.f289195X.setBackgroundResource(C0966R.C0969drawable.b39);
            }
            NoteEditorVoiceBaseView noteEditorVoiceBaseView = this.f289195X;
            C102596l lVar2 = this.f289199x0;
            String str = lVar2.f302101r;
            int i3 = lVar2.f302134w;
            String str2 = lVar2.f302133v;
            noteEditorVoiceBaseView.getClass();
            noteEditorVoiceBaseView.f283398i = Util.nullAs(str, "");
            noteEditorVoiceBaseView.f283399j = i3;
            noteEditorVoiceBaseView.setText(str2);
        } else {
            this.f289242J.setPadding(26, 7, 0, 7);
            this.f289194W.setVisibility(8);
            this.f289193V.setVisibility(0);
            ImageView imageView = this.f289196Y;
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
            if (this.f289199x0.f302088y.booleanValue()) {
                this.f289200y0.sendEmptyMessage(4096);
                this.f289197Z.setText(C0966R.string.csg);
                this.f289198p0.setText(" " + ((String) C101121a.m132522b(MMApplicationContext.getContext(), this.f289199x0.f302131t)).toString());
            } else {
                this.f289197Z.setText(C0966R.string.csf);
                this.f289198p0.setText(" " + ((String) C101121a.m132522b(MMApplicationContext.getContext(), (int) C101121a.m132521a((long) this.f289199x0.f302135x))).toString());
            }
        }
        super.mo138059z(cVar, i, i2);
    }
}
