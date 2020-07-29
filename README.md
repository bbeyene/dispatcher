A desktop app that imports your firefighters' contact information, company manifest excel file as well as your vehicles list, builds a form filler with drop-downs and empty fields, then exports a filled PDF form that can still be edited after saving (swap a firefighter out, update quals, etc). 

It does not modify existing files because you probably have a system for the way you store your files and generally handle other logistics (which the state also requires) - the app treats your excel files as the database so as not to mess with your workflow (nor involve making/using another spreadsheet).

As you choose personnel, it locks them in so that for example a 'FFT2' that was selected for one slot in one manifest wont be available for another slot or another manifest. 

To alert firefighters, it uses Twilio to make automated calls and/or send text messages to all of them at the same. The contractor used this feature for company-wide notifications like upcoming trainings and reminders.
