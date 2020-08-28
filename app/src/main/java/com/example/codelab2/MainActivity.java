package com.example.codelab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Debugging","Don't forget this exists!");
    }
}



/*Some eye roll humor

Two bytes meet.  The first byte asks, “Are you ill?”
The second byte replies, “No, just feeling a bit off.”
----
What's the best thing thing about UDP jokes?

I don't care if you get them
----

A manager, a mechanical engineer, and software analyst are driving back from convention through the mountains. Suddenly, as they crest a hill, the brakes on the car go out and they fly careening down the mountain. After scraping against numerous guardrails, they come to a stop in the ditch. Everyone gets out of the car to assess the damage.

The manager says, "Let's form a group to collaborate ideas on how we can solve this issue."

The mechanical engineer suggests, "We should disassemble the car and analyze each part for failure."

The software analyst says, "Let's push it back up the hill and see if it does it again."

---

A programmer puts two glasses on his bedside table before going to sleep.
A full one, in case he gets thirsty, and an empty one, in case he doesn’t.
 */