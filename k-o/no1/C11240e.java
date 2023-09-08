package no1;

import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import com.tencent.tinker.loader.hotplug.EnvConsts;
import gy3.C8480h;
import gy3.C87412m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: no1.e */
public abstract class C11240e implements C11237b<View> {

    /* renamed from: a */
    public final AppCompatActivity f33138a;

    /* renamed from: b */
    public final Fragment f33139b;

    /* renamed from: c */
    public final List<Integer> f33140c;

    /* renamed from: d */
    public final List<View> f33141d;

    /* renamed from: e */
    public final List<View> f33142e;

    public C11240e(AppCompatActivity appCompatActivity, Fragment fragment, List<Integer> list, List<View> list2, String str, int i, C8480h hVar) {
        fragment = (i & 2) != 0 ? null : fragment;
        list = (i & 4) != 0 ? null : list;
        list2 = (i & 8) != 0 ? null : list2;
        C87412m.m108594g(appCompatActivity, EnvConsts.ACTIVITY_MANAGER_SRVNAME);
        this.f33138a = appCompatActivity;
        this.f33139b = fragment;
        this.f33140c = list;
        this.f33141d = list2;
        this.f33142e = new ArrayList();
        mo11314b(list2, list);
    }

    /* renamed from: b */
    public void mo11314b(List<? extends View> list, List<Integer> list2) {
        View view;
        if (list != null) {
            ((ArrayList) this.f33142e).addAll(list);
        }
        if (list2 != null) {
            for (Number intValue : list2) {
                int intValue2 = intValue.intValue();
                Fragment fragment = this.f33139b;
                if (fragment != null) {
                    View view2 = fragment.getView();
                    view = view2 != null ? view2.findViewById(intValue2) : null;
                } else {
                    view = this.f33138a.findViewById(intValue2);
                }
                if (view != null) {
                    ((ArrayList) this.f33142e).add(view);
                }
            }
        }
    }
}
