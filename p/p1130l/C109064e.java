package p1130l;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C103448e;
import androidx.appcompat.view.menu.C103452g;
import p1130l.C109059d;
import p1164y2.C112383b;
import p849e3.C107170b;

/* renamed from: l.e */
public class C109064e extends C109059d {

    /* renamed from: l.e$a */
    public class C109065a extends C109059d.C109060a implements ActionProvider.VisibilityListener {

        /* renamed from: f */
        public C107170b.C107172b f326631f;

        public C109065a(C109064e eVar, Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        /* renamed from: b */
        public boolean mo157614b() {
            return this.f326626d.isVisible();
        }

        /* renamed from: d */
        public View mo157616d(MenuItem menuItem) {
            return this.f326626d.onCreateActionView(menuItem);
        }

        /* renamed from: g */
        public boolean mo157619g() {
            return this.f326626d.overridesItemVisibility();
        }

        /* renamed from: h */
        public void mo157620h(C107170b.C107172b bVar) {
            this.f326631f = bVar;
            this.f326626d.setVisibilityListener(bVar != null ? this : null);
        }

        public void onActionProviderVisibilityChanged(boolean z) {
            C107170b.C107172b bVar = this.f326631f;
            if (bVar != null) {
                C103448e eVar = C103452g.this.f305280t;
                eVar.f305242n = true;
                eVar.mo143611p(true);
            }
        }
    }

    public C109064e(Context context, C112383b bVar) {
        super(context, bVar);
    }

    /* renamed from: e */
    public C109059d.C109060a mo160223e(ActionProvider actionProvider) {
        return new C109065a(this, this.f326621e, actionProvider);
    }
}
