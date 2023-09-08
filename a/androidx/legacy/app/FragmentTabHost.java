package androidx.legacy.app;

import android.app.FragmentTransaction;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TabHost;
import java.util.ArrayList;

@Deprecated
public class FragmentTabHost extends TabHost implements TabHost.OnTabChangeListener {

    /* renamed from: d */
    public final ArrayList<C112973a> f338191d = new ArrayList<>();

    /* renamed from: e */
    public TabHost.OnTabChangeListener f338192e;

    /* renamed from: f */
    public boolean f338193f;

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C112972a();

        /* renamed from: d */
        public String f338194d;

        /* renamed from: androidx.legacy.app.FragmentTabHost$SavedState$a */
        public static class C112972a implements Parcelable.Creator<SavedState> {
            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentTabHost.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " curTab=" + this.f338194d + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f338194d);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.f338194d = parcel.readString();
        }
    }

    /* renamed from: androidx.legacy.app.FragmentTabHost$a */
    public static final class C112973a {
    }

    @Deprecated
    public FragmentTabHost(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842995}, 0, 0);
        obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        super.setOnTabChangedListener(this);
    }

    /* renamed from: b */
    public final FragmentTransaction mo165291b(String str, FragmentTransaction fragmentTransaction) {
        if (this.f338191d.size() <= 0) {
            throw new IllegalStateException("No tab known for tag " + str);
        }
        this.f338191d.get(0).getClass();
        throw null;
    }

    @Deprecated
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String currentTabTag = getCurrentTabTag();
        if (this.f338191d.size() > 0) {
            this.f338191d.get(0).getClass();
            throw null;
        }
        this.f338193f = true;
        mo165291b(currentTabTag, (FragmentTransaction) null);
        throw null;
    }

    @Deprecated
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f338193f = false;
    }

    @Deprecated
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCurrentTabByTag(savedState.f338194d);
    }

    @Deprecated
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f338194d = getCurrentTabTag();
        return savedState;
    }

    @Deprecated
    public void onTabChanged(String str) {
        if (!this.f338193f) {
            TabHost.OnTabChangeListener onTabChangeListener = this.f338192e;
            if (onTabChangeListener != null) {
                onTabChangeListener.onTabChanged(str);
                return;
            }
            return;
        }
        mo165291b(str, (FragmentTransaction) null);
        throw null;
    }

    @Deprecated
    public void setOnTabChangedListener(TabHost.OnTabChangeListener onTabChangeListener) {
        this.f338192e = onTabChangeListener;
    }

    @Deprecated
    public void setup() {
        throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
    }
}
