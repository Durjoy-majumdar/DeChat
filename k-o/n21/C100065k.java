package n21;

import android.os.Message;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.component.editor.C93088r;
import com.tencent.p014mm.plugin.component.editor.model.nativenote.manager.C93083b;
import com.tencent.p014mm.plugin.component.editor.widget.voiceview.C93093a;
import com.tencent.p014mm.plugin.component.editor.widget.voiceview.VoiceView;
import com.tencent.p014mm.sdk.platformtools.Log;
import com.tencent.p014mm.sdk.platformtools.MMApplicationContext;
import com.tencent.p014mm.sdk.platformtools.MMHandler;
import com.tencent.p014mm.sdk.platformtools.Util;
import j20.C117292a;
import java.util.ArrayList;
import k20.C60958c;
import k20.C9556a;
import ob0.C76996p;
import p21.C100616a;
import p21.C100631p;
import p371ph.C21967a;
import p375qh.C22086d;

/* renamed from: n21.k */
public class C100065k extends C100047f {

    /* renamed from: U */
    public LinearLayout f293117U;

    /* renamed from: V */
    public LinearLayout f293118V;

    /* renamed from: W */
    public LinearLayout f293119W;

    /* renamed from: X */
    public VoiceView f293120X;

    /* renamed from: Y */
    public ImageView f293121Y;

    /* renamed from: Z */
    public TextView f293122Z;

    /* renamed from: p0 */
    public TextView f293123p0;

    /* renamed from: x0 */
    public C100631p f293124x0;

    /* renamed from: y0 */
    public final MMHandler f293125y0 = new C100067b();

    /* renamed from: n21.k$a */
    public class C100066a implements View.OnClickListener {
        public C100066a() {
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorVoiceItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            C100631p pVar = C100065k.this.f293124x0;
            if (pVar != null && pVar.f294830w.booleanValue()) {
                C100065k.this.f293124x0.f294831x = Boolean.TRUE;
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/component/editor/adapter/itemholder/EditorVoiceItemHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: n21.k$b */
    public class C100067b extends MMHandler {
        public C100067b() {
        }

        public void handleMessage(Message message) {
            C100065k kVar = C100065k.this;
            if (kVar.f293124x0.f294812q) {
                kVar.f293125y0.removeMessages(4096);
                return;
            }
            C100065k.this.f293123p0.setText(" " + ((String) C93088r.m117443m(MMApplicationContext.getContext(), C100065k.this.f293124x0.f294824t)).toString());
            sendEmptyMessageDelayed(4096, 500);
        }
    }

    public C100065k(View view, C93083b bVar) {
        super(view, bVar);
        this.f293117U = (LinearLayout) view.findViewById(C0966R.C0970id.hj4);
        this.f293118V = (LinearLayout) view.findViewById(C0966R.C0970id.hj6);
        this.f293119W = (LinearLayout) view.findViewById(C0966R.C0970id.hj5);
        this.f293121Y = (ImageView) view.findViewById(C0966R.C0970id.hj7);
        this.f293122Z = (TextView) view.findViewById(C0966R.C0970id.hj9);
        this.f293123p0 = (TextView) view.findViewById(C0966R.C0970id.hj_);
        VoiceView voiceView = (VoiceView) view.findViewById(C0966R.C0970id.him);
        this.f293120X = voiceView;
        voiceView.setVoiceHelper(C93093a.m117459b());
        this.f293117U.setVisibility(0);
        this.f293118V.setVisibility(8);
        this.f293119W.setVisibility(0);
        this.f293079B.setVisibility(8);
        this.f293082E.setVisibility(8);
        this.f293117U.setOnClickListener(new C100066a());
    }

    /* renamed from: y */
    public int mo139367y() {
        return 4;
    }

    /* renamed from: z */
    public void mo139368z(C100616a aVar, int i, int i2) {
        boolean z;
        C100616a aVar2 = aVar;
        C100631p pVar = (C100631p) aVar2;
        this.f293124x0 = pVar;
        if (pVar.f294812q) {
            this.f293117U.setBackgroundResource(0);
            this.f293119W.setVisibility(0);
            this.f293118V.setVisibility(8);
            this.f293117U.setPadding(0, 0, 0, 0);
            boolean z2 = aVar2.f294802h;
            VoiceView voiceView = this.f293120X;
            C100631p pVar2 = this.f293124x0;
            String str = pVar2.f294813r;
            int i3 = pVar2.f294825u;
            int i4 = pVar2.f294826v;
            voiceView.getClass();
            voiceView.f268194n = Util.nullAs(str, "");
            voiceView.f268195o = i3;
            voiceView.f268193j = i4;
            if (z2) {
                View view = voiceView.f268192i;
                C9556a aVar3 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar3.mo10233c(0);
                View view2 = view;
                C117292a.m165358d(view2, aVar3.mo10232b(), "com/tencent/mm/plugin/component/editor/widget/voiceview/VoiceView", "updateInfo", "(Ljava/lang/String;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((Integer) aVar3.mo10231a(0)).intValue());
                C117292a.m165359e(view2, "com/tencent/mm/plugin/component/editor/widget/voiceview/VoiceView", "updateInfo", "(Ljava/lang/String;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                View view3 = voiceView.f268192i;
                C9556a aVar4 = new C9556a();
                ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                aVar4.mo10233c(8);
                View view4 = view3;
                C117292a.m165358d(view4, aVar4.mo10232b(), "com/tencent/mm/plugin/component/editor/widget/voiceview/VoiceView", "updateInfo", "(Ljava/lang/String;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                C117292a.m165359e(view4, "com/tencent/mm/plugin/component/editor/widget/voiceview/VoiceView", "updateInfo", "(Ljava/lang/String;IIZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (voiceView.f268194n.equals(voiceView.f268196p.f268208e)) {
                double d = 0.0d;
                if (voiceView.f268196p.mo127596c()) {
                    Log.m105924i("MicroMsg.NoteVoiceView", "updateInfo .isPlay()");
                    VoiceView.C93092c cVar = voiceView.f268197q;
                    C76996p pVar3 = voiceView.f268196p.f268207d;
                    if (pVar3 == null) {
                        Log.m105928w("MicroMsg.RecordVoiceHelper", "get now progress error, player is null");
                    } else {
                        C22086d dVar = ((C21967a) pVar3).f62200a;
                        if (dVar != null) {
                            d = dVar.mo33330f();
                        }
                    }
                    cVar.mo127595c(d, i4, true);
                } else {
                    C76996p pVar4 = voiceView.f268196p.f268207d;
                    if (pVar4 == null) {
                        Log.m105928w("MicroMsg.RecordVoiceHelper", "check is pause, but player is null");
                        z = false;
                    } else {
                        z = ((C21967a) pVar4).mo35057a();
                    }
                    if (z) {
                        Log.m105924i("MicroMsg.NoteVoiceView", "updateInfo .isPause()");
                        VoiceView.C93092c cVar2 = voiceView.f268197q;
                        C76996p pVar5 = voiceView.f268196p.f268207d;
                        if (pVar5 == null) {
                            Log.m105928w("MicroMsg.RecordVoiceHelper", "get now progress error, player is null");
                        } else {
                            C22086d dVar2 = ((C21967a) pVar5).f62200a;
                            if (dVar2 != null) {
                                d = dVar2.mo33330f();
                            }
                        }
                        cVar2.mo127595c(d, i4, false);
                    } else {
                        voiceView.f268197q.mo127593a(i4);
                    }
                }
            } else {
                voiceView.f268197q.mo127593a(i4);
            }
        } else {
            this.f293117U.setBackgroundResource(C0966R.C0969drawable.f4931rm);
            this.f293117U.setPadding(26, 7, 0, 7);
            this.f293119W.setVisibility(8);
            this.f293118V.setVisibility(0);
            ImageView imageView = this.f293121Y;
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
            if (this.f293124x0.f294830w.booleanValue()) {
                this.f293125y0.sendEmptyMessage(4096);
                this.f293122Z.setText(C0966R.string.csg);
                this.f293123p0.setText(" " + ((String) C93088r.m117443m(MMApplicationContext.getContext(), this.f293124x0.f294824t)).toString());
            } else {
                this.f293122Z.setText(C0966R.string.csf);
                this.f293123p0.setText(" " + ((String) C93088r.m117443m(MMApplicationContext.getContext(), (int) C93088r.m117440j((long) this.f293124x0.f294826v))).toString());
            }
        }
        super.mo139368z(aVar, i, i2);
    }
}
