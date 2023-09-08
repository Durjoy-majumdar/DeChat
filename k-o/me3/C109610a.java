package me3;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;
import android.widget.EditText;
import com.tencent.p014mm.C0966R;
import com.tencent.p014mm.sdk.platformtools.Log;
import cq3.C106952a;
import eq3.C107283a;
import j20.C117292a;
import k20.C60958c;
import k20.C9556a;
import p1093bh.C104084a;
import p1093bh.C104085b;
import p1093bh.C104089c;
import p1093bh.C104090d;
import p1093bh.C104097g;
import p1093bh.C104098h;
import p1093bh.C104099i;
import p1093bh.C104100j;
import p1093bh.C104103l;
import p1093bh.C104107p;
import p1158tg.C110980a;
import p248ug.C111163p0;
import p248ug.C111167t;
import p520fi.C107544a;
import p520fi.C107548f;
import z20.C112571a;
import z20.C112576e;

/* renamed from: me3.a */
public class C109610a implements C111163p0 {

    /* renamed from: a */
    public final /* synthetic */ C109612c f328157a;

    public C109610a(C109612c cVar) {
        this.f328157a = cVar;
    }

    /* renamed from: a */
    public void mo150361a(C111167t tVar) {
        Log.m105925i("MicroMsg.DrawingPresenter", "[onSelectedFeature] features:%s", tVar);
        if (tVar == C111167t.DEFAULT) {
            this.f328157a.f328158a.getBaseFooterView().setCurFeatureType(tVar);
        }
        C107283a baseFooterView = this.f328157a.f328158a.getBaseFooterView();
        baseFooterView.f320978s = baseFooterView.f320977r;
        if (this.f328157a.f328158a.getSelectedFeatureListener() != null) {
            this.f328157a.f328158a.getSelectedFeatureListener().mo150361a(tVar);
        }
        if (tVar == C111167t.CROP_VIDEO) {
            View footerBg = this.f328157a.f328158a.getFooterBg();
            C9556a aVar = new C9556a();
            ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
            aVar.mo10233c(8);
            C117292a.m165358d(footerBg, aVar.mo10232b(), "com/tencent/mm/presenter/DrawingPresenter$1", "onSelectedFeature", "(Lcom/tencent/mm/api/FeaturesType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            footerBg.setVisibility(((Integer) aVar.mo10231a(0)).intValue());
            C117292a.m165359e(footerBg, "com/tencent/mm/presenter/DrawingPresenter$1", "onSelectedFeature", "(Lcom/tencent/mm/api/FeaturesType;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        C104085b bVar = this.f328157a.f328160c.get(tVar);
        if (bVar != null) {
            boolean z = bVar.f307888e;
            if (z) {
                if (!(z && bVar.f307887d)) {
                    bVar.mo145706q();
                }
            }
            if (bVar.mo145700k() != C104084a.DEFAULT) {
                ((C109612c) bVar.f307884a).f328158a.getBaseBoardView().setOneFingerMoveEnable(false);
            }
            bVar.mo145713x();
            this.f328157a.f328176s = bVar;
            int ordinal = tVar.ordinal();
            if (ordinal == 2) {
                if (!this.f328157a.f328158a.getBaseFooterView().f320985z) {
                    ((EditText) this.f328157a.f328158a.getTextEditView().findViewById(C0966R.C0970id.ki7)).setTextColor(C107283a.f320962D[0]);
                    this.f328157a.mo160834r(true);
                    this.f328157a.f328158a.setFooterVisible(false);
                }
                this.f328157a.f328174q = tVar;
            } else if (ordinal == 3) {
                this.f328157a.f328158a.setActionBarVisible(false);
                this.f328157a.f328158a.setFooterVisible(false);
                this.f328157a.f328158a.mo154840c(false);
                this.f328157a.f328174q = tVar;
            } else if (ordinal != 5) {
                this.f328157a.f328174q = tVar;
            } else {
                C109612c cVar = this.f328157a;
                cVar.f328173p = cVar.f328174q;
            }
            this.f328157a.f328158a.getBaseFooterView().setCurFeatureType(tVar);
        }
    }

    /* renamed from: b */
    public void mo150362b(boolean z) {
    }

    /* renamed from: c */
    public void mo150363c(C111167t tVar, int i, Object obj) {
        C112571a aVar;
        C111167t tVar2 = tVar;
        int i2 = i;
        Object obj2 = obj;
        Log.m105925i("MicroMsg.DrawingPresenter", "[onSelectedDetailFeature] features:%s index:%s", tVar2, Integer.valueOf(i));
        if (this.f328157a.f328158a.getSelectedFeatureListener() != null) {
            this.f328157a.f328158a.getSelectedFeatureListener().mo150363c(tVar2, i2, obj2);
        }
        C109612c cVar = this.f328157a;
        cVar.f328176s = cVar.f328160c.get(tVar2);
        if (this.f328157a.mo160820d().mo145700k() != C104084a.DEFAULT) {
            if (this.f328157a.f328158a.getFooterBg().getVisibility() == 8) {
                View footerBg = this.f328157a.f328158a.getFooterBg();
                C9556a aVar2 = new C9556a();
                ThreadLocal<C9556a> threadLocal = C60958c.f173611a;
                aVar2.mo10233c(0);
                View view = footerBg;
                C117292a.m165358d(view, aVar2.mo10232b(), "com/tencent/mm/presenter/DrawingPresenter$1", "onSelectedDetailFeature", "(Lcom/tencent/mm/api/FeaturesType;ILjava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                footerBg.setVisibility(((Integer) aVar2.mo10231a(0)).intValue());
                C117292a.m165359e(view, "com/tencent/mm/presenter/DrawingPresenter$1", "onSelectedDetailFeature", "(Lcom/tencent/mm/api/FeaturesType;ILjava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            int ordinal = tVar.ordinal();
            if (ordinal == 1) {
                C104100j jVar = (C104100j) this.f328157a.mo160820d();
                if (i2 != -1) {
                    jVar.f307958s = this.f328157a.f328158a.getBaseFooterView().mo157767e(i2);
                } else {
                    jVar.mo145715z();
                }
            } else if (ordinal == 7) {
                C104103l lVar = (C104103l) this.f328157a.mo160820d();
                float floatValue = ((Float) obj2).floatValue();
                C107548f fVar = (C107548f) lVar.mo145692c();
                if (fVar != null) {
                    fVar.f321776d = i2;
                }
                C107548f fVar2 = (C107548f) lVar.mo145692c();
                if (fVar2 != null) {
                    fVar2.f321777e = floatValue;
                }
                this.f328157a.f328158a.getBaseBoardView().postInvalidate();
                Log.m105924i("MicroMsg.DrawingPresenter", "lxl postInvalidate");
            } else if (ordinal == 4) {
                C104107p pVar = (C104107p) this.f328157a.mo160820d();
                if (i2 == 0) {
                    pVar.f308015v = C112576e.C112577a.ONE;
                } else if (1 == i2) {
                    pVar.f308015v = C112576e.C112577a.TWO;
                } else {
                    pVar.mo145715z();
                }
            } else if (ordinal == 5) {
                C104090d dVar = (C104090d) this.f328157a.mo160820d();
                if (i2 == 0) {
                    dVar.f307917S++;
                    dVar.f307901C.mo162647a();
                    ValueAnimator valueAnimator = dVar.f307915Q;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    Matrix matrix = new Matrix();
                    matrix.postRotate(-90.0f, (float) dVar.f307922s.centerX(), (float) dVar.f307922s.centerY());
                    if (dVar.f307916R.isEmpty()) {
                        dVar.f307916R.set(dVar.f307922s);
                    }
                    RectF rectF = new RectF(dVar.f307916R);
                    matrix.mapRect(rectF);
                    float width = (((float) dVar.f307927x.width()) * 1.0f) / rectF.width();
                    float height = (((float) dVar.f307927x.height()) * 1.0f) / rectF.height();
                    if (width >= height) {
                        width = height;
                    }
                    matrix.postScale(width, width, (float) dVar.f307922s.centerX(), (float) dVar.f307922s.centerY());
                    rectF.set(dVar.f307916R);
                    matrix.mapRect(rectF);
                    dVar.f307916R.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                    float centerX = (float) dVar.f307922s.centerX();
                    float centerY = (float) dVar.f307922s.centerY();
                    ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofInt("rotation", new int[]{0, -90}), PropertyValuesHolder.ofInt("deltaX", new int[]{0, dVar.f307927x.centerX() - ((int) centerX)}), PropertyValuesHolder.ofInt("deltaY", new int[]{0, dVar.f307927x.centerY() - ((int) centerY)})});
                    ofPropertyValuesHolder.addUpdateListener(new C104099i(dVar, centerX, centerY, width));
                    ofPropertyValuesHolder.addListener(new C104089c(dVar));
                    ofPropertyValuesHolder.setDuration(200);
                    ofPropertyValuesHolder.start();
                } else if (1 == i2) {
                    dVar.getClass();
                    Log.m105924i("MicroMsg.CropArtist", "[cancel]");
                    dVar.f307901C.mo162647a();
                    ValueAnimator valueAnimator2 = dVar.f307915Q;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    ((C109612c) dVar.f307884a).f328158a.getBaseBoardView().f320136i = ((C109612c) dVar.f307884a).f328158a.getBaseBoardView().getRawBoardRect();
                    float f = 0.0f;
                    if (dVar.mo145692c() != null) {
                        C107544a aVar3 = (C107544a) dVar.mo145692c();
                        if (aVar3.f321765d.size() <= 0) {
                            Log.m105920e("MicroMsg.CropCache", "[pop]");
                            aVar = null;
                        } else {
                            aVar = aVar3.f321765d.pop();
                        }
                        if (aVar != null) {
                            f = dVar.mo145697h() - dVar.mo145698i(aVar.f337057f);
                            if (!aVar.f337056e.isEmpty()) {
                                ((C109612c) dVar.f307884a).f328158a.getBaseBoardView().mo157351i(aVar.f337056e);
                            }
                        }
                    }
                    ((C109612c) dVar.f307884a).f328158a.getBaseBoardView().mo157328b((C106952a.C106955c) null, f, true);
                    View actionBar = ((C109612c) dVar.f307884a).f328158a.getActionBar();
                    C9556a aVar4 = new C9556a();
                    ThreadLocal<C9556a> threadLocal2 = C60958c.f173611a;
                    aVar4.mo10233c(0);
                    View view2 = actionBar;
                    C117292a.m165358d(view2, aVar4.mo10232b(), "com/tencent/mm/artists/CropArtist", "cancel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    actionBar.setVisibility(((Integer) aVar4.mo10231a(0)).intValue());
                    C117292a.m165359e(view2, "com/tencent/mm/artists/CropArtist", "cancel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    C109612c cVar2 = this.f328157a;
                    cVar2.f328176s = cVar2.f328160c.get(cVar2.f328173p);
                    this.f328157a.f328158a.getBaseFooterView().setCurFeatureType(this.f328157a.f328173p);
                } else if (2 == i2) {
                    dVar.getClass();
                    Log.m105924i("MicroMsg.CropArtist", "[doCrop]");
                    ValueAnimator valueAnimator3 = dVar.f307915Q;
                    if (valueAnimator3 != null) {
                        valueAnimator3.cancel();
                    }
                    C110980a aVar5 = dVar.f307901C;
                    if (!aVar5.f332399a) {
                        if (!aVar5.f332400b) {
                            aVar5.mo162647a();
                            dVar.f307901C.mo162648b();
                        }
                        dVar.f307901C.f332394l = new C104097g(dVar);
                    } else {
                        aVar5.f332394l = null;
                        dVar.mo145722E();
                    }
                    C109612c cVar3 = this.f328157a;
                    cVar3.f328176s = cVar3.f328160c.get(cVar3.f328173p);
                    this.f328157a.f328158a.getBaseFooterView().setCurFeatureType(this.f328157a.f328173p);
                } else if (3 == i2) {
                    dVar.getClass();
                    Log.m105924i("MicroMsg.CropArtist", "[reset]");
                    dVar.f307901C.mo162647a();
                    ValueAnimator valueAnimator4 = dVar.f307915Q;
                    if (valueAnimator4 != null) {
                        valueAnimator4.cancel();
                    }
                    dVar.f307916R.setEmpty();
                    dVar.mo145724G();
                    dVar.f307908J = false;
                    ((C109612c) dVar.f307884a).f328158a.getBaseBoardView().f320136i = dVar.f307922s;
                    ((C109612c) dVar.f307884a).f328158a.getBaseBoardView().mo157328b(new C104098h(dVar), dVar.mo145697h(), true);
                }
            }
        }
    }
}
