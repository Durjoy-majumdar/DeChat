package com.tencent.p014mm.plugin.voip.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.p136ui.MMActivity;
import com.tencent.p014mm.plugin.report.service.C115669n;
import com.tencent.p014mm.plugin.voip.model.VoipScoreState;
import j20.C117292a;
import java.util.ArrayList;
import nj3.C88989a;
import qo3.C77398g;
import qo3.C77426q;
import v20.C90741c;

@C88989a(3)
/* renamed from: com.tencent.mm.plugin.voip.widget.VoipScoreDialog */
public class VoipScoreDialog extends MMActivity {

    /* renamed from: i */
    public static final /* synthetic */ int f318199i = 0;

    /* renamed from: d */
    public VoipScoreState f318200d;

    /* renamed from: e */
    public ViewGroup f318201e;

    /* renamed from: f */
    public ImageView[] f318202f = new ImageView[5];

    /* renamed from: g */
    public C77398g f318203g = null;

    /* renamed from: h */
    public int f318204h = 0;

    /* renamed from: com.tencent.mm.plugin.voip.widget.VoipScoreDialog$a */
    public class C106507a implements View.OnClickListener {

        /* renamed from: d */
        public final /* synthetic */ int f318205d;

        public C106507a(int i) {
            this.f318205d = i;
        }

        public void onClick(View view) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(view);
            Object[] array = arrayList.toArray();
            arrayList.clear();
            C117292a.m165356b("com/tencent/mm/plugin/voip/widget/VoipScoreDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
            VoipScoreDialog voipScoreDialog = VoipScoreDialog.this;
            int i = this.f318205d;
            int i2 = VoipScoreDialog.f318199i;
            voipScoreDialog.getClass();
            C90741c.m113809b("MicroMsg.VoipScoreDialog", "onScoreViewClick %s", Integer.valueOf(i));
            if (i >= 0 && i < voipScoreDialog.f318202f.length) {
                for (int i3 = 0; i3 <= i; i3++) {
                    voipScoreDialog.f318202f[i3].setImageResource(C0966R.C0969drawable.ce6);
                }
                int i4 = i + 1;
                int i5 = i4;
                while (true) {
                    ImageView[] imageViewArr = voipScoreDialog.f318202f;
                    if (i5 >= imageViewArr.length) {
                        break;
                    }
                    imageViewArr[i5].setImageResource(C0966R.C0969drawable.ce5);
                    i5++;
                }
                voipScoreDialog.f318204h = i4;
            }
            C77398g gVar = voipScoreDialog.f318203g;
            if (gVar != null) {
                gVar.mo107541v(C0966R.string.kim, new C106518f(voipScoreDialog));
                voipScoreDialog.f318203g.mo107534s(C0966R.string.f7926wf, new C106520g(voipScoreDialog));
            }
            C117292a.m165361g(this, "com/tencent/mm/plugin/voip/widget/VoipScoreDialog$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }

    /* renamed from: H7 */
    public static void m143781H7(VoipScoreDialog voipScoreDialog, int i) {
        C90741c.m113809b("MicroMsg.VoipScoreDialog", "doScoreStat %s %s %s", Integer.valueOf(voipScoreDialog.f318204h), Integer.valueOf(i), voipScoreDialog.f318200d);
        C115669n.INSTANCE.mo160131h(15684, Integer.valueOf(voipScoreDialog.f318200d.f317165f), Long.valueOf(voipScoreDialog.f318200d.f317166g), Integer.valueOf(i), Integer.valueOf(voipScoreDialog.f318204h), Integer.valueOf(voipScoreDialog.f318200d.f317164e), Long.valueOf(voipScoreDialog.f318200d.f317168i), Long.valueOf(voipScoreDialog.f318200d.f317167h));
    }

    public int getLayoutId() {
        return C0966R.C0971layout.f360049cd2;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        VoipScoreState voipScoreState = (VoipScoreState) getIntent().getParcelableExtra("key_score_state");
        this.f318200d = voipScoreState;
        if (voipScoreState == null) {
            C90741c.m113808a("MicroMsg.VoipScoreDialog", "onCreate error, scoreState is null", new Object[0]);
            finish();
            return;
        }
        ViewGroup viewGroup = (ViewGroup) View.inflate(this, C0966R.C0971layout.f360048cd1, (ViewGroup) null);
        this.f318201e = viewGroup;
        this.f318202f[0] = (ImageView) viewGroup.findViewById(C0966R.C0970id.j2g);
        this.f318202f[1] = (ImageView) this.f318201e.findViewById(C0966R.C0970id.j2h);
        this.f318202f[2] = (ImageView) this.f318201e.findViewById(C0966R.C0970id.j2i);
        this.f318202f[3] = (ImageView) this.f318201e.findViewById(C0966R.C0970id.j2j);
        this.f318202f[4] = (ImageView) this.f318201e.findViewById(C0966R.C0970id.j2k);
        int i = 0;
        while (true) {
            ImageView[] imageViewArr = this.f318202f;
            if (i >= imageViewArr.length) {
                break;
            }
            imageViewArr[i].setOnClickListener(new C106507a(i));
            i++;
        }
        C77426q qVar = new C77426q(this);
        qVar.mo107606r(this.f318200d.f317163d);
        qVar.mo107592d(this.f318201e);
        qVar.mo107602n(getString(C0966R.string.kil));
        qVar.mo107600l(new C106516d(this));
        qVar.mo107589a(false);
        qVar.mo107593e(new C106517e(this));
        C77398g gVar = qVar.f225839c;
        this.f318203g = gVar;
        if (gVar != null) {
            gVar.show();
        } else {
            finish();
        }
    }
}
