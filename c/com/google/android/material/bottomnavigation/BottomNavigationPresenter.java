package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MenuItem;
import androidx.appcompat.view.menu.C103448e;
import androidx.appcompat.view.menu.C103452g;
import androidx.appcompat.view.menu.C103456i;
import androidx.appcompat.view.menu.C103463l;
import androidx.transition.C103834d;

public class BottomNavigationPresenter implements C103456i {

    /* renamed from: d */
    public BottomNavigationMenuView f309205d;

    /* renamed from: e */
    public boolean f309206e = false;

    /* renamed from: f */
    public int f309207f;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new C104418a();

        /* renamed from: d */
        public int f309208d;

        /* renamed from: com.google.android.material.bottomnavigation.BottomNavigationPresenter$SavedState$a */
        public static class C104418a implements Parcelable.Creator<SavedState> {
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.f309208d = parcel.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f309208d);
        }
    }

    /* renamed from: a */
    public void mo143537a(C103448e eVar, boolean z) {
    }

    /* renamed from: b */
    public Parcelable mo143538b() {
        SavedState savedState = new SavedState();
        savedState.f309208d = this.f309205d.getSelectedItemId();
        return savedState;
    }

    /* renamed from: c */
    public void mo143539c(boolean z) {
        if (!this.f309206e) {
            if (z) {
                this.f309205d.mo146323a();
                return;
            }
            BottomNavigationMenuView bottomNavigationMenuView = this.f309205d;
            C103448e eVar = bottomNavigationMenuView.f309183D;
            if (eVar != null && bottomNavigationMenuView.f309194q != null) {
                int size = eVar.size();
                if (size != bottomNavigationMenuView.f309194q.length) {
                    bottomNavigationMenuView.mo146323a();
                    return;
                }
                int i = bottomNavigationMenuView.f309195r;
                for (int i2 = 0; i2 < size; i2++) {
                    MenuItem item = bottomNavigationMenuView.f309183D.getItem(i2);
                    if (item.isChecked()) {
                        bottomNavigationMenuView.f309195r = item.getItemId();
                        bottomNavigationMenuView.f309196s = i2;
                    }
                }
                if (i != bottomNavigationMenuView.f309195r) {
                    C103834d.m138407a(bottomNavigationMenuView, bottomNavigationMenuView.f309184d);
                }
                int i3 = bottomNavigationMenuView.f309193p;
                boolean z2 = i3 != -1 ? i3 == 0 : bottomNavigationMenuView.f309183D.mo143607l().size() > 3;
                for (int i4 = 0; i4 < size; i4++) {
                    bottomNavigationMenuView.f309182C.f309206e = true;
                    bottomNavigationMenuView.f309194q[i4].setLabelVisibilityMode(bottomNavigationMenuView.f309193p);
                    bottomNavigationMenuView.f309194q[i4].setShifting(z2);
                    bottomNavigationMenuView.f309194q[i4].mo143501d((C103452g) bottomNavigationMenuView.f309183D.getItem(i4), 0);
                    bottomNavigationMenuView.f309182C.f309206e = false;
                }
            }
        }
    }

    /* renamed from: d */
    public boolean mo143540d(C103463l lVar) {
        return false;
    }

    /* renamed from: e */
    public boolean mo143533e(C103448e eVar, C103452g gVar) {
        return false;
    }

    /* renamed from: f */
    public boolean mo143542f() {
        return false;
    }

    /* renamed from: g */
    public boolean mo143534g(C103448e eVar, C103452g gVar) {
        return false;
    }

    public int getId() {
        return this.f309207f;
    }

    /* renamed from: h */
    public void mo143564h(Context context, C103448e eVar) {
        this.f309205d.f309183D = eVar;
    }

    /* renamed from: j */
    public void mo143545j(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            BottomNavigationMenuView bottomNavigationMenuView = this.f309205d;
            int i = ((SavedState) parcelable).f309208d;
            int size = bottomNavigationMenuView.f309183D.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = bottomNavigationMenuView.f309183D.getItem(i2);
                if (i == item.getItemId()) {
                    bottomNavigationMenuView.f309195r = i;
                    bottomNavigationMenuView.f309196s = i2;
                    item.setChecked(true);
                    return;
                }
            }
        }
    }
}
