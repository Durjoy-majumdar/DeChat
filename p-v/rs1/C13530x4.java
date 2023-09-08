package rs1;

import android.content.Intent;
import android.view.MenuItem;
import androidx.appcompat.app.AppCompatActivity;
import di3.C86312j;
import er1.C58684b;
import nj3.C11184p0;

/* renamed from: rs1.x4 */
public final class C13530x4 implements C11184p0 {

    /* renamed from: d */
    public final /* synthetic */ String f38364d;

    /* renamed from: e */
    public final /* synthetic */ AppCompatActivity f38365e;

    public C13530x4(String str, AppCompatActivity appCompatActivity) {
        this.f38364d = str;
        this.f38365e = appCompatActivity;
    }

    public final void onMMMenuItemSelected(MenuItem menuItem, int i) {
        Intent intent = new Intent();
        if (menuItem.getItemId() == 1001) {
            intent.putExtra("key_finder_post_router", 2);
        } else if (menuItem.getItemId() == 1002) {
            intent.putExtra("key_finder_post_router", 3);
        }
        intent.putExtra("key_finder_post_from", 5);
        intent.putExtra("key_finder_post_id", this.f38364d);
        ((C58684b) C86312j.m106911c(C58684b.class)).mo83582c0(this.f38365e, intent);
    }
}
