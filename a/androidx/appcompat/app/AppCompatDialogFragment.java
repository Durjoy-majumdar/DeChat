package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;

public class AppCompatDialogFragment extends DialogFragment {
    public Dialog onCreateDialog(Bundle bundle) {
        return new C103422m(getContext(), getTheme());
    }

    public void setupDialog(Dialog dialog, int i) {
        if (dialog instanceof C103422m) {
            C103422m mVar = (C103422m) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            mVar.mo143460C(1);
            return;
        }
        super.setupDialog(dialog, i);
    }
}
