package com.google.android.search.verification.client;

import android.content.Intent;
import android.os.Bundle;
import com.tencent.p014mm.hellhoundlib.activities.HellActivity;

public abstract class SearchActionVerificationClientActivity extends HellActivity {
    /* renamed from: E7 */
    public abstract Class<? extends SearchActionVerificationClientService> mo847E7();

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = new Intent(this, mo847E7());
        intent.putExtra("SearchActionVerificationClientExtraIntent", getIntent());
        startService(intent);
        finish();
    }
}
