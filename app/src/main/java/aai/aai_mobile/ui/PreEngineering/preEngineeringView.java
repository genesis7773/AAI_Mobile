package aai.aai_mobile.ui.PreEngineering;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import flow.Flow;
/**
 * Created by Aladdin on 4/9/2016.
 */
public class preEngineeringView extends RelativeLayout {
    public preEngineeringView(Context context, AttributeSet attrs) {
        super(context, attrs);

    }

     protected void onAttachedWindow(){
        super.onAttachedToWindow();
        preEngineeringView screen = Flow.getKey(this);
    }
}
