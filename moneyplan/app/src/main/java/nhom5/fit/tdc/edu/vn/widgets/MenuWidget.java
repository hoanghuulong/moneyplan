package nhom5.fit.tdc.edu.vn.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import nhom5.fit.tdc.edu.vn.R;

public class MenuWidget extends LinearLayout {

    private ImageView btnWallet, btnReport, btnAdd, btnNote, btnAccount;
    private ViewGroup menulayout;

    private OnClickListener onClick = new OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v.isSelected()) {
                v.setSelected(false);
            }else{
                int count = menulayout.getChildCount();
                for(int i = 0; i< count; ++i){
                    menulayout.getChildAt(i).setSelected(false);
                }
                v.setSelected(true);
            }
        }
    };

    public MenuWidget(Context context) {
        super(context);
        intialization();
    }

    public MenuWidget(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        intialization();
    }

    public MenuWidget(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        intialization();
    }

    private void intialization(){
        inflate(getContext(), R.layout.menu_layout, this);
        menulayout =(ViewGroup)getChildAt(0);

        btnWallet = menulayout.findViewById(R.id.btnWallet);
        btnWallet.setOnClickListener(onClick);

        btnReport = menulayout.findViewById(R.id.btnReport);
        btnReport.setOnClickListener(onClick);

        btnAdd = menulayout.findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(onClick);

        btnNote = menulayout.findViewById(R.id.btnNote);
        btnNote.setOnClickListener(onClick);

        btnAccount = menulayout.findViewById(R.id.btnAccount);
        btnAccount.setOnClickListener(onClick);
    }
}
