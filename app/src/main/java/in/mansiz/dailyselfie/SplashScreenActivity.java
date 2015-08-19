package in.mansiz.dailyselfie;

/**
 * Created by Manishgant on 026 26-11-2014.
 */

    import android.os.Bundle;
    import android.os.Handler;
    import android.app.Activity;
    import android.content.Intent;
    import android.view.Menu;

    public class SplashScreenActivity extends Activity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.splash_screen);

// METHOD 1

            /****** Create Thread that will sleep for 5 seconds *************/
            Thread background = new Thread() {
                public void run() {

                    try {
                        // Thread will sleep for 5 seconds
                        sleep(3*1000);

                        // After 5 seconds redirect to another intent
                        Intent i=new Intent(getBaseContext(),SelfieListActivity.class);
                        startActivity(i);

                        //Remove activity
                        finish();

                    } catch (Exception e) {

                    }
                }
            };

            // start thread
            background.start();

    }
}
