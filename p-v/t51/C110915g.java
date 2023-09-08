package t51;

import a14.C53895h;
import a14.C53934p0;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.util.StateSet;
import android.view.View;
import android.widget.Button;
import androidx.lifecycle.C0120a0;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.plugin.eggspring.p882ui.SpringLuckyEggActivity;
import com.tencent.p014mm.vfs.C86013q1;
import com.tencent.xweb.file.XVFSFile;
import gy3.C87412m;
import i61.C98603i;
import p385u2.C111105a;
import p765yp.C112477a;
import uc0.C111156r;
import wx3.C15601d;
import wx3.C66212f;

/* renamed from: t51.g */
public final class C110915g<T> implements C0120a0 {

    /* renamed from: d */
    public final /* synthetic */ SpringLuckyEggActivity f331727d;

    public C110915g(SpringLuckyEggActivity springLuckyEggActivity) {
        this.f331727d = springLuckyEggActivity;
    }

    public final void onChanged(T t) {
        C111156r rVar = (C111156r) t;
        if (rVar != null) {
            String str = C98603i.m128192c() + "/egg/";
            boolean z = rVar.f332916y == 0;
            this.f331727d.getWindow().getDecorView().setSystemUiVisibility((!z || Build.VERSION.SDK_INT < 23) ? 1792 : 9984);
            this.f331727d.setBackBtnColorFilter(z ? C0966R.color.BW_0 : C0966R.color.f2975b6);
            C110928q qVar = this.f331727d.f312423f;
            if (qVar != null) {
                qVar.f331753i.setText(rVar.f332904j);
                C110928q qVar2 = this.f331727d.f312423f;
                if (qVar2 != null) {
                    qVar2.f331754j.setImageFilePath(str + XVFSFile.SEPARATOR_CHAR + rVar.f332903i);
                    C110928q qVar3 = this.f331727d.f312423f;
                    if (qVar3 != null) {
                        qVar3.f331748d.setText(rVar.f332899e);
                        C110928q qVar4 = this.f331727d.f312423f;
                        if (qVar4 != null) {
                            qVar4.f331749e.setText(rVar.f332901g);
                            int J7 = SpringLuckyEggActivity.m141269J7(this.f331727d, rVar.f332900f, C0966R.color.ae9);
                            int J72 = SpringLuckyEggActivity.m141269J7(this.f331727d, rVar.f332902h, C0966R.color.ae7);
                            SpringLuckyEggActivity springLuckyEggActivity = this.f331727d;
                            C110928q qVar5 = springLuckyEggActivity.f312423f;
                            if (qVar5 != null) {
                                qVar5.f331748d.setTextColor(SpringLuckyEggActivity.m141267H7(springLuckyEggActivity, J7, 0.6f));
                                C110928q qVar6 = this.f331727d.f312423f;
                                if (qVar6 != null) {
                                    qVar6.f331747c.mo104517q(J7, 0.6f);
                                    ColorStateList H7 = SpringLuckyEggActivity.m141267H7(this.f331727d, J72, 0.3f);
                                    C110928q qVar7 = this.f331727d.f312423f;
                                    if (qVar7 != null) {
                                        qVar7.f331749e.setTextColor(H7);
                                        SpringLuckyEggActivity springLuckyEggActivity2 = this.f331727d;
                                        C110928q qVar8 = springLuckyEggActivity2.f312423f;
                                        if (qVar8 != null) {
                                            View view = qVar8.f331750f;
                                            springLuckyEggActivity2.getClass();
                                            view.setBackgroundColor(Color.argb((int) (((float) 255) * 0.3f), Color.red(J72), Color.green(J72), Color.blue(J72)));
                                            C110928q qVar9 = this.f331727d.f312423f;
                                            if (qVar9 != null) {
                                                qVar9.f331751g.setTextColor(H7);
                                                if (rVar.f332906o == null) {
                                                    C110928q qVar10 = this.f331727d.f312423f;
                                                    if (qVar10 != null) {
                                                        qVar10.f331752h.setImageBitmap((Bitmap) null);
                                                    } else {
                                                        C87412m.m108603p("viewBinding");
                                                        throw null;
                                                    }
                                                } else {
                                                    SpringLuckyEggActivity springLuckyEggActivity3 = this.f331727d;
                                                    C53895h.m60466d(springLuckyEggActivity3.f312421d, (C66212f) null, (C53934p0) null, new C110918j(springLuckyEggActivity3, str, rVar, (C15601d<? super C110918j>) null), 3, (Object) null);
                                                }
                                                String str2 = str + XVFSFile.SEPARATOR_CHAR + rVar.f332911t;
                                                if (C86013q1.m106450k(str2)) {
                                                    C110928q qVar11 = this.f331727d.f312423f;
                                                    if (qVar11 != null) {
                                                        qVar11.f331746b.setImageFilePath(str2);
                                                    } else {
                                                        C87412m.m108603p("viewBinding");
                                                        throw null;
                                                    }
                                                } else {
                                                    String str3 = C112477a.f336783g;
                                                    if (C86013q1.m106450k(str3)) {
                                                        C110928q qVar12 = this.f331727d.f312423f;
                                                        if (qVar12 != null) {
                                                            qVar12.f331746b.setImageFilePath(str3);
                                                        } else {
                                                            C87412m.m108603p("viewBinding");
                                                            throw null;
                                                        }
                                                    } else {
                                                        C110928q qVar13 = this.f331727d.f312423f;
                                                        if (qVar13 != null) {
                                                            qVar13.f331746b.setImageResource(C0966R.C0969drawable.f357242c50);
                                                        } else {
                                                            C87412m.m108603p("viewBinding");
                                                            throw null;
                                                        }
                                                    }
                                                }
                                                C110928q qVar14 = this.f331727d.f312423f;
                                                if (qVar14 != null) {
                                                    qVar14.f331759o.setTextColor(new ColorStateList(new int[][]{new int[]{-16842910}, StateSet.WILD_CARD}, new int[]{C111105a.m151500b(this.f331727d, C0966R.color.UN_BW_0_Alpha_0_3), SpringLuckyEggActivity.m141269J7(this.f331727d, rVar.f332913v, C0966R.color.f2975b6)}));
                                                    SpringLuckyEggActivity springLuckyEggActivity4 = this.f331727d;
                                                    C110928q qVar15 = springLuckyEggActivity4.f312423f;
                                                    if (qVar15 != null) {
                                                        Button button = qVar15.f331759o;
                                                        int J73 = SpringLuckyEggActivity.m141269J7(springLuckyEggActivity4, rVar.f332912u, C0966R.color.Red_90);
                                                        springLuckyEggActivity4.getClass();
                                                        int b = C111105a.m151500b(springLuckyEggActivity4, C0966R.color.UN_BW_0_Alpha_0_0_5);
                                                        StateListDrawable stateListDrawable = new StateListDrawable();
                                                        stateListDrawable.addState(new int[]{-16842910}, springLuckyEggActivity4.mo149513L7(b));
                                                        stateListDrawable.addState(StateSet.WILD_CARD, springLuckyEggActivity4.mo149513L7(J73));
                                                        StateListDrawable stateListDrawable2 = new StateListDrawable();
                                                        stateListDrawable2.addState(new int[]{16842919}, springLuckyEggActivity4.mo149513L7(C111105a.m151500b(springLuckyEggActivity4, C0966R.color.UN_BW_0_Alpha_0_1)));
                                                        stateListDrawable2.addState(StateSet.WILD_CARD, springLuckyEggActivity4.mo149513L7(0));
                                                        button.setBackground(new LayerDrawable(new StateListDrawable[]{stateListDrawable, stateListDrawable2}));
                                                        return;
                                                    }
                                                    C87412m.m108603p("viewBinding");
                                                    throw null;
                                                }
                                                C87412m.m108603p("viewBinding");
                                                throw null;
                                            }
                                            C87412m.m108603p("viewBinding");
                                            throw null;
                                        }
                                        C87412m.m108603p("viewBinding");
                                        throw null;
                                    }
                                    C87412m.m108603p("viewBinding");
                                    throw null;
                                }
                                C87412m.m108603p("viewBinding");
                                throw null;
                            }
                            C87412m.m108603p("viewBinding");
                            throw null;
                        }
                        C87412m.m108603p("viewBinding");
                        throw null;
                    }
                    C87412m.m108603p("viewBinding");
                    throw null;
                }
                C87412m.m108603p("viewBinding");
                throw null;
            }
            C87412m.m108603p("viewBinding");
            throw null;
        }
    }
}
